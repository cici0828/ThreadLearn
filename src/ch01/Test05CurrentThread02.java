package ch01;

/**
 * @author ��ε
 * ���ڣ�2018��11��14�� ����9:26:02
 * 
 */
public class Test05CurrentThread02 implements Runnable {
	
	public Test05CurrentThread02() {
		System.out.println("���췽����ӡ��" + Thread.currentThread().getName());
	}


	@Override
	public void run() {
		System.out.println("run������ӡ��" + Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		Thread test05CurrentThread02 = new Thread(new Test05CurrentThread02());
		test05CurrentThread02.run();
		test05CurrentThread02.start();
	}

}
