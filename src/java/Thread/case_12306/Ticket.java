package src.java.Thread.case_12306;

public class Ticket {

    private String start;
    private String end;
    private Float price;

    public Ticket() {
    }

    public Ticket(String start, String end, Float price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        builder.append(this.start);
        builder.append(" --> ");
        builder.append(this.end);
        builder.append(", 价格: ");
        builder.append(this.price);
        builder.append("元 ]");
        return builder.toString();
    }
}






