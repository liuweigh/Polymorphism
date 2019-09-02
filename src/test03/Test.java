package test03;

/**
 * @Author: liuwei
 * @Date: 2019/8/30 0030 20:47
 */
public class Test {
    public static void main(String[] args) {
        // 多态形式，创建对象
        Cat c = new Cat();
        Dog d = new Dog();
// 调用showCatEat
        showCatEat(c);   //吃鱼
// 调用showDogEat
        showDogEat(d);  //吃骨头
/*
以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代
而执行效果一致
*/
        showAnimalEat(c);  //吃鱼
        showAnimalEat(d); //吃骨头
    }

    public static void showCatEat(Cat c) {
        c.eat();
    }

    public static void showDogEat(Dog d) {
        d.eat();
    }

    public static void showAnimalEat(Animal a) {
        a.eat();
    }


}




