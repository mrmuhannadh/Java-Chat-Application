package pojo;
// Generated 29-May-2022 08:37:18 by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private int userId;
     private String userName;
     private String password;
     private String type;
     private byte[] profile;

    public Users() {
    }

    public Users(int userId, String userName, String password, String type, byte[] profile) {
       this.userId = userId;
       this.userName = userName;
       this.password = password;
       this.type = type;
       this.profile = profile;
    }
   
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public byte[] getProfile() {
        return this.profile;
    }
    
    public void setProfile(byte[] profile) {
        this.profile = profile;
    }




}


