package Forms;

public class User {

    private Integer userID;
    private String email;

    public User(Integer userID, String email) {
        this.setUserID(userID);
        this.setEmail(email);
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
