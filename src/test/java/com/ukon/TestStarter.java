package com.ukon;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: ukondoz
 * Date: 09/12/2013
 * Time: 09:29
 * To change this template use File | Settings | File Templates.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:com/ukon", format = {"pretty"}, tags={"@deposit"})
public class TestStarter {


}
