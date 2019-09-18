package ejb;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Singleton;

@Singleton
@RolesAllowed({"root", "admin"})
public class ExampleBean8 {

    public String getName() {
        return "Max ";
    }
}
