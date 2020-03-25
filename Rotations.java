public class Rotations {  // first letter is which second letter direction...
    public static void r(int i,Side[] c, Side[] SA){      // Right
        Piece[] red = SA[0].Pieces[i];
        Piece[] green = SA[1].Pieces[i];
        Piece[] pink = SA[2].Pieces[i];
        Piece[] blue = SA[3].Pieces[i];
        c[1].Pieces[i] = blue;
        c[2].Pieces[i] = red;
        c[3].Pieces[i] = green;
        c[4].Pieces[i] = pink;
    }

    public static void u(int i, Side[] c, Side[] DSA) {       // Up
        Piece[] Yellow = new Piece[]{DSA[0].Pieces[2][i], DSA[0].Pieces[1][i], DSA[0].Pieces[0][i]};
        Piece[] Red = new Piece[]{DSA[1].Pieces[0][i], DSA[1].Pieces[1][i], DSA[1].Pieces[2][i]};
        Piece[] Pink = new Piece[]{DSA[2].Pieces[2][2 - i], DSA[2].Pieces[1][2 - i], DSA[2].Pieces[0][2 - i]};
        Piece[] White = new Piece[]{DSA[3].Pieces[0][i], DSA[3].Pieces[1][i], DSA[3].Pieces[2][i]};
        for (int j = 0; j < 3; j++){
            c[0].Pieces[j][i] = Red[j];
            c[1].Pieces[j][i] = White[j];
            c[3].Pieces[j][2 - i] = Yellow[j]; //
            c[5].Pieces[j][i] = Pink[j];
        }
    }

    public static void ur(Side[] c, Side[] SA){       // Up Right
        for (Side side : c) {
            if (side.Color.equals(Cube.Yellow)){
                side.RotateRight();
                r(0, c, SA);
            }
        }
    }

    public static void mr(Side[] c, Side[] SA){       // Middle Right
        r(1, c, SA);
    }

    public static void br(Side[] c, Side[] SA){       // Bottom Right
        for (Side side : c) {
            if (side.Color.equals(Cube.White)){
                side.RotateLeft();
                r(2, c, SA);
            }
        }
    }

    public static void mu(Side[] c, Side[] DSA){      // Middle Up
        u(1, c, DSA);
    }

    public static void ru(Side[] c, Side[] DSA){      // Right Up
        for (Side side : c) {
            if (side.Color.equals(Cube.Green)){
                side.RotateLeft();
                u(2, c, DSA);
            }
        }
    }

    public static void lu(Side[] c, Side[] DSA){      // Left Up
        for (Side side : c) {
            if (side.Color.equals(Cube.Blue)){
                side.RotateRight();
                u(0, c, DSA);
            }
        }
    }

    public static void acr(Side[] c, Side[] SA){      // All Cube Right
        ur(c, SA);
        mr(c, SA);
        br(c, SA);
    }

    public static  void acl(Side[] c, Side[] SA){     // All Cube Left
        for (int i = 0; i < 3; i++){
            acr(c, SA);
        }
    }

    public static  void ul(Side[] c, Side[] SA){      // Up Left
        for (int i = 0; i < 3; i++){
            ur(c, SA);
        }
    }

    public static  void ml(Side[] c, Side[] SA){      // Middle Left
        for (int i = 0; i < 3; i++){
            mr(c, SA);
        }
    }

    public static  void bl(Side[] c, Side[] SA){      // Bottom Left
        for (int i = 0; i < 3; i++){
            br(c, SA);
        }
    }

    public static void rd(Side[] c, Side[] DSA){     // Right Down
        for (int i = 0; i < 3; i++){
            ru(c, DSA);
        }
    }

    public static void md(Side[] c, Side[] DSA){     // Middle Left
        for (int i = 0; i < 3; i++){
            mu(c, DSA);
        }
    }

    public static void ld(Side[] c, Side[] DSA){     // Left Down
        for (int i = 0; i < 3; i++){
            lu(c, DSA);
        }
    }
}
