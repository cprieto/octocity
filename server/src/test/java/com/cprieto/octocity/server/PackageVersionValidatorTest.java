package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;
import jetbrains.buildServer.serverSide.InvalidProperty;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class PackageVersionValidatorTest {
    private final PackageVersionValidator validator = new PackageVersionValidator();

    @Test
    public void testItWillReturnNullWithEmptyPackageId(){
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_VERSION, "");
        }});

        assertNotNull(result);
        assertEquals(result.getPropertyName(), PropertyNames.PACKAGE_VERSION);
    }

    @Test
    public void testItWillReturnNullWithNullPackageId(){
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>());

        assertNotNull(result);
        assertEquals(result.getPropertyName(), PropertyNames.PACKAGE_VERSION);
    }

    @Test
    public void testItWorksWithNonNullOrEmptyPackageName() {
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_VERSION, "1.2");
        }});

        assertNull(result);
    }

    @Test
    public void testItFailWithInvalidPackageId() {
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_VERSION, "package version");
        }});

        assertNotNull(result);
        assertEquals(result.getPropertyName(), PropertyNames.PACKAGE_VERSION);
    }
}

