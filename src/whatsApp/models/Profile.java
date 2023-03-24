package whatsApp.models;

import whatsApp.enums.Image;
import whatsApp.enums.Status;

import java.util.List;

public class Profile {
    private int id;
    private String user;
    private String number;
    private String password;
    private Image images;
    private Status statuses;
    private List<Message> messages;
    

    public Profile(int id, String user, String number, String password, Image images, Status statuses, List<Message> messages) {
        this.id = id;
        this.user = user;
        this.number = number;
        this.password = password;
        this.images = images;
        this.statuses = statuses;
        this.messages = messages;
    }

    public Profile( ) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public Status getStatuses() {
        return statuses;
    }

    public void setStatuses(Status statuses) {
        this.statuses = statuses;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", number=" + number +
                ", password='" + password + '\'' +
                ", images=" + images +
                ", statuses=" + statuses +
                ", messages=" + messages +
                '}';
    }



}
