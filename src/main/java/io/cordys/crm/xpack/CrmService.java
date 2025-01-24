package io.cordys.crm.xpack;

import io.cordys.mybatis.BaseMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import io.cordys.crm.system.domain.User;
@Service
public class CrmService {
    @Resource
    BaseMapper <User> userMapper;

}
