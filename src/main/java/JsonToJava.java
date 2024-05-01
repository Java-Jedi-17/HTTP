import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonToJava {

    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public JsonToJava(@JsonProperty("id") String id,
                      @JsonProperty("text") String text,
                      @JsonProperty("type") String type,
                      @JsonProperty("user") String user,
                      @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getid() {
        return id;
    }

    public String gettext() {
        return text;
    }

    public String gettype() {
        return type;
    }

    public String getuser() {
        return user;
    }

    public String getupvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Запись" +
                "\n Id: " + id +
                "\n Текст: " + text +
                "\n Тип: " + type +
                "\n Пользователь: " + user +
                "\n Голоса: " + upvotes +
                "\n------";
    }
}
