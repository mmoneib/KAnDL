package com.moneib.kandl.model;

import com.moneib.kandl.model.meta.Type;

public class Word extends Entity {
	{
		type = Type.WORD;
	}
	
	public Word(long id) {
		this.id = id;
	}
}
