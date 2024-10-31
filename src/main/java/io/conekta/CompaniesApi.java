/**
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.conekta;

import io.conekta.ApiException;
import io.conekta.ApiInvoker;
import io.conekta.Pair;

import io.conekta.model.*;

import java.util.*;

import io.conekta.model.CompanyResponse;
import io.conekta.model.Error;
import io.conekta.model.GetCompaniesResponse;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class CompaniesApi {
  String basePath = "https://api.conekta.io";
  String apiKey;
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }
  
  public void setApiKey(String apiKey){
      this.apiKey = apiKey;
  }
  
  public String GetApiKey(){
      return this.apiKey;
  }

  /**
   * Get List of Companies
   * Consume the list of child companies.  This is used for holding companies with several child entities.
   * @param acceptLanguage Use for knowing which language to use
   * @param limit The numbers of items to return, the maximum value is 250
   * @param search General order search, e.g. by mail, reference etc.
   * @param next next page
   * @param previous previous page
   * @return GetCompaniesResponse
   */
  public GetCompaniesResponse  getCompanies (String acceptLanguage, Integer limit, String search, String next, String previous) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/companies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "previous", previous));
    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));

    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    localVarHeaderParams.put("Conekta-Client-User-Agent", "{\"agent\": \"Conekta Android SDK\"}");
    
    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (GetCompaniesResponse) ApiInvoker.deserialize(localVarResponse, "", GetCompaniesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get Company
   * 
   * @param id Identifier of the resource
   * @param acceptLanguage Use for knowing which language to use
   * @return CompanyResponse
   */
  public CompanyResponse  getCompany (String id, String acceptLanguage) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getCompany");
    }

    // create path and map variables
    String localVarPath = "/companies/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));

    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    localVarHeaderParams.put("Conekta-Client-User-Agent", "{\"agent\": \"Conekta Android SDK\"}");
    
    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (CompanyResponse) ApiInvoker.deserialize(localVarResponse, "", CompanyResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}
