package movil;

public class Range<T> {
	T min;
	T max;
	public Range(T min, T max) {
		super();
		this.min = min;
		this.max = max;
	}
	public T getMin() {
		return min;
	}
	public void setMin(T min) {
		this.min = min;
	}
	public T getMax() {
		return max;
	}
	public void setMax(T max) {
		this.max = max;
	}
	
	 
}
