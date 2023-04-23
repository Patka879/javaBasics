package edu.sda.java.advanced.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {

        try {
            Class<?> studentClass = Class.forName("edu.sda.java.advanced.reflection.Student");
            Method[] studentMethods = studentClass.getDeclaredMethods();

            grubaKrecha();
            System.out.println("All methods of student class, regardless of access");
            for (Method method : studentMethods) {
                System.out.println(method);
            }
            grubaKrecha();

            Method[] allMethods = studentClass.getMethods();
            System.out.println("All public methods of Student class and its parents: Person and Object");
            for (Method method : allMethods) {
                System.out.println(method);
            }
            grubaKrecha();

            Field[] classFields = studentClass.getDeclaredFields();
            System.out.println("All fields of given class, regardless of access modifiers");
            for (Field fields : classFields) {
                System.out.println(fields);
            }
            grubaKrecha();

            Field[] allFields = studentClass.getFields();
            System.out.println("All firlds of given class and it's parents, but only public ones");
            for (Field fields : allFields) {
                System.out.println(fields);
            }
            grubaKrecha();

            System.out.println("Let's create an object");
            Student refletionStudent = (Student) studentClass.getDeclaredConstructor().newInstance();
            Method setFaculty = studentClass.getDeclaredMethod("setFaculty", String.class);
            setFaculty.invoke(refletionStudent, "Electronics");

            System.out.println(refletionStudent.getFaculty());


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static void grubaKrecha() {
        System.out.println("=============");
        System.out.println("=============");
    }
}
