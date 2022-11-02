package studio7;

public class Die {

		public int sides;
		
	public Die(int sides) 
	{
	this.sides = sides;
	}
	
	public int roll()
	{
		return (int)(Math.random()*(sides-1)+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sides = 4;
		Die a = new Die(sides);
		System.out.println(a.roll());
	}

}
