package br.com.akira.ponto;

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
}
