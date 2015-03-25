package com.cprieto.octocity.common;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

public class PluginConstantsTest {
    @Test
    public void testNoneOfTheRequiredConstantsAreEmpty() {
        assertThat(PluginConstants.RUNNER_TYPE, not(isEmptyOrNullString()));
        assertThat(PluginConstants.RUNNER_NAME, not(isEmptyOrNullString()));
        assertThat(PluginConstants.RUNNER_DESCRIPTION, not(isEmptyOrNullString()));
    }
}
