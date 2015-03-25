package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PluginConstants;
import com.cprieto.octocity.common.PropertyNames;
import jetbrains.buildServer.serverSide.Parameter;
import jetbrains.buildServer.serverSide.PropertiesProcessor;
import jetbrains.buildServer.serverSide.RunType;
import jetbrains.buildServer.serverSide.RunTypeRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class OctocityRunType extends RunType {
    private final OctocityPropertyProcessor processor;

    public OctocityRunType(@NotNull final RunTypeRegistry registry, @NotNull OctocityPropertyProcessor processor) {
        this.processor = processor;
        registry.registerRunType(this);
    }

    @Override
    public String getType() {
        return PluginConstants.RUNNER_TYPE;
    }

    @Override
    public String getDisplayName() {
        return PluginConstants.RUNNER_NAME;
    }

    @Override
    public String getDescription() {
        return PluginConstants.RUNNER_DESCRIPTION;
    }

    @Override
    public PropertiesProcessor getRunnerPropertiesProcessor() {
        return processor;
    }

    @Override
    public String getEditRunnerParamsJspFilePath() {
        return ViewNames.EDIT_PARAMETERS;
    }

    @Override
    public String getViewRunnerParamsJspFilePath() {
        return ViewNames.VIEW_PARAMETERS;
    }

    @Override
    public Map<String, String> getDefaultRunnerProperties() {
        return new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_VERSION, "%build.number%");
        }};
    }
}
