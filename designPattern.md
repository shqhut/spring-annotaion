# Design Pattern设计模式

###适配器模式 Adapter
将一个接口转换成客户希望的另一个接口。
Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

适配器两种实现方式
1、Object Adapter


###模板方法模式 Template Method
定义一个操作的算法骨架，而将一些步骤延迟到子类中。
Template Method使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
在抽象类中定义一些固定方法，在定义一些抽象方法交给子类去实现；
```java
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

```


####工厂方法模式 Factory Method
定义一个用于创建对象的接口，让子类决定实例化哪一个类。
Factory Method使得一个类的实例化延迟到子类。

