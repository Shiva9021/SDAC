package debugging;

class A{
	void meth1(int a){
		a=0;
		System.out.println(a);
	}
	void meth2(int a, int b){
		System.out.println(a+b);
		
	}
}
public class Demo {
public static void main(String[] args) {
 A a = new A();
 a.meth1(10);
 a.meth2(10, 20);
}
}
