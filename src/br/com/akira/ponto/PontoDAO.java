package br.com.akira.ponto;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.akira.conexao.ConexaoHibernate;

public class PontoDAO {

	private Session session;

	public void salvar(Ponto p) {
		session = ConexaoHibernate.getInstance();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(p);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

	public List listAll(String query) {
		session = ConexaoHibernate.getInstance();
		try {
			Query pQuery = session.createQuery(query);
			List lista = pQuery.list();
			session.flush();
			session.close();
			return lista;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List listByLatitudeLongitude(Double latitude, Double longitude) {
		session = ConexaoHibernate.getInstance();
		try {
			Query pQuery = session
					.createQuery("FROM br.com.akira.ponto.Ponto p WHERE p.latitude >  "
							+ latitude + " and p.longitude > " + longitude);
			pQuery.setMaxResults(6);
			List lista = pQuery.list();
			session.flush();
			session.close();
			return lista;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List listByPath(Double latitudeFrom, Double longitudeFrom,
			Double latitudeTo, Double longitudeTo) {
		session = ConexaoHibernate.getInstance();
		try {
			Query pQuery = session
					.createQuery("FROM br.com.akira.ponto.Ponto p WHERE p.latitude >  "
							+ latitudeFrom
							+ " and p.latitude < "
							+ latitudeTo
							+ " and p.longitude > "
							+ longitudeFrom
							+ " and p.longitude < " + longitudeTo);
			pQuery.setMaxResults(10);
			List lista = pQuery.list();
			session.flush();
			session.close();
			return lista;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
}
