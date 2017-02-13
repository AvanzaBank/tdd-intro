[![][license img]][license]

# TDD Introduction

Project used for TDD introduction workshops. Contains everything you need to get started with Java and TDD. The only 
prerequisite is installed JDK 8 and an editor of your choice.

## Preparation

Perform these preparations before the workshop. This way you can sort out any issues with you development environment 
without being stressed and waisting valuable time at the workshop. It also ensures you can participate even if there's 
no internet connection available.

### Prerequisites

Make sure you have the following installed:

- JDK 8, or later
- An IDE/editor to write code in

The project makes use of Maven wrapper. This mean you do not have to have Maven installed in you local environment. You 
execute maven by using the wrapper scripts `mvnw` or `mvnw.cmd`, depending on if you are in *nix or Windows.

### Download and setup

If you have git installed you can clone this project. Otherwise you can just download the source as a ZIP archive. Use 
the "Clone or Download" button at the top of this page.

Go to the directory where you put the source and execute:

    $> ./mvnw clean package

You should see Maven kicking off and at the end it should say "BUILD SUCCESS" in the output.

You're now ready to start coding!

[license]:LICENSE
[license img]:https://img.shields.io/badge/License-Apache%202-blue.svg
