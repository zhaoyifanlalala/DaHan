package Collection;
/*
2.课程类：编号 课程名称
 */
public class Course {
    private String cname;
    private int cid;

    public Course() {

    }

    public Course(String cname, int cid) {
        this.cname = cname;
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                ", cid=" + cid +
                '}';
    }
}
