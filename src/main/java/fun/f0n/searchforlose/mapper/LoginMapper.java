package fun.f0n.searchforlose.mapper;

import fun.f0n.searchforlose.domain.Login;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author esp3j
* @description 针对表【login】的数据库操作Mapper
* @createDate 2022-11-30 22:01:19
* @Entity fun.f0n.searchforlose.domain.Login
*/
@Mapper
public interface LoginMapper extends BaseMapper<Login> {

}




