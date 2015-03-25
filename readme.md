# Octocity - Octopack for Teamcity

### What is Octocity?

Octocity is a simple nuget packager for Octupus Deploy, it works very similar than Octopack and can be added as a TeamCity step

### Why on earth?

Am I reinventing the wheel? not necesarily.

Octupus Deploy uses nuget packages as a deployment artifact, but that is not the common nuget package that we know (and that is the reason we cannot use the existing Nuget package from TeamCity). So to solve this, the guys from Octupus Deploy created an open source tool named Octopack.

Well, Octopack has two disvantages for our scenario:

 - It does not run in Mono (the tool is made in .NET and it has some problems with paths in non-Windows environments)
 - It works as a task/target for a msbuild project

In our case, we have a bunch of PHP/Ruby/Java tools we need to deploy and we want to have full control of the generated Octopack nuget, for example, using TeamCity artifact paths specification, so, we decided to build this plugin.

### It is complete?

Not really, this is Open Source mate, so we probably are not covering all the scenarios.

### How do I install the plugin?

As any other TeamCity plugin, just make sure to release one of the binaries and not the source code.

### Can this plugin run in non-Windows targets?

Sure, that is one of the reasons we build it

### How can I build the plugin?

I will explain this later.

## How can I configure this?

I will explain this later.
