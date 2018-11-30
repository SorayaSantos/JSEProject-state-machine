package io.altar.textInterface;

public class FSM {
	private State[] states = {
			new InitialMenu(),				//0
			new MenuProduct(),		//1
			new MenuShelf()};	//2
	
	private int transitionsMatrix [][] = {	{1,2},		//state 0
											{0,0,0,0,0}, 	//state 1
											{0,0,0,0,0}};	//state 2
	
	private int currentState = 0;
	
	public static void main(String[] args) {
		
		FSM fsm = new FSM();
		int opcao = 0;
		
		while(true){
			opcao = fsm.states[fsm.currentState].execute();
			if (fsm.currentState==0 && opcao==3){
				break;}
			fsm.currentState=fsm.transitionsMatrix[fsm.currentState][opcao-1];
		}

	}
}
