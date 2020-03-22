import java.util.Objects;

public class Piece {
    public static final String Reset = "\u001B[0m";
    public String Color;
    public String Name;

    public Piece(String c){
        this.Color = c;
        this.Name = c + "█" + Reset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return Color.equals(piece.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Color);
    }

    @Override
    public String toString() {
        return this.Name;
    }
}
