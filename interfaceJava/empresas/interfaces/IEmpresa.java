package empresas.interfaces;

import empresas.classes.Empleado;
import empresas.classes.CEO;

public interface IEmpresa{

	int MAXEMPLEADOS_DEF = 2;
	String NOMBRE_DEF = " ";
	int SALARIO_DEF = 1000;

	boolean contrataEmp(Empleado e, int salario);
	boolean contrataEmp(Empleado e);
	boolean despideEmp(String nombre);
	void contrataCEO(CEO c, int salario, int bonus);
	void contrataCEO(CEO c, int bonus);
	void contrataCEO(CEO c);







}