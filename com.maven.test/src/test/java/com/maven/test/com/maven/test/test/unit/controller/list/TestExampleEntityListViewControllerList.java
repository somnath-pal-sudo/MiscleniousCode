/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2017-2019 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.maven.test.com.maven.test.test.unit.controller.list;

import java.util.Collection;
import java.util.ArrayList;

import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.maven.test.com.maven.test.controller.entity.ExampleEntityListViewController;
import com.maven.test.com.maven.test.controller.entity.ExampleEntityViewConstants;
import com.maven.test.com.maven.test.model.persistence.DefaultExampleEntity;
import com.maven.test.com.maven.test.service.ExampleEntityService;
import com.maven.test.com.maven.test.test.config.UrlConfig;

/**
 * Unit tests for {@link ExampleEntityListViewController}, checking the methods for
 * listing entities.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public final class TestExampleEntityListViewControllerList {

    /**
     * Mocked MVC context.
     */
    private MockMvc mockMvc;

    /**
     * Default constructor.
     */
    public TestExampleEntityListViewControllerList() {
        super();
    }

    /**
     * Sets up the mocked MVC context.
     * <p>
     * It expects all the responses to have the OK (200) HTTP code.
     */
    @BeforeEach
    public final void setUpMockContext() {
        mockMvc = MockMvcBuilders.standaloneSetup(getController())
                .alwaysExpect(MockMvcResultMatchers.status().isOk()).build();
    }

    /**
     * Verifies that the form view loads the expected attributes into the model.
     * <p>
     * The form requires a bean which will contain all its data.
     */
    @Test
    public final void testShowForm_ExpectedAttributeModel() throws Exception {
        final ResultActions result; // Request result

        result = mockMvc.perform(getViewRequest());

        // The response model contains the expected attributes
        result.andExpect(MockMvcResultMatchers.model()
                .attributeExists(ExampleEntityViewConstants.PARAM_ENTITIES));
    }

    /**
     * Returns a controller with mocked dependencies.
     * 
     * @return a mocked controller
     */
    private final ExampleEntityListViewController getController() {
        final ExampleEntityService service; // Mocked service
        final Collection<DefaultExampleEntity> entities; // Mocked entities

        service = Mockito.mock(ExampleEntityService.class);

        entities = new ArrayList<>();

        Mockito.when(service.getAllEntities()).thenReturn(entities);

        return new ExampleEntityListViewController(service);
    }

    /**
     * Returns a request builder for getting the entities list view.
     * 
     * @return a request builder for the entities list view
     */
    private final RequestBuilder getViewRequest() {
        return MockMvcRequestBuilders.get(UrlConfig.URL_LIST);
    }

}
