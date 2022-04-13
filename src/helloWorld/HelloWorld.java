package helloWorld;

public class HelloWorld {

	String message;
	
	
	public static HelloWorld syracuse(int i, HelloWorld h) {
		if (i % 2 != 0)
			return syracuse(3 * i + 1, h);
		return h;
	}
	
	public static HelloWorld getInstance() {
		HelloWorld xy = null;
		return syracuse(42, xy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	
	public HelloWorld(String msg) {
		message = msg;
	}
	
	public void printMessage() {
		printMessage(1);
	}

	
	public void printMessage(int i) {
		int j = 0;
		while (j < i) {
			System.out.println(message);
			j++;
		}
		
	}
	
	
	public static void test() {
		
		IdentityInt ii = new IdentityInt(1);
		int iii = ii.get();
		
		//IdentityObject io = new IdentityObject(new HelloWorld(""));
		//int ioi = (int) io.get();
		
		Identity<Integer> ip = new Identity<Integer>(new Integer(123));
		Integer iiii = ip.get();
		int klm = iiii.intValue();
		
		
		Identity<String> is = new Identity<String>("lkjlkjlkjljlkj");
		String stree = is.get(); 
		
		

		Identity<Object> iso = new Identity<Object>("lkjlkjlkjljlkj");
		Object steree = iso.get(); 
		Integer lkjlkjlkj = (Integer) iso.get();
		
		
		
		
		MyList<String> mls = new MyList<String>();
		mls.create("Hello World !");
		mls.create("Hello World !");
		mls.create("Hello World !");
		mls.create("Hello World !");
		
		
		String str = mls.read(3);
		
		System.out.println(str);
	}
	
}
