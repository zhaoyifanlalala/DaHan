class basic6 {
    public static void main(String[] args) {
        String a = "aa";
        int c = 555;
        String b = a + "bbb" + c;
        double d = 5.66600;
        int e = (int) d;
        int f = 3;
        double g = 3.53;
        float h = 1.7f;
        int i = 1;
        System.out.println(b);
        System.out.println(e);
        System.out.println( f / i );
        System.out.println( g / f);
        System.out.println( h / f );
        System.out.println(  9.5 < 8 );
        System.out.println( (int)'a' +  (int)'z' );
        System.out.println("A~Z：" + ((int)'A') + "~" + ((int)'Z'));
        System.out.println("'A' < 'a':" + ('A' < 'a'));
    }
}
/*
aabbb555
5
3
1.1766666666666665
0.56666666
false
219
A~Z：65~90
'A' < 'a':true
*/