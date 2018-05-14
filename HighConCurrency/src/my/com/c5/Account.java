package my.com.c5;

import java.util.concurrent.TimeUnit;

/**
 * dirty read 
 * @author 贺保铭
 *
 * 2018年05月14日
 */
public class Account {

	private String name;
	
	private double balance;
	
	public synchronized void setAcc(String name,double balance) {
		this.name = name;
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
		}
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account();
		new Thread(() -> acc.setAcc("至尊宝", 200.0f)).start();
		
		System.out.println(acc.getBalance());
		
		TimeUnit.SECONDS.sleep(2);
		
		System.out.println(acc.getBalance());
	}
}
