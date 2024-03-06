package priority;

import org.testng.annotations.Test;

public class WithoutPriority {

    @Test(priority = 1)
    public void testScriptC(){
        System.out.println("C");
    }
    @Test(priority = 2)
    public void testScriptD(){
        System.out.println("D");
    }
    @Test(priority = 3)
    public void testScriptA(){
        System.out.println("A");
    }
    @Test(priority = 4)
    public void testScriptB(){
        System.out.println("B");
    }
}
