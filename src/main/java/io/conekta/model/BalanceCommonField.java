package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * balance common fields model
 **/
@ApiModel(description = "balance common fields model")
public class BalanceCommonField  {
  
  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("currency")
  private String currency = null;

  /**
   * The balance's amount
   **/
  @ApiModelProperty(value = "The balance's amount")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * The balance's currency
   **/
  @ApiModelProperty(value = "The balance's currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceCommonField balanceCommonField = (BalanceCommonField) o;
    return (this.amount == null ? balanceCommonField.amount == null : this.amount.equals(balanceCommonField.amount)) &&
        (this.currency == null ? balanceCommonField.currency == null : this.currency.equals(balanceCommonField.currency));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceCommonField {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
