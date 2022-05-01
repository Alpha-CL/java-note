package class_case.tomcat.server.server;

public class HtmlElement {

    private String type;
    private String key;
    private String value;
    private String action;
    private String method;

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("{ ");

        builder.append(" type: ");
        builder.append("\"").append(this.type).append("\"");
        builder.append(", ");
        builder.append(" key: ");
        builder.append("\"").append(this.key).append("\"");
        builder.append(", ");
        builder.append(" value: ");
        builder.append("\"").append(this.value).append("\"");
        builder.append(", ");
        builder.append(" action: ");
        builder.append("\"").append(this.action).append("\"");
        builder.append(", ");
        builder.append(" method: ");
        builder.append("\"").append(this.method).append("\"");
        builder.append(" }");

        return builder.toString();
    }

    public HtmlElement() {
    }

    public HtmlElement(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public HtmlElement(String type, String key, String value) {
        this.type = type;
        this.key = key;
        this.value = value;
    }

    public HtmlElement(String type, String key, String value, String action) {
        this.type = type;
        this.key = key;
        this.value = value;
        this.action = action;
    }

    public HtmlElement(String type, String key, String value, String action, String method) {
        this.type = type;
        this.key = key;
        this.value = value;
        this.action = action;
        this.method = method;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}