package manning.spock.chapter2

import com.manning.spock.chapter2.UsingMapBasedConstructor.Address
import com.manning.spock.chapter2.UsingMapBasedConstructor.Employee

// 1st Way
Map<String, Integer> wordCount = new HashMap<String, Integer>();
wordCount.put("ABC", 1)
wordCount.put("LMN", 2)
wordCount.put("xyz", 3)
println wordCount

//2nd way
Map<String, Integer> wrdCount1 = ["Hi": 1, "buy": 2, "hello": 3]
println wrdCount1

//3rd way gave example using class Employee and Address
Employee emp1 = new Employee(firstName: "Ajay", lastName: "Kumar", middleName: "none", retired: false);
Employee emp2 = new Employee(firstName: "Sanjay", middleName: "nobe", inTraining: true);

Address address1 = new Address(street: "Marley", number: 25)
Address address2 = new Address(street: "Washtingon", number: 7)

// in java based way
Map<Employee, Address> staffEmpAddress1 = new HashMap<Employee, Address>();
staffEmpAddress1.put(emp1, address1);
staffEmpAddress1.put(emp2, address2);
println staffEmpAddress1

//in groovy way with class object
Map<Employee, Address> staffEmpAddress2 = [(emp1): address1, (emp2): address2]  // bracket needed as () , otherwise groovy treat the object to string
println staffEmpAddress2

//adding element in map groovy way
Map<String,String> personRoles = [:]
personRoles.put("Suzan Ivanova","Lt. Commander")
personRoles["Stephen Franklin"]= "Doctor"
personRoles["Ajay"] = "Kumar"
println personRoles
//get element from map
println personRoles.get("Suzan Ivanova")
println personRoles["Ajay"]

//print out the maps
for (Map.Entry<String, String> entry : personRoles.entrySet()) {
    System.out.println("Key : " + entry.getKey() + "AND Value : " + entry.getValue());
}
//



/** ----------------------------Using List in groovy------------------------**/
