# Gradle

Gradle is a dependency management and build tool for JVM-based languages (Java, Kotlin, Groovy, Scala, etc.).

## Setting Properties in Gradle

### Setting JVM Compiler Properties

The particular subproject which is requires some property should have its `JavaCompile` task modified as such:

```groovy
project(":some-project") {
    tasks.withType(JavaCompile).all { JavaCompile compile ->
        compile.options.compilerArgs = [
            ...
        ]
    }
}
```

### Setting System Properties of Gradle

To set system properties for the JVM in which Gradle is running, add the system properties to `gradle.properties`.

#### Example

```
org.gradle.daemon=true
org.gradle.parallel=false
org.gradle.configureondemand=true
org.gradle.jvmargs=-Xmx2048m -Xss2048k -XX:MaxPermSize=512m -XX:+HeapDumpOnOutOfMemoryError -Dfile.encoding=UTF-8
```

### Setting System Properties for Application Compiled by Gradle

If the project is configured to use the `application` plugin, system properties can be added via the `run` task:
```
run {
    systemProperties['property'] = 'value'
}
```
