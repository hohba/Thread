package thread;

public class Thread_runnable extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 10; i++) {
			System.out.println("スレッド"+getName()+"から出力 : "+i);
		}
	}

}
