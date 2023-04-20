package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

    private String user;
    private String topic;

    // message sent from client to subscribe on a topic
    public SubscribeMsg(String user, String topic) {
        super(MessageType.SUBSCRIBE, user);
        this.topic = topic;
    }

    // Getters and setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    // String representation of the message the user will receive
    @Override
    public String toString() {
        return "SubscribeMsg [user=" + user + ", topic=" + topic + "]";
    }
}
