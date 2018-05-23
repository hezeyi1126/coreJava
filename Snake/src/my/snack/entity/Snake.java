package my.snack.entity;
/**
 * @author 贺保铭
 *
 * 2018年05月22日
 */

import java.util.LinkedList;
import java.util.List;

public class Snake {
	private LinkedList<Node> body;
	
	
	
	public void eat(Node node) {
		body.addLast(node);
	}
	
	public void moveUp() {
		Node first = getFirst();
		body.addFirst(new Node(first.getX(), first.getY() -1));
		body.removeLast();
	}
	
	public void moveDown() {
		Node first = getFirst();
		body.addFirst(new Node(first.getX(), first.getY() +1));
		body.removeLast();
	}
	
	public void moveLeft() {
		Node first = getFirst();
		body.addFirst(new Node(first.getX() - 1, first.getY()));
		body.removeLast();
	}
	
	public void moveRight() {
		Node first = getFirst();
		body.addFirst(new Node(first.getX() + 1, first.getY()));
		body.removeLast();
	}

	public Snake(LinkedList<Node> body) {
		super();
		this.body = body;
	}

	public List<Node> getBody() {
		return body;
	}

	public void setBody(LinkedList<Node> body) {
		this.body = body;
	}
	
	private Node getFirst() {
		return body.getFirst();
	}
	
	private Node getLast() {
		return body.getLast();
	}
	
	
}
