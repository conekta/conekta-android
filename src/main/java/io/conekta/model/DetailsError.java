package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class DetailsError  {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("param")
  private String param = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("debug_message")
  private String debugMessage = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDebugMessage() {
    return debugMessage;
  }
  public void setDebugMessage(String debugMessage) {
    this.debugMessage = debugMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsError detailsError = (DetailsError) o;
    return (this.code == null ? detailsError.code == null : this.code.equals(detailsError.code)) &&
        (this.param == null ? detailsError.param == null : this.param.equals(detailsError.param)) &&
        (this.message == null ? detailsError.message == null : this.message.equals(detailsError.message)) &&
        (this.debugMessage == null ? detailsError.debugMessage == null : this.debugMessage.equals(detailsError.debugMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.param == null ? 0: this.param.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.debugMessage == null ? 0: this.debugMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsError {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  param: ").append(param).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  debugMessage: ").append(debugMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
