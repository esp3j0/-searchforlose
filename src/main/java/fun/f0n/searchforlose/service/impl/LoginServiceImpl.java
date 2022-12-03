package fun.f0n.searchforlose.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.f0n.searchforlose.domain.Login;
import fun.f0n.searchforlose.service.LoginService;
import fun.f0n.searchforlose.mapper.LoginMapper;
import org.springframework.stereotype.Service;

/**
* @author esp3j
* @description 针对表【login】的数据库操作Service实现
* @createDate 2022-11-30 22:01:19
*/
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login>
    implements LoginService{

}




