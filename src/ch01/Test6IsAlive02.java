package ch01;

/**
 * @author 冯蔚
 * 日期：2018年11月21日 下午10:21:17
 * 
 */
public class Test6IsAlive02 extends Thread {
	public Test6IsAlive02() {
		System.out.println("Test6 begin:");
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
		System.out.println("this.getName():" + this.getName());
		System.out.println("this.isAlive():" + this.isAlive());
		this.setName("test6isalive");
	}
	
	@Override
	public void run() {
		System.out.println("run begin:");
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
		System.out.println("this.getName():" + this.getName());
		System.out.println("this.isAlive():" + this.isAlive());
	}
	
	public static void main(String[] args) {
		Test6IsAlive02 test6IsAlive02 = new Test6IsAlive02();
		Thread t1 = new Thread(test6IsAlive02);
		//System.out.println("main begin t1 is Alive:" + t1.isAlive());
		t1.setName("A1");
		t1.start();
		//System.out.println("main end t1 is Alive:" + t1.isAlive());
	}

}
