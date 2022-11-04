# Jakarta EE

[![Deployment](../../actions/workflows/deployment.yml/badge.svg)](../../actions/workflows/deployment.yml)
[![Code Quality](../../actions/workflows/code-quality.yml/badge.svg)](../../actions/workflows/code-quality.yml)

Example project to get started with [Jakarta EE](https://jakarta.ee).

## ⚙️ Get Started

You'll need [OpenJDK 11.x](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) and [Maven 3.6.x](https://maven.apache.org) installed.

> **Note**: Manual installation of [Apache Tomcat](https://tomcat.apache.org) is not required. The download and installation is done by the [Codehaus Cargo Maven 3 Plugin](https://codehaus-cargo.github.io/cargo/Maven+3+Plugin.html).

### Clone Repository

First of all, you need to clone the repository:

```bash
$ git clone https://github.com/StefanZoneExamples/jakartaee.git
$ cd jakartaee
```

### Run Container

Then you're able to run the local [Apache Tomcat](https://tomcat.apache.org) container:

```bash
$ mvn clean verify cargo:run
```

It will listen on [http://localhost:8080/](http://localhost:8080/) unless otherwise configured in `pom.xml`.

### Deploy

Execute the following command to deploy the **W**eb **AR**chive (WAR) to the running container. (Patience required)

> **Note**: By using [VisualStudio Code](https://code.visualstudio.com), this command is executed automatically on each `Save`.

```bash
$ mvn package cargo:redeploy
```

### Code Quality

Enforce coding standards with [Checkstyle](https://checkstyle.org) and [PMD](https://pmd.github.io) by executing the following command.

```bash
$ mvn verify
```

### Cleanup

Cleanup (delete) `target` directory by executing the command:

```bash
$ mvn clean
```

## 🔨 Technology

The following technologies and tools were used during development.

- **Code**: [Java](https://www.java.com)
- **View**: [Jakarta Server Faces (JSF)](https://jakarta.ee/specifications/faces/)
- **UI**: [PrimeFaces](https://primefaces.org)
- **Server**: [Tomcat](https://tomcat.apache.org)
- **Code Quality**: [Checkstyle](https://checkstyle.org), [PMD](https://pmd.github.io)

## 👷‍ Error Found?

Thank you for your message! Please fill out a [bug report](../../issues/new?assignees=&labels=&template=bug_report.md&title=).

## License

This project is licensed under the [GNU General Public License Version 2](https://www.gnu.org/licenses/old-licenses/gpl-2.0.txt).

```
Copyright (C) 2022 Stefan Kühnel

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
```
