package empresas.interfaces;

import empresas.classes.Empleado;
import empresas.classes.CEO;

public interface IEmpleado{

	String EMPREAS_DEF ="";
	String NOMBRE_DEF = "";
	int SALARIO_DEF =0;

	boolean somosColegas(Empleado otro);
	CEO quienEsMijefe();
	String trabaja();
	int cobra();






}