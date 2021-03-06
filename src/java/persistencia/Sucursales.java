package persistencia;
// Generated 11-08-2018 03:37:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursales generated by hbm2java
 */
public class Sucursales  implements java.io.Serializable {


     private Integer idSucursal;
     private Empresas empresas;
     private String nombre;
     private String direccion;
     private String telefono;
     private Integer encargado;
     private String giro;
     private Set empleadoses = new HashSet(0);

    public Sucursales() {
    }

    public Sucursales(Empresas empresas, String nombre, String direccion, String telefono, Integer encargado, String giro, Set empleadoses) {
       this.empresas = empresas;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.encargado = encargado;
       this.giro = giro;
       this.empleadoses = empleadoses;
    }
   
    public Integer getIdSucursal() {
        return this.idSucursal;
    }
    
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Integer getEncargado() {
        return this.encargado;
    }
    
    public void setEncargado(Integer encargado) {
        this.encargado = encargado;
    }
    public String getGiro() {
        return this.giro;
    }
    
    public void setGiro(String giro) {
        this.giro = giro;
    }
    public Set getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set empleadoses) {
        this.empleadoses = empleadoses;
    }




}


