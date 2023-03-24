package whatsApp.service;

import whatsApp.models.Message;
import whatsApp.models.Profile;

import java.util.List;

public interface MessageService {
    Message sendMessage(List<Profile> profiles);
}
