#### 一、选择题
```

1.下面哪些是合法的变量名? ( D、E)

 A．2variable              
 B. ．variable2    
  C. ．_whatavariable
 D．_3_  
  E．$anothervar  
  F．#myvar      
 G. $_￥
2.请问 “abcd” instanceof Object返回的值是? ( B)
A. “abcd”  B. true   C. false  D. String 
3.下面有关方法覆盖说法不正确的是：( B)
A. 方法覆盖要求覆盖和被覆盖的方法有相同的名字，参数列以及返回值 
B. 方法覆盖要求覆盖和被覆盖的方法必须具有相同的访问权限； 
C. 覆盖的方法不能比被覆盖的方法抛出更多的异常 
D. 覆盖的方法一定不能是private的 
4. 下面代码段中：( A)
String String=”String”;    
System.out.println(String);
A. String  B.不知道  C. 编译出错 D. 运行出错
6.关于被私有保护访问控制符protected修饰的成员变量，以下说法正确的是? ( A)
A．可以被三种类所引用：该类自身、与它在同一个包中的其他类、在其他包中的该类的子类  
B. 可以被两种类访问和引用：该类本身、该类的所有子类 
C. 只能被该类自身所访问和修改 
D．只能被同一个包中的类访问 
7.下列有关继承的说法。正确的是：(B )
A. 子类能继承父类的所有方法和属性；
B. 子类能继承父类的非私有方法和属性  
C. 子类只能继承父类public方法和属性 
D. 子类能继承父类的方法，而不是属性。 
8.对于构造方法，下列叙述正确的是：( C)
A. 构造方法的方法名必须与类名相同； 
B. 构造方法必须用void申明返回类型 
C. 构造方法可以被程序调用 
D. 若编程人员没再类中定义构造方法，程序将报错。 
9.下面是有关子类继承父类构造函数的描述，其中正确的是：( C)
A. 创建子类的对象时，先调用子类自己的构造函数，然后调用父类的构造函数。 
B. 子类可以不调用父类的构造函数
C. 子类必须通过super()关键字调用父类的构造函数 
D. 子类无法继承父类的构造函数。 
10. 下列说法中，正确的是：(A )
A. 类是变量和方法的集合体 
B. 数组是无序数据的集合 
C. 抽象类可以实例化 
D. 类成员数据必须是公有的 
11.在创建对象时必须（ C）
A) 先声明对象，然后才能使用对象 
B) 先声明对象，为对象分配内存空间，然后才能使用对象 
C) 先声明对象，为对象分配内存空间，对对象初始化，然后才能使用对象 
D) 上述说法都对 
12. Java中（ C）
A) 一个子类可以有多个父类，一个父类也可以有多个子类 
B) 一个子类可以有多个父类，但一个父类只可以有一个子类 
C) 一个子类可以有一个父类，但一个父类可以有多个子类 
D) 上述说法都不对 
13.Java语言具有许多优点和特点，哪个反映了Java程序并行机制的特点？（B ） 
A) 安全性            B) 多线(程)性           
    C)跨平台             D) 可移植 
15.关于以下application的说明，正确的是（ C）
1．  class   StaticStuff
2． {  
3．   static  int  x=10； 
4．   static  { x+=5；} 
5．    public  static  void  main（String  args[ ]） 
6．   { 
7．    System.out.println(“x=” + x); 
8．    } 
9．    static  { x/=3;}
 10.   }
A、4行与9行不能通过编译，因为缺少方法名和返回类型   
B、9行不能通过编译，因为只能有一个静态初始化器 
C、编译通过，执行结果为：x=5 
D、编译通过，执行结果为：x=3 
16.关于以下程序代码的说明正确的是（D ）
1．class  HasStatic{ 
2．    private  static  int  x=100； 
3．    public  static  void  main(String  args[  ]){ 
4．        HasStatic  hs1=new  HasStatic(  ); 
5．        hs1.x++; 
6．        HasStatic  hs2=new  HasStatic(  ); 
7．        hs2.x++; 
8．        hs1=new  HasStatic( ); 
9．        hs1.x++; 
10．       HasStatic.x- -; 
11．       System.out.println(“x=”+x); 
12．    } 
13． } 
A、 5行不能通过编译，因为引用了私有静态变量 
B、 10行不能通过编译，因为x是私有静态变量 
C、 程序通过编译，输出结果为：x=103 
D、 程序通过编译，输出结果为：x=102 
17.以下选项中循环结构合法的是（ C）
A、while (int  i<7) 
{     i++;
     System.out.println(“i is “+i); 
 }
B、 int  j=3; 
while(j)
{   
System.out.println(“j  is “+j); 
}
C、int  j=0; 
for(int  k=0; j + k !=10; j++,k++)
{     
System.out.println(“j  is “+ j + “k  is”+ k); 
}
D、  int  j=0; 
do{
      System.out.println( “j  is “+j++); 
      if (j = = 3) {continue  loop;}
 }while  (j<10);
18.类Test1定义如下： 
1．public  class  Test1{ 
2．   public  float  aMethod（float  a，float  b）{return ..;   }  
3．     
4．}        
将以下哪种方法插入行3是不合法的。（  B    ）
A、public  float  aMethod（float  a， float  b，float  c）{ return ..;  }
B、public  float  aMethod（float  c，float d）{ return.. ;  }
C、public  int  aMethod（int  a， int b）{ return ..;  }
D、private  float  aMethod（int a，int b，int c）{ return ..;  }
19. 类Test1、Test2定义如下： 
1．  public  class  Test1 
2．{ public  float  aMethod（float a，float b） throws 
3．  IOException{      } 
4． } 
5． public  class  Test2  extends  Test1{ 
6． 
7．} 
将以下哪种方法插入行6是不合法的。（  C  ）

A、float  aMethod（float  a，float  b）{ } 
B、public  int  aMethod（int a，int b）throws  Exception{ } 
C、public  float  aMethod（float  p，float q）{ } 
D、public  int  aMethod（int a，int  b）throws IOException{ } 
20. 关于以下程序段，正确的说法是（ A）//////不会
1．  String  s1=”abc”+”def”; 
2．  String  s2=new  String（s1）； 
3．  if（s1= =s2） 
4．     System.out.println(“= = succeeded”);  
5．  if (s1.equals(s2)) 
6．     System.out.println(“.equals()  succeeded”); 
A、行4与行6都将执行            B、行4执行，行6不执行 
C、行6执行，行4不执行         C、行4、行6都不执行 
22. 有以下方法的定义，请选择该方法的返回类型（B ）。
ReturnType  method(byte x, double y)                            {
    return  (short)x/y*2;
}
A byte    B short     C int     D、double 
24 以下哪项是接口的正确定义？（ B）
A、 interface  B 
{  void print(){};}
B、 abstract  interface  B 
{ void print() ;}
C、 abstract  interface  B  extends  A1,A2  { abstract  void  print(){  };}  
D、 interface  B 
      {  void  print();}
25. A派生出子类B，B派生出子类C，并且在Java源代码中有如下声明：
1.    A  a0=new  A();
2.    A  a1 =new  B();
3.    A  a2=new  C();
问以下哪个说法是正确的？（   D   ）
A、只有第1行能通过编译  
B、第1、2行能通过编译，但第3行编译出错 
C、第1、2、3行能通过编译，但第2、3行运行时出错 
D、第1行、第2行和第3行的声明都是正确的  
26. 假设A类有如下定义，设a是A类的一个实例，下列语句调用哪个是错误的？（ C、D ）
class  A
{     int  i;
      static  String  s;
       void  method1() {   }
       static  void  method2()  {   }
}
A、System.out.println(a.i)；
B、a.method1();  
C、A.method1(); 
D、A.method2() 
27. 以下关于继承的叙述正确的是（ A）。
A、在Java中类只允许单一继承 
B、在Java中一个类只能实现一个接口  
C、在Java中一个类不能同时继承一个类和实现一个接口  
D、在Java中接口只允许单一继承  
28. 给出下面代码，关于该程序以下哪个说法是正确的？（ C）
public class Person{  
static int arr[] = new int[5];
public static void main(String a[]) {  
System.out.println(arr[0]);}
}  
}
A、编译时将产生错误        B、编译时正确，运行时将产生错误 
C、输出零           		 D、输出空 
29 在使用interface声明一个接口时，只可以使用（D ）修饰符修饰该接口。
A、private            B、protected         C、private  protected   D、public 
30. 编译并运行以下程序，以下描述哪个选项是正确的（D ）
1.  class  A{
2.      protected  boolean  equals(){
					// public boolean equals(Object obj)
3.           return  super.equals();
4． } 
5. }    
A、编译通过运行无异常     B、编译通过但运行时出错 
C、行2出错，不能成功编译     D、不能成功编译，行3出错 
31. 有语句String s=”hello world”; ，以下操作哪个是不合法的？（B ）
  A、int i=s.length();       B、s>>>=3;
  C、String ts=s.trim();    D、String t=s+”!”; 
32. 阅读以下代码： 
import java.io.*;
import java.util.*;
public class foo{
public static void main (String[] args){
String s;
System.out.println("s=" + s);
}
}
 
输出结果应该是：（    C   ）

A．代码得到编译，并输出“s=” 
B．代码得到编译，并输出“s=null”  
C．由于String s没有初始化，代码不能编译通过 
D．代码得到编译，但捕获到 NullPointException异常 
33. 编译运行以下程序后，关于输出结果的说明正确的是 （ B）
       public  class   Conditional{
           public  static  void  main(String  args[ ]){
           int  x=4;
           System.out.println(“value  is  “+ ((x>4) ? 99.9:9)); 
}
}
A．输出结果为：value  is  99.9      
B．输出结果为：value  is  9 
C．输出结果为：value  is  9.0   
D．编译错误 
34. 执行完以下代码int [ ] x = new int[10]；后，以下哪项说明是正确的（ A）
A．x[9]为0
B．x[9]未定义 
C．x[10]为0 
D．x[0]为空 
35. 关于以下程序段，正确的说法是（ ）///////和20题一样的
1．  String  s1=“a”+“b”; 
2．   String  s2=new  String（s1）； 
3．    if（s1= =s2） 
4．       System.out.println(“= =  is succeeded”); 
5．     if (s1.equals(s2)) 
6．        System.out.println(“.equals() is succeeded”); 
A．行4与行6都将执行            B．行4执行，行6不执行 
C．行6执行，行4不执行         C．行4、行6都不执行
36. 以下程序的运行结果是：（ C）
public class Increment{
       public static void main(String args[]){
int c;
c = 2;
System.out.println(c);
System.out.println(c++);
System.out.println(c);
}     
}
A．2 2 2     B．2 3 3    C．2 2 3   D．3 4 4 
37 若a的值为3时，下列程序段被执行后，c的值是多少？（C ）
    if ( a>0 )   
        if ( a>3 )  
						c = 2;    
      	 else 
					c = 3;  
    	else  
				c = 4;   
 A、1    B、2          C3          D、4 
38. 下面哪一个操作符的优先级最高？ （ D）
    A、&&        B、|| 
    C、!         D( ) 
39. 执行语句int i = 1, j = ++i + ++i + i--; 后i与j的值分别为（ D）。  
       A、2与6               B、3与8 
       C、3与5               D、2与8 （++i先运算再取值）
40. 下面哪一个循环会导致死循环？（ C）
 A、for (int k = 0; k < 0; k++)     
 B、for (int k = 10; k > 0; k--) 
 C、for (int k = 0; k < 10; k--)  
 D、for (int k = 0; k > 0; k++) 
41. 有如下程序段: 
       int a = b = 5;
       String s1 = "祝你今天考出好成绩！"; 
       String s2 = s1;
则表达式a == b与s2 == s1的结果分别是：（  A  ）。
       A、true与true          B、false与true  
       C、true与false          D、false与false 
42. 在Java中用什么关键字修饰的方法可以直接通过类名来调用？（ A）
  A static      B final       C private    D void 
43. 有如下程序段: 
int total = 0;
for ( int i = 0; i< 4; i++ ){
  if ( i == 1) continue;  
  if ( i == 2) break;                             
  total += i;
}
则执行完该程序段后total的值为：（   A  ）。
A.0         B.1        C.3   D.6 
44.如果希望某个变量只可以被类本身访问和调用,则应该使用下列哪一种访问控制修饰（ A）。
    A、private                    B、protected 
    C、private  protected         D、public 
47. 指出下列程序运行的结果 （ B）
public class Example{  
    String str=new String("good");  
     char[] ch = {'a','b','c'};  
     public static void main(String args[]){  
         Example ex=new Example();  
         ex.change(ex.str,ex.ch);  
         System.out.print(ex.str+" and ");
      System.out.print(ex.ch);
     }
    public void change(String str,char ch[]){  
         str="test ok";  
         ch[0]='g';  
     }
}
A、 good and abc  
B、 good and gbc  
C、 test ok and abc  
D、 test ok and gbc  
49.下面语句在编译时出现警告或错误的是( A)
A. float f=3.14;    
B. char c=”c”;     
C. Boolean b=null;    Boolean 包装类没问题
D. int i=10.0;      
50. 给出下面代码段, 哪行将引起一个编译时错误？（D ） 
1) public class Test {  
2)   int n = 0;  
3)   int m = 0;  
4)   public Test(int a) { m=a; }  
5)   public static void main(String arg[]) {  
6)     Test t1,t2;  
7)     int j,k;  
8)     j=3; k=5;  
9)     t1=new Test();           
10)    t2=new Test(k);  
11)  }  
12) }
A. 行1      B. 行4    C. 行6    D. 行9 
51.下面程序中类ClassDemo中定义了一个静态变量sum，分析程序段的输出结果。
（  B ） 
class ClassDemo {
   public static int sum=1;
   public ClassDemo() {
      sum = sum + 5;   
   }
}
public class ClassDemoTest{
   public static void main(String args[]) {
   ClassDemo demo1=new ClassDemo();
   ClassDemo demo2=new ClassDemo();
   System.out.println(demo1.sum);   
  }
}
A. 0        B.6         C. 11        D. 2
52. 下面关于数组声明和初始化的语句那个有语法错误？（C ）
A）int a1[]={3,4,5}; 
B）String a2[]={"string1","string1","string1"}; 
C）String a3[]=new String(3); 
D）int[][] a4=new int[3][3]; 
53. 下面的方法，当输入为2的时候返回值是多少?（ C）
    public int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
A）0      B）2        C）4         D）10 
59. 下面是People和Child类的定义和构造方法，每个构造方法都输出编号。在执行new
Child("mike")的时候都有哪些构造方法被顺序调用？请选择输出结果 ( D)/////我得123

class People {
       String name;
       public People() {  System.out.print(1); }
       public People(String name) {
              System.out.print(2);
              this.name = name;
       }
}
class Child extends People {
       People father;
       public Child(String name) {
              System.out.print(3);
              this.name = name;
              father = new People(name + ":F");
       }
       public Child(){ System.out.print(4); }
}  
A）312      B) 32        C) 432    D) 132
60. 下面哪个选项中的代码没有定义内部类,或者错误的定义了内部类？ ( C)
A）public Class Line { 
      int length;
      Class Point {//内部类代码} 
}
B)    public Class Line {
      public Point getPoint() {
         return new Point(){//内部类代码}; 
      }
}
C)    public Class Line {
              //外部类代码 
}
Class Point {//内部类代码}    
D) public Class Line {
      public int calcLength() {
         Class Point {//内部类代码} 
  }
}
```