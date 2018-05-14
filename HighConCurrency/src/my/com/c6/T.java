package my.com.c6;
/**
 * 同一个线程 同步方法可以调用同步方法， synchronized 是可重入锁
 * 
 * 写一个程序模拟死锁
 * @author 贺保铭
 *
 * 2018年05月14日
 */
public class T {
	Object o = new Object();

	public synchronized void m1() {
		System.out.println("m1 started");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		m2();
	}

	public  void m2() {
		synchronized(o) {
			System.out.println("m2 started");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			m1();
		}
	}


	public static void main(String[] args) {
		T t = new T();
		//死锁程序
		new Thread(() -> t.m1()).start();
		new Thread(() -> t.m2()).start();
	}

}
