package ch01;

/**
 * @author ��ε
 * ���ڣ�2018��11��20�� ����10:07:55
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
