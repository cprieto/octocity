package com.cprieto.octocity.server;

import jetbrains.buildServer.serverSide.InvalidProperty;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

@Test
public class RequiredPropertyValidatorTest {
    private final String property = "property";
    private final String error = "error";

    private final RequiredPropertyValidator validator = new RequiredPropertyValidator(property, error) {
    };

    public void testItCanValidateEmptyProperty() throws Exception {
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(property, "");
        }});

        assertNotNull(result);
        assertEquals(result.getPropertyName(), property);
        assertEquals(result.getInvalidReason(), error);
    }
}