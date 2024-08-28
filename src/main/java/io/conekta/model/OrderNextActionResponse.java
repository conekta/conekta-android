package io.conekta.model;

import io.conekta.model.OrderNextActionResponseRedirectToUrl;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * contains the following attributes that will guide to continue the flow
 **/
@ApiModel(description = "contains the following attributes that will guide to continue the flow")
public class OrderNextActionResponse  {
  
  @SerializedName("redirect_to_url")
  private OrderNextActionResponseRedirectToUrl redirectToUrl = null;
  @SerializedName("type")
  private String type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderNextActionResponseRedirectToUrl getRedirectToUrl() {
    return redirectToUrl;
  }
  public void setRedirectToUrl(OrderNextActionResponseRedirectToUrl redirectToUrl) {
    this.redirectToUrl = redirectToUrl;
  }

  /**
   * Indicates the type of action to be taken
   **/
  @ApiModelProperty(value = "Indicates the type of action to be taken")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderNextActionResponse orderNextActionResponse = (OrderNextActionResponse) o;
    return (this.redirectToUrl == null ? orderNextActionResponse.redirectToUrl == null : this.redirectToUrl.equals(orderNextActionResponse.redirectToUrl)) &&
        (this.type == null ? orderNextActionResponse.type == null : this.type.equals(orderNextActionResponse.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.redirectToUrl == null ? 0: this.redirectToUrl.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderNextActionResponse {\n");
    
    sb.append("  redirectToUrl: ").append(redirectToUrl).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
