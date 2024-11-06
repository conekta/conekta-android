package io.conekta.model;

import io.conekta.model.DetailsError;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * err model
 **/
@ApiModel(description = "err model")
public class Error  {

  private static final String MXN = "MXN";

  @SerializedName("details")
  private List<DetailsError> details = null;
  @SerializedName("log_id")
  private String logId = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("object")
  private String _object = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<DetailsError> getDetails() {
    return details;
  }

  public void setDetails(List<DetailsError> details) {
    this.details = details;
  }
  /**
   * log id
   * 
   **/
  @ApiModelProperty(value = "log id")
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
    Error error = (Error) o;
    return (this.details == null ? error.details == null : this.details.equals(error.details)) &&
        (this.logId == null ? error.logId == null : this.logId.equals(error.logId)) &&
        (this.type == null ? error.type == null : this.type.equals(error.type)) &&
        (this._object == null ? error._object == null : this._object.equals(error._object));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.details == null ? 0 : this.details.hashCode());
    result = 31 * result + (this.logId == null ? 0 : this.logId.hashCode());
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  details: ").append(details).append("\n");
sb.append("  logId: ").append(logId).append("\n");
sb.append("  type: ").append(type).append("\n");
sb.append("  _object: ").append(_object).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
