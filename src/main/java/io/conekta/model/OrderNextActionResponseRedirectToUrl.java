package io.conekta.model;

import java.net.URI;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * contains the following attributes that will guide to continue the flow
 **/
@ApiModel(description = "contains the following attributes that will guide to continue the flow")
public class OrderNextActionResponseRedirectToUrl  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("url")
  private URI url = null;
  @SerializedName("return_url")
  private URI returnUrl = null;

  /**
   * pay.conekta.com/{id} Indicates the url of the Conekta component to authenticate the flow through 3DS2.
   **/
  @ApiModelProperty(value = "pay.conekta.com/{id} Indicates the url of the Conekta component to authenticate the flow through 3DS2.")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * Indicates the url to which the 3DS2 flow returns at the end, when the integration is redirected.
   **/
  @ApiModelProperty(value = "Indicates the url to which the 3DS2 flow returns at the end, when the integration is redirected.")
  public URI getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(URI returnUrl) {
    this.returnUrl = returnUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderNextActionResponseRedirectToUrl orderNextActionResponseRedirectToUrl = (OrderNextActionResponseRedirectToUrl) o;
    return (this.url == null ? orderNextActionResponseRedirectToUrl.url == null : this.url.equals(orderNextActionResponseRedirectToUrl.url)) &&
        (this.returnUrl == null ? orderNextActionResponseRedirectToUrl.returnUrl == null : this.returnUrl.equals(orderNextActionResponseRedirectToUrl.returnUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.returnUrl == null ? 0: this.returnUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderNextActionResponseRedirectToUrl {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  returnUrl: ").append(returnUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
