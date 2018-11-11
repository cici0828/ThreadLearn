package ch01;

/**
 * @author 
 * 日期：2018年11月11日 下午9:33:16
 * 
 */
public class Test03 implements Runnable {
	private int count=5;

	@Override
	synchronized public void run() {
		System.out.println(Thread.currentThread().getName()+ ":" + count--  );
	}
	
	public static void main(String[] args) {
		Test03 test02 = new Test03();
		Thread thread_a = new Thread(test02, "a");
		Thread thread_b = new Thread(test02, "b");
		Thread thread_c = new Thread(test02, "c");
		Thread thread_d = new Thread(test02, "d");
		Thread thread_e = new Thread(test02, "e");
		thread_a.start();
		thread_b.start();
		thread_c.start();
		thread_d.start();
		thread_e.start();
	}


}
