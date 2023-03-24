package whatsApp.service.impl;

import whatsApp.dao.impl.MessageDaoImpl;
import whatsApp.models.Message;
import whatsApp.models.Profile;
import whatsApp.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {
    MessageDaoImpl messageDao=new MessageDaoImpl();
    @Override
    public Message sendMessage(List<Profile> profiles) {
        return messageDao.sendMessage(profiles);
    }
}
