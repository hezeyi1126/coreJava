package my.com.c3;
/**
 * 同步方法和非同步方法可否同时执行
 * @author 贺保铭
 *
 * 2018年05月14日
 */
public class T {

	public synchronized void m1() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("this is m1");
	}
	
	public void m2() {
		System.out.println("this is m2");
	}
	
	
	public static void main(String[] args) {
		T t = new T();
		new Thread(() -> t.m1()).start();
		new Thread(() -> t.m2()).start();
	}

}
