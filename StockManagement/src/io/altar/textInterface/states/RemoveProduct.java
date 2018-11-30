package io.altar.textInterface.states;

import io.altar.textInterface.ScannerUtils;
import io.altar.textInterface.State;
import io.altar.textInterface.TextInterface;
import io.altar.model.Product;
import java.util.ArrayList;
import java.util.Scanner;

import io.altar.model.Shelf;

public class RemoveProduct implements State {
	private static Scanner sc = new Scanner(System.in);

	@Override
	public int execute() {
		
		long productId = ScannerUtils.findIdProduct("Please insert the id of the product to be removed: ", false);
		if (productId == (long) -2) {
			return 1;
		}else{
			System.out.println("Remove product? Press enter to remove. ");
			sc.nextLine();
			Product product =  TextInterface.productRepository1.ConsultEntityById(productId);
			ArrayList<Shelf> shelvesList = product.getShelves_list();
			
			for (Shelf shelf:shelvesList ){
				shelf.setProduct(null);
			}
			
			 TextInterface.productRepository1.RemoveEntityById(productId);
			return 1;
		}
}}
