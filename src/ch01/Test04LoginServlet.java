package ch01;

/**
 * @author 日期：2018年11月11日 下午9:31:41
 * 
 */
public class Test04LoginServlet {
	private static String username;
	private static String password;

	synchronized public static void doPost(String username, String password) {

		try {
			Test04LoginServlet.username = username;
			if (username.equals("a")) {
				Thread.sleep(1000);
			}
			Test04LoginServlet.password = password;
			System.out.println(Test04LoginServlet.username + ":" + Test04LoginServlet.password);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
	
	public static void main(String[] args) {
		new Thread(new Runnable() {		
			@Override
			public void run() {
				Test04LoginServlet.doPost("a", "aa");	
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Test04LoginServlet.doPost("b", "bb");	
			}
		}).start();
	}

}
