package src.ReflectionEx.blackBoxInteger;

import blackBoxInteger.BlackBoxInt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            Constructor<BlackBoxInt> defaultConstructor = BlackBoxInt.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            BlackBoxInt object = defaultConstructor.newInstance();
            String input;

            while (!"END".equals(input = scan.nextLine())) {

                String methodName = input.split("_")[0];
                int parameter = Integer.parseInt(input.split("_")[1]);

                Method method = BlackBoxInt.class.getDeclaredMethod(methodName, int.class);
                method.setAccessible(true);
                method.invoke(object, parameter);

                Field field = BlackBoxInt.class.getDeclaredField("innerValue");
                field.setAccessible(true);

                System.out.println((int) field.get(object));
            }
        } catch (IllegalAccessException
                | InstantiationException
                | NoSuchMethodException
                | InvocationTargetException
                | NoSuchFieldException e) {

            e.printStackTrace();
        }
    }
}
