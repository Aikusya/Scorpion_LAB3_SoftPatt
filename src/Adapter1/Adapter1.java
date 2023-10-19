package Adapter1;

public class Adapter1 implements IPerformPunch{
    private Console1 console1;

    public Adapter1(Console1 console1){
        this.console1 = console1;
    }
    @Override
    public void performPunch() {
        console1.clackToPunch();
    }
}
