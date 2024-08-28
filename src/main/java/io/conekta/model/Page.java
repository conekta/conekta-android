package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * page metadata
 **/
@ApiModel(description = "page metadata")
public class Page  {
  
  @SerializedName("next_page_url")
  private String nextPageUrl = null;
  @SerializedName("previous_page_url")
  private String previousPageUrl = null;

  /**
   * URL of the next page.
   **/
  @ApiModelProperty(value = "URL of the next page.")
  public String getNextPageUrl() {
    return nextPageUrl;
  }
  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  /**
   * Url of the previous page.
   **/
  @ApiModelProperty(value = "Url of the previous page.")
  public String getPreviousPageUrl() {
    return previousPageUrl;
  }
  public void setPreviousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return (this.nextPageUrl == null ? page.nextPageUrl == null : this.nextPageUrl.equals(page.nextPageUrl)) &&
        (this.previousPageUrl == null ? page.previousPageUrl == null : this.previousPageUrl.equals(page.previousPageUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.nextPageUrl == null ? 0: this.nextPageUrl.hashCode());
    result = 31 * result + (this.previousPageUrl == null ? 0: this.previousPageUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("  nextPageUrl: ").append(nextPageUrl).append("\n");
    sb.append("  previousPageUrl: ").append(previousPageUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
