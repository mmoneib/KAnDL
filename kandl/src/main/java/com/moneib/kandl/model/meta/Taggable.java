package com.moneib.kandl.model.meta;

import java.util.HashSet;

import com.moneib.kandl.model.Tag;

public interface Taggable {
	HashSet<Tag> tagSet = new HashSet<>();
	
	default boolean addTag(Tag tag) {
		return tagSet.add(tag);
	}
 	default boolean removeTag(Tag tag) {
 		return tagSet.remove(tag);
 	}
}
