package studio7;

public class Die {
	private int n;

	public Die (int n) {
		this.n = n;
	}
	public int getValue () {
		return (int)(Math.random()* n);
	}
	public static void main (String []args) {
		Die n = new Die (8);
		n.getValue();
		System.out.println (n.getValue());
}	}	

