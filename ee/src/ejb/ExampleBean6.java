package ejb;

import javax.annotation.Resource;

public class ExampleBean6 {

    @Resource(name = "currencyRate")
    Double currencyRate;

    public String getName() {
        return "Max " + currencyRate;
    }
}
