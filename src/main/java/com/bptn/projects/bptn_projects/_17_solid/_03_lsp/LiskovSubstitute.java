package com.bptn.projects.bptn_projects._17_solid._03_lsp;

class Bird{
	void fly() {
		
	}
}

class BirdsThatFly{
	
}
class BirdsThatDontFly{
	
}

class Penguin extends BirdsThatDontFly{
	
}


public class LiskovSubstitute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static void doSomething(Penguin pen) {
		System.out.println("doSomething");
	}

}
