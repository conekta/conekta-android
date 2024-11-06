package io.conekta.model;

import io.conekta.model.OrderResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class OrdersResponse  {

  private static final String MXN = "MXN";

  @SerializedName("data")
  private List<OrderResponse> data = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderResponse> getData() {
    return data;
  }

  public void setData(List<OrderResponse> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersResponse ordersResponse = (OrdersResponse) o;
    return (this.data == null ? ordersResponse.data == null : this.data.equals(ordersResponse.data));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0 : this.data.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
