package io.altar.textInterface;

import io.altar.Repository.ProductRepository;
import io.altar.Repository.ShelfRepository;

public class TextInterface {
	static public ProductRepository productRepository1 = ProductRepository.getInstance();
	static public ShelfRepository shelfRepository1 = ShelfRepository.getInstance();
	public static int[] ivas = new int[] { 6, 13, 23 };
}
