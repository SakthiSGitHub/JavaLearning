package com.java.sakthi;

public class Main {

    public static void main(String[] args) {
	    Parent.printName();
	    Child.printName();
	    Parent parent = new Parent();
	    parent.printName();
	    parent.printFullName();
	    Child child = new Child();
	    child.printName();
	    child.printFullName();
	    Parent newChild = new Child();
	    newChild.printName();
	    newChild.printFullName();
    }
}
