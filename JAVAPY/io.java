package Function;
import java.util.Scanner;
public class io {
    public static String input;
    //Output Block
    public void print(){
        System.out.println();
    }
    public void print(int i){
        System.out.println(i);
    }
    public void print(double f){
        System.out.println(f);
    }
    public void print(String a){
        System.out.println(a);
    }
    public void print(String[] arg){
        System.out.println(arg);
    }
    //input block;
    Scanner _get_=new Scanner(System.in); 
    
    public String input(){
        input=this._get_.nextLine();
        return input;
    }
    //Input assigner block;

    //Integer block
    public int Int(){
        int value=Integer.valueOf(input());
        return value;
    }
    //Double block
    public double Double(){
        double value=Double.valueOf(input());
        return value;
    }
    //String block
    public String str(){
        String value=String.valueOf(input());
        return value;
    }
    //Float block
    public float Float(){
        float value=Float.valueOf(input());
        return value;
    }
    
}