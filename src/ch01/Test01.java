package ch01;

/**
 * @author 
 * 日期：2018年11月11日 下午5:21:24
 * 
 */
public class Test01 extends Thread {
	private int count = 5;
	
	public  Test01(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public void run() {
		super.run();
		while(count> 0) {
			count--;
			System.out.println(Thread.currentThread().getName()+ ":" + count);
		}
	}
	
	public static void main(String[] args) {
		Test01 test01_a = new Test01("A");
		Test01 test01_b = new Test01("B");
		Test01 test01_c = new Test01("C");
		test01_a.start();
		test01_b.start();
		test01_c.start();
	}

}
