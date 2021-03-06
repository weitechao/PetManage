package com.care.sys.appuserinfo.dao.ibatis;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.care.sys.appuserinfo.dao.AppUserInfoDao;
import com.care.sys.appuserinfo.domain.AppUserInfo;
import com.godoing.rose.lang.DataMap;
import com.godoing.rose.log.LogFactory;

public class SqlMapAppUserInfoDao extends SqlMapClientDaoSupport implements AppUserInfoDao{
	
	Log logger = LogFactory.getLog(SqlMapAppUserInfoDao.class);

	public List<DataMap> getAppUserInfo(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getAppUserInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().queryForList("getAppUserInfo", vo);
	}

	public Integer insertAppUserInfo(AppUserInfo vo) throws DataAccessException {
		logger.debug("insertAppUserInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().update("insertAppUserInfo", vo);
	}

	public Integer updateAppUserInfo(AppUserInfo vo) throws DataAccessException {
		logger.debug("updateAppUserInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().update("updateAppUserInfo", vo);
	}

	public Integer getAppUserInfoCount(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getAppUserInfoCount(AppUserInfo vo)");
		return (Integer)getSqlMapClientTemplate().queryForObject("getAppUserInfoCount", vo);
	}

	public List<DataMap> getAppUserInfoListByVo(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getAppUserInfoListByVo(AppUserInfo vo)");
		return getSqlMapClientTemplate().queryForList("getAppUserInfoListByVo", vo);
	}

	public Integer getAppUserInfoCountGroupByTime(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getAppUserInfoCountGroupByTime(AppUserInfo vo)");
		return (Integer)getSqlMapClientTemplate().queryForObject("getAppUserInfoCountGroupByTime", vo);
	}

	public List<DataMap> getAppUserInfoGroupByTime(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getAppUserInfoGroupByTime(AppUserInfo vo)");
		return getSqlMapClientTemplate().queryForList("getAppUserInfoGroupByTime", vo);
	}

	public Integer getAppUserInfoCountByVo(AppUserInfo vo)
			throws DataAccessException {
		// TODO Auto-generated method stub
		logger.debug("getAppUserInfoCountByVo(AppUserInfo vo)");
		return (Integer)getSqlMapClientTemplate().queryForObject("getAppUserInfoCountByVo", vo);
	}

	public List<DataMap> getWAppUserInfoListByVo(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getWAppUserInfoListByVo(AppUserInfo vo)");
		return getSqlMapClientTemplate().queryForList("getWAppUserInfoListByVo", vo);
	}

	public Integer getWAppUserInfoCountByVo(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("getWAppUserInfoCountByVo(AppUserInfo vo)");
		return (Integer)getSqlMapClientTemplate().queryForObject("getWAppUserInfoCountByVo", vo);
	}

	public Integer deleteAppUserInfo(AppUserInfo vo) throws DataAccessException {
		logger.debug("deleteAppUserInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().update("deleteAppUserInfo", vo);
	}

	public List<DataMap> selectTestInfo(AppUserInfo vo)
			throws DataAccessException {
		logger.debug("selectTestInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().queryForList("selectTestInfo", vo);
	}

	public int insertTestInfo(AppUserInfo vo) throws DataAccessException {
		logger.debug("insertTestInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().update("insertTestInfo", vo);
	}

	public int updateTestInfo(AppUserInfo vo) throws DataAccessException {
		logger.debug("updateTestInfo(AppUserInfo vo)");
		return getSqlMapClientTemplate().update("updateTestInfo", vo);
	}
}
