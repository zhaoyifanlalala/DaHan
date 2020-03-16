### //作业1：
#### 1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出将上诉字节数组  从指定的位置开始到结束转换成字符串输出
```
public static void main(String[] args) {
        String str = new String();
        byte [] by={65,67,68,97,98,101};
        str = new String(by);
        System.out.println(str);
    }
```
#### 2.同样的自定义一个字符数组用字符串的方式输出
```
        char[] ch = {'a','b','c','d','e'};
        String ch1 = String.valueOf(ch);
        System.out.println(ch1);
```
#### 3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
```
public static void main(String[] args) {
        String a = "abcdw";
        String b = "ABCDw";
        System.out.println(a.equalsIgnoreCase(b));
    }
```
#### 4."我是你的谁,我是你的剑" 判断是否包含 "剑"
```
public static void main(String[] args) {
        String a = "我是你的谁,我是你的剑";
        String b = "剑";
        if (a.indexOf(b) != -1) {
            System.out.println("字符串:" + a + "中有" + b);
        } else {
            System.out.println("字符串:" + a + "中没有" + b);
        }
    }
```
#### 5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
```
public static void main(String[] args) {
        String a = "我是你的谁,我是你的剑";
        if (a.startsWith("我") && a.endsWith("剑")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
```
#### 6.String   str=""和 String  str2=null; 判断他们是否为空
```
        String str = "";
        String str2 = null;
        if (str == null) {
            System.out.println("str为空");
        }
        if (str2 == null) {
            System.out.println("str2为空");
        }
```
#### 7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
```
        String a = "我是你的小宝贝";
        if (a.indexOf("我") != -1){
            System.out.println("我");
        }else{
            System.out.println("不存在");
        }
```
#### 8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
```
        String a = "我是你的谁,我是你的剑";
        System.out.println(a.indexOf("你"));
```
#### 9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
```
        String a = "我是你的谁,我是你的剑";
        System.out.println(a.lastIndexOf("你"));
        System.out.println(a.indexOf("你",4));

```
#### 10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
```
        String a = "我是你的谁,我是你的剑";
        System.out.println(a.substring(5));
        System.out.println(a.substring(1,9));
```
#### 11." 我是你的谁,我是你的剑 " 去除字符串左右空格
```
        String a = " 我是你的谁,我是你的剑 ";
        System.out.println(a.trim());
```
#### 12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
```
        String a = "我是你的谁,我是你的剑";
        System.out.println(a.replace("谁","被子"));

```
#### 13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
```
        String a = "我是你的谁,我是你的剑";
        System.out.println(a.replaceAll("你","哈"));

```
#### 14. 比较 "avabc" 和 "avab" 字符串
```
        String a = "avabc";
        String b = "avab";
        System.out.println(a == b);
        System.out.println(a.equals(b));
```
#### 15. 将字符数组转换成 字符串输出
```
        char[] ch = {'a','b','c','d','e'};
        String ch1 = String.valueOf(ch);
        System.out.println(ch1);

```
#### 16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
```

        String str = "啦啦啦我是谁";
        byte[] ss = str.getBytes("UTF-8");
        str = new String(ss,"UTF-8");
        System.out.println(str);
```

### //作业2: String  StringBuffer  StringBuilder   总结 
```

string是编程语言中的字符串，String类是不可变的，对String类的任何改变，都是返回一个新的String类对象。 String 对象是 System.Char 对象的有序集合，用于表示字符串。String 对象的值是该有序集合的内容，并且该值是不可变的。
string赋值是给string分配空间，把值放在所分配的空间里，一般当值不经常变的时候使用；stringbuffer是设置缓存空间，把值放在缓存空间里，当值需要经常变动的时候使用
stringBuilder是.net提供的动态创建string的高效方式，以克服string对象恒定性带来的性能影响。

```

---

## API练习
#### 1:需求：请设计一个方法，可以实现获取任意范围内的随机数。
```

```
#### 2.定义一个StringBuffer类对象，
#### 1）使用append方法向对象中添加26个字母，并倒序遍历输入
#### 2）删除前五个字符
```
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("倒序输出");
        System.out.println(buffer.reverse());
        // 删除前五个字符
        buffer.reverse();
        buffer.delete(0,5);
        System.out.println(buffer);

    }

```
#### 3.将字符串中指定部分进行反转。
```
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("我喜欢苹果草莓樱桃葡萄香蕉山竹芒果梨，是吃火锅还是烤肉这是一个值得深思的问题。");
        StringBuffer stringBuffer1 = new StringBuffer(stringBuffer.substring(1,25));
        System.out.println(stringBuffer1.reverse());
```
#### 4. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，“To be or not to be"，将变成"oT eb ro ton ot eb."。
```
        String str = "To be or not to be";
        String[] strArr = str.split(" ");

        for(int i = 0; i < strArr.length; i++){
            StringBuffer stringBuffer = new StringBuffer(strArr[i]);
            stringBuffer = stringBuffer.reverse();
            System.out.printf(stringBuffer+" ");
        }
```
面试题：
#### 5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个”。