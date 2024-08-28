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

import io.conekta.model.ChargeOrderResponse;
import io.conekta.model.ChargeRequest;
import io.conekta.model.ChargeResponse;
import io.conekta.model.ChargeUpdateRequest;
import io.conekta.model.Error;
import io.conekta.model.GetChargesResponse;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ChargesApi {
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
   * Get A List of Charges
   * 
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @param limit The numbers of items to return, the maximum value is 250
   * @param search General order search, e.g. by mail, reference etc.
   * @param next next page
   * @param previous previous page
   * @return GetChargesResponse
   */
  public GetChargesResponse  getCharges (String acceptLanguage, String xChildCompanyId, Integer limit, String search, String next, String previous) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/charges".replaceAll("\\{format\\}","json");

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
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));
    
    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    
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
        return (GetChargesResponse) ApiInvoker.deserialize(localVarResponse, "", GetChargesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Create charge
   * Create charge for an existing orden
   * @param id Identifier of the resource
   * @param chargeRequest requested field for a charge
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return ChargeOrderResponse
   */
  public ChargeOrderResponse  ordersCreateCharge (String id, ChargeRequest chargeRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = chargeRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateCharge");
    }
    // verify the required parameter 'chargeRequest' is set
    if (chargeRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'chargeRequest' when calling ordersCreateCharge");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/charges".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));
    
    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    
    String[] localVarContentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (ChargeOrderResponse) ApiInvoker.deserialize(localVarResponse, "", ChargeOrderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Update a charge
   * 
   * @param id Identifier of the resource
   * @param chargeUpdateRequest requested field for update a charge
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return ChargeResponse
   */
  public ChargeResponse  updateCharge (String id, ChargeUpdateRequest chargeUpdateRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = chargeUpdateRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling updateCharge");
    }
    // verify the required parameter 'chargeUpdateRequest' is set
    if (chargeUpdateRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'chargeUpdateRequest' when calling updateCharge");
    }

    // create path and map variables
    String localVarPath = "/charges/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));
    
    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    
    String[] localVarContentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (ChargeResponse) ApiInvoker.deserialize(localVarResponse, "", ChargeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}
