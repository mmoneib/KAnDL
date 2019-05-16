package com.moneib.kandl.model;

import com.moneib.kandl.model.meta.Taggable;
import com.moneib.kandl.model.meta.Type;

public class Statement extends Entity implements Taggable {
	{
		type = Type.STATEMENT;
	}
	
	public Statement(long id) {
		this.id = id;
	}
	
	//TODO Make a statement an array of words.

}
