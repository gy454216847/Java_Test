package testng.demo;


import module.Count;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCount {
    @Test
    public void testAdd(){
        int z = new Count().add(3,5);
        assertEquals(z,8);
    }
}
