package whatsApp.service.impl;

import whatsApp.dao.WhatsappDao;
import whatsApp.dao.impl.WhatsappDaoImpl;
import whatsApp.enums.Status;
import whatsApp.models.Profile;
import whatsApp.models.Whatsapp;
import whatsApp.service.WhatsappService;

import java.util.List;

public class WhatsappServiceImpl implements WhatsappService {


    WhatsappDaoImpl whatsappDao=new WhatsappDaoImpl();

    @Override
    public Profile instAllWhatsapp() {
        return whatsappDao. instAllWhatsapp();

    }

    @Override
    public List<Status> getAllWhatsappStatus() {
        return whatsappDao.getAllWhatsappStatus();
    }

    @Override
    public Profile changeWhatsappStatus(List<Profile> profiles) {
        return whatsappDao.changeWhatsappStatus(profiles);
    }

    @Override
    public Profile addContact() {
        return whatsappDao.addContact();
    }

    @Override
    public void deleteWhatsapp(List<Profile> whatsapp) {
       whatsappDao.deleteWhatsapp(whatsapp);

    }
}
