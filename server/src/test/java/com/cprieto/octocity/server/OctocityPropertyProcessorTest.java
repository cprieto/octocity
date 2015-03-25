package com.cprieto.octocity.server;

import jetbrains.buildServer.serverSide.InvalidProperty;
import org.testng.annotations.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class OctocityPropertyProcessorTest {
    private final PropertyValidator validator;
    private final OctocityPropertyProcessor processor;

    public OctocityPropertyProcessorTest() {
        validator = mock(PropertyValidator.class);
        when(validator.hasErrors(anyMapOf(String.class, String.class)))
                .thenReturn(new InvalidProperty("property", "error"));

        processor = new OctocityPropertyProcessor(new ArrayList<PropertyValidator>() {{
            add(validator);
        }});
    }

    @Test
    public void testItWillUseProcessorToCheckProperties() {
        Map<String, String> properties = new HashMap<String, String>() {{
            put("property", "value");
        }};

        Collection<InvalidProperty> result = processor.process(properties);

        verify(validator).hasErrors(properties);
        assertThat(result, hasSize(1));
    }
}
