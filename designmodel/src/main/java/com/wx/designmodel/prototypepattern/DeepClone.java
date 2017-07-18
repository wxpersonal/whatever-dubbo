package com.wx.designmodel.prototypepattern;

/**
 * @Author: Wells.Wei
 * @Date: 2017/5/2
 * @Description: 深拷贝
 */
public class DeepClone implements Cloneable {
    String name;
    int age;
    A a;
    DeepClone(String name,int age, A a) {
        this.name=name;
        this.age=age;
        this.a=a;
    }
    public Object clone() {
        DeepClone o=null;
        try
        {
            o=(DeepClone)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.toString());
        }
        return o;
    }

    public static void main(String[] args) {
        DeepClone s1=new DeepClone("zhangsan",18, new A("123","456"));
        DeepClone s2=(DeepClone)s1.clone();
        s2.name="lisi";
        s2.age=20;
        s2.a.setS1("789");

        System.out.println("name="+s1.name+","+"age="+s1.age+"，"+s1.a.toString());
        System.out.println("name="+s2.name+","+"age="+s2.age+","+s2.a.toString());
    }
}

