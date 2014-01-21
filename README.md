# Usage

## Start Tomcat manual with the webapplication
``mvn tomcat:run``

## Start FitNesse manual
``mvn test -Pfitnesse``

## Run the FitNesse tests via Maven
``mvn clean integration-test -Pxebium``


Currently FitNesse is using PhantomJS so the environment variable ``PHANTOMJS_BIN``