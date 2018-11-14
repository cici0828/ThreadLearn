package ch01;

/**
 * @author 冯蔚
 * 日期：2018年11月14日 下午9:26:02
 * 
 */
public class Test05CurrentThread02 implements Runnable {
	
	public Test05CurrentThread02() {
		System.out.println("构造方法打印：" + Thread.currentThread().getName());
	}


	@Override
	public void run() {
		System.out.println("run方法打印：" + Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		Thread test05CurrentThread02 = new Thread(new Test05CurrentThread02());
		test05CurrentThread02.run();
		test05CurrentThread02.start();
	}

}
