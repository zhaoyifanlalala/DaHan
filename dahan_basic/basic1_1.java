class basic1_1 {
    public static void main(String[] args) {
        //1、有10长度的字符串数组,根据字符串的长度进行降序排序输出
        int a[] = {1, 5, 8, 2, 4, 7, 6, 3, 9, 10};
        int t;
        for (int i = 0; i < a.length - 1; i++) {				//控制趟数
            for (int j = 0; j < a.length - 1 - i ; j++) {		//控制每趟比较的次数
                if (a[j] < a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int c : a) {
            System.out.print(c + " ");
        }

    }
}