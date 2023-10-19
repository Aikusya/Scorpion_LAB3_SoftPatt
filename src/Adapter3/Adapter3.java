package Adapter3;

public class Adapter3 implements IPerformFatalBlow{
    private Console3 console3;

    public Adapter3(Console3 console3){
        this.console3 = console3;
    }
    @Override
    public void performFatalBlow() {
        console3.clackToPerformFatalBlow();
    }
}
