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

import io.conekta.model.Error;
import io.conekta.model.OrderTaxRequest;
import io.conekta.model.UpdateOrderTaxRequest;
import io.conekta.model.UpdateOrderTaxResponse;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class TaxesApi {
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
   * Create Tax
   * Create new taxes for an existing orden
   * @param id Identifier of the resource
   * @param orderTaxRequest requested field for a taxes
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return UpdateOrderTaxResponse
   */
  public UpdateOrderTaxResponse  ordersCreateTaxes (String id, OrderTaxRequest orderTaxRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = orderTaxRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateTaxes");
    }
    // verify the required parameter 'orderTaxRequest' is set
    if (orderTaxRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'orderTaxRequest' when calling ordersCreateTaxes");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/tax_lines".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UpdateOrderTaxResponse) ApiInvoker.deserialize(localVarResponse, "", UpdateOrderTaxResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Delete Tax
   * Delete taxes for an existing orden
   * @param id Identifier of the resource
   * @param taxId identifier
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return UpdateOrderTaxResponse
   */
  public UpdateOrderTaxResponse  ordersDeleteTaxes (String id, String taxId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersDeleteTaxes");
    }
    // verify the required parameter 'taxId' is set
    if (taxId == null) {
       throw new ApiException(400, "Missing the required parameter 'taxId' when calling ordersDeleteTaxes");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/tax_lines/{tax_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "tax_id" + "\\}", apiInvoker.escapeString(taxId.toString()));

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
        return (UpdateOrderTaxResponse) ApiInvoker.deserialize(localVarResponse, "", UpdateOrderTaxResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Update Tax
   * Update taxes for an existing orden
   * @param id Identifier of the resource
   * @param taxId identifier
   * @param updateOrderTaxRequest requested field for taxes
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return UpdateOrderTaxResponse
   */
  public UpdateOrderTaxResponse  ordersUpdateTaxes (String id, String taxId, UpdateOrderTaxRequest updateOrderTaxRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = updateOrderTaxRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersUpdateTaxes");
    }
    // verify the required parameter 'taxId' is set
    if (taxId == null) {
       throw new ApiException(400, "Missing the required parameter 'taxId' when calling ordersUpdateTaxes");
    }
    // verify the required parameter 'updateOrderTaxRequest' is set
    if (updateOrderTaxRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'updateOrderTaxRequest' when calling ordersUpdateTaxes");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/tax_lines/{tax_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "tax_id" + "\\}", apiInvoker.escapeString(taxId.toString()));

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
        return (UpdateOrderTaxResponse) ApiInvoker.deserialize(localVarResponse, "", UpdateOrderTaxResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}
