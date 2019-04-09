package empresas.classes;
import empresas.interfaces.IEmpresa;
/**
	Empresa.class
	permite crear objetos de tipo empleados.
	@author ENDES SPRINT 4
	@version 0.1
*/
public class Empresa implements IEmpresa{
	private final static int BONUS_DEF=0;

	public JEFE ceo;
	public String nombre;
	public Empleado[] empleados;
	public int maxempleados;
	public static int NEmpresas =0; 
    
	public Empresa(String nombre, int maxempleados ){
		Empresa.NEmpresas++;
		this.nombre = nombre;
		this.maxempleados=maxempleados;
		Empleados(maxempleados);
	}

	 public Empresa(String nombre){
		this(nombre, MAXEMPLEADOS_DEF);
	}


    public Empresa(){	
    	this(NOMBRE_DEF, MAXEMPLEADOS_DEF);
	  }

	 /**	
		agrega objetos de tipo Empleado a un array del mismo tipo.
		@param e objeto de tipo Empleado
		@param salario salario que tendra el objeto Empleado.
		@return devuelve true si ha podido agregar el objeto Empleado

	*/

        @Override
	public boolean contrataEmp(Empleado e, int salario){
		boolean contratado = false;
		if(e!=null){
			for (int i =0 ;i<this.empleados.length && !contratado; i++ ) {

				if(this.empleados[i]==null){

					e.salario = salario;
					e.empresa = this;
					this.empleados[i]= e;
					contratado = true; 

				}
			}
		}

		return contratado;



	}
	/**	
		agrega objetos de tipo empleado a un array del mismo tipo.
		@param e objeto de tipo empleado
		@return devuelve true si ha podido agregar el objeto empleado

	*/

	public boolean contrataEmp(Empleado e){
		return this.contrataEmp(e,SALARIO_DEF);
	}

	/**	
		elimina objetos de tipo empleado de un array del mismo tipo.
		@param nombre objeto de tipo empleado
		@return devuelve true si ha podido eliminar el objeto empleado

	*/

        @Override
	public boolean despideEmp(String nombre){

		boolean despide = false;

		for (int i =0; i<this.empleados.length && !despide; i++ ) {
			if(this.empleados[i]!=null){
				if(this.empleados[i].nombre.equals(nombre)) {
					this.empleados[i].salario=0;
					this.empleados[i].empresa=null;
					this.empleados[i] =null;
					despide = true;

				}
			}
		}
		return despide;

	}
	/**	
		metodo que asigna un jefe a la empresa
		@param c objeto de tipo jefe que sera dado de alta en la empresa
                @param salario
		@param bonus cantidad que se sumara al objeto tipo jefe.
                @param titulo

	*/
        @Override
	public void contrataCEO(JEFE c, int salario,int bonus,String titulo){
		c.salario = salario;
		c.empresa=this;
		c.bonus = bonus;
                c.titulo = titulo;
		this.ceo = c;
	}
        @Override
	public void contrataCEO(JEFE c, int bonus){
		this.contrataCEO(c,SALARIO_DEF,bonus,c.titulo);
	}
        @Override
	public void contrataCEO(JEFE c){
		this.contrataCEO(c,SALARIO_DEF,BONUS_DEF,c.titulo);	
	}
	/**
		metodo que lista empleados.
		@return devuelve un string con una lista de empleados de la empresa.
	*/
	private String listaEmpleados(){
		StringBuilder listaemp = new StringBuilder();

		for(int i =0; i<empleados.length; i++){
			if(empleados[i]!=null){
				listaemp.append(empleados[i].nombre+" Salario "+empleados[i].cobra()+" ");
			}
		}

		return listaemp.toString();
	}
        /**
         * Nombre: Empleados
         * Descripción: Método que crea y instancia una lista de empleados dependiendo del tamaño que se le pase al constructor.
         */
        private void Empleados(int maxempleados){
            
            this.empleados = new Empleado[maxempleados];
        
        }
        @Override
	public String toString(){

		return "Nombre empresa :"+this.nombre+" Empleados: "+listaEmpleados()+" CEO: "+this.ceo.nombre;
	} 

}