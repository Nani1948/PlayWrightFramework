package basic.day2.method;

public class MethodDemo {
	//It is main purpose : it is reusabailtuy of method.
	//Method can be  return type  and return value.
	//Method can be parameterized or non-parameterized
	//In the method, local variable are declared .it is belongs to method.
	//it is particular to belong to particular method.
	//Local Variable:The variable which belongs to a particular method but not inside the class.
	//Method Overloading :The mutiple methods with same name but differ in parameter list.
	//No.of.parameter or type of parameter or Order of parameter.
	//It server different implementation for the same name.
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public int add(int a,double b) {
		return 0;
	}
	public void add() {
		
	}
	public String add(String a,String b) {
		return a+b;
	}
	public static void main(String []args) {
		MethodDemo d=new MethodDemo();
		int res=d.add(19, 20);
		System.out.println("Addition Of Two Number:"+res);
		double res1=d.add(10.20,10.20);
		System.out.println("Addition Of Two Number:"+res1);
		String res2=d.add("10","20");//it will be concentation method.
		System.out.println("Addition Of Two Number:"+res2);
		//Function Overloading /Method overloading/Compile time binding, compiler time polymorphism
		
		
	}

}
