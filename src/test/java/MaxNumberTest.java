package com.example
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxNumberTest {
    @Test
    public void testMaxWithFirstNumberGreater() {
        MaxNumber maxNumber = new MaxNumber();
        assertEquals(10, maxNumber.max(10, 5));
    
}
