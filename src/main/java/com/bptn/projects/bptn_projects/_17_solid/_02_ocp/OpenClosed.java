package com.bptn.projects.bptn_projects._17_solid._02_ocp;

interface Document{
	void print();
}
class Credit implements Document{
	@Override
	public void print() {
		System.out.println();
	}
}


// open to extension and closed to modification
class Printer{
	void print(Document doc) {
		doc.print();
	}
}
public class OpenClosed {
	

	public static void main(String[] args) {
		Printer prt = new Printer();

	}

}
