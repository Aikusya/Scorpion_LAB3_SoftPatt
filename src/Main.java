import Adapter1.Adapter1;
import Adapter1.Console1;
import Adapter1.IPerformPunch;
import Adapter2.Adapter2;
import Adapter2.IGetOverHere;
import Adapter2.Console2;
import Adapter3.Adapter3;
import Adapter3.IPerformFatalBlow;
import Adapter3.Console3;

public class Main {
    public static void main(String[] args) {

        IPerformPunch performPunch = new Adapter1(new Console1());
        performPunch.performPunch();

        IGetOverHere getOverHere = new Adapter2(new Console2());
        getOverHere.getOverHere();

        IPerformFatalBlow performFatalBlow = new Adapter3(new Console3());
        performFatalBlow.performFatalBlow();
    }
}