package uz.exemple.less53_telegramui_contacts_java.model;

public class Chat {
    private int profile;
    private String fullname;
    private String message;

    public Chat(int profile, String fullname, String messsage) {
        this.profile = profile;
        this.fullname = fullname;
        this.message = messsage;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    public String getMessage() {
        return message;
    }
}
