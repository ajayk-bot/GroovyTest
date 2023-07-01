package manning.spock.chapter2.readingXMlJsonFile

//def xmlRoot = new XmlSlurper().parse('src/main/resources/employee-data.xml')
def xmlRoot = new XmlSlurper().parse('D:/IntelljJava/ProjectWorkSPace/SpockFrameworkIntelliJ/src/main/resources/employee-data.xml')
println xmlRoot
assert xmlRoot.department.size() ==1
println xmlRoot.department.size()

assert xmlRoot.department.@name =="sales"
println xmlRoot.department.@name

assert xmlRoot.department.employee.size() ==2
println xmlRoot.department.employee.size()

assert xmlRoot.department.employee[0].firstName =="Orlando"
println xmlRoot.department.employee[0].firstName

assert xmlRoot.department.employee[0].lastName =="Boren"
assert xmlRoot.department.employee[0].age ==24
assert xmlRoot.department.employee[1].firstName =="Diana"
assert xmlRoot.department.employee[1].lastName =="Colgan"
assert xmlRoot.department.employee[1].age ==28
