package com.expense.tracker.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class DebitCardExpenseDetail {

	private @NotNull Long transactionId;
	private @NotNull String cardId;
	private @NotNull String bank;
	private @NotNull LocalDate transactionDate;
	private @NotNull BigDecimal amount;
	private String purpose;
	private @NotNull String transactionType;
	
	
}
