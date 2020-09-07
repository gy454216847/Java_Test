package module;

/**
 * @author YGan
 */
public class Test {
    public static void main(String args[]){
        int result = new Count().add(3,5);
        if (result == 8) {
            System.out.println("pass!");

        }else{
            System.out.println("failed!");
        }
    }
}
