package my.snack.run;
/**
 * @author 贺保铭
 *
 * 2018年05月22日
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import my.snack.entity.Node;
import my.snack.entity.Snake;
import my.snack.entity.Span;

public class Run {
	private Span span;
	
	public void init(int snakeLength,int nodeCount) {
		if(span == null) {
			span = new Span();
		}
		//snakeLength = 1;
		//初始化蛇的身体
		Random ran = new Random();
		LinkedList<Node> body = new LinkedList<Node>();
		for(int i =0;i < snakeLength ;i++) {
			body.add(new Node(ran.nextInt(span.getWidth()), ran.nextInt(span.getLength())));
			
		}
		//System.out.println(body.size());
		//初始化吃的豆子
		Set<Node> nodes = new HashSet<Node>();
		for(int i =0;i < nodeCount ;i++) {
			nodes.add(new Node(ran.nextInt(span.getWidth()), ran.nextInt(span.getLength())));
		}
		//System.out.println(nodes.size());
		this.span =  new Span(new Snake(body), nodes);
	}
	
	public void startGame() {
		span.paint();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请输入移动方向,wsad，上下左右");
			String str = sc.next();
			if("w".equals(str)) span.getSnake().moveUp();
			if("s".equals(str)) span.getSnake().moveDown();
			if("a".equals(str)) span.getSnake().moveLeft();
			if("d".equals(str)) span.getSnake().moveRight();
			
			span.paint();
		}
	}
	
	public static void main(String[] args) {
		Run run = new Run();
		run.init(1, 5);
		run.startGame();
		
		
	}
	
}
