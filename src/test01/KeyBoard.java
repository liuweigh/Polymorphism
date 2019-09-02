package test01;

/**
 * @Author: liuwei
 * @Date: 2019/8/30 0030 19:46
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启,鼠标闪一闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭,绿灯熄灭");
    }

    public void type(){
        System.out.println("键盘打字");
    }
}
