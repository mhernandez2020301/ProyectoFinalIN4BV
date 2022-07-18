package Paquete;

public class Juego {
    private String id;
	private String nombre;
	public Juego(String id, String nombre){

		this.id        = id;
		this.nombre    = nombre;
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
    public String toString(){
    	return "(" + "El id del juego es: " + id + ","+" El nombre del juego es: "
		+ nombre + ")";
    }
}