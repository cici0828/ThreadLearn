package ch01;

/**
 * @author 冯蔚
 * 日期：2018年11月20日 下午10:07:55
 * 
 */
public class Test6IsAlive01 extends Thread{
	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test6IsAlive01 test6IsAlive01 = new Test6IsAlive01();
		System.out.println("begin:" + test6IsAlive01.isAlive());
		test6IsAlive01.start();
		Thread.sleep(10000);
		System.out.println("end:" + test6IsAlive01.isAlive());
	}

}
