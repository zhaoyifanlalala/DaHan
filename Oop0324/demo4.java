package zijieliu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
4.在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，
然后再从文件中把Student对象的信息读出,并且把读出来的数据重新塞给一个对象,然后显示在控制台上
 */
public class demo4 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1111,"小帆",23));
        list.add(new Student(1112,"小韩",23));
        list.add(new Student(1113,"小赵",18));
        list.add(new Student(1114,"小方",24));
        new File("io").mkdir();
        File file = new File("io/student.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write("学生信息：\n".getBytes());
            for (int i = 0; i < list.size(); i++) {
                Student student=list.get(i);
                outputStream.write(("学号:"+student.getStuId()+",").getBytes());
                outputStream.write(("姓名:"+student.getStuName()+",").getBytes());
                outputStream.write(("年龄:"+student.getStuAge()).getBytes());
                outputStream.write("\n".getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(file);
            byte[] by=new byte[(int)file.length()];
            inputStream.read(by);
            String str=new String(by,0,by.length);
            System.out.println("student.txt内容如下：\n"+str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //不知道怎么塞给另外的对象 T_T
    }
}
