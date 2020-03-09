package cn.face;

public class Pen {
    private String name;
    private String brand;
    private double length;
    private String type;
    private String factory;

    public void setName(String name){
        this.name = name;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setLength(double length){
        if(length>=5.0 && length<=20.0){
            this.length = length;
        }else{
            this.length = 10.0;
        }
    }
    public void setType(String type){
        this.type = type;
    }
    public void setFactory(String factory){
        this.factory = factory;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public double getLength(){
        return this.length;
    }
    public String getType(){
        return type;
    }
    public String getFactory(){
        return factory;
    }

    public String detial(){
        return "笔的名字："+this.name+",品牌："+this.brand+",笔的长度："+this.length+"cm"+",笔的种类"+this.type+",笔的生产厂家："+this.factory;
    }

}
