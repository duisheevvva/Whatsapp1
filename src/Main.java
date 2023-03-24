import whatsApp.enums.Image;
import whatsApp.enums.Status;
import whatsApp.models.Message;
import whatsApp.models.Profile;
import whatsApp.models.Whatsapp;
import whatsApp.service.impl.MessageServiceImpl;
import whatsApp.service.impl.ProfileServiceImpl;
import whatsApp.service.impl.WhatsappServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WhatsappServiceImpl whatsappService = new WhatsappServiceImpl();
        ProfileServiceImpl profileService = new ProfileServiceImpl();
        MessageServiceImpl messageService = new MessageServiceImpl();
        List<Whatsapp> whatsapps = new ArrayList<>();
        List<Profile> profiles = new ArrayList<>();
        List<Message> messages = new ArrayList<>();
        List<Image> images=new ArrayList<>();
        List<Status> statuses=new ArrayList<>();


        while (true){
            System.out.println("""
                    1->InstAll Whatsapp
                    2->Go to profile
                    3->Get all WhatsappStatus
                    4->Change ProfilePhoto
                    5->Change WhatsappStatus
                    6->Add contact
                    7->Send message
                    8->Delete Whatsapp
                    """);
            System.out.print("Choose command: ");
            int select = new Scanner(System.in).nextInt();
            switch (select) {
                case 1 -> System.out.println(whatsappService.instAllWhatsapp());
                case 2 -> System.out.println(profileService.goToProfile(profiles));
                case 3 -> System.out.println(whatsappService.getAllWhatsappStatus());
                case 4 -> System.out.println(profileService.changeProfilePhoto(profiles));
                case 5 -> System.out.println(whatsappService.changeWhatsappStatus(profiles));
                case 6 -> System.out.println(whatsappService.addContact());
                case 7 -> System.out.println(messageService.sendMessage(profiles));
                case 8 -> whatsappService.deleteWhatsapp(profiles);

            }
        }
    }
}