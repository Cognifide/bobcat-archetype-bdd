![Cognifide logo](http://cognifide.github.io/images/cognifide-logo.png)

# Bobcat Archetype BDD

## Summary 
This project is Maven archetype for Bobcat using BDD tests. It contains simple test and hooks for actions required on beginning and end of test.

## Prerequisites
* JDK 8
* Maven 3

## Create project
```
mvn archetype:generate \
        -DarchetypeGroupId=com.cognifide.qa.bb \
        -DarchetypeArtifactId=bobcat-archetype-bdd \
        -DarchetypeVersion=1.0.0 \
```
Example properties for archetype
```
Define value for property 'groupId': : com.cognifde.qa.bb
Define value for property 'artifactId': : hello-world
Define value for property 'version':  1.0-SNAPSHOT: : 1.0.0
Define value for property 'package':  com.cognifde.qa.bb: : com.hello.world
```
## Project structure
```
└───hello-world
 |    └───src
 |        ├───main
 |        │   ├───config
 |        │   │   ├───common
 |        │   │   ├───dev
 |        │   │   └───integration
 |        │   ├───features
 |        │   │   ├───example
 |        │   ├───java
 |        │   │   └───com
 |        │   │       └───hello
 |        │   │           └───world
 |        │   │               ├───hooks
 |        │   │               ├───pageobjects
 |        │   │               └───steps
 |        │   └───resources
 |        └───test
 |            └───java
 |                └───com
 |                    └───hello
 |                        └───world
 └───pom.xml 
```

Test cases written in Gherkin are in features in directory:

```
└───hello-world
 |    └───src
 |        ├───main
 |        │   ├───features
```

BDD project contains also runners for Gherkin scenarios:

```
 |        └───test
 |            └───java
 |                └───com
 |                    └───hello
 |                        └───world
```

Package com.hello.world.steps for steps implementation:
```
└───hello-world
 |    └───src
 |        │   ├───java
 |        │   │   └───com
 |        │   │       └───hello
 |        │   │           └───world
 |        │   │               └───steps
```

There is also special place for hooks (com.hello.world.hooks) - actions to be executed before and after tests execution (e.g. browser window maximize):

```
└───hello-world
 |    └───src
 |        │   ├───java
 |        │   │   └───com
 |        │   │       └───hello
 |        │   │           └───world
 |        │   │               ├───hooks
```

## Running sample test cases
Execute following command from the command line:
```
mvn clean test
```
