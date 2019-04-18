package demo.demoweb;

import demo.demodao.Demo;
import demo.demoservice.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {

    @Autowired
    private demoService  demoService;

    @GetMapping("/add")
    @ResponseBody
    public Demo add(){
        Demo  demo = new Demo();
        demo.setName("姓名");
        demo = demoService.addOne(demo);
        return demo;
    }
}
