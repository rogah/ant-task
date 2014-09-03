# Template for Custom ANT Task

This is template for start writing a *ANT* custom task. The ```build.xml``` includes the following:

1. Basic structure for *ANT* project:
  1.  Set the build number;
  2.  Import ```build.properties``` file;
  3.  Set environment variable;
  4.  Set timestamp;
  5.  Set default task;
2. Compile java;
3. Create *JAR* file:
  1. Copy the ```antlib.xml``` files to bin folder with *.class* files;
  2. Create manifest file ```manifest.mf```;
  3. Create the *JAR* file into build folder (including lib files);
4. Deploy the *JAR* file to ```%ANT_HOME%\lib``` directory;
5. Cleanup files;

## Antlib

An antlib file is an xml file with a root element of "antlib".

```xml
<?xml version="1.0"?>
<antlib>
   <taskdef name="foobar" classname="com.foo.bar.FooBarTask" />
</antlib>
```

Which allows you to reference your *ANT* lib through a namespace (e.g. *xmlns:my="antlib:com.foo.bar"*) as follows:

```xml
<project name="Custom ANT Task Demo"
  basedir="."
  default="default"
  xmlns:my="antlib:com.foo.bar">
  
  ...
  
  <target name="default">
    <my:foobar message="baz qux!" />
  </target>

  ...

</project>
```

More on [Antlib](https://ant.apache.org/manual/Types/antlib.html) URL address.
