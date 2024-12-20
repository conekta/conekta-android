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
import io.conekta.model.GetWebhooksResponse;
import io.conekta.model.WebhookRequest;
import io.conekta.model.WebhookResponse;
import io.conekta.model.WebhookUpdateRequest;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class WebhooksApi {
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
   * Create Webhook
   * What we do at Conekta translates into events. For example, an event of interest to us occurs at the time a payment is successfully processed. At that moment we will be interested in doing several things: Send an email to the buyer, generate an invoice, start the process of shipping the product, etc.
   * @param webhookRequest requested field for webhook
   * @param acceptLanguage Use for knowing which language to use
   * @return WebhookResponse
   */
  public WebhookResponse  createWebhook (WebhookRequest webhookRequest, String acceptLanguage) throws ApiException {
    Object localVarPostBody = webhookRequest;
    // verify the required parameter 'webhookRequest' is set
    if (webhookRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'webhookRequest' when calling createWebhook");
    }

    // create path and map variables
    String localVarPath = "/webhooks".replaceAll("\\{format\\}","json");

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
        return (WebhookResponse) ApiInvoker.deserialize(localVarResponse, "", WebhookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Delete Webhook
   * 
   * @param id Identifier of the resource
   * @param acceptLanguage Use for knowing which language to use
   * @return WebhookResponse
   */
  public WebhookResponse  deleteWebhook (String id, String acceptLanguage) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWebhook");
    }

    // create path and map variables
    String localVarPath = "/webhooks/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (WebhookResponse) ApiInvoker.deserialize(localVarResponse, "", WebhookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get Webhook
   * 
   * @param id Identifier of the resource
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return WebhookResponse
   */
  public WebhookResponse  getWebhook (String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getWebhook");
    }

    // create path and map variables
    String localVarPath = "/webhooks/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (WebhookResponse) ApiInvoker.deserialize(localVarResponse, "", WebhookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Get List of Webhooks
   * Consume the list of webhooks you have, each environment supports 10 webhooks (For production and testing)
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @param limit The numbers of items to return, the maximum value is 250
   * @param search General order search, e.g. by mail, reference etc.
   * @param url url for webhook filter
   * @param next next page
   * @param previous previous page
   * @return GetWebhooksResponse
   */
  public GetWebhooksResponse  getWebhooks (String acceptLanguage, String xChildCompanyId, Integer limit, String search, String url, String next, String previous) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "url", url));
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
        return (GetWebhooksResponse) ApiInvoker.deserialize(localVarResponse, "", GetWebhooksResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Test Webhook
   * Send a webhook.ping event
   * @param id Identifier of the resource
   * @param acceptLanguage Use for knowing which language to use
   * @return WebhookResponse
   */
  public WebhookResponse  testWebhook (String id, String acceptLanguage) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling testWebhook");
    }

    // create path and map variables
    String localVarPath = "/webhooks/{id}/test".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (WebhookResponse) ApiInvoker.deserialize(localVarResponse, "", WebhookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Update Webhook
   * updates an existing webhook
   * @param id Identifier of the resource
   * @param webhookUpdateRequest requested fields in order to update a webhook
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return WebhookResponse
   */
  public WebhookResponse  updateWebhook (String id, WebhookUpdateRequest webhookUpdateRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = webhookUpdateRequest;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling updateWebhook");
    }
    // verify the required parameter 'webhookUpdateRequest' is set
    if (webhookUpdateRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'webhookUpdateRequest' when calling updateWebhook");
    }

    // create path and map variables
    String localVarPath = "/webhooks/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (WebhookResponse) ApiInvoker.deserialize(localVarResponse, "", WebhookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}
