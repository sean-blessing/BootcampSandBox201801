package ball;

public class Ball implements Comparable {
	// color and size will not be validated, 
	// but assumed valid values are:
	// - color:  black, red, blue and green
	// - sizes:  S, M, and L
	private String color;
	private String size;
	
	public Ball() {
		super();
	}

	public Ball(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", size=" + size + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Ball b2 = (Ball)arg0;
		String thisColorSize = color+size;
		String b2ColorSize = b2.getColor()+b2.getSize();
		return thisColorSize.compareTo(b2ColorSize);
	}
	
}
