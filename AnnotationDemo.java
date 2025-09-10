import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args){
        Method[] methods = MyService.class.getDeclaredMethods();

        for(Method method : methods){
            if(method.isAnnotationPresent(Important.class)){
                Important imp = method.getAnnotation(Important.class);
                System.out.println("Method: "+method.getName()+" -> "+imp.value());
            }
        }
    }
}