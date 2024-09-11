
Introduction:

This README file provides a comprehensive guide for setting up and using a frontend testing framework built with Java, Selenium WebDriver, Maven, Extent Reports, and TestNG.
This framework is designed to efficiently automate the testing of web applications, ensuring their quality and reliability.It incorporates a modular structure with packages
for base classes, global resources, configuration, test data, reports, and utilities to enhance code organization and reusability.

Pre-requisite Installations:

Java Development Kit (JDK):jdk version 11.0.16
Maven
Selenium WebDriver

Supported browsers:
Google Chrome 
Microsoft Edge

Project Setup:
Created a New Maven Project:frontendFramework

Used IDE:Intellij

Added Dependencies:

In the pom.xml file the following dependencies are added:
XML
 <dependencies>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.15.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.8.0</version>
            <scope>compile</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.codehaus.gmaven/gmaven-plugin -->
        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>4.1.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.13.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
        <!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
        <dependency>
            <groupId>com.relevantcodes</groupId>
            <artifactId>extentreports</artifactId>
            <version>2.41.2</version>
        </dependency>

    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
        </plugins>
    </build>

Packages:

base: 
 Sets up the WebDriver instance and launches the browser.
 Loads the specified file into properties class using the object referance variable    name.

config: 
 For reading configuration properties from files.

globalresources: 
 Provides a class for storing global static resources that can be accessed from anywhere in the project.

testdata: Manages test data, such as user credentials.

reports: Generates and manages Extent Reports for test results.

utilities: Offers utility classes for various tasks like Excel reading.
Used ExtentTest methods to log test results, including status (pass, fail, skip), descriptions, and attachments.

test:
 Created new Java classes within the tests package.
Annotated class with @Test to indicate that it contains test method.


