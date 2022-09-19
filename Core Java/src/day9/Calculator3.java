package day9;

class Calc1
{
	int add()
	{
		int c = 10+20;
		return c;	
	}

}

public class Calculator3 {

	public static void main(String[] args) {
		
		Calc1 calc=new Calc1();
		int result=calc.add();
		System.out.println(result);
	}
}


