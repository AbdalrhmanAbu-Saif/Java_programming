package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.MessagingService;

public class MessagingService {
    private String sender;
    private String content;

    public MessagingService(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public String getContent() {
        return this.content;
    }

}

