package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Fazer todos os testes antes de finalizar
		
		SellerDao sd = DaoFactory.createSellerDao();
		//Listando todos os Seller do DB + Department Id/Name
		List<Seller> sl = new ArrayList<>();
				sl = sd.findAl();
		sd.deleteById(2); // Deletando BD;
		for (Seller seller : sl) {
			System.out.println(seller);
		}
				
		
	}

}
