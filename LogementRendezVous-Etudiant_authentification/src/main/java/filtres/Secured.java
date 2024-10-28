package filtres;



import javax.ws.rs.NameBinding;
import java.lang.annotation.*;


@NameBinding
@Retention(RetentionPolicy.RUNTIME)

//L'annotation pourra être utilisée sur une classe, une interface, etc ET aussi bien sur des méthodes
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface Secured {
}
