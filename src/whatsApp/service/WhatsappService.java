package whatsApp.service;

import whatsApp.enums.Status;
import whatsApp.models.Profile;
import whatsApp.models.Whatsapp;

import java.util.List;

public interface WhatsappService {
    Profile instAllWhatsapp();
    List<Status> getAllWhatsappStatus();
    Profile changeWhatsappStatus(List<Profile>profiles);
    Profile addContact();
    void deleteWhatsapp(List<Profile>whatsapp);
}
