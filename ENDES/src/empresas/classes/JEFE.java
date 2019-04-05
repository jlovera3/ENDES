package empresas.classes;
public class JEFE extends Empleado{

	private static final int BONUS_DEF = 250;
 
	public int bonus;

	public JEFE(){
		this(NOMBRE_DEF,SALARIO_DEF,BONUS_DEF);
	}

	public JEFE(String nombre){
		this(nombre,SALARIO_DEF,BONUS_DEF);
	}
	

	public JEFE(String nombre, int salario,int bonus){
		super(nombre, salario);
		//this.nombre=nombre;
		//this.salario=salario;
		this.bonus = bonus;
	}


	@Override
	 public int cobra(){
	 	return super.cobra()+this.bonus;
	 }



	@Override 
	public String toString(){
		return super.toString()+" "+this.bonus;
	}

	@Override
	public boolean equals(Object obj){

		boolean iguales = false;
    if(obj instanceof JEFE){
			JEFE tmp = (JEFE) obj;
			if(super.equals(obj) && this.bonus == tmp.bonus){
			   	iguales = true;
			}

		} 
		return iguales;
	}
 
}