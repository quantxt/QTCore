package com.quantxt.doc;

import com.memetix.mst.language.Language;

public class FADocumentInfo extends QTDocument {
	public FADocumentInfo (String body, String title){
		super(body, title);
	}
	
	public void processDoc() {
		englishTitle = Translate(title, Language.PERSIAN, Language.ENGLISH);
	}

	@Override
	protected boolean isStatement(String s) {
		// TODO Auto-generated method stub
		return false;
	}
}
