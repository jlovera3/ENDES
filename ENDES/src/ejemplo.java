import empresas.classes.Empresa;
import empresas.classes.JEFE;
import empresas.classes.Empleado;

public class ejemplo{
	public static void main(String[] args){



		Empresa emp1=new Empresa("Google",10);
		Empresa emp2=new Empresa("Yahoo");

		Empleado e1=new Empleado("Juan");
		Empleado e2=new Empleado("Maria");
		Empleado e3=new Empleado("Pedro");
		Empleado e4=new Empleado("Amalia");
		Empleado e5=new Empleado("Julio");
		Empleado e6=new Empleado("Maria");

		JEFE c1=new JEFE("Carlos");
		JEFE c2=new JEFE("Eva");


		emp1.contrataEmp(e1);
		emp1.contrataEmp(e2,1200);
		
		emp2.contrataEmp(e3);
		emp2.contrataEmp(e4,2000);
		
		emp2.despideEmp("Amalia");
		System.out.println(e4);

		if(emp2.contrataEmp(e5)){
			System.out.println("La empresa "+emp2.nombre+" ha podido contratar a "+e5.nombre);
		}else{
			System.out.println("La empresa "+emp2.nombre+" NO ha podido contratar a "+e5.nombre);
		}

		emp1.contrataCEO(c1);
		emp2.contrataCEO(c2,500);

		System.out.println(emp1); 
		System.out.println(emp2);

		System.out.println("El jefe de "+e2.nombre+" es "+e2.quienEsMijefe().nombre);

		if(e3.Compañeros(e4)){
			System.out.println(e3.nombre+" es colega de "+e4.nombre);
		}

		System.out.println("El numero de empresas en el mundo es de "+Empresa.NEmpresas);

	}
}