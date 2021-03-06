package com.automationpractice.core;

import cucumber.api.java8.En;
import org.picocontainer.annotations.Inject;

public class BaseSteps implements En {

    @Inject
    private PageContainer pageContainer;

    protected void update(BasePage newPage) {
        pageContainer.updatePage(newPage);
    }

    protected BasePage page() {
        return pageContainer.getPage();
    }
}
