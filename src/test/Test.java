package test;

import java.lang.reflect.Field;

public class Test {

   public static void main(String[] args) throws NoSuchFieldException, 
      SecurityException, IllegalArgumentException, IllegalAccessException {

      SampleClass sampleObject = new SampleClass();

      Field field = SampleClass.class.getField("sampleField");

      field.setInt(sampleObject, 7999);

      System.out.println(field.getInt(sampleObject));
   }
}

class SampleClass {
   public static int sampleField = 5999;
}