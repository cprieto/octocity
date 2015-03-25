package com.cprieto.octocity.server;

import jetbrains.buildServer.serverSide.InvalidProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface PropertyValidator {
    InvalidProperty hasErrors(@NotNull Map<String, String> properties);
}
