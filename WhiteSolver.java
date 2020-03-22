import java.util.Scanner;

public class WhiteSolver extends SolverInterface {
public static Scanner in = new Scanner(System.in);
    @Override
    public void solve() {
        BottomMiddle();
        System.out.println("\nBottom Middle: ");
        this.c.Print();
        Cross();
        System.out.println("\nWhite Cross: ");
        this.c.Print();
        SideMiddles();
        System.out.println("\nSide Middles: ");
        this.c.Print();
    }

    public void BottomMiddle(){
        if (this.c.cube[0].Pieces[1][1].Color.equals(Cube.White)){
            Rotations.md(this.c.cube, this.c.DiagonalStripAry);
            Rotations.md(this.c.cube, this.c.DiagonalStripAry);
        }
        else if (this.c.cube[1].Pieces[1][1].Color.equals(Cube.White)){
            Rotations.md(this.c.cube, this.c.DiagonalStripAry);
        }
        else if (this.c.cube[2].Pieces[1][1].Color.equals(Cube.White)){
            Rotations.ml(this.c.cube, this.c.StripAry);
            Rotations.md(this.c.cube, this.c.DiagonalStripAry);
        }
        else if (this.c.cube[3].Pieces[1][1].Color.equals(Cube.White)){
            Rotations.mu(this.c.cube, this.c.DiagonalStripAry);
        }
        else if (this.c.cube[4].Pieces[1][1].Color.equals(Cube.White)){
            Rotations.mr(this.c.cube, this.c.StripAry);
            Rotations.md(this.c.cube, this.c.DiagonalStripAry);
        }
    }
    public void Clear(int i, int j){
        while (this.c.cube[5].Pieces[i][j].Color.equals(Cube.White)){
            Rotations.br(this.c.cube,this.c.StripAry);
        }
    }

    public void Cross() {
        for (int i = 0; i < 10; i++){
            if (this.c.cube[1].Pieces[1][0].Color.equals(Cube.White)) {
                Clear(1, 0);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
            } else if (this.c.cube[1].Pieces[0][1].Color.equals(Cube.White)) {
                Clear(0, 1);
                Rotations.ur(this.c.cube, this.c.StripAry);
                Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
                Rotations.acr(this.c.cube, this.c.StripAry);
                Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
                Rotations.acl(this.c.cube, this.c.StripAry);
                Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
            } else if (this.c.cube[1].Pieces[1][2].Color.equals(Cube.White)) {
                Clear(1, 2);
                Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
            } else if(this.c.cube[1].Pieces[2][1].Color.equals(Cube.White)) {
                Rotations.acr(this.c.cube, this.c.StripAry);
                Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
                Rotations.ml(this.c.cube, this.c.StripAry);
                Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
            } else if (this.c.cube[0].Pieces[0][1].Color.equals(Cube.White)) {
                Clear(1,0);
                Rotations.ur(this.c.cube, this.c.StripAry);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
            } else if (this.c.cube[0].Pieces[1][0].Color.equals(Cube.White)) {
                Clear(1,0);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
            } else if (this.c.cube[0].Pieces[1][2].Color.equals(Cube.White)) {
                Clear(1,2);
                Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
                Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
            } else if (this.c.cube[0].Pieces[2][1].Color.equals(Cube.White)) {
                Clear(1,2);
                Rotations.ur(this.c.cube, this.c.StripAry);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
                Rotations.ld(this.c.cube, this.c.DiagonalStripAry);
            }
            Rotations.acr(this.c.cube, this.c.StripAry);
        }
    }

    public void SideMiddles(){
        while (!this.c.cube[1].Pieces[1][1].Color.equals(Cube.Red)) {
            Rotations.mr(this.c.cube, this.c.StripAry);
        }
        while (!this.c.cube[1].Pieces[2][1].Color.equals(Cube.Red)) {
            Rotations.br(this.c.cube, this.c.StripAry);
        }
        if(!this.c.cube[2].Pieces[2][1].Color.equals(Cube.Green)) {
            while (!this.c.cube[2].Pieces[2][1].Color.equals(Cube.Green)) {
                Rotations.br(this.c.cube, this.c.StripAry);
            }
            Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
            Rotations.br(this.c.cube, this.c.StripAry);
            Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
            Rotations.bl(this.c.cube, this.c.StripAry);
            Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
            Rotations.br(this.c.cube, this.c.StripAry);
            Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
        }
        if(!this.c.cube[4].Pieces[2][1].Color.equals(Cube.Blue)) {
            Rotations.acr(this.c.cube, this.c.StripAry);
            Rotations.acr(this.c.cube, this.c.StripAry);
            Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
            Rotations.br(this.c.cube, this.c.StripAry);
            Rotations.ru(this.c.cube, this.c.DiagonalStripAry);
            Rotations.bl(this.c.cube, this.c.StripAry);
            Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
            Rotations.br(this.c.cube, this.c.StripAry);
            Rotations.rd(this.c.cube, this.c.DiagonalStripAry);
            Rotations.bl(this.c.cube, this.c.StripAry);
        }
        while (!this.c.cube[1].Pieces[1][1].Color.equals(Cube.Red)) {
            Rotations.acr(this.c.cube, this.c.StripAry);
        }
    }
}
