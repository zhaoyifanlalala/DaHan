package zijieliu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
2.利用字节流或者换成字节流的方式以指定的格式输入数据
如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
 */
public class demo2 {
    public static void main(String[] args) {
        File file=new File("1.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> list=new ArrayList<>();
        list.add("赵赵");
        list.add("赵小帆");
        list.add("小帆帆");
        list.add("小帆");
        list.add("一帆");
        list.add("赵");
        list.add("一一");
        list.add("帆");
        list.add("小小帆");
        list.add("帆帆");
        list.add("方方");
        list.add("憨憨");
        list.add("小韩子");
        list.add("啦啦");

        OutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(file);
            for (int i = 0; i < list.size(); i++) {
                outputStream.write(list.get(i).getBytes());
                if (i!=list.size()-1){
                    if ((i+1)%5==0){
                        outputStream.write("\n".getBytes());
                    }else {
                        outputStream.write(",".getBytes());
                    }
                }else {
                    outputStream.write(".".getBytes());
                }
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
            System.out.println("1.txt内容如下：\n"+str);

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
    }
}
