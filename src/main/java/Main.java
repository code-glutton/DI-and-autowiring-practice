import com.osahonAtm.DogAndOwnerProf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DogAndOwnerProf dG = context.getBean("implementbean",DogAndOwnerProf.class);
        dG.impl();
    }

}
