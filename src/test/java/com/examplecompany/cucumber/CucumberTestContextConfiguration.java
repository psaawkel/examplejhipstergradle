package com.examplecompany.cucumber;

import com.examplecompany.ExamplejhipstergradleApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ExamplejhipstergradleApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
