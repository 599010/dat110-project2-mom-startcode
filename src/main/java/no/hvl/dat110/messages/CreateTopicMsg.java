package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	private String user;
	private String topic;

    // message sent from client to create topic on the broker
    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC, user);
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
        return "CreateTopicMsg [user=" + user + ", topic=" + topic + "]";
    }
}
