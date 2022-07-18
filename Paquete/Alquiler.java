package Paquete;

public class Alquiler {
    private String idMiembro;
	private String idJuego;

	private String activo;

	public Alquiler(String idMiembro, String idJuego, String activo){

		this.idMiembro        = idMiembro;
		this.idJuego    = idJuego;
		this.activo  = activo;

	}

	public String getId(){
		return idMiembro;
	}
	public void setId(String idMiembro){
		this.idMiembro = idMiembro;
	}

	public String getidJuego(){
		return idJuego;
	}
	public void setidJuego(String idJuego){
		this.idJuego = idJuego;
	}

	public  String getactivo(){
		return activo;
	}
	public  void setactivo(String activo){
		this.activo = activo;
	} 

	public String toString(){
    	return "(" + "El id del Miembro es: " + idMiembro + ","+" El id del juego es: "
		+ idJuego +  " activo " + activo + ")";
	}
}