package com.manning.spock.chapter2;

public class SimpleDepartment {
    public String departMentName;
    public String departBuildingName;


    public String getDepartMentName() {
        return departMentName;
    }

    public void setDepartMentName(String departMentName) {
        this.departMentName = departMentName;
    }

    public String getDepartBuildingName() {
        return departBuildingName;
    }

    public void setDepartBuildingName(String departBuildingName) {
        this.departBuildingName = departBuildingName;
    }

    @Override
    public String toString() {
        return "SimpleDepartment{" +
                "departMentName='" + departMentName + '\'' +
                ", departBuildingName='" + departBuildingName + '\'' +
                '}';
    }
}
