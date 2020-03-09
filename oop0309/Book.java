package cn.face;

public class Book {
    private String title;
    private int pageNum=200;

    public void setTitle(String title){
        this.title=title;
    }
    public void setPageNum(int pageNum){
        if (pageNum >= 200){
            this.pageNum = pageNum;
        }else {
            this.pageNum=200;
        }
    }
    public String getTitle(){
        return title;
    }
    public int pageNum(){
        return this.pageNum;
    }

    public String detail(){
        return "这本教材的名称是:"+title+"，总页数为"+pageNum+"页";
    }

}
