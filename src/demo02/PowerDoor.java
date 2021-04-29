package demo02;

/**
 * @author xujinwei
 * @date 2021/4/29 11:17
 */
public class PowerDoor implements Door{
    @Override
    public void open() {
        System.out.println("电动关门");
        System.out.println(des);
    }

    @Override
    public void close() {
        System.out.println("电动开门");
        System.out.println(des);
    }
}
