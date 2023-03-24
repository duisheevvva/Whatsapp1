package whatsApp.dao.impl;

import whatsApp.dao.WhatsappDao;
import whatsApp.enums.Image;
import whatsApp.enums.Status;
import whatsApp.exception.MyException;
import whatsApp.models.Message;
import whatsApp.models.Profile;
import whatsApp.models.Whatsapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsappDaoImpl implements WhatsappDao {

    @Override
    public Profile instAllWhatsapp() {
        List<Whatsapp> whatsapps = new ArrayList<>();
        List<Profile> profiles1 = new ArrayList<>();
        List<Message> messages = new ArrayList<>();
        List<Image> images=new ArrayList<>();
        List<Status> statuses=new ArrayList<>();
        Profile profile=new Profile();
        int counter = 0;
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.print("Enter user name:");
                String name =new Scanner(System.in).nextLine();
                System.out.print("Enter phone number:");
                String phoneNumber = new Scanner(System.in).nextLine();
                if (phoneNumber.startsWith("+996")) {
                    profile.setNumber(phoneNumber);
                    isTrue=false;
                } else {
                    throw new MyException("Phone number received code 996!");
                }
                System.out.println("Enter password");
                String password=new Scanner(System.in).nextLine();
                isTrue=false;
                Profile profile1 = new Profile(++counter,name,phoneNumber,password,Image.DEFAULT_IMAGE,Status.LIFE_IS_BEAUTIFUL,messages);
                profiles1.add(profile1);
                System.out.println(profiles1);
            }catch(MyException e){
                System.out.println(e.getMessage());
        }
        }   return null;
    }

    @Override
    public List<Status> getAllWhatsappStatus() {
        return List.of(Status.values());
    }

    @Override
    public Profile changeWhatsappStatus(List<Profile> profiles) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter user name:");
            String name = scanner.nextLine();
            System.out.print("Enter password:");
            String password = scanner.nextLine();
            for (Profile p : profiles) {
                if (name.equals(p.getUser()) && (password.equals(p.getPassword()))) {
                    System.out.println("Current status:" + p.getStatuses());
                    System.out.println("~~Statuses~~");
                    System.out.println("1->EVERYTHING_IS_TEMPORARY\n" +
                                       "2->PREDICTABLE_IS_UNPREDICTABLE\n" +
                                       "3->LIFE_IS_BEAUTIFUL" );
                    switch (new Scanner(System.in).nextInt()) {
                        case 1 -> p.setStatuses(Status.EVERYTHING_IS_TEMPORARY);
                        case 2 -> p.setStatuses(Status.PREDICTABLE_IS_UNPREDICTABLE);
                        case 3 -> p.setStatuses(Status.LIFE_IS_BEAUTIFUL);
                    }
                    System.out.println("Status changed:" + p.toString());
                } else {
                    throw new MyException("no such profile");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }return null;
    }

    @Override
    public Profile addContact() {
        return null;
    }

    @Override
    public void deleteWhatsapp(List<Profile> profiles) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username :");
        for (Profile profile : profiles) {
            String name = scanner.nextLine();
            if (profile.getUser().equalsIgnoreCase(name)) {
                profiles.remove(profile);
                System.out.println("Your profile has been successfully");
                break;
            } else {
                System.out.println("not found!");
            }
        }
    }


    }

