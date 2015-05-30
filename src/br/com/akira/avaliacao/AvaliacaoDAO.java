package br.com.akira.avaliacao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.akira.conexao.ConexaoHibernate;

public class AvaliacaoDAO {
	private Session session;

	public void salvar(Avaliacao a) {
		session = ConexaoHibernate.getInstance();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(a);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

}
