class basic1{
	public static void main(String[] args){
		//1、
		int a = 10;
	    int b = 10;
	    int c = 10;
	    a = b++;    
	    c = --a;    
	    b = ++a;    
	    a = c--; 
	    System.out.println("a="+a+",b="+b+",c="+c);

	    /*
			a=9
			b=10
			c=8
	    */

	}
}