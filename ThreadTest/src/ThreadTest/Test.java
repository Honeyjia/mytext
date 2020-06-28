package ThreadTest;

public class Test extends Thread{
	public void run() {
		for(int i=0;i<20;i++)
		{
			System.out.println(" +++ Java多线程  +++");
		}
	}
	public static void main(String[] args) {
		Test Thread = new Test();
		Thread.start();
		for(int i=0;i<20;i++)
		{
			System.out.println(" --- Java多线程  ---");
		}
	}
}

