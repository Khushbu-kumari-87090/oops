import com.oops.abstraction.Polymorphism1;
import com.oops.polymorphism.Polymorphism;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void sum(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Polymorphism p1=new Polymorphism("g",8);
        sum(2);
//        p1.sum("kk");
        Polymorphism1 p2=new Polymorphism1(2,3);
        p2.sum1();

    }
}