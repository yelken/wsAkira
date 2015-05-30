package br.com.akira.usuario;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.akira.conexao.ConexaoHibernate;

public class UsuarioDAO {
	private Session session;

	public void salvar(Usuario u) {
		session = ConexaoHibernate.getInstance();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(u);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

}
