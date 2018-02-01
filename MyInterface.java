package java8Ver2;

import java.util.Collections;
import java.util.List;

public interface MyInterface {
    default public List<String> sortStudent(List<String> stuList){
        Collections.sort(stuList);
        return stuList;
    }

    public static void greet(String name){
        System.out.println("WELCOME: "+name);
    }

    public abstract Integer getMax(List<String> inlist);

}
