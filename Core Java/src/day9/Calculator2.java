package day9;

class Calc
{
	int a;
	int b;
	void add(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}

}
public class Calculator2 {

	public static void main(String[] args) {
		
		Calc calc=new Calc();
	    calc.add(10,20);
		
	}

}
