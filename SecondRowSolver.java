public class SecondRowSolver extends SolverInterface {

    @Override
    public void solve() {
        System.out.println("\nSide Middles");
        SideMiddles();
        c.Print();
    }

    public void SideMiddles() {
        for (int i = 0; i < 11; i++) {
            if (!this.c.cube[1].Pieces[1][0].Color.equals(Cube.Yellow) && !this.c.cube[4].Pieces[1][2].Color.equals(Cube.Yellow)) {
                boolean was = false;
                for (int j = 0; j < 5; j++){
                    if ((this.c.cube[1].Pieces[0][1].Color.equals(Cube.Yellow) || this.c.cube[0].Pieces[2][1].Color.equals(Cube.Yellow)) && !was){
                        Rotations.ur(this.c.cube, this.c.StripAry);
                        Rotations.lu(this.c.cube, this.c.DiagonalStripAry);
                        Rotations.ul(this.c.cube, this.c.StripAry);
                        Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
                        Rotations.ul(this.c.cube, this.c.StripAry);
                        Rotations.acr(this.c.cube, this.c.StripAry);
                        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
                        Rotations.ur(this.c.cube, this.c.StripAry);
                        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
                        was = true;
                    }
                    Rotations.ur(this.c.cube, this.c.StripAry);
                }
            }
            Rotations.acr(this.c.cube, this.c.StripAry);
        }
        for (int i = 0; i < 10; i++) {
            if (!this.c.cube[1].Pieces[0][1].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[2][1].Color.equals(Cube.Yellow)) {
                while (!this.c.cube[1].Pieces[0][1].Color.equals(this.c.cube[1].Pieces[1][1].Color)) {
                    Rotations.br(this.c.cube, this.c.StripAry);
                    Rotations.mr(this.c.cube, this.c.StripAry);
                }
                if (this.c.cube[0].Pieces[2][1].Color.equals(this.c.cube[2].Pieces[1][1].Color)) {
                    Rotations.ul(this.c.cube, this.c.StripAry);
                    Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    Rotations.acl(this.c.cube, this.c.StripAry);
                    Rotations.lu(this.c.cube, this.c.DiagonalStripAry);
                    Rotations.ul(this.c.cube, this.c.StripAry);
                    Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
                } else {
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    Rotations.lu(this.c.cube, this.c.DiagonalStripAry);
                    Rotations.ul(this.c.cube, this.c.StripAry);
                    Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
                    Rotations.ul(this.c.cube, this.c.StripAry);
                    Rotations.acr(this.c.cube, this.c.StripAry);
                    Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
                }
            }
            Rotations.ur(this.c.cube, this.c.StripAry);
        }
    }
}
