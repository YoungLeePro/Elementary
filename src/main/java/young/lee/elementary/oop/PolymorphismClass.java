package young.lee.elementary.oop;

/**
 * @USER: Young
 * @DATETIME: 2020/7/15
 * @DESCRIPTION: java的三大特性之多态：Polymorphism
 * 多态前提：封装、继承、父类型引用指向子类型
 *
 **/
public class PolymorphismClass {

    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal tiger = new Tiger();
        tiger.eat();

        Animal loin = new Loin();
        loin.eat();


    }
}

class Animal{
    public void eat(){
        System.out.println("动物都会吃东西");
    }
}

class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("我是老虎，我也会吃东西");
    }
}

class Loin extends Animal{
    @Override
    public void eat(){
        System.out.println("我是狮子，我也会吃东西");
    }
}