package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.MessagingService;

import java.util.ArrayList;

public class MessagingServicelist {

    private ArrayList<MessagingService> messages;

    public MessagingServicelist(){
        this.messages=new ArrayList<>();
    }

    public void add(MessagingService  msg){
        if(msg.getContent().length()<=280)
            this.messages.add(msg);
    }

    public  ArrayList<MessagingService> getMessages(){
        return this.messages;
    }
}
