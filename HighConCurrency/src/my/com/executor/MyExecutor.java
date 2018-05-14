package my.com.executor;

import java.util.concurrent.Executor;

/**
 * @author 贺保铭
 *
 * 2018年05月10日
 */
public class MyExecutor implements Executor{

	@Override
	public void execute(Runnable command) {
		command.run();
		//or
		//new Thread(command).start();
	}
	
	public static void main(String[] args) {
		new MyExecutor().execute(() ->System.out.println("哈哈 这是Myexecutor"));
		Object o = new Object();
		
	}
	
}
