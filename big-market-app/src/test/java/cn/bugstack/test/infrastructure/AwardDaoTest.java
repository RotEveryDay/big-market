package cn.bugstack.test.infrastructure;

import cn.bugstack.infrastructure.persistent.dao.IAwardDao;
import cn.bugstack.infrastructure.persistent.po.Award;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 奖品持久化单元测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {
    @Resource
    private IAwardDao awardDao;
    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果，奖品列表：{}", JSON.toJSONString(awards));
    }
}
