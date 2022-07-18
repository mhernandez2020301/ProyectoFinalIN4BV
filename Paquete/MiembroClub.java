package Paquete;

public class MiembroClub {


	private String id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	public MiembroClub(String id, String nombre, String apellido, String direccion,int telefono){

		this.id        = id;
		this.nombre    = nombre;
		this.apellido  = apellido;
		this.direccion = direccion;
		this.telefono  = telefono;
	}

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public  String getApellido(){
		return apellido;
	}
	public  void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public int getTelefono(){
		return telefono;
	}

	public void setTelefono(int telefono){
		this.telefono = telefono;
	}

		public String toString(){
		return "(Sus Datos son los siguientes;  " + "// Su ID es el siguiente: " + id + ","+" //Su nombre completo es: "
		+ nombre + "" + apellido + ", " + " //Su direccion es: " +  direccion + ", " + " //Su numero de telefono es: "
		+ telefono + ")"; 
    }	


}