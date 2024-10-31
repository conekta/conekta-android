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

import io.conekta.model.DiscountLinesResponse;
import io.conekta.model.Error;
import io.conekta.model.GetOrderDiscountLinesResponse;
import io.conekta.model.OrderDiscountLinesRequest;
import io.conekta.model.UpdateOrderDiscountLinesRequest;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DiscountsApi {
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
   * Create Discount
   * Create discount lines for an existing orden
   * @param id Identifier of the resource
   * @param orderDiscountLinesRequest requested field for a discount lines
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return DiscountLinesResponse
   */
  public DiscountLinesResponse  ordersCreateDiscountLine (String id, OrderDiscountLinesRequest orderDiscountLinesRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = orderDiscountLinesRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateDiscountLine");
    }
    // verify the required parameter 'orderDiscountLinesRequest' is set
    if (orderDiscountLinesRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'orderDiscountLinesRequest' when calling ordersCreateDiscountLine");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    localVarHeaderParams.put("Conekta-Client-User-Agent", "{\"agent\": \"Conekta Android SDK\"}");
    
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
        return (DiscountLinesResponse) ApiInvoker.deserialize(localVarResponse, "", DiscountLinesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Delete Discount
   * Delete an existing discount lines for an existing orden
   * @param id Identifier of the resource
   * @param discountLinesId discount line id identifier
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return DiscountLinesResponse
   */
  public DiscountLinesResponse  ordersDeleteDiscountLines (String id, String discountLinesId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersDeleteDiscountLines");
    }
    // verify the required parameter 'discountLinesId' is set
    if (discountLinesId == null) {
       throw new ApiException(400, "Missing the required parameter 'discountLinesId' when calling ordersDeleteDiscountLines");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines/{discount_lines_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "discount_lines_id" + "\\}", apiInvoker.escapeString(discountLinesId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (DiscountLinesResponse) ApiInvoker.deserialize(localVarResponse, "", DiscountLinesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get Discount
   * Get an existing discount lines for an existing orden
   * @param id Identifier of the resource
   * @param discountLinesId discount line id identifier
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return DiscountLinesResponse
   */
  public DiscountLinesResponse  ordersGetDiscountLine (String id, String discountLinesId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersGetDiscountLine");
    }
    // verify the required parameter 'discountLinesId' is set
    if (discountLinesId == null) {
       throw new ApiException(400, "Missing the required parameter 'discountLinesId' when calling ordersGetDiscountLine");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines/{discount_lines_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "discount_lines_id" + "\\}", apiInvoker.escapeString(discountLinesId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

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
        return (DiscountLinesResponse) ApiInvoker.deserialize(localVarResponse, "", DiscountLinesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get a List of Discount
   * Get discount lines for an existing orden
   * @param id Identifier of the resource
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @param limit The numbers of items to return, the maximum value is 250
   * @param search General order search, e.g. by mail, reference etc.
   * @param next next page
   * @param previous previous page
   * @return GetOrderDiscountLinesResponse
   */
  public GetOrderDiscountLinesResponse  ordersGetDiscountLines (String id, String acceptLanguage, String xChildCompanyId, Integer limit, String search, String next, String previous) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersGetDiscountLines");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (GetOrderDiscountLinesResponse) ApiInvoker.deserialize(localVarResponse, "", GetOrderDiscountLinesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Update Discount
   * Update an existing discount lines for an existing orden
   * @param id Identifier of the resource
   * @param discountLinesId discount line id identifier
   * @param updateOrderDiscountLinesRequest requested field for a discount lines
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return DiscountLinesResponse
   */
  public DiscountLinesResponse  ordersUpdateDiscountLines (String id, String discountLinesId, UpdateOrderDiscountLinesRequest updateOrderDiscountLinesRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = updateOrderDiscountLinesRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersUpdateDiscountLines");
    }
    // verify the required parameter 'discountLinesId' is set
    if (discountLinesId == null) {
       throw new ApiException(400, "Missing the required parameter 'discountLinesId' when calling ordersUpdateDiscountLines");
    }
    // verify the required parameter 'updateOrderDiscountLinesRequest' is set
    if (updateOrderDiscountLinesRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'updateOrderDiscountLinesRequest' when calling ordersUpdateDiscountLines");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines/{discount_lines_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "discount_lines_id" + "\\}", apiInvoker.escapeString(discountLinesId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

    localVarHeaderParams.put("Authorization",  ApiInvoker.parameterToString("Bearer " + apiKey));
    localVarHeaderParams.put("Conekta-Client-User-Agent", "{\"agent\": \"Conekta Android SDK\"}");
    
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
        return (DiscountLinesResponse) ApiInvoker.deserialize(localVarResponse, "", DiscountLinesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}