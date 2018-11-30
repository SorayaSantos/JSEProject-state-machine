package io.altar.textInterface.states;

import io.altar.textInterface.State;
import io.altar.textInterface.TextInterface;
import io.altar.textInterface.ScannerUtils;


public class ConsultProduct implements State {

	@Override
	public int execute() {
		long productId = ScannerUtils.findIdProduct("Please insert the id of the product: ", false);
		if (productId == (long) -2) {
			return 2;
		}else{
			System.out.println(TextInterface.productRepository1.ConsultEntityById(productId));
			return 1;
		}
	}
}