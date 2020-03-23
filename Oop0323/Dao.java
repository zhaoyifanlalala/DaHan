package fanxing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
定义一个泛型Dao<T>，在其中顶一个Map成员变量,Map的键为String类型，值为T类型
分别创建以下方法:
public void save(String id,T entity) 保存T乐行的对象到map集合中
public T get(String id) 从map中获取id对应的对象
public  void update(String id,T entity) 替换map中的key为id的内容
public List<T> list()  返回map中所有的 T 对象
public  void delete(String id) 删除指定对象

定义一个User类  Integer id   String name
定义一个测试类 分别对上述方法进行测试
 */
public class Dao<T> {
    Map<String, T> map;

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {

        return map.get(id);
    }

    public void update(String id, T entity) {
        map.replace(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<T>();
        return list();
    }

    public void delete(String id) {
        map.remove(id);
    }

}
