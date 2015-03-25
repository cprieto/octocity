package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PluginConstants;
import jetbrains.buildServer.serverSide.RunTypeRegistry;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

@Test
public class OctocityRunTypeTest {
    private final OctocityPropertyProcessor processor;
    private final RunTypeRegistry registry;
    private final OctocityRunType runType;

    public OctocityRunTypeTest() {
        processor = mock(OctocityPropertyProcessor.class);
        registry = mock(RunTypeRegistry.class);
        runType = new OctocityRunType(registry, processor);
    }

    public void testItRegistersItselfAgainstTheRunRegistry() {
        verify(registry).registerRunType(runType);
    }

    public void testItCanGetPropertiesForRunType() {
        assertEquals(runType.getType(), PluginConstants.RUNNER_TYPE);
        assertEquals(runType.getDisplayName(), PluginConstants.RUNNER_NAME);
        assertEquals(runType.getDescription(), PluginConstants.RUNNER_DESCRIPTION);
    }

    public void testItWillReturnViewNames() {
        assertEquals(runType.getEditRunnerParamsJspFilePath(), ViewNames.EDIT_PARAMETERS);
        assertEquals(runType.getViewRunnerParamsJspFilePath(), ViewNames.VIEW_PARAMETERS);
    }

    public void testItWillReturnCorrectPropertyProcessor() {
        assertEquals(runType.getRunnerPropertiesProcessor(), processor);
    }
}
