package farhan.experiments;

class ChainTest {
    ChainTest() {
        System.out.println("no arguement constructor parent");
    }
}

public class ChainTestA extends ChainTest {
    public ChainTestA() {
        System.out.println("no arguement constructor child");
    }

    public ChainTestA(int a) {
        this();
        System.out.println("arguement constructor child");
    }
}
