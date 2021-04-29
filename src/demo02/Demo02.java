package demo02;

/**
 * @author xujinwei
 * @date 2021/4/29 11:19
 */
public class Demo02 {
    public static void main(String[] args) {
        KeypadDoor keypadDoor = new KeypadDoor();
        keypadDoor.open();
        keypadDoor.close();
        keypadDoor.test01();

        PowerDoor powerDoor = new PowerDoor();
        powerDoor.open();
        powerDoor.close();

        Door door = new Door() {
            @Override
            public void open() {
                System.out.println("临时开门");
            }

            @Override
            public void close() {
                System.out.println("临时关门");
            }
        };
        door.open();
        door.close();
    }
}
