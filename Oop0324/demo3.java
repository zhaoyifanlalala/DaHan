package zijieliu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
3.创建a/test.txt文件并在其中输入"hello world",
创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中
 */
public class demo3 {
    public static void main(String[] args) {
        new File("a").mkdir();
        File file = new File("a/test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        new File("b").mkdir();
        File file2 = new File("b/test.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String content = "hello world!";
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(content.getBytes());
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
            inputStream = new FileInputStream(file);
            inputStream.read(content.getBytes());
            System.out.println("a/test.txt中的文本为:"+content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String newContent = br.readLine().replace("l","L");
            outputStream = new FileOutputStream(file2);
            outputStream.write(newContent.getBytes());

            inputStream = new FileInputStream(file2);
            inputStream.read(content.getBytes());
            System.out.println("b/test.txt中的文本为:"+newContent);

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
    }
}
