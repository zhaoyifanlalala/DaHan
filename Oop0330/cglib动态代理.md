#### 1.cglib 动态代理 上传到git 明天检查 找出 jdk 动态代理和 cglib 动态代理的不同
```

```
#### 2.使用jdk给指定的程序添加额外的功能
```

```
#### 3.写出一个线程安全的单例模式
```
public class LazySafe {
    private static LazySafe lazySafe=null;

    private  LazySafe(){

    }
    public static LazySafe getInstance() {
        if (lazySafe == null) {
            synchronized (LazyDemo.class) {
                if (lazySafe == null) {
                    lazySafe = new LazySafe();
                }
            }
        }
        return lazySafe;
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(LazySafe.getInstance().hashCode());
    }
}
class Test{
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        MyThread1 myThread2=new MyThread1();
        myThread1.start();
        myThread2.start();
    }
}
```