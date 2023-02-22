public class Samsung extends Phone {

    String phoneName = "Galaxy A73 5G 6 ";

    @Override
    public void call(String number) {
        System.out.println("Phone " + phoneName + "call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Phone " + phoneName + "receive call from " + number);
    }
}