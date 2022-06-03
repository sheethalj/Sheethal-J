package TNSIF;

class A
{

	int a;
	int b;
	public A(int a, int b){

		System.out.println("ïn a calss defailt constructor");
		this.a=a;
		this.b=b;

	}
}

class B extends A{

	static int b;
	int c;
	public B(){
		super(b, b);
		System.out.println("ïn b calss defailt constructor");
		super.a=10;
		super.b=20;
	}
	public B(int c){
		super(c, c);
		this.c =c;
		System.out.println("ïn b calss parameterized constructor");

	}
}
public class main{

	public static void main(String[] args) {
		
		B obj =  new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}