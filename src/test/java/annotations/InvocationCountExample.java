package annotations;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 10,invocationTimeOut = 1)
    public void iCount(){
        System.out.println("java");
    }
}
