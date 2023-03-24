package whatsApp.dao.impl;

import whatsApp.dao.ProfileDao;
import whatsApp.enums.Image;
import whatsApp.enums.Status;
import whatsApp.exception.MyException;
import whatsApp.models.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfileDaoImpl implements ProfileDao {
    @Override
    public Profile goToProfile(List<Profile> profiles) {

        boolean isTrue=false;
        try {
            System.out.print("Enter user name:");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Enter password:");
            String password = new Scanner(System.in).nextLine();
            for (Profile p : profiles) {
                if (name.equals(p.getUser()) && (password.equals(p.getPassword()))) {
                    System.out.println(profiles);
                    isTrue=false;
                } else {
                    throw new MyException("no such profile");

                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }return  null;
    }

    @Override
    public Profile changeProfilePhoto(List<Profile> profiles) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter user name:");
            String name = scanner.nextLine();
            System.out.print("Enter password:");
            String password = scanner.nextLine();
            for (Profile p : profiles) {
                if (name.equals(p.getUser()) && (password.equals(p.getPassword()))) {
                    profiles.add(p);
                }
            }
            if (!profiles.isEmpty()) {
                for (Profile p : profiles) {
                    System.out.println("Current image:" + p.getImages());
                    System.out.println("~~Images~~");
                    System.out.println("1->MY_PHOTO\n" +
                                       "2->DEFAULT_IMAGE\n" +
                                       "3->PHOTO_OF_FLOWERS\n" +
                                       "4->PHOTO_OF_PARENTS");
                    switch (new Scanner(System.in).nextInt()) {
                        case 1 -> p.setImages(Image.MY_PHOTO);
                        case 2 -> p.setImages(Image.DEFAULT_IMAGE);
                        case 3 -> p.setImages(Image.PHOTO_OF_FLOWERS);
                        case 4 -> p.setImages(Image.PHOTO_OF_PARENTS);
                    }
                    System.out.println("Images changed:" + p);
                }
            } else {
                throw new MyException("no such profile");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

