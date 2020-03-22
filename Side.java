import java.util.Arrays;

public class Side {
    public String Color;
    public Piece[][] Pieces = new Piece[3][3];

    public void RotateRight(){
         Piece[] firstRow = new Piece[] {this.Pieces[0][2], this.Pieces[1][2], this.Pieces[2][2]};
         Piece[] secondRow = new Piece[] {this.Pieces[0][1], this.Pieces[1][1], this.Pieces[2][1]};
         Piece[] thirdRow = new Piece[] {this.Pieces[0][0], this.Pieces[1][0], this.Pieces[2][0]};
         this.Pieces = new Piece[][]{firstRow, secondRow, thirdRow};
    }

    public void RotateLeft(){
        
        Piece[] firstRow = new Piece[] {this.Pieces[2][0], this.Pieces[1][0], this.Pieces[0][0]};
        Piece[] secondRow = new Piece[] {this.Pieces[2][1], this.Pieces[1][1], this.Pieces[0][1]};
        Piece[] thirdRow = new Piece[] {this.Pieces[2][2], this.Pieces[1][2], this.Pieces[0][2]};
        this.Pieces = new Piece[][]{firstRow, secondRow, thirdRow};
    }

    public void Init(String color){
        this.Color = color;
        for (Piece[] row: this.Pieces) {
            for (int i = 0; i < 3; i++){
                row[i] = new Piece(this.Color);
//                }
            }
        }
    }

    public void PrintYellow(){
        for (Piece[] row : this.Pieces) {
            if (this.Color.equals(Cube.Yellow)) {
                for (Piece piece : row) {
                    System.out.print(piece.Name + " ");
                }
                System.out.println("");
            }

        }
    }

    public void PrintWhite(){
        for (Piece[] row : this.Pieces) {
            if (this.Color.equals(Cube.White)) {
                for (Piece piece : row) {
                    System.out.print(piece.Name + " ");
                }
                System.out.println("");
            }
        }
    }
}
