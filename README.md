# sbt-rpm
A toy SBT project that creates installable RPM files from Scala sources.

## Why?

This project might be a useful starting point to package your Scala and Spark programs in RPM files and distribute them in your datacenter using Yum or DevOPS tools, such as [Ansible](https://www.ansible.com/), [Puppet](https://puppet.com/) or [Salt](https://saltstack.com/).

This template project is based on the work done by [SBT Native Packager plugin](https://github.com/sbt/sbt-native-packager) and was tested on CentOS 7.

## Building

To build the RPM:

    sbt rpm:packageBin

At the end of the execution, the RPM file is saved under `target/rpm/RPMS/noarch/`.
    
## Install

To install the RPM you can use either `rpm` or `yum` commands:

    rpm -i target/rpm/RPMS/noarch/sbt-rpm-1.0-1.noarch.rpm

or:

    yum install target/rpm/RPMS/noarch/sbt-rpm-1.0-1.noarch.rpm

## Use your program
The [SBT Native Packager plugin](https://github.com/sbt/sbt-native-packager) takes care of creating RPMs that installs and create links in `/usr/bin`. Thus, you can launch the Scala program as just typing `sbt-rpm`.
