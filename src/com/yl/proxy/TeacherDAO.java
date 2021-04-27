package com.yl.proxy;

/**
 * @author candk
 * @Description
 * @date 4/27/21 - 8:36 AM
 */
public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("Teach");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }
}
