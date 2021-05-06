package com.yl.responsibilitychain;

/**
 * @author candk
 * @Description
 * @date 5/6/21 - 3:29 PM
 */
public class Client {

    public static void main(String[] args) {
        Request request1 = new Request(1, 10, 1000.0f);
        Request request2 = new Request(2, 20, 15000.0f);
        Request request3 = new Request(3, 30, 45000.0f);

        DepartmentApprover department_master = new DepartmentApprover("department master");
        CollegeApprover college_master = new CollegeApprover("college master");
        SchoolApprover school_master = new SchoolApprover("school master");

        department_master.setApprover(college_master);
        college_master.setApprover(school_master);

        department_master.processRequest(request1);
        department_master.processRequest(request2);
        department_master.processRequest(request3);
    }
}
