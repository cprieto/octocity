package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;

public class DescriptionPropertyValidator extends RequiredPropertyValidator {
    public DescriptionPropertyValidator() {
        super(PropertyNames.PACKAGE_DESCRIPTION, "Description cannot be empty");
    }
}

