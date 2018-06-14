import java.io.Serializable;

import com.mongodb.BasicDBObject;

public class FechaCantida extends BasicDBObject  {

	private static final long serialVersionUID = 1L;
	
	private String fecha;
	private Long   cantidad;
		
	public FechaCantida(String fecha, Long cantidad) {
		super.put("fecha", fecha);
		super.put("cantidad", cantidad);
		this.fecha = fecha;
		this.cantidad = cantidad;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj) {
			System.out.println("1");
			return true;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("3");
			return false;
		}
		FechaCantida other = (FechaCantida) obj;
		if (fecha == null) {
			if (other.fecha != null) {
				System.out.println("4");
				return false;
			}
		} else if (!fecha.equals(other.fecha)) {
			System.out.println("5");
			return false;
		}
		System.out.println("6");
		return true;
	}

	@Override
	public String toString() {
		return "FechaCantida [fecha=" + fecha + ", cantidad=" + cantidad + "]";
	}	
}
