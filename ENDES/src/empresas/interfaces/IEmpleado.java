package empresas.interfaces;

import empresas.classes.Empleado;
import empresas.classes.JEFE;

public interface IEmpleado{

	String EMPREAS_DEF ="";
	String NOMBRE_DEF = "";
	int SALARIO_DEF =0;

	boolean Compañeros(Empleado persona);
	JEFE quienEsMijefe();
	String trabaja();
	int cobra();






}