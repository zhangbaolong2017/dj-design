package com.zbl.demo.prototype;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class PrototypeTest {

    public static void main(String[] args) {
        Prototype demo1 = new Prototype();
        Student student = new Student();
        demo1.setString("cnm");
        student.setName("demo1");
        demo1.setStudent(student);

        Prototype demo2 = null;
        try {
            demo2 = (Prototype)demo1.cloneProtptype();
        } catch (Exception e) {

        }

        Prototype demo3 = null;
        try {
            demo3 = (Prototype)demo1.deepCloneProtptype();
        } catch (Exception e) {

        }

        /*Boolean cloneFlag = (demo1 == demo2 ? true : false);
        Boolean deepCloneFlag = (demo1 == demo3 ? true : false);
        System.out.println(demo2.getString());
        System.out.println(demo3.getString());

        System.out.println(cloneFlag);
        System.out.println(deepCloneFlag);
        System.out.println(demo1.equals(demo2));
        System.out.println(demo1.equals(demo3));

        demo2.setString("nidaye");
        System.out.println(demo1.getString());

        demo2.setNumber(12);
        System.out.println(demo1.getNumber());*/


        demo2.getStudent().setName("demo2222");
        System.out.println(demo1.getStudent().getName());
        demo3.getStudent().setName("demo333333");
        System.out.println(demo1.getStudent().getName());
    }
}
