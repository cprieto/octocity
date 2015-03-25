package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;
import com.cprieto.octocity.common.Util;
import jetbrains.buildServer.serverSide.InvalidProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class PackageVersionValidator implements PropertyValidator {
    @Override
    public InvalidProperty hasErrors(@NotNull Map<String, String> properties) {
        String packageVersion = properties.get(PropertyNames.PACKAGE_VERSION);
        if (Util.IsNullOrWitespace(packageVersion))
            return new InvalidProperty(PropertyNames.PACKAGE_VERSION, "You need to specify a package version");

        if (!packageVersion.matches("^(\\d+\\.)?(\\d+\\.)?(\\d+\\.)?(\\d+)$"))
            return new InvalidProperty(PropertyNames.PACKAGE_VERSION, "Are you sure this is a valid package version?");

        return null;
    }
}
