package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.MessagingService;

public class MainMessagingService {
    public static void main(String[] args){

        MessagingServicelist mslist =new MessagingServicelist();

        MessagingService msg1=new MessagingService("Ahmed", "Hi Ali");
        MessagingService msg2=new MessagingService("Ali", "Hi Ahmed");
        MessagingService msg3=new MessagingService("Abood", "where are you? ksjdfjskhfsdlkjgfjksdyflsdfkjkjsgdfklsjdfkjgshdlgskdhglkgsadhgkjha;itpiewuklxjhblakdsjgh;aisdyhgpaiygfkzhslkfjhalsrhpqwoieyr[w9atpaisuygpiauhpituhfpaghpseiarughpwrgherpaiuhklzbnz.x,mbvksjhrf;asihfpaiyfpahfkjfhklasgpituafahfliaufhpai8hfap9hsi;lduhgfsidughs;lidfhgkmfndkashdf;liausfhiauh;eflrekugfuioehksadfhkjfhlaskhf;ohzxmnbfalskjehfliaghfsakjdhfkjsd");

        mslist.add(msg1);
        mslist.add(msg2);
        mslist.add(msg3);

        for (MessagingService msg :mslist.getMessages()){
            System.out.println(msg.getSender() +", "+msg.getContent());
        }



    }
}
