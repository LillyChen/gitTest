package demo;


 abstract  class A {
	 A(){
		 
	 }
	A(int i){
		print();
		System.out.println("A");
	}
	public void f(){
		System.out.println("f");
	}
	public void g(){
		h();
		System.out.println("g");
	}
	public String toString(){
		return "A";
	}
	
	public void h(){
		System.out.println("Ah");
	}
	
	abstract void print();
}
