package ejb;

import ejb.interfaces.LocalExampleInterface;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateless
@LocalBean
@Local(LocalExampleInterface.class)
public class ExampleBean implements LocalExampleInterface {

    @Override
    public String getName() {
        return "Max";
    }

    public String getSurname() {
        return "black";
    }
}
