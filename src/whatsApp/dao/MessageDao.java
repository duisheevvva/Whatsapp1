package whatsApp.dao;

import whatsApp.models.Message;
import whatsApp.models.Profile;

import java.util.List;

public interface MessageDao {
    Message sendMessage(List<Profile> profiles);
}
