package com.shq.designPattern.Adpater.v2;

public class AdapterPatternDemo2 {
    public static void main(String[] args) {
        Target adapter = new Adapter();
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

class Adapter extends Adaptee implements Target {

    @Override
    public int output5v() {
        int i = super.output220v();
        //适配器转换过程
        System.out.println(String.format("原始电压：%d v -> 输出电压：%d v",i,5));
        return 5;
    }
}