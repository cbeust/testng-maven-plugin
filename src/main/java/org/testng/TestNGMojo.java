package org.testng;

import java.io.File;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author Cedric Beust <cedric@beust.com>
 * @since 06 01, 2013
 */
@Mojo(name = "test", defaultPhase = LifecyclePhase.TEST)
public class TestNGMojo extends AbstractMojo {
    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "src/test/resources/testng.xml", property = "suiteFiles")
    private List<File> suiteFiles;

    public void execute() throws MojoExecutionException {
        getLog().info("Running TestNG on " + suiteFiles);
    }
}