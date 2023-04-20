package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

    private String user;
    private String topic;

    // message sent from client to delete topic on the broker
    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
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

    // String representation of the message
    @Override
    public String toString() {
        return "DeleteTopicMsg [user=" + user + ", topic=" + topic + "]";
    }
}
