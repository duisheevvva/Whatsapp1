package whatsApp.service.impl;

import whatsApp.dao.impl.ProfileDaoImpl;
import whatsApp.dao.impl.WhatsappDaoImpl;
import whatsApp.models.Profile;
import whatsApp.service.ProfileService;

import java.util.List;

public class ProfileServiceImpl implements ProfileService {

    ProfileDaoImpl profileDao=new ProfileDaoImpl();

    @Override
    public Profile goToProfile(List<Profile> profiles) {
        return profileDao.goToProfile(profiles);
    }

    @Override
    public Profile changeProfilePhoto(List<Profile> profiles) {
        return profileDao.changeProfilePhoto(profiles);
    }
}
