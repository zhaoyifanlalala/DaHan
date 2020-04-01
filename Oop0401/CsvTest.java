package com.banyuan.homework2;

import com.csvreader.CsvWriter;

import java.io.*;
import java.util.LinkedList;
/*
作业2: 循环写入cvs文件 要求：再次启动程序的时候往文件里面写不能覆盖原有的内容
 */
public class CsvTest {
    static LinkedList<String[]> linkedList = new LinkedList<>();
    static File file = new File("1.csv");

    public static void main(String[] args) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        linkedList.add(new String[]{"1", "apple","1"});
        linkedList.add(new String[]{"2", "orange","1"});
        linkedList.add(new String[]{"3", "strawberry","1"});

    }
    public void writeFileToCsv(String[] str, String file) {
    File f = new File(file);
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
        CsvWriter cwriter = new CsvWriter(writer, ',');
        cwriter.writeRecord(str, true);
        cwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

