package whatsApp.models;

import java.util.Set;

public class Whatsapp {
    private Profile profile;
    private String password;
    private Set<String> contacts;

    public Whatsapp(Profile profile, String password, Set<String> contacts) {
        this.profile = profile;
        this.password = password;
        this.contacts = contacts;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getContacts() {
        return contacts;
    }

    public void setContacts(Set<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "profile=" + profile +
                ", password='" + password + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
