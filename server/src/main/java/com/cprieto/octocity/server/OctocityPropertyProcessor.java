package com.cprieto.octocity.server;

import jetbrains.buildServer.serverSide.InvalidProperty;
import jetbrains.buildServer.serverSide.PropertiesProcessor;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class OctocityPropertyProcessor implements PropertiesProcessor {
    private final List<PropertyValidator> validators;

    public OctocityPropertyProcessor(@NotNull List<PropertyValidator> validators) {
        this.validators = validators;
    }

    @Override
    public Collection<InvalidProperty> process(@NotNull Map<String, String> properties) {
        Collection<InvalidProperty> errors = new HashSet<InvalidProperty>();

        for(PropertyValidator validator : validators) {
            InvalidProperty result = validator.hasErrors(properties);
            if (result != null) errors.add(result);
        }

        return errors;
    }
}
