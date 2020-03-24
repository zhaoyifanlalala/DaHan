package zijieliu;

import java.io.File;
import java.io.FilenameFilter;

/*
课堂作业1：找到指定文件夹下面所有满足.java 文件。
 */
public class demo1 {
    public static void main(String[] args) {
        File file=new File("/Users/edz/dahan");
        String[] str=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java")){
                    return true;
                }
                return false;
            }                                   //运行出来的结果只能看到dahan文件夹里面的.java文件，
                                                //不能看到dahan里面的 文件夹里面的.java文件
        });
        for (String s:str) {
            System.out.println(s);
        }
    }
}
