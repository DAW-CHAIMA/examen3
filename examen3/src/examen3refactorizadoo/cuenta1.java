package examen3refactorizadoo;
/**
 *Clase que representa a una cuenta 
 ** @author Chaima
 **/
public class cuenta1 {
    // Propiedades de la Clase Cuenta
	/**
	 *Devuelve estado de la cuenta 
	 ** @return  saldo de la cuenta 
	 **/
    public double dSaldo;
    public String nombre;

    public static void main(String[] args) {

        operativa_cuenta(null);
    }

	public double getdSaldo() {
		return dSaldo;
	}

	public void setdSaldo(double dSaldo) {
		this.dSaldo = dSaldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void operativa_cuenta(float cantidad) {
		cuenta1 miCuenta = new cuenta1();

        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
	}

    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo. */
	/**Ingresa una cantidad en la cuenta 
	 * @parm Cantidad a ingresar
	 *  @trows Exception si cantidad es negativa 
	 * */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (!(cantidad >= 0 || cantidad <= 3000)) {
            System.out.println("No se puede ingresar una cantidad negativa ni superior a 3000€ (sin ser notificada con formulario)");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }

        return iCodErr;
    }

    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo que se va a retirar. 
     */
    /**Retira una cantidad en la cuenta 
  	 * @parm Cantidad a retirar
  	 *  @trows Exception si cantidad es negativa o cero
  	 * */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
