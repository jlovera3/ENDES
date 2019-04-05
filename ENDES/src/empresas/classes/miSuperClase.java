/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas.classes;

import empresas.interfaces.IEmpleado;

/**
 *
 * @author jlove
 */
public abstract class miSuperClase implements IEmpleado {
    
    public String nombre;
    public int salario;
    public Empresa empresa;

    /**
     *
     * @param nombre
     * @param salario
     */
    public miSuperClase(String nombre, int salario) {
        this.nombre=nombre;
        this.salario=salario;
    }

    public miSuperClase() {
    }

    /**
    metodo que dice si dos empleados trabaja en la misma empresa
    @param persona objeto de tipo empleado que se obtendra si son de la misma empresa.
    @return devuelve true si los dos objeto son colegas.
     */
    @Override
    public boolean Compañeros(Empleado persona) {
        boolean amigos = false;
        if (this.empresa != null && persona.empresa != null) {
            if (this.empresa.nombre.equals(persona.empresa.nombre)) {
                amigos = true;
            }
        }
        return amigos;
    }

    /**
    dice quien es el jefe actual de la empresa del empleado.
    @return devuelve un objeto de tipo JEFE
     */
    @Override
    public JEFE quienEsMijefe() {
        JEFE miceo = null;
        if (this.empresa != null) {
            miceo = this.empresa.ceo;
        }
        return miceo;
    }

    /**
    devuelve el nombre de la empresa.
    @return un string con el nombre de la empresa;
     */
    @Override
    public String trabaja() {
        return "Estoy currando en " + (this.empresa == null ? "ningun lado" : this.empresa.nombre);
    }

    /**
    devuelve el sueldo del empleado
     * @return
     */
    @Override
    public int cobra() {
        return this.salario;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.salario;
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if (obj instanceof Empleado) {
            Empleado tmp = (Empleado) obj;
            if (this.nombre.equals(tmp.nombre) && this.salario == tmp.salario) {
                iguales = true;
            }
        }
        return iguales;
    }
    
}
