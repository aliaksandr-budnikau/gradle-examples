public class Main {
    public static void main(String[] args) {
        Message message = new MessageService().getMessage();
        System.out.println("Title :" + message.getTitle());
        System.out.println("Content :" + message.getText());
    }
}