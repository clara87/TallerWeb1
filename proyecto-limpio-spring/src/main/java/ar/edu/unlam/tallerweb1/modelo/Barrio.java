//package ar.edu.unlam.tallerweb1.modelo;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Barrio {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String nombre;
//	
//	// n - 1 Una comuna muchos barrios // Muchas barrios perteneces a una comuna(localidad)
//	private Comuna comuna; 
//	
//	// Constructor Con Parametros
//	
//	public Barrio() {
//		super();
//	}
//	
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public Comuna getComuna() {
//		return comuna;
//	}
//
//	public void setComuna(Comuna comuna) {
//		this.comuna = comuna;
//	}
//	
//	
//}
