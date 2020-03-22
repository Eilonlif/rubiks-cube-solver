public class Main {
    public static void main(String[] args) {
        Cube c = new Cube();
        c.Init();
        c.Print();

        c.Scramble();

        SolverInterface s = new WhiteSolver();
        s.init(c);
        s.solve();
    }
}
