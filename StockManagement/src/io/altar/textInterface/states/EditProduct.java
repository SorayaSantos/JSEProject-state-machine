package io.altar.textInterface.states;

import io.altar.textInterface.State;
import io.altar.textInterface.TextInterface;
import io.altar.textInterface.ScannerUtils;
import io.altar.model.Product;

	public class EditProduct implements State {

		@Override
		public int execute() {
			int[] ivas = new int[] { 6, 13, 23 };
			long productId = ScannerUtils.findIdProduct("Please insert the id of the product to be changed: ", false);
			if (productId == (long) -2) {
				return 1;
				
			}else{
			Product productToBeChanged = TextInterface.productRepository1.ConsultEntityById(productId);

			int iva = ScannerUtils.getValidIntFromScanner("Please insert the iva:             Actual iva: (" + productToBeChanged.getIva() + ")", ivas, true);
			
			double discount = ScannerUtils.getValidDoubleFromScanner("Please insert the discount:             Actual discount: ("
					+ productToBeChanged.getDiscount() + ")", 100, true);
			double pvp = ScannerUtils.getDoubleFromScanner("Please insert the pvp:             Actual pvp: (" + productToBeChanged.getPvp() + ")", true);

				Product product = TextInterface.productRepository1.ConsultEntityById(productId);
				
				if (iva  != (long) -1) {
					product.setIva(iva);
				}
				if (discount  != (long) -1) {
					product.setDiscount(discount);	
				}
				if (pvp  != (long) -1) {
					product.setPvp(pvp);
				}

				TextInterface.productRepository1.EditEntityById(productId, product);

				return 1;

}}}
