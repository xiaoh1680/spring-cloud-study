package com.xiaohui.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 辉 on 2017/3/25.
 */
public class ReflectTest {

    public Object getProperty(Object owner, String fieldName) throws Exception {
             Class ownerClass = owner.getClass();
             Field field = ownerClass.getField(fieldName);
             Object property = field.get(owner);
             return property;
         }
    public Object getStaticProperty(String className, String fieldName)
             throws Exception {
             Class ownerClass = Class.forName(className);
             Field field = ownerClass.getField(fieldName);
             Object property = field.get(ownerClass);
             return property;
    }
     public Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {
             Class ownerClass = owner.getClass();
             Class[] argsClass = new Class[args.length];
             for (int i = 0, j = args.length; i < j; i++) {
                    argsClass[i] = args[i].getClass();
                 }
             Method method = ownerClass.getMethod(methodName, argsClass);
             return method.invoke(owner, args);
         }
    public Object invokeStaticMethod(String className, String methodName,
              Object[] args) throws Exception {
             Class ownerClass = Class.forName(className);
             Class[] argsClass = new Class[args.length];
             for (int i = 0, j = args.length; i < j; i++) {
                     argsClass[i] = args[i].getClass();
                 }
             Method method = ownerClass.getMethod(methodName, argsClass);
             return method.invoke(null, args);
         }
//          新建实例
          public Object newInstance(String className, Object[] args) throws Exception {
             Class newoneClass = Class.forName(className);
            Class[] argsClass = new Class[args.length];
            for (int i = 0, j = args.length; i < j; i++) {
                     argsClass[i] = args[i].getClass();
                }
             Constructor cons = newoneClass.getConstructor(argsClass);
              return cons.newInstance(args);
            }
            public boolean isInstance(Object obj, Class cls) {
                       return cls.isInstance(obj);
            }
            public Object getByArray(Object array, int index) {
            return Array.get(array,index);
            }

    public static void main(String[] args) throws Exception{
        User user = new User();
        ReflectTest reflectTest=new ReflectTest();
//        reflectTest.getProperty(user, "level");
//        reflectTest.getStaticProperty("com.xiaohui.reflect.User","level");
        Object[] objects = new Object[2];
        objects[0]=13;
        objects[1]=3;
//        reflectTest.invokeMethod(user, "judgeAge", objects);
        reflectTest.newInstance("com.xiaohui.reflect.User", objects);
    }
}
