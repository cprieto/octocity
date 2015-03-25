package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;
import com.cprieto.octocity.common.Util;
import jetbrains.buildServer.serverSide.InvalidProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public abstract class RequiredPropertyValidator implements PropertyValidator {
    private final String _propertyName;
    private final String _errorMessage;

    public RequiredPropertyValidator(String propertyName, String errorMessage) {
        _propertyName = propertyName;
        _errorMessage = errorMessage;
    }

    @Override
    public InvalidProperty hasErrors(@NotNull Map<String, String> properties) {
        if (Util.IsNullOrWitespace(properties.get(_propertyName)))
            return new InvalidProperty(_propertyName, _errorMessage);
        return null;
    }
}

