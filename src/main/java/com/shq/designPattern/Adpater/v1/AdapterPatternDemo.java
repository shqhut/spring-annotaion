package com.shq.designPattern.Adpater.v1;

/**
 * 对象适配器模式
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.output5v();
    }
}

class Adaptee{
    public int output220v(){
        return 220;
    }
}

interface Target{
    int output5v();
}

class Adapter implements Target{

    Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int output5v() {
        int i = adaptee.output220v();
        //适配器转换过程
        System.out.println(String.format("原始电压：%d v -> 输出电压：%d v",i,5));
        return 5;
    }
}

