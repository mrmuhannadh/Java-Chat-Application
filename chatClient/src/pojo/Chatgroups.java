package pojo;
// Generated 29-May-2022 08:37:18 by Hibernate Tools 4.3.1



/**
 * Chatgroups generated by hbm2java
 */
public class Chatgroups  implements java.io.Serializable {


     private Integer chatId;
     private String groupName;
     private int hostId;
     private int status;

    public Chatgroups() {
    }

    public Chatgroups(String groupName, int hostId, int status) {
       this.groupName = groupName;
       this.hostId = hostId;
       this.status = status;
    }
   
    public Integer getChatId() {
        return this.chatId;
    }
    
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getHostId() {
        return this.hostId;
    }
    
    public void setHostId(int hostId) {
        this.hostId = hostId;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }




}


