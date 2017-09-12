/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package cat.diba.oficinasvivienda.service.persistence;

import cat.diba.oficinasvivienda.NoSuchMunicipioException;
import cat.diba.oficinasvivienda.model.Municipio;
import cat.diba.oficinasvivienda.model.impl.MunicipioImpl;
import cat.diba.oficinasvivienda.model.impl.MunicipioModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the municipio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see MunicipioPersistence
 * @see MunicipioUtil
 * @generated
 */
public class MunicipioPersistenceImpl extends BasePersistenceImpl<Municipio>
	implements MunicipioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MunicipioUtil} to access the municipio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MunicipioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioModelImpl.FINDER_CACHE_ENABLED, MunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioModelImpl.FINDER_CACHE_ENABLED, MunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MunicipioPersistenceImpl() {
		setModelClass(Municipio.class);
	}

	/**
	 * Caches the municipio in the entity cache if it is enabled.
	 *
	 * @param municipio the municipio
	 */
	@Override
	public void cacheResult(Municipio municipio) {
		EntityCacheUtil.putResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioImpl.class, municipio.getPrimaryKey(), municipio);

		municipio.resetOriginalValues();
	}

	/**
	 * Caches the municipios in the entity cache if it is enabled.
	 *
	 * @param municipios the municipios
	 */
	@Override
	public void cacheResult(List<Municipio> municipios) {
		for (Municipio municipio : municipios) {
			if (EntityCacheUtil.getResult(
						MunicipioModelImpl.ENTITY_CACHE_ENABLED,
						MunicipioImpl.class, municipio.getPrimaryKey()) == null) {
				cacheResult(municipio);
			}
			else {
				municipio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all municipios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MunicipioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MunicipioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the municipio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Municipio municipio) {
		EntityCacheUtil.removeResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioImpl.class, municipio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Municipio> municipios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Municipio municipio : municipios) {
			EntityCacheUtil.removeResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
				MunicipioImpl.class, municipio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param codigoIne the primary key for the new municipio
	 * @return the new municipio
	 */
	@Override
	public Municipio create(String codigoIne) {
		Municipio municipio = new MunicipioImpl();

		municipio.setNew(true);
		municipio.setPrimaryKey(codigoIne);

		return municipio;
	}

	/**
	 * Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigoIne the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio remove(String codigoIne)
		throws NoSuchMunicipioException, SystemException {
		return remove((Serializable)codigoIne);
	}

	/**
	 * Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws cat.diba.oficinasvivienda.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio remove(Serializable primaryKey)
		throws NoSuchMunicipioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Municipio municipio = (Municipio)session.get(MunicipioImpl.class,
					primaryKey);

			if (municipio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMunicipioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(municipio);
		}
		catch (NoSuchMunicipioException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Municipio removeImpl(Municipio municipio)
		throws SystemException {
		municipio = toUnwrappedModel(municipio);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(municipio)) {
				municipio = (Municipio)session.get(MunicipioImpl.class,
						municipio.getPrimaryKeyObj());
			}

			if (municipio != null) {
				session.delete(municipio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (municipio != null) {
			clearCache(municipio);
		}

		return municipio;
	}

	@Override
	public Municipio updateImpl(
		cat.diba.oficinasvivienda.model.Municipio municipio)
		throws SystemException {
		municipio = toUnwrappedModel(municipio);

		boolean isNew = municipio.isNew();

		Session session = null;

		try {
			session = openSession();

			if (municipio.isNew()) {
				session.save(municipio);

				municipio.setNew(false);
			}
			else {
				session.merge(municipio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioImpl.class, municipio.getPrimaryKey(), municipio);

		return municipio;
	}

	protected Municipio toUnwrappedModel(Municipio municipio) {
		if (municipio instanceof MunicipioImpl) {
			return municipio;
		}

		MunicipioImpl municipioImpl = new MunicipioImpl();

		municipioImpl.setNew(municipio.isNew());
		municipioImpl.setPrimaryKey(municipio.getPrimaryKey());

		municipioImpl.setCodigoIne(municipio.getCodigoIne());
		municipioImpl.setNombre(municipio.getNombre());

		return municipioImpl;
	}

	/**
	 * Returns the municipio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the municipio
	 * @return the municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMunicipioException, SystemException {
		Municipio municipio = fetchByPrimaryKey(primaryKey);

		if (municipio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMunicipioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return municipio;
	}

	/**
	 * Returns the municipio with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchMunicipioException} if it could not be found.
	 *
	 * @param codigoIne the primary key of the municipio
	 * @return the municipio
	 * @throws cat.diba.oficinasvivienda.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio findByPrimaryKey(String codigoIne)
		throws NoSuchMunicipioException, SystemException {
		return findByPrimaryKey((Serializable)codigoIne);
	}

	/**
	 * Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the municipio
	 * @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Municipio municipio = (Municipio)EntityCacheUtil.getResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
				MunicipioImpl.class, primaryKey);

		if (municipio == _nullMunicipio) {
			return null;
		}

		if (municipio == null) {
			Session session = null;

			try {
				session = openSession();

				municipio = (Municipio)session.get(MunicipioImpl.class,
						primaryKey);

				if (municipio != null) {
					cacheResult(municipio);
				}
				else {
					EntityCacheUtil.putResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
						MunicipioImpl.class, primaryKey, _nullMunicipio);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
					MunicipioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return municipio;
	}

	/**
	 * Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param codigoIne the primary key of the municipio
	 * @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio fetchByPrimaryKey(String codigoIne)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)codigoIne);
	}

	/**
	 * Returns all the municipios.
	 *
	 * @return the municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Municipio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.MunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Municipio> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.MunicipioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Municipio> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Municipio> list = (List<Municipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MUNICIPIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MUNICIPIO;

				if (pagination) {
					sql = sql.concat(MunicipioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Municipio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Municipio>(list);
				}
				else {
					list = (List<Municipio>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the municipios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Municipio municipio : findAll()) {
			remove(municipio);
		}
	}

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MUNICIPIO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the municipio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cat.diba.oficinasvivienda.model.Municipio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Municipio>> listenersList = new ArrayList<ModelListener<Municipio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Municipio>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MunicipioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MUNICIPIO = "SELECT municipio FROM Municipio municipio";
	private static final String _SQL_COUNT_MUNICIPIO = "SELECT COUNT(municipio) FROM Municipio municipio";
	private static final String _ORDER_BY_ENTITY_ALIAS = "municipio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Municipio exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MunicipioPersistenceImpl.class);
	private static Municipio _nullMunicipio = new MunicipioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Municipio> toCacheModel() {
				return _nullMunicipioCacheModel;
			}
		};

	private static CacheModel<Municipio> _nullMunicipioCacheModel = new CacheModel<Municipio>() {
			@Override
			public Municipio toEntityModel() {
				return _nullMunicipio;
			}
		};
}