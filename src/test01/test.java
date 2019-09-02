package test01;

/**
 * @Author: liuwei
 * @Date: 2019/8/30 0030 20:02
 */
public class test {
    public static void main(String[] args) {
        //创建笔记本实体类对象
        Laptop lt = new Laptop();
        //笔记本开启
        lt.run();    //笔记本运行

        //创建鼠标实体对象

        USB u = new Mouse();
        //笔记本使用鼠标
        lt.useUSB(u);   //鼠标单击

        //创建键盘实体对象
        KeyBoard kb = new KeyBoard();
        //笔记本使用键盘
        lt.useUSB(kb);     //键盘打字
        //笔记本关闭
        lt.shutDown();  //笔记本关闭
    }
}
