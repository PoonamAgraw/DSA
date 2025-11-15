
package com.demo.service;

import java.util.Arrays;
import com.demo.beans.Employee;

public class EmployeeService {
    
    public static void bubbleSort(Employee[] employees) {
        int n = employees.length;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (employees[j].getSalary() > employees[j + 1].getSalary()) {
             
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                    count++;
                }
            }
            System.out.println("Number of swaps in pass " + i + " is: " + count);
        }
        System.out.println("Sorted Employees by Salary:");
        System.out.println(Arrays.toString(employees));
    }
}
