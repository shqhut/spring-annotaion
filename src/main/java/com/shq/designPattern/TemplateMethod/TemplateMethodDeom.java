package com.shq.designPattern.TemplateMethod;

public class TemplateMethodDeom {

    public static void main(String[] args) {
        AbstractClass subClass = new SubClass();
        subClass.operation();
    }
}

abstract class AbstractClass{
    public void operation(){
        System.out.println("pre....");
        System.out.println("step1....");
        System.out.println("step2....");
        templateMethod();
    }

    abstract protected void templateMethod();
}

class SubClass extends AbstractClass{

    @Override
    protected void templateMethod() {
        System.out.println("子类实现步骤");
    }
}

