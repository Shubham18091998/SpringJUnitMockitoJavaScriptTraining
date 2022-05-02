package com.spring.apppackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ChennaiPassportOffice implements HeadPassportOffice{

	Document chennaiDocument;
	@Autowired
	public ChennaiPassportOffice(Document chennaiDocument) {
		super();
		this.chennaiDocument = chennaiDocument;
	}

	@Override
	public void doPhotoVerification() {
		
		System.out.println("Photo verification done using "+chennaiDocument.getIdProof());
		
	}

	@Override
	public void issuePassport() {
		System.out.println("Passport issue is in progress for "+chennaiDocument.getName()+" from "+chennaiDocument.getCity()+" office");
		
	}

}
