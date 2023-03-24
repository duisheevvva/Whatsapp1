package whatsApp.dao;

import whatsApp.enums.Image;
import whatsApp.models.Profile;

import java.util.List;

public interface ProfileDao {
    Profile goToProfile(List<Profile> profile);
    Profile changeProfilePhoto(List<Profile>profiles);

}
