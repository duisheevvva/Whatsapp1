package whatsApp.dao;

import whatsApp.enums.Status;
import whatsApp.models.Profile;

import java.util.List;

public interface WhatsappDao {
   Profile instAllWhatsapp();
   List<Status> getAllWhatsappStatus();
    Profile changeWhatsappStatus(List<Profile>profiles);
    Profile addContact();
    void deleteWhatsapp(List<Profile>profiles);
}
