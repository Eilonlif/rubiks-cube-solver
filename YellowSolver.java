public class YellowSolver extends SolverInterface {
    @Override
    public void solve() {
        System.out.println("\nYellow Cross: ");
        YellowCross();
        this.c.Print();
        System.out.println("\nYellow Corners: ");
        YellowCorners();
        this.c.Print();
    }

    public void CrossFunc() {
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ul(this.c.cube, this.c.StripAry);
        Rotations.acl(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ur(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
    }

    public void YellowCross() {
        if (!(this.c.cube[0].Pieces[1][0].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[1][2].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[0][1].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[2][1].Color.equals(Cube.Yellow))) {
            if (!this.c.cube[0].Pieces[1][0].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[1][2].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[0][1].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[2][1].Color.equals(Cube.Yellow)) {
                CrossFunc();
                CrossFunc();
                Rotations.ul(this.c.cube, this.c.StripAry);
                CrossFunc();

            } else if (this.c.cube[0].Pieces[1][0].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[1][2].Color.equals(Cube.Yellow)) {
                CrossFunc();
                Rotations.ul(this.c.cube, this.c.StripAry);
                CrossFunc();
            } else if (this.c.cube[0].Pieces[0][1].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[2][1].Color.equals(Cube.Yellow)) {
                Rotations.ur(this.c.cube, this.c.StripAry);
                CrossFunc();
                Rotations.ul(this.c.cube, this.c.StripAry);
                CrossFunc();
            } else {
                if (this.c.cube[0].Pieces[0][1].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[1][0].Color.equals(Cube.Yellow)) {
                    CrossFunc();
                } else if (this.c.cube[0].Pieces[0][1].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[1][2].Color.equals(Cube.Yellow)) {
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    CrossFunc();
                } else if (this.c.cube[0].Pieces[2][1].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[1][2].Color.equals(Cube.Yellow)) {
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    Rotations.ur(this.c.cube, this.c.StripAry);
                    CrossFunc();
                } else {
                    Rotations.ul(this.c.cube, this.c.StripAry);
                    CrossFunc();
                }
            }
        }
    }

    public void CornerFunc() {
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ul(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ul(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ur(this.c.cube, this.c.StripAry);
        Rotations.ur(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
    }

    public void YellowCorners() {
        if (!(this.c.cube[0].Pieces[0][0].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[0][2].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[2][0].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[2][2].Color.equals(Cube.Yellow))) {
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < 5; i++) {
                    if (!this.c.cube[0].Pieces[0][0].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[0][2].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[2][0].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[2][2].Color.equals(Cube.Yellow)) {
                        CornerFunc();
                        if (!this.c.cube[0].Pieces[0][0].Color.equals(Cube.Yellow) && this.c.cube[0].Pieces[0][2].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[2][0].Color.equals(Cube.Yellow) && !this.c.cube[0].Pieces[2][2].Color.equals(Cube.Yellow)) {
                            Rotations.ur(this.c.cube, this.c.StripAry);
                            Rotations.ur(this.c.cube, this.c.StripAry);
                            CornerFunc();
                        }
                        return;
                    } else {
                        Rotations.ur(this.c.cube, this.c.StripAry);
                    }
                }
                CornerFunc();
            }
        }
    }
}
