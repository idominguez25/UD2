package Backend.PatronMVC.model.dto;

public class Cliente {
	//Atributos
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int DNI;
	private String fecha;
	
	public Cliente(int id, String nombre, String apellido, String direccion, int dNI, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		DNI = dNI;
		this.fecha = fecha;
	}
	
	public Cliente() {
		super();
	}

	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
	