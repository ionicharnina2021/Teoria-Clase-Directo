package movil;

public class MobileFilter {
	String marca="any";
	boolean bueno=false;
	Range<Float> precio=new Range<Float>(0f, 20000f);
	Range<Float> pantalla=new Range<Float>(4.5f,9f);
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isBueno() {
		return bueno;
	}
	public void setBueno(boolean bueno) {
		this.bueno = bueno;
	}
	public Range<Float> getPrecio() {
		return precio;
	}
	public void setPrecio(Range<Float> precio) {
		this.precio = precio;
	}
	public MobileFilter(String marca, boolean bueno, Range<Float> precio) {
		super();
		this.marca = marca;
		this.bueno = bueno;
		this.precio = precio;
	}
	public MobileFilter(boolean b) {
		// TODO Auto-generated constructor stub
	}
}
