package Paquete;

public class Alquilerv2 {
    private String idMiembro;
	private String idJuego;

	private String activo;

	public Alquilerv2(String idMiembro, String idJuego, String activo){

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
    	return "(" + "La persona que se identifica con el id: " + idMiembro + ","+" Tiene el juego que se identifica con el id "
		+ idJuego +  " Su estado es  " + activo + ")";
	}
}