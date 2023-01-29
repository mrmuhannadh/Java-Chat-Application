package pojo;
// Generated 29-May-2022 08:37:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Chats generated by hbm2java
 */
public class Chats  implements java.io.Serializable {


     private Integer chatId;
     private String chat;
     private Date time;
     private Date date;
     private String sender;

    public Chats() {
    }

    public Chats(String chat, Date time, Date date, String sender) {
       this.chat = chat;
       this.time = time;
       this.date = date;
       this.sender = sender;
    }
   
    public Integer getChatId() {
        return this.chatId;
    }
    
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }
    public String getChat() {
        return this.chat;
    }
    
    public void setChat(String chat) {
        this.chat = chat;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getSender() {
        return this.sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }




}

