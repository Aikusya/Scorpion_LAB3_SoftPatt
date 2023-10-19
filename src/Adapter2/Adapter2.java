package Adapter2;

public class Adapter2 implements IGetOverHere{
    private Console2 console2;

    public Adapter2(Console2 console2){
        this.console2 = console2;
    }
    @Override
    public void getOverHere() {
        console2.clackToGetOverHere();
    }
}
