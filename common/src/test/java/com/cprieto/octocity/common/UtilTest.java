package com.cprieto.octocity.common;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

@Test
public class UtilTest {
    public void testItCanValidateNullStrings(){
        assertTrue(Util.IsNullOrWitespace(null));
    }

    public void testItCanValidateEmptyStrings() {
        assertTrue(Util.IsNullOrWitespace(""));
    }

    public void testItCanVaidateOnlySpaceStrings() {
        assertTrue(Util.IsNullOrWitespace("  "));
    }

    public void testItPassWithNonEmptyOrWhitespaceStrings() {
        assertFalse(Util.IsNullOrWitespace("hola"));
    }
}
