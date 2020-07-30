package com.my;

/**
 * 对于 Records 来说，一条 Record 就代表一个不变的状态。
 * 尽管它会提供诸如 equals()、hashCode()、toString()、构造方法，以及字段的 getter，
 * 但它无意替代可变对象的类（没有 setter），以及 Lombok 提供的功能。
 * @author bao
 *
 */
public class Records {
	
	public record People(String name,int age) {}
	
	
	public static void main(String[] args) {
		People p = new People("张三 ", 18);
		People p2 = new People("李四 ", 20);
		
		
		System.out.println(p.equals(p));
		System.out.println(p.equals(p2));
		
		System.out.println("我叫" + p.name() );
		System.out.println("今年" + p.age() +"岁");
		
	}
	
}
