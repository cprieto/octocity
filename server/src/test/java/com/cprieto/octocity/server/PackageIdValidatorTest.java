package com.cprieto.octocity.server;

import com.cprieto.octocity.common.PropertyNames;
import jetbrains.buildServer.serverSide.InvalidProperty;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class PackageIdValidatorTest {
    private final PackageIdValidator validator = new PackageIdValidator();

    @Test
    public void testItWillReturnNullWithEmptyPackageId(){
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_ID, "");
        }});

        assertNotNull(result);
        assertEquals(result.getPropertyName(), PropertyNames.PACKAGE_ID);
    }

    @Test
    public void testItWillReturnNullWithNullPackageId(){
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>());

        assertNotNull(result);
        assertEquals(result.getPropertyName(), PropertyNames.PACKAGE_ID);
    }

    @Test
    public void testItWorksWithNonNullOrEmptyPackageName() {
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_ID, "package.name");
        }});

        assertNull(result);
    }

    @Test
    public void testItFailWithInvalidPackageId() {
        final InvalidProperty result = validator.hasErrors(new HashMap<String, String>() {{
            put(PropertyNames.PACKAGE_ID, "package name");
        }});

        assertNotNull(result);
        assertEquals(result.getPropertyName(), PropertyNames.PACKAGE_ID);
    }
}
