package feat;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="gayathri/feat.feature",
				tags={"@login"})
				//tags={"~@regression"}) //ignore regression
				//tags={"@login","@regression"}) - AND case
				//tags={"@login,@regression"})
				//plugin="html:target\\HtmlReport") // OR case
				//plugin="json:target\\Jsonreport.json")
				//plugin="junit:C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\xmlreport.xml")
public class featrun {

}
