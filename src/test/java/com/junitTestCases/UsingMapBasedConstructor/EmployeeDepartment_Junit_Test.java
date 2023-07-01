package com.junitTestCases.UsingMapBasedConstructor;

import com.manning.spock.chapter2.UsingMapBasedConstructor.Department;
import org.junit.jupiter.api.Test;
import com.manning.spock.chapter2.UsingMapBasedConstructor.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeDepartment_Junit_Test {

    @Test
    public void employeeJunitTes() {

        Employee trainee = new Employee();   // Object 1
        trainee.setAge(22);
        trainee.setFirstName("Alice");
        trainee.setLastName("Olson");
        trainee.setInTraining(true);
        trainee.setRetired(false);

        Employee seasoned = new Employee(); //Object 2
        seasoned.setAge(45);
        seasoned.setFirstName("Alex");
        seasoned.setMiddleName("Jones");
        seasoned.setLastName("Corwin");
        // seasoned.setRetired(true);
        seasoned.setRetired(false);

        List<Employee> people = new ArrayList<Employee>();
        people.add(trainee);
        people.add(seasoned);

        System.out.println("People list :" + people);

        //Test Java class Department
        Department dept = new Department();

        //assign the staff to department with condition like if passed staff is retired then no allocation
        dept.assign(people);
        //verify the manpowerCount() function
        int noOfStaffInDept = dept.manpowerCount();

        assertEquals(2, noOfStaffInDept);


    }

}
