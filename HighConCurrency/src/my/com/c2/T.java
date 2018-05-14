package my.com.c2;
/**
 * @author 贺保铭
 *
 * 2018年05月14日
 */
public class T implements Runnable{

	private int count = 10;
	@Override
	public synchronized void run() {
		count--;
		System.out.println(Thread.currentThread().getName() +"--------" + count);
	}
	
	public static void main(String[] args) {
		T t = new T();
		for(int i = 0;i < 5;i++) {
			//new Thread(t).start();
			new Thread(t,"T" + i).start();
		}
	}

}
