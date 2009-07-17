package com.ndpar.springtest;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:appclicationContext.xml"})
@DirtiesContext
public class MockDatabaseTest {

    private Database mockDatabase;
    @Autowired
    private Application application;

    @Before
    public void setUp() {
        mockDatabase = mock(Database.class);
        application.setDatabase(mockDatabase);
    }

    @Test
    public void test() {
        application.businessMethod("input");
        verify(mockDatabase, times(1)).persist("Processed input");
    }
}
