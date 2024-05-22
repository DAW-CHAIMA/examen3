package examen3refactorizadoo;

class CCuentaTest {
	cuenta1 miCuenta = new cuenta1();

	@ParameterizedTest
	@CsvSource({"-10,1","-3,2","10,0"})
	@DisplayName("Caja Blanca - Ingresar")
	void testIngreso(double cant,int resul) {
		assertEquals(resul,miCuenta.ingresar(cant));
	}

	private void assertEquals(int resul, int ingresar) {
		// TODO Auto-generated method stub
		
	}
}
