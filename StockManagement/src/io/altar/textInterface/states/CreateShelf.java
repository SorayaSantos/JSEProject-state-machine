package io.altar.textInterface.states;

import io.altar.textInterface.State;

import java.util.ArrayList;
import io.altar.model.Shelf;
import io.altar.textInterface.TextInterface;
import io.altar.textInterface.ScannerUtils;
import io.altar.model.Product;

	public class CreateShelf implements State {
		@Override
		public int execute() {
			ArrayList<Shelf> shelvesList = new ArrayList<Shelf>();

			long capacity = ScannerUtils.getLongFromScanner("Please insert the capacity: ", false);
			long productId = ScannerUtils.findIdProduct("Please insert the product id: ", false);

			if (productId == (long) -2) {
				return 1;
			}
			else{

			double price = ScannerUtils.getDoubleFromScanner("Please insert the rent price: ", false);

			Product product = TextInterface.productRepository1.ConsultEntityById(productId);
			
					Shelf shelf = new Shelf(capacity, product, price);
					shelvesList = product.getShelves_list();
					shelvesList.add(shelf);
					product.setShelves_list(shelvesList);
					TextInterface.shelfRepository1.CreateEntities(shelf);
					
			return 2;}
		}
	}
