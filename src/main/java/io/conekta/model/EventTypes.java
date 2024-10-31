package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * It is a parameter that allows to identify in the response, the type of event that is being generated.
 **/
@ApiModel(description = "It is a parameter that allows to identify in the response, the type of event that is being generated.")
public class EventTypes  {
  
  private static final String MXN = "MXN";
  
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypes eventTypes = (EventTypes) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypes {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
