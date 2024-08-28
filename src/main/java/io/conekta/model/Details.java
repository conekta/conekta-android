package io.conekta.model;

import io.conekta.model.DetailsError;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Details  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("details")
  private List<DetailsError> details = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DetailsError> getDetails() {
    return details;
  }
  public void setDetails(List<DetailsError> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Details details = (Details) o;
    return (this.details == null ? details.details == null : this.details.equals(details.details));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Details {\n");
    
    sb.append("  details: ").append(details).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
