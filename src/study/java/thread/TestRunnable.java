package study.java.thread;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("i="+i);
		}		
	}

	public static void main(String[] args) {
		Thread myThread = new Thread(new TestRunnable());
		myThread.start();//启动线程
		//myThread.run(); //方法调用
		for (int i = 0; i < 10; i++) {
			System.out.println("main i="+i);
		}
	}
}
