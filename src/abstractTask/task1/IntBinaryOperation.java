package abstractTask.task1;

public abstract class IntBinaryOperation {
    protected int firstArg;
    protected int secondArg;
    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public int getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(int firstArg) {
        this.firstArg = firstArg;
    }

    public int getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(int secondArg) {
        this.secondArg = secondArg;
    }

    public abstract int perform();

}
