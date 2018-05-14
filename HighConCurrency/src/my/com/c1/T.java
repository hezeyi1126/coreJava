package my.com.c1;
/**
 * @author 贺保铭
 *
 * 2018年05月08日
 */
public class T {
	private int count = 500000;
	
	private long end = 0;

	private Object o = new Object();

	public void countDown() {//没一个线程要执行下列代码时  都要获得 o这个对象锁才能执行 
		//synchronized(o) {
		while(count > 0) {
			//synchronized(o) {
				if(count == 0) {end = System.currentTimeMillis();      
				
					System.out.println();
					break;
				}
				count--;
				System.out.println(Thread.currentThread().getName() + "  当前数字是:----->" +count);
			//}
		}
		//}
	}
	
	public synchronized static void m() {
		System.out.println("this is a synchronized method");
	}
	
	public static void mm() {
		synchronized(T.class) {
			System.out.println("this is a static synchronized method");
		}
	}
	

	public static void main(String[] args) {
		T t = new T();
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 5 ;i++) {
			Thread t1 = new Thread(() -> t.countDown());
			t1.start();
//			try {
//				t1.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
		
		//t.countDown();
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		//System.out.println(t.count);
	}

}
