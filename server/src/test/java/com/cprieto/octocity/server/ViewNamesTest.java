package com.cprieto.octocity.server;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

public class ViewNamesTest {
    @Test
    public void testViewNamesAreNotEmpty() {
        assertThat(ViewNames.EDIT_PARAMETERS, not(isEmptyOrNullString()));
        assertThat(ViewNames.VIEW_PARAMETERS, not(isEmptyOrNullString()));
    }
}
