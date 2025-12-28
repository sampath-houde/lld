package patterns.creational.prototype;

public class ChessPiece implements Protoype<ChessPiece> {

    String color;
    Integer position;

    public ChessPiece(String color, Integer position) {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public Integer getPosition() {
        return position;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "color='" + color + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public ChessPiece clone() {
        return new ChessPiece(this.color, this.position);
    }
}
