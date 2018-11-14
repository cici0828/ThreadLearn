package ch01;

/**
 * @author ��ε
 * ���ڣ�2018��11��14�� ����9:32:55
 * 
 */
public class Test05CurrentThread03 extends Thread {
	public Test05CurrentThread03(){
		System.out.println("Test-begin");
		System.out.println("Test01:" + Thread.currentThread().getName());
		System.out.println("Test02:" + this.getName());
		System.out.println("Test-end");
	}
	 
	@Override
	public void run() {
		System.out.println("Run-begin");
		System.out.println("Run01:" + Thread.currentThread().getName());
		System.out.println("Run02:" + this.getName());
		System.out.println("Run-end");		
	}
	
	public static void main(String[] args) {
		Test05CurrentThread03 test05CurrentThread03 = new Test05CurrentThread03();
		Thread thread = new Thread(test05CurrentThread03);
		thread.setName("A");
		thread.start();
		//thread.run();
	}

}
