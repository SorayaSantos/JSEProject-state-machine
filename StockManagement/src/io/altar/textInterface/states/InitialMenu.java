package io.altar.textInterface.states;

import io.altar.textInterface.ScannerUtils;
import io.altar.textInterface.State;

public class InitialMenu implements State {
	
	@Override
	public int execute(){
		System.out.println("1) List produts");
		System.out.println("2) List shelves");
		System.out.println("3) Quit");
		int [] opcoesValidas = {1,2,3};
		
		return ScannerUtils.getValidIntFromScanner("Por favor selecione as seguintes opcoes ", opcoesValidas,true);
	}
}
