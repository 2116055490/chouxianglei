package demo02;

/**
 * @author xujinwei
 * @date 2021/4/29 11:15
 */
public class KeypadDoor implements Door{
    @Override
    public void open() {
        System.out.println("键盘门关门");
        System.out.println(des);
    }

    @Override
    public void close() {
        System.out.println("键盘门关门");
        System.out.println(des);
    }
}
