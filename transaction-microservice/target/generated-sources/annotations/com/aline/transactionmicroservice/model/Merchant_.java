package com.aline.transactionmicroservice.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Merchant.class)
public abstract class Merchant_ {

	public static volatile SingularAttribute<Merchant, String> zipcode;
	public static volatile SingularAttribute<Merchant, String> code;
	public static volatile SingularAttribute<Merchant, String> address;
	public static volatile SingularAttribute<Merchant, String> city;
	public static volatile SingularAttribute<Merchant, String> name;
	public static volatile SingularAttribute<Merchant, LocalDateTime> registeredAt;
	public static volatile SingularAttribute<Merchant, String> description;
	public static volatile SingularAttribute<Merchant, String> state;

	public static final String ZIPCODE = "zipcode";
	public static final String CODE = "code";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String NAME = "name";
	public static final String REGISTERED_AT = "registeredAt";
	public static final String DESCRIPTION = "description";
	public static final String STATE = "state";

}

