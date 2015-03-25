package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;

public class OwnersPropertyValidator extends RequiredPropertyValidator {

    public OwnersPropertyValidator() {
        super(PropertyNames.PACKAGE_OWNERS, "You need to tell us who is the package owner");
    }
}
