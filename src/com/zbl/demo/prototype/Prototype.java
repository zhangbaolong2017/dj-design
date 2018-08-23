package com.zbl.demo.prototype;


import java.io.*;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String string;

    private Number number;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    private SerializableObject object;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObject() {
        return object;
    }

    public void setObject(SerializableObject object) {
        this.object = object;
    }

    /**
     * 浅复制
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object cloneProtptype() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    public Object deepCloneProtptype() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }

    class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }

}
