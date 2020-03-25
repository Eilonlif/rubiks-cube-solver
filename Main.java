import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube c = new Cube();
        c.Init();
        c.Print();
        c.Scramble();
        SolveCube(c);


    }
    public static void SolveCube(Cube c){
        SolverInterface s1 = new WhiteSolver();
        SolverInterface s2 = new SecondRowSolver();
        SolverInterface s3 = new YellowSolver();
        SolverInterface s4 = new ThirdRowSolver();

        List<SolverInterface> solvers = new ArrayList<>();
        solvers.add(s1);
        solvers.add(s2);
        solvers.add(s3);
        solvers.add(s4);
        for (SolverInterface Solver : solvers) {
            Solver.init(c);
            Solver.solve();
        }
    }
}
