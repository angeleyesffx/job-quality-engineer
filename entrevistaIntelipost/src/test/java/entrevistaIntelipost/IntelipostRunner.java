package entrevistaIntelipost;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.Test;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources"}
 )

public class IntelipostRunner {

}
