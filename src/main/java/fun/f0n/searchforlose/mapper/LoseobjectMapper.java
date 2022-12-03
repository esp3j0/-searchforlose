package fun.f0n.searchforlose.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.f0n.searchforlose.domain.Loseobject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author esp3j
* @description 针对表【loseobject】的数据库操作Mapper
* @createDate 2022-11-30 22:01:19
* @Entity fun.f0n.searchforlose.domain.Loseobject
*/
@Mapper
public interface LoseobjectMapper extends BaseMapper<Loseobject> {


    Page<Loseobject> testPage(Page<Loseobject> page);
}




