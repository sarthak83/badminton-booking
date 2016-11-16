/**
 * 
 */
package com.berenberg.bank.cukeTestWithArcheType;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author sarthakdayanand
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/",
                 tags={"@TestBut"},
                 plugin={"pretty",
                		 "html:target/test-report",
                		 "json:target/test-report.json",
                		 "junit:target/test-report.xml"}
                 )
public class RunCukesTest {

}
