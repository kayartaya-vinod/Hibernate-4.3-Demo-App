package demos.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import demos.entity.Brand;
import demos.util.HibernateUtil;

public class P01_GetBrandById {

	public static void main(String[] args) {
		SessionFactory factory = null;
		try {
			factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			Brand b1 = (Brand) session.get(Brand.class, 1);
			System.out.println(b1);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
