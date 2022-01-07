package com.aline.transactionmicroservice.model;

import com.aline.core.model.account.Account;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transaction.class)
public abstract class Transaction_ {

	public static volatile SingularAttribute<Transaction, LocalDateTime> date;
	public static volatile SingularAttribute<Transaction, Integer> amount;
	public static volatile SingularAttribute<Transaction, TransactionMethod> method;
	public static volatile SingularAttribute<Transaction, LocalDateTime> created;
	public static volatile SingularAttribute<Transaction, String> description;
	public static volatile SingularAttribute<Transaction, Merchant> merchant;
	public static volatile SingularAttribute<Transaction, TransactionType> type;
	public static volatile SingularAttribute<Transaction, Integer> postedBalance;
	public static volatile SingularAttribute<Transaction, Integer> initialBalance;
	public static volatile SingularAttribute<Transaction, Long> id;
	public static volatile SingularAttribute<Transaction, TransactionState> state;
	public static volatile SingularAttribute<Transaction, LocalDateTime> lastModified;
	public static volatile SingularAttribute<Transaction, Account> account;
	public static volatile SingularAttribute<Transaction, TransactionStatus> status;

	public static final String DATE = "date";
	public static final String AMOUNT = "amount";
	public static final String METHOD = "method";
	public static final String CREATED = "created";
	public static final String DESCRIPTION = "description";
	public static final String MERCHANT = "merchant";
	public static final String TYPE = "type";
	public static final String POSTED_BALANCE = "postedBalance";
	public static final String INITIAL_BALANCE = "initialBalance";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String LAST_MODIFIED = "lastModified";
	public static final String ACCOUNT = "account";
	public static final String STATUS = "status";

}

