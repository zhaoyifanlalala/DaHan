class basic5 {
    public static void main(String[] args) {
        int x = 5, y = 6, z;
        //z = ++x + y++; 		
        //System.out.println("z="+z+",x="+x+",y="+y);
        //z = ++x + x++;
        //System.out.println("z="+z+",x="+x+",y="+y);
        //x = ++x + x++;
        //System.out.println("x="+x);
        z = x > y ? ++x : y++;
        System.out.println("z="+z+",x="+x+",y="+y);
        /*输出ABCD题目中x、y、z的值
    		z=12,x=6,y=7
			z=12,x=7,y=6
			x=12 
			z=6 x=5 y=7 
    	*/
    }
}