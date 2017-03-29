/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jorge Espina
 */
public class Datos {
    
    private String Usuario;
    private String Contraseña;
    private String Empresa;
    private String Departamento;
    private String Nombre;
    private String Descripcion;
    private String NombreProducto;
    private String Id;
     public void setUsuario(String user){
        this.Usuario=user;
    }
    
    public void setContraseña(String pasword){
        this.Contraseña=pasword;
    }
    
    public void setEmpresa(String empresa){
        this.Empresa=empresa;
    }
    
    public void setDepartamento(String departamento){
        this.Departamento=departamento;
    }
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.Descripcion = descripcion;
    }
    public void setNombreProducto(String nombreproducto){
        this.NombreProducto = nombreproducto;
    }
    public void setId(String id){
        this.Id = id;
    }
    public String getUsuario(){
        return this.Usuario;
    }
    
    public String getContraseña(){
        return this.Contraseña;
    }
    
    public String getEmpresa(){
        return this.Empresa;
    }
    public String getDepartamento(){
        return this.Departamento;
    }
    public String getNombre(){
        return this.Nombre;
    }
     public String getDescripcion(){
        return this.Descripcion;
    }
     public String getNombreProducto(){
        return this.NombreProducto;
    }
     public String getId(){
         return this.Id;
     }
    public boolean Login(String Usuario, String Pass , String Empresa , String Departamento ){
        return new  Principal_Service().getPrincipalPort().login(Usuario, Pass, Empresa, Departamento);        
    }
    public void Registrarse(String Usuario,String Pass,String Nombre, String Departamento, String Empresa ){
        new Principal_Service().getPrincipalPort().registrar(Usuario, Pass, Nombre, Departamento, Empresa);                
    }
    public void CreacionActivos(String Usuario,String NombreProducto,String Descripcion, String Empresa,String Departamento){
         new Principal_Service().getPrincipalPort().registrarActivo(Usuario, NombreProducto, Descripcion, Empresa, Departamento);
    }
    public void ModificacionActivos(String Usuario,String Id,String Producto, String Descripcion , String Empresa ,String Departamento){
        new Principal_Service().getPrincipalPort().modificarActivo(Usuario, Id, Producto, Descripcion, Empresa, Departamento);
    }
    public void EliminacionActivos(String Usuario,String Id ,String Empresa,String Departamento){
        new Principal_Service().getPrincipalPort().eliminarActivo(Usuario, Id, Empresa, Departamento);
    }
    
    
}
