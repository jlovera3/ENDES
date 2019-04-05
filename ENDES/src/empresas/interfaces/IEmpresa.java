package empresas.interfaces;

import empresas.classes.Empleado;
import empresas.classes.JEFE;

public interface IEmpresa{

	int MAXEMPLEADOS_DEF = 2;
	String NOMBRE_DEF = " ";
	int SALARIO_DEF = 1000;

	boolean contrataEmp(Empleado e, int salario);
	boolean contrataEmp(Empleado e);
	boolean despideEmp(String nombre);
	void contrataCEO(JEFE c, int salario, int bonus);
	void contrataCEO(JEFE c, int bonus);
	void contrataCEO(JEFE c);







}