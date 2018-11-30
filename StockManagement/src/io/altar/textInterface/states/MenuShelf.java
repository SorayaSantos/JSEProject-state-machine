package io.altar.textInterface.states;

import java.util.Collection;

import io.altar.model.Shelf;
import io.altar.textInterface.ScannerUtils;
import io.altar.textInterface.State;
import io.altar.textInterface.TextInterface;


public class MenuShelf implements State {
	@Override
	public int execute() {
		System.out.println("Please select one of the follow options: ");
		System.out.println("");
		System.out.println("1) Create a new shelf");
		System.out.println("2) Edit a existing shelf");
		System.out.println("3) Consult shelf details");
		System.out.println("4) Remove a shelf");
		System.out.println("5) Return to the initial menu");
		
		Collection<Shelf> values = TextInterface.shelfRepository1.ConsultEntities();

		for (Shelf shelf : values) {
			System.out.println(shelf);
		}
		
		int [] opcoesValidas = {1,2,3,4,5};
		
		return ScannerUtils.getValidIntFromScanner("Por favor selecione as seguintes opcoes ", opcoesValidas,true);
		
		}}