package test02;

/**
 * @Author: liuwei
 * @Date: 2019/8/30 0030 20:42
 */
public class Test {
    public static void main(String[] args) {
// 多态形式，创建对象
        Animal a1 = new Cat();
// 调用的是 Cat 的 eat
        a1.eat();   //吃鱼
// 多态形式，创建对象
        Animal a2 = new Dog();
// 调用的是 Dog 的 eat
        a2.eat();   //吃骨头
    }

}
