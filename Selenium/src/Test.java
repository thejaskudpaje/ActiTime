class Run{
	static int k;
	public static void run() {
		System.out.println(k);
	}
}
public class Test {
	static int i;
	int j;
public static void main(String[] args) {
	Run.k=18;
	System.out.println(i);
	Test t=new Test();
t.test();
Run.run();
}
public void test() {
	j=10;
	System.out.println(j);
}
}
