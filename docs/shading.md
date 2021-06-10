# Shading

## What is a Fat Jar?

A "fat" jar is one that not only contains all of the classes for your project, but also all of their dependencies. A fat
jar has no dependencies, because it packages everything it needs together. It's called fat because these jars tend to be
much larger than a regular jar since they contain so many other jars within them.

The advantages of fat jars are that they can be distributed without worrying about whether the installation destinations
have the necessary dependencies. The disadvantages are that they use vastly more space and don't take advantage of
runtime library linking.

## What is a Shaded Jar?

A "shaded" jar is a fat jar that also renames all of the dependencies' packages so that they are considered a part of
your project. Without shading, it's possible that the dependencies in a fat jar may conflict with different versions of
the same library in the destination environment. By shading the fat jar, it guarantees that not only will the necessary
dependencies be present, but that they will also not conflict with any local dependencies at runtime.
