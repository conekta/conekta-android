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
import io.conekta.model.Product;
import io.conekta.model.ProductOrderResponse;
import io.conekta.model.UpdateProduct;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ProductsApi {
  String basePath = "https://api.conekta.io";
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

  /**
   * Create Product
   * Create a new product for an existing order.
   * @param id Identifier of the resource
   * @param product requested field for a product
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return ProductOrderResponse
   */
  public ProductOrderResponse  ordersCreateProduct (String id, Product product, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = product;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateProduct");
    }
    // verify the required parameter 'product' is set
    if (product == null) {
       throw new ApiException(400, "Missing the required parameter 'product' when calling ordersCreateProduct");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/line_items".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();


    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

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
        return (ProductOrderResponse) ApiInvoker.deserialize(localVarResponse, "", ProductOrderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Delete Product
   * Delete product for an existing orden
   * @param id Identifier of the resource
   * @param lineItemId identifier
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return ProductOrderResponse
   */
  public ProductOrderResponse  ordersDeleteProduct (String id, String lineItemId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersDeleteProduct");
    }
    // verify the required parameter 'lineItemId' is set
    if (lineItemId == null) {
       throw new ApiException(400, "Missing the required parameter 'lineItemId' when calling ordersDeleteProduct");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/line_items/{line_item_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "line_item_id" + "\\}", apiInvoker.escapeString(lineItemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();


    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

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
        return (ProductOrderResponse) ApiInvoker.deserialize(localVarResponse, "", ProductOrderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Update Product
   * Update an existing product for an existing orden
   * @param id Identifier of the resource
   * @param lineItemId identifier
   * @param updateProduct requested field for products
   * @param acceptLanguage Use for knowing which language to use
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request.
   * @return ProductOrderResponse
   */
  public ProductOrderResponse  ordersUpdateProduct (String id, String lineItemId, UpdateProduct updateProduct, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = updateProduct;
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ordersUpdateProduct");
    }
    // verify the required parameter 'lineItemId' is set
    if (lineItemId == null) {
       throw new ApiException(400, "Missing the required parameter 'lineItemId' when calling ordersUpdateProduct");
    }
    // verify the required parameter 'updateProduct' is set
    if (updateProduct == null) {
       throw new ApiException(400, "Missing the required parameter 'updateProduct' when calling ordersUpdateProduct");
    }

    // create path and map variables
    String localVarPath = "/orders/{id}/line_items/{line_item_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "line_item_id" + "\\}", apiInvoker.escapeString(lineItemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();


    localVarHeaderParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    localVarHeaderParams.put("X-Child-Company-Id", ApiInvoker.parameterToString(xChildCompanyId));

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
        return (ProductOrderResponse) ApiInvoker.deserialize(localVarResponse, "", ProductOrderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}
