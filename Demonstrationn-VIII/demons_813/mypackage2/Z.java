package mypackage2;

import mypackage1.*;

public class Z extends X {
    public Z() {
        System.out.println("I am constructor from class Z");

        // System.out.println("n from Z : " + n); //Error!
        // Default variables are not accessible outside the package
        // System.out.println("p from Z : " + p); //Error! -private is not accessible

        // protected members are accessible only by inheritance outside the package
        System.out.println("q from Z : " + q); // ok: protected is accessible as Z extends X
        System.out.println("r from Z : " + r); // ok: public is accessible
    }
}

/*
 * Get-ChildItem -Path mypackage2 -Filter *.java | ForEach-Object { javac
 * $_.FullName }
 * Run the above command if javac is not able to compile package2 java files
 * It may
 */

/*
 * 1. Get-ChildItem: Get-ChildItem is a PowerShell cmdlet that retrieves the
 * files and subfolders from a specified location. It's similar to the dir
 * command in Windows or ls command in Linux.
 * 
 * 2. -Path mypackage2: This specifies the path where Get-ChildItem should look
 * for files and subfolders. In this case, it's the mypackage2 directory.
 * 
 * 3. -Filter *.java: This specifies a filter to apply to the results of
 * Get-ChildItem. The * is a wildcard character that matches any characters, and
 * .java specifies that we only want to retrieve files with the .java extension.
 * So, this filter returns only the Java files in the mypackage2 directory.
 * 
 * 4. |: The | character is a pipe symbol, which is used to pass the output of
 * the previous command as input to the next command.
 * 
 * 5. ForEach-Object: ForEach-Object is a PowerShell cmdlet that executes a
 * script block for each object in the pipeline. In this case, the pipeline
 * contains the list of Java files retrieved by Get-ChildItem.
 * 
 * 6. { javac $_.FullName }: This is the script block that's executed for each
 * Java file in the pipeline. Here's what it does: * $_ is a special variable in
 * PowerShell that represents the current object in the pipeline. In this case,
 * it's a Java file. * FullName is a property of the file object that returns
 * the full path and name of the file. * javac is the Java compiler command.
 * It's executed with the full path and name of each Java file as an argument.
 * 
 * So, when we put it all together, the command Get-ChildItem -Path mypackage2
 * -Filter *.java | ForEach-Object { javac $_.FullName } does the following:
 * 
 * Retrieves a list of Java files in the mypackage2 directory.
 * Pipes the list of Java files to the ForEach-Object cmdlet.
 * For each Java file, executes the javac command with the full path and name of
 * the file as an argument.
 * This command compiles each Java file in the mypackage2 directory, including
 * Z.java and B.java, and generates the corresponding .class files.
 */