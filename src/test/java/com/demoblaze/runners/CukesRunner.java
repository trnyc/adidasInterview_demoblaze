package com.demoblaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
        },
        features ="src/test/resources/features",
        glue = "com/demoblaze/step_definitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}


/*
After you create your scenarios in 'feature' files, you need to set 'dryRun = true'
 and run yor codes to be able to get your snippets and paste in your 'step_definitions' class
 */
