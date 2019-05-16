package com.moneib.kandl.model;

import com.moneib.kandl.model.meta.Type;

public class Tag extends Entity {
	private String tagText;
	
	public Tag(String tagText, Type type) {
		validateType(type);
		this.type = type;
		this.tagText = tagText;
	}
	
	protected void validateType(Type type) {
		if (type!=Type.TAG || type!=Type.CATEGORY) {
			throw new IllegalArgumentException("A tag must be of the type TAG or CATEGORY!");
		}
	}
	
	//TODO Fail equality if both tags have the same text.
}
