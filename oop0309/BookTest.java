package cn.face;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("葵花宝典");
        book.setPageNum(300);
        System.out.println(book.detail());
    }
}
