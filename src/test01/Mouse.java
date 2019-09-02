package test01;

/**
 * @Author: liuwei
 * @Date: 2019/8/30 0030 19:43
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启,红灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭,红灯熄灭");
    }

    public void click(){
        System.out.println("鼠标单击");
    }
}
