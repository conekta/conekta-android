package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class PaymentMethod  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("object")
  private String _object = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return (this.type == null ? paymentMethod.type == null : this.type.equals(paymentMethod.type)) &&
        (this._object == null ? paymentMethod._object == null : this._object.equals(paymentMethod._object));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
