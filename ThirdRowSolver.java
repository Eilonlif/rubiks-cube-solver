public class ThirdRowSolver extends SolverInterface {
    @Override
    public void solve() {
        TwoToTheRow();
        System.out.println("\nDouble Double Time: ");
        this.c.Print();

        DoubleDouble();
        System.out.println("\nDouble Double!!!! ");
        this.c.Print();
    }
    public void secondLongest(Boolean RightOrLeft){
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        if (RightOrLeft) {
            Rotations.ul(this.c.cube, this.c.StripAry);
        } else{
            Rotations.ur(this.c.cube, this.c.StripAry);
        }
        Rotations.acl(this.c.cube, this.c.StripAry);
        Rotations.mu(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ur(this.c.cube, this.c.StripAry);
        Rotations.ur(this.c.cube, this.c.StripAry);
        Rotations.md(this.c.cube, this.c.DiagonalStripAry);

        if (RightOrLeft) {
            Rotations.ul(this.c.cube, this.c.StripAry);
        } else{
            Rotations.ur(this.c.cube, this.c.StripAry);
        }

        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);

    }

    public void longest(){
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acl(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acl(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acl(this.c.cube, this.c.StripAry);
        Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acl(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.acr(this.c.cube, this.c.StripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
        Rotations.ru(this.c.cube, this.c.DiagonalStripAry);

    }

    public void TwoToTheRow(){
        if(!(this.c.cube[1].Pieces[0][0].Color.equals(this.c.cube[1].Pieces[0][2].Color) && this.c.cube[2].Pieces[0][0].Color.equals(this.c.cube[2].Pieces[0][2].Color) && this.c.cube[3].Pieces[0][0].Color.equals(this.c.cube[3].Pieces[0][2].Color) && this.c.cube[4].Pieces[0][0].Color.equals(this.c.cube[4].Pieces[0][2].Color))) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 5; i++) {
                    if (this.c.cube[3].Pieces[0][0].Color.equals(this.c.cube[3].Pieces[0][2].Color)) {
                        longest();
                        return;
                    } else {
                        Rotations.ur(this.c.cube, this.c.StripAry);
                    }
                }
                longest();
            }
        }
    }

    public void DoubleDouble(){
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 5; i++) {
                if (this.c.cube[1].Pieces[0][0].Color.equals(this.c.cube[1].Pieces[0][2].Color) && this.c.cube[1].Pieces[0][0].Color.equals(this.c.cube[1].Pieces[0][1].Color)) {
                    while(!(this.c.cube[1].Pieces[0][1].Color.equals(this.c.cube[1].Pieces[1][1].Color))){
                        Rotations.br(this.c.cube, this.c.StripAry);
                        Rotations.mr(this.c.cube, this.c.StripAry);
                    }
                    Rotations.acr(this.c.cube, this.c.StripAry);
                    Rotations.acr(this.c.cube, this.c.StripAry);
                    if (this.c.cube[1].Pieces[0][1].Color.equals(this.c.cube[2].Pieces[1][1].Color)) {
                        secondLongest(false);
                    } else {
                        secondLongest(true);
                    }
                    return;
                } else {
                    Rotations.ur(this.c.cube, this.c.StripAry);
                }
            }
            secondLongest(true);
        }
    }
}
