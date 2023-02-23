public class RadioPhone extends Phone{

    String phoneName = "Phillips ";

    @Override
    public void call(String number) {
        System.out.println("Phone " + phoneName + "call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Phone " + phoneName + "receive call from " + number);
    }
}
