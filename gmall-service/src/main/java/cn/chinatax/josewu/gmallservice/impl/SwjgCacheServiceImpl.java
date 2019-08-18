package cn.chinatax.josewu.gmallservice.impl;


import cn.chinatax.josewu.base.bean.Swjg;
import cn.chinatax.josewu.gmallservice.SwjgCacheService;
import cn.chinatax.josewu.mapper.SwjgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@CacheConfig(cacheNames = "swjgCache")
@Repository("swdjCacheServiceImpl")
@Service
public class SwjgCacheServiceImpl implements SwjgCacheService {

	
	
	@Autowired
	private SwjgMapper swjgMapper;
	
	@Cacheable(key = "#p0")
	@Override
	public Swjg selectById(int id) {
		
		System.out.println("查询功能，缓存找不到，直接读库, id=" +id);
		return swjgMapper.selectByPrimaryKey((short) id);
	}



	@CachePut(key = "#p0")
	@Override
	public void updateById(Swjg swjg) {
		System.out.println("更新功能，更新缓存，直接写库, id=" +swjg);
		swjgMapper.updateByPrimaryKeySelective(swjg);
	}

	@CacheEvict(key = "#p0")
	@Override
	public String deleteById(int id) {
		System.out.println("删除功能，删除缓存，直接写库, id=" + id);
		return "清空缓存成功";
	}

}
