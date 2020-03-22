public abstract class SolverInterface {
    public Cube c;

    public void init(Cube c) {
        this.c = c;
    }

    public abstract void solve();
}
