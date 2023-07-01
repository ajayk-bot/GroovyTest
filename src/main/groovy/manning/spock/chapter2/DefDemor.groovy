package manning.spock.chapter2


def createName(String fname, String lname){
    return "$fname + $lname"
}

def createMilitaryName(def fname, def lname){
    return "$fname + $lname"
}

def fullname = createName("AJay","Kumar")
println fullname

def fullMilitaryName = createMilitaryName("sanjay","kumar")
println  fullMilitaryName