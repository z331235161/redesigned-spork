package demo.demoservice.lmpl;

import demo.demodao.Demo;
import demo.demodao.DemoRepository;
import demo.demoservice.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class demoServiceImpl implements demoService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public Demo addOne(Demo demo) {
        return demoRepository.save(demo);
    }
}
