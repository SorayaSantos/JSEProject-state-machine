package io.altar.Repository;

import io.altar.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{
	
	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	public static ShelfRepository getInstance(){
		return INSTANCE;
	}
	private ShelfRepository(){
		
	}
}
