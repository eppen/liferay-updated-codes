package  userapi.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.model.Contact;
import java.util.List;

import userapi.model.screennameempidmapping;
import userapi.service.persistence.screennameempidmappingFinder;


public class screennameempidmappingFinderImpl extends screennameempidmappingFinderBaseImpl 
implements screennameempidmappingFinder
{

	public List getEmpBirthday() {
		Session session = null;
		
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(),"empbirthday");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public List getEmpAnniversary() {
		Session session = null;
		
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(),"empanniversary");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public List getMilestone() {
		Session session = null;
		
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(),"milestone");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	
}