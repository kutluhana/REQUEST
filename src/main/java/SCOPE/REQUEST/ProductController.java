package SCOPE.REQUEST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private Tapucom tapucom;

    @Autowired
    private Tapucom tapucom2;

    @Autowired
    private GenericApplicationContext applicationContext;

    @GetMapping("get-data")
    public String getData() {
        tapucom.setName("Kutluhan Palalıoğlu 1");
        tapucom.setName("Kutluhan Palalıoğlu 2");

        System.out.println("Hello: " + applicationContext.getBean("tapucom"));

        return String.format("first tapucom: %s\nsecond tapucom: %s", tapucom.getName(), tapucom2.getName());
    }

}
