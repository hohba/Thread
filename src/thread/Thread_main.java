package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run th = new Thread_run();
		th.start();
		Thread_runnable th2 = new Thread_runnable();
		th2.run();//runÇ∂Ç·Ç»Ç¢Ç∆Ç‹Ç∏Ç¢ÇÃÇ©ÅcÅB
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0;i < 10; i++) {
			System.out.println("mainÇ©ÇÁèoóÕ : "+i );
		}

	}

}
