package ch01;

/**
 * @author 冯蔚
 * 日期：2018年11月23日 下午10:01:19
 * 
 */
public class Test7Sleep01 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + "end--" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Test7Sleep01 test7Sleep01 = new Test7Sleep01();
		System.out.println(System.currentTimeMillis());
		//test7Sleep01.run();
		test7Sleep01.start();
		System.out.println(System.currentTimeMillis());
		
	}

}
