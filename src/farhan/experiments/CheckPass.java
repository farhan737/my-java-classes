package farhan.exeperiments;

public class CheckPass {

    public boolean passOrfail(int m, int p, int c, int passLimit) {
        return ((m + p + c) / 3) >= passLimit;
    }
}
