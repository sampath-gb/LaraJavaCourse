class N 
{
	N()
	{
		System.out.println("N()");
	}
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("------");
		N n2 = new N();
		System.out.println("------");
	}
}
/*
- in every constructor body the first statement would be super() calling statement.
(if the programmer didnt keep super or this calling statement explecitely).
- each and every class is a sub class to object class(wheather diredctly or indirectly )
- object class is the supermost class in  java
- some of the commenly requiredd members are inherited to the sub-classes from the object classs
- super calling statement is calling the object class no argument constructor
- super calling statement is calling the object class no argument constructor
- in the object class we have one constructor which is no argument constructor, and we dont have any statement inside that constructor
- super statement will be always calling the super caling constructor
- super and this statement comes under non-static
- this calling statement always calls the current class constructor not the super class constructor
- if we keep super() , or any argument then compiler will not be keeping super()
- in the constructor body only either this or super calling statement not both








*/






