import java.io.Serializable;


public class Cycle implements Serializable {
	private double weight;
	private double wheels;
	public Cycle(double weight, double wheels) {
		super();
		this.weight = weight;
		this.wheels = wheels;
	}
	@Override
	public String toString() {
		return "Cycle [weight=" + weight + ", wheels=" + wheels + "]";
	}
}
