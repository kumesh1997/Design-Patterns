import Adapter.AdapterMainClass;
import Calculator.*;
import Observer.MainController;
import Singleton.ClipBoard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        CalculatorController.runCalculator();
//        try {
//            MainController.run();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        AdapterMainClass.runAdapter();

    }
}