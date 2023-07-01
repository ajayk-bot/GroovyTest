package manning.spock.chapter2

//list creation in java
List<String> list1 = new ArrayList<>();
list1.add("AA");
list1.add("BB");
list1.add("CC");
println(list1);

List<String> list2 = Arrays.asList("keep", "my", "wallet", "with", "you");
println(list2);

//define lis in groovy
List<String> groovyList = ["AA", "BB", "CC"]
println groovyList
assert groovyList == list1
String[] racesArray = ["Drazi", "Minbari", "Humans"]
println racesArray

List<String> humanShips = ["Condor", "Explorer"]
//Accessing element from list
println humanShips.get(0)
println humanShips[0]
assert humanShips[0] == "Condor";
//Adding element in existing list
humanShips.add("Test")
humanShips[0] = "AddedElement"
humanShips << "Nova" << "Ajay" << "sanjay"
println humanShips
println humanShips.size()
//using stream print list
humanShips.stream().forEach { it -> println it }

