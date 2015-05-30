package br.com.akira.tipo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.akira.conexao.ConexaoHibernate;

public class TipoProblemaDAO {
	
	private Session session;

	public void salvar(TipoProblema tp) {
		session = ConexaoHibernate.getInstance();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(tp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

}
