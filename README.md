# JunitTutorial



## What is unit testing

Unit testing is a type of software testing that focuses on individual units or components of a software system. The purpose of unit testing is to validate that each unit of the software works as intended and meets the requirements. Unit tests are designed to validate the smallest possible unit of  code, such as a function or a method, and test it in isolation from the  rest of the system. This allows developers to quickly identify and fix  any issues early in the development process, improving the overall  quality of the software and reducing the time required for later  testing.

More Details [here](https://www.geeksforgeeks.org/unit-testing-software-testing)

## Test Pyramid

<img src="test_pyramid.png" alt="Test Pyramid" style="zoom:50%;" />



## Junit User guide

[User Guide](https://junit.org/junit5/docs/current/user-guide)

## Junit Annotations

1. @BeforeEach

   > Denotes that the annotated method should be executed *before* **each** `@Test`, `@RepeatedTest`, `@ParameterizedTest`, or `@TestFactory` method in the current class; analogous to JUnit 4’s `@Before`. Such methods are *inherited* – unless they are *overridden* or *superseded* (i.e., replaced based on signature only, irrespective of Java’s visibility rules).

2. @AfterEach

   > Denotes that the annotated method should be executed *after* **each** `@Test`, `@RepeatedTest`, `@ParameterizedTest`, or `@TestFactory` method in the current class; analogous to JUnit 4’s `@After`. Such methods are *inherited* – unless they are *overridden* or *superseded* (i.e., replaced based on signature only, irrespective of Java’s visibility rules).

3. @BeforeAll

   > Denotes that the annotated method should be executed before all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; analogous to JUnit 4’s @BeforeClass. Such methods are inherited – unless they are hidden, overridden, or superseded, (i.e., replaced based on signature only, irrespective of Java’s visibility rules) – and must be static unless the "per-class" test instance lifecycle is used.

4. @AfterAll

   > Denotes that the annotated method should be executed after all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; analogous to JUnit 4’s @AfterClass. Such methods are inherited – unless they are hidden, overridden, or superseded, (i.e., replaced based on signature only, irrespective of Java’s visibility rules) – and must be static unless the "per-class" test instance lifecycle is used.

5. @Disabled

   > Used to [disable](https://junit.org/junit5/docs/current/user-guide/#writing-tests-disabling) a test class or test method; analogous to JUnit 4’s `@Ignore`.

6. @RepeatedTest

   > Used to denote that test will be executed mulitple times

7. @ParameterizedTest

   > Denotes that a method is a [parameterized test](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests). 

More annotations can be found [here](https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations)

### [Source code GitHub link](https://github.com/nasasatyanasa/JunitTutorial)

