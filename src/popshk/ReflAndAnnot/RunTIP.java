package popshk.ReflAndAnnot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTIP {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
            Class myClass = TwoInt.class;

        Method [] methods = myClass.getDeclaredMethods();
            for (Method m:methods){
                if (m.isAnnotationPresent(TwoIntParameter.class)){
                    TwoIntParameter tip = m.getAnnotation(TwoIntParameter.class);
                        int res = (Integer)m.invoke(null,tip.a(),tip.b());
                    System.out.println(res);
                }
            }
    }
}

class TwoInt{
    @TwoIntParameter(a=2,b=3)
        public static int sum(int a,int b){
            return a+b;
    }
}
