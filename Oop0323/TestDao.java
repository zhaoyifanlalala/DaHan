package fanxing;

import java.util.HashMap;
import java.util.List;

/*
定义一个测试类 分别对上述方法进行测试      //list()没写出来
 */
public class TestDao {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<User>();
        dao.map = new HashMap<String, User>();          //为什么不写这个会出现空指针异常错误
        dao.save("1",new User(1,"张三"));
        dao.save("2",new User(2,"李四"));
        dao.save("3",new User(3,"王五"));
        dao.save("4",new User(4,"小二"));
        List<User> list=dao.list();
        for (User u:list) {
            System.out.println(u.toString());
        }
        //save
        System.out.println(dao.map);
        //get
        System.out.println(dao.get("1"));
        //update
        dao.update("4",new User(4,"小四"));
        System.out.println(dao.map);
        //delete
        dao.delete("4");
        System.out.println(dao.map);

    }

}
