# Maven multi-module mixed Groovy and Java code with Spock and JUnit Unit and Ordered Integration Test Suites

This project demonstrates the use of:

* Maven
* Groovy
* Java
* Spock
* JUnit test suites
* Failsafe plugin
* Surefire plugin
* Jacoco code coverage
* Integration tests
* Unit tests
* Maven multi modules

The key part to this is being able to specify the order of the integration test steps and the naming of
the files.  To make sure that tests don't run twice tests that are included in test suitesdo not have
a suffix of Test/Spec/IntTest/IntSpec.

The naming pattern still allows you to quickly locate all the integration tests or integration test steps.
e.g. In IntelliJ IDEA you can use the open-class dialog and type in IntSpec or IntTest to see them.

Being able to specify the order of the test can be important where one test depends on another, however
having non-isolated tests is generally a bad idea in the first place.  Sometimes though your project is
young and you don't have the resources to isolate the tests or you have another genuine reason.

The driver behind this was a situation where:
* Geb tests that navigate round a website creating data along the way via the UI.
* Later test depended on the data created by the earlier tests.
* Tests were always run using a fresh VM with no seed data.
* The UI exposed no way of deleting the items created. 
* Database cleanup was not required because a fresh VM was used.
* Each integration test could be run repeatedly run as long as all the tests before it had been run once.
* Geb tests were required to have no knowledge of the implementation details of the system under test.

Feel free to use this as the basis of your own POM files in accordance with the license below.

## Usage

mvn clean install

Then inspect the 'target' directory.

## Prerequisits

* Maven 3
* JDK 7

Tested with versions as follows:

```
$ mvn -version
Apache Maven 3.2.1 (ea8b2b07643dbb1b84b6d16e1f08391b666bc1e9; 2014-02-14T17:37:52+00:00)
Maven home: C:\Progra~1\Maven\apache-maven-3.2.1
Java version: 1.8.0_05, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_05\jre
Default locale: en_GB, platform encoding: Cp1252
OS name: "windows 7", version: "6.1", arch: "amd64", family: "dos"

$ java -version
java version "1.8.0_11"
Java(TM) SE Runtime Environment (build 1.8.0_11-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.11-b03, mixed mode)
```

## License

This work is licensed under a Creative Commons Attribution-ShareAlike 4.0 International License.

http://creativecommons.org/licenses/by-sa/4.0/


