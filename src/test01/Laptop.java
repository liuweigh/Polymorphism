package test01;

/**
 * @Author: liuwei
 * @Date: 2019/8/30 0030 19:47
 */
public class Laptop {
    //笔记本开启运行功能
    public void run(){
        System.out.println("笔记本运行");
    }

    //笔记本使用usb 设备,这时当笔记本对象调用这个功能时,必须给其传递一个符合USB规则的USB 设备
    public void useUSB(USB usb){
        //判断是否有USB设备
        if (usb!=null){
            usb.open();
            //类型转换,调用特有方法
            if (usb instanceof Mouse){
                Mouse m = (Mouse) usb;
                m.click();
            }else if (usb instanceof KeyBoard){
                 KeyBoard kb= (KeyBoard)usb;
                 kb.type();
            }
            usb.close();
        }
    }

    public void shutDown(){
        System.out.println("笔记本关闭");
    }
}
