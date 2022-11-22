package cl.malapractica.entidades;

/**
 *
 * @author malapractica
 * @date   2022-11-22
 */
public class Empresa {
    
    private String rol;
    private String razonSocial;
    private String direccion;
    private String correoElectronico;
    private int    telefono;

    public Empresa() {
    }

    public Empresa(String rol, String razonSocial, String direccion, String correoElectronico, int telefono) {
        this.rol = rol;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empresa{" + "rol=" + rol + ", razonSocial=" + razonSocial + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + '}';
    }
    
    
}
