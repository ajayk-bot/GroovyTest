package manning.spock.chapter2

import com.manning.spock.chapter2.SimpleDepartment

//Java way to access object
SimpleDepartment simDept = new SimpleDepartment();
simDept.setDepartBuildingName("Sale department");
simDept.setDepartMentName("SALES")
println simDept
System.out.println("Department Building Name:" + simDept.getDepartBuildingName());
System.out.println("Department Name:" + simDept.getDepartMentName());

//groovy way to access
println "String interpolation: ${simDept.getDepartMentName()}" //methos calls hence use ${}
println "String interpolation: ${simDept.getDepartBuildingName()}"
println "String interpolation direct access field $simDept.departBuildingName" //direct fields access use $ only
println "String interpolation direct access field $simDept.departMentName"

Person per = new Person();
per.setAge(30)
per.setFirstName("AJAY")
per.setLastName("KUmar")
System.out.println("Age is $per.age") //access fields
println "Age is grater than 25: ${per.getAge() > 25}"  // using expression use ${} -> either True/False
println "Amount in dollars is: \$300" // Escaping is used "\" the $ when want to print out as $300 in console
println "Age is grater than 25: ${per.age > 25}" // with double quotes it becomes expression
println 'Age is grater than 25: ${per.age > 25}' // with single quotes it just pritn as complete statement in console


