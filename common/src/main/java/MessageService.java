public class MessageService {
    private Message message;

    public MessageService() {
        message = new Message();
        message.setTitle("Example of title.");
        message.setText("Example of text.");
    }

    public Message getMessage() {
        return message;
    }
}
