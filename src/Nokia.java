public class Nokia extends Phone{

    String phoneName = "Nokia X30 ";

    @Override
    public void call(String number) {
        System.out.println("Phone " + phoneName + "call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Phone " + phoneName + "receive call from " + number);
    }
}
