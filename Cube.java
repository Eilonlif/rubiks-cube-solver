public class Cube {

    public static final String Reset = "\u001B[0m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Yellow = "\u001B[33m";
    public static final String Blue = "\u001B[34m";
    public static final String White = "\u001B[1m";
    public static final String Pink = "\u001B[35m";

    public Side[] cube = new Side[6];
    public String[] ColorsAry = new String[] {Yellow, Red, Green, Pink, Blue, White};
    public Side[] StripAry = new Side[4];
    public Side[] DiagonalStripAry = new Side[4];
    public void Init(){
        for (int i = 0; i < 6; i++) {
            this.cube[i] = new Side();
            this.cube[i].Color = this.ColorsAry[i];
            this.cube[i].Init(this.ColorsAry[i]);
            if (i != 0 && i != 5){
                this.StripAry[i - 1] = this.cube[i];
            }

            if (i == 0){
                this.DiagonalStripAry[0] = this.cube[i];
            } else if(i == 1) {
                this.DiagonalStripAry[1] = this.cube[i];
            } else if(i == 3) {
                this.DiagonalStripAry[2] = this.cube[i];
            } else if(i == 5) {
                this.DiagonalStripAry[3] = this.cube[i];
            }
        }
    }

    public void PrintTop(){
        for (Side side : this.cube) {
            side.PrintYellow();
        }
    }

    public void PrintBottom(){
        for (Side side : this.cube) {
            side.PrintWhite();
        }
    }

    public void PrintStrip(){
        for (int i = 0; i < 3; i++) {
            for (Side side : this.cube) {
                if (!side.Color.equals(White) && !side.Color.equals(Yellow)) {
                    for (int j = 0; j < 3; j++){
                        System.out.print(side.Pieces[i][j] + " ");
                    }
                    System.out.print("| ");
                }
            }
            System.out.println("");
        }
    }

    public void Print(){
        System.out.println("");
        PrintTop();
        PrintStrip();
        PrintBottom();
    }

    public void Scramble(){
        for (int i = 0; i < 100; i ++){
            int ran = (int) (Math.random() * 5);
            for (int j = 0; j < ran; j++){
                Rotations.ru(this.cube, this.DiagonalStripAry);
                Rotations.br(this.cube, this.StripAry);
                Rotations.ur(this.cube, this.StripAry);
                Rotations.ul(this.cube, this.StripAry);
                Rotations.md(this.cube, this.DiagonalStripAry);
                Rotations.acr(this.cube, this.StripAry);
            }
        }
    }
}
