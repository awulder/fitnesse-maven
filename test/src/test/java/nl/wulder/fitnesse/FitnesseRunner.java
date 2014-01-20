package nl.wulder.fitnesse;

import fitnesse.junit.JUnitHelper;
import fitnesse.junit.JUnitXMLTestListener;
import fitnesse.junit.PrintTestListener;
import fitnesse.testsystems.CompositeTestSystemListener;
import org.junit.Test;

public class FitnesseRunner {

    @Test
    public void runTests() throws Exception {
        String repo = System.getProperty("fitnesse.repository");
        String output = System.getProperty("fitnesse.path.output");
        String report = System.getProperty("fitnesse.path.junitreport");
        String suite = System.getProperty("fitnesse.suite");
        String port = System.getProperty("fitnesse.port");

        CompositeTestSystemListener resultsListener = new CompositeTestSystemListener();
        resultsListener.addTestSystemListener(new PrintTestListener());
        resultsListener.addTestSystemListener(new JUnitXMLTestListener(report));

        JUnitHelper jUnitHelper = new JUnitHelper(repo, output, resultsListener);
        if (port != null) {
            jUnitHelper.setPort(Integer.parseInt(port));
        }
        jUnitHelper.assertSuitePasses(suite);
    }
}
