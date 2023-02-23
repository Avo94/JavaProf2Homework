public class ButtonPhone extends Phone{

    String phoneName = "Siemens ";

    @Override
    public void call(String number) {
        System.out.println("Phone " + phoneName + "call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Phone " + phoneName + "receive call from " + number);
    }
}
