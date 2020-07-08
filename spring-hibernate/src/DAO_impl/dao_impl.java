package DAO_impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import DAO.DAO_interfcae;
import model.SPORTS;

public class dao_impl implements DAO_interfcae{
 private SessionFactory sf;
 
	public SessionFactory getSf() {
	return sf;
}

public void setSf(SessionFactory sf) {
	this.sf = sf;
}

	@Override
	public void insert(SPORTS sp) {
		try(Session session=getSf().openSession())
		{
			session.beginTransaction();
			session.save(sp);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, double value) {
		try(Session session=getSf().openSession())
		{
			session.beginTransaction();
			SPORTS sp=session.get(SPORTS.class,id);
			if(sp!=null)
			{
			sp.setCost(value);
			session.update(sp);
			}
			else
			{
				System.out.print("value not available in the DB");
			}
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try(Session session=getSf().openSession())
		{
			session.beginTransaction();
			SPORTS sp=session.get(SPORTS.class,id);
			if(sp!=null)
			{
			session.delete(sp);
			}
			else
			{
				System.out.print("value not available in the DB");
			}
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void fetch_employee_by_id(int id) {
		try(Session session=getSf().openSession())
		{
			String HQl="from SPORTS where id=?";
			Query<SPORTS>query=session.createQuery(HQl,SPORTS.class);
			query.setParameter(0,id);
			SPORTS sport=query.uniqueResult();
			if(sport!=null)
			{
			System.out.print("id: "+sport.getSports_id()+"\t"+"name: "+sport.getSports_name()+"\t"+"number_of_players: "+sport.getNumber_of_players()+"\t"+"cost"+sport.getCost());
			}
			else
			{
			 System.out.print("value not in db");	
			}
			
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void fetch_employee() {
		try(Session session=getSf().openSession())
		{
			String HQl="from SPORTS";
			Query<SPORTS>query=session.createQuery(HQl,SPORTS.class);
			List<SPORTS>spo=query.list();
			if(spo!=null)
			{
			for(SPORTS sp:spo)
			{
				if(sp!=null)
				{
				System.out.println("id: "+sp.getSports_id()+"\t"+"name: "+sp.getSports_name()+"\t"+"number_of_players: "+sp.getNumber_of_players()+"\t"+"cost"+sp.getCost());
				}
				else
				{
					 System.out.print("value not in db");
				}
			}
			}
			else
			{
			 System.out.print("value not in db");	
			}
			
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}

}
