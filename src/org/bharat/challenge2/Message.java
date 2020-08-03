package org.bharat.challenge2;

public class Message {
    private String text;
    private String recipient;
    private int id;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void getDetails(){
        System.out.println("Contact Name: "+recipient + "\nMessages: "+text+"\nid: "+id);
    }
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message(String text, String recipient, int id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }
}
