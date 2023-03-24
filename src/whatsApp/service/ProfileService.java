package whatsApp.service;

import whatsApp.models.Profile;
import whatsApp.service.impl.ProfileServiceImpl;

import java.util.List;


public interface ProfileService {

    Profile goToProfile(List<Profile> profiles);
    Profile changeProfilePhoto(List<Profile>profiles);
}
