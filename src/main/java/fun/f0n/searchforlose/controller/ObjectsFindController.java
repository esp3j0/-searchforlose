package fun.f0n.searchforlose.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.f0n.searchforlose.domain.Loseobject;
import fun.f0n.searchforlose.mapper.LoseobjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ObjectsFindController {
    @Autowired
    private LoseobjectMapper loseobjectMapper;

    @RequestMapping("/objects")
    public Page<Loseobject> getObjects(@RequestParam int current,@RequestParam int size){
        Page<Loseobject> page = new Page<Loseobject>(current, size);
        return loseobjectMapper.testPage(page);
    }
}
