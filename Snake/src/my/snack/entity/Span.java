package my.snack.entity;
/**
 * @author 贺保铭
 *
 * 2018年05月22日
 */
/**
 * 实体类  棋盘
 * @author Administrator
 *
 */

import java.util.HashSet;
import java.util.Set;

public class Span {
	private Snake snake;
	
	private Set<Node> nodes;
	
	private Set<Node> dots;
	
	private int length = 20;
	private int width = 100;
	
	
	/**
	 * 打印棋盘
	 */
	public void paint() {
		//System.out.println(nodes.size());
		for(int i = 0 ; i < length;i++){
			for(int j = 0; j < width ;j++) {
				Node node = new Node(j, i);
				if(i ==0 || j==0 || i==(length-1) || j == (width-1)) {
					System.out.print("!");
				}else if(snake.getBody().contains(node) || nodes.contains(node)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(snake.getBody().contains(node) && nodes.contains(node)) {
					nodes.remove(node);
					snake.eat(new Node(j, i));
				}
				
				
			}
			System.out.println();
		}
	}
	

	public Span(Snake snake, Set<Node> nodes) {
		super();
		this.snake = snake;
		this.nodes = nodes;
	}
	
	public Span() {
		if(dots == null ) dots = new HashSet<Node>();
		for(int i=0; i < length;i++) {
			for(int j=0 ; j < width ;j++) {
				dots.add(new Node(i, j));
			}
		}
		//System.out.println(dots.size());
	}
	
	

	public Set<Node> getDots() {
		return dots;
	}


	public void setDots(Set<Node> dots) {
		this.dots = dots;
	}


	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public Set<Node> getNodes() {
		return nodes;
	}

	public void setNodes(Set<Node> nodes) {
		this.nodes = nodes;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
}
