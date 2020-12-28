class P{
        public void m1(){
	System.out.println("Parent Class");
}
}

class C extends P{
      public void m2(){
	System.out.println("Child Class");
}	
}

class Test{
       public static void main(String[] args){
	P p = new P();
	p.m1();
	C c = new C();
	c.m1();
	c.m2();
	P p1 = new C();
	p1.m1();	
}
}