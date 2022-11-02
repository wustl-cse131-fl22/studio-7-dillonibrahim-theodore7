package studio7;

public class Fraction {
	public int num,denom;
	
	public Fraction(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	
	public Fraction multiply(Fraction a)
	{
		Fraction b = new Fraction (this.num*a.num,this.denom*a.denom);
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println();
	}

}
