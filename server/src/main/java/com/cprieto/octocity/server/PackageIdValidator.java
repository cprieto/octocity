package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;
import com.cprieto.octocity.common.Util;
import jetbrains.buildServer.serverSide.InvalidProperty;

import java.util.Map;

public class PackageIdValidator implements PropertyValidator {
    @Override
    public InvalidProperty hasErrors(Map<String, String> properties) {
        String packageId = properties.get(PropertyNames.PACKAGE_ID);
        if (Util.IsNullOrWitespace(packageId))
            return new InvalidProperty(PropertyNames.PACKAGE_ID, "You need to specify a package id");

        if (!packageId.matches("^[a-zA-Z.]+$"))
            return new InvalidProperty(PropertyNames.PACKAGE_ID, "A valid package id can only contains letters and periods");

        return null;
    }
}
