# Yildiz-Engine feature-mission-shared

This is the official repository of the feature mission server library, part of the Yildiz-Engine project.
The feature mission library library contains the server code to manage the missions.

## Features

* Missions persistence.
* ...

## Requirements

To build this module, you will need a the latest Java JDK and Maven 3.

## Coding Style and other information

Project website:
https://engine.yildiz-games.be

Issue tracker:
https://yildiz.atlassian.net/browse/YFMSV

Wiki:
https://yildiz.atlassian.net/wiki

Quality report:
https://sonarcloud.io/dashboard/index/be.yildiz-games:feature-mission-server

## License

All source code files are licensed under the permissive MIT license
(http://opensource.org/licenses/MIT) unless marked differently in a particular folder/file.

## Build instructions

Go to your root directory, where you POM file is located.

Then invoke maven

	mvn clean install

This will compile the source code, then run the unit tests, and finally build a jar file.

## Usage

In your maven project, add the dependency

```xml
<dependency>
    <groupId>be.yildiz-games</groupId>
    <artifactId>feature-mission-server</artifactId>
    <version>LATEST</version>
</dependency>
```
Replace LATEST with the correct version.

## Contact
Owner of this repository: Grégory Van den Borre
