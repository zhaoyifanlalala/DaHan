class basic8 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0;i < 100; i++){
            count = count++;
        }
        System.out.println("count="+count);
        //求cont输出的值. count=0
    }
}