/**
 * title
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.ap.client.api;

import com.ap.client.ApiCallback;
import com.ap.client.ApiClient;
import com.ap.client.ApiException;
import com.ap.client.ApiResponse;
import com.ap.client.Configuration;
import com.ap.client.Pair;
import com.ap.client.ProgressRequestBody;
import com.ap.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.ap.client.model.Per;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for nmPerf1dayGet */
    private com.squareup.okhttp.Call nmPerf1dayGetCall(String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling nmPerf1dayGet(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling nmPerf1dayGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/nm_perf/1day".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get 1 day nm_perf data
     * Get 1 day nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return Per
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Per nmPerf1dayGet(String username, String password) throws ApiException {
        ApiResponse<Per> resp = nmPerf1dayGetWithHttpInfo(username, password);
        return resp.getData();
    }

    /**
     * Get 1 day nm_perf data
     * Get 1 day nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return ApiResponse&lt;Per&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Per> nmPerf1dayGetWithHttpInfo(String username, String password) throws ApiException {
        com.squareup.okhttp.Call call = nmPerf1dayGetCall(username, password, null, null);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get 1 day nm_perf data (asynchronously)
     * Get 1 day nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nmPerf1dayGetAsync(String username, String password, final ApiCallback<Per> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = nmPerf1dayGetCall(username, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for nmPerf2hourGet */
    private com.squareup.okhttp.Call nmPerf2hourGetCall(String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling nmPerf2hourGet(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling nmPerf2hourGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/nm_perf/2hour".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get 2 hour nm_perf data
     * Get 2 hour nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return Per
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Per nmPerf2hourGet(String username, String password) throws ApiException {
        ApiResponse<Per> resp = nmPerf2hourGetWithHttpInfo(username, password);
        return resp.getData();
    }

    /**
     * Get 2 hour nm_perf data
     * Get 2 hour nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return ApiResponse&lt;Per&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Per> nmPerf2hourGetWithHttpInfo(String username, String password) throws ApiException {
        com.squareup.okhttp.Call call = nmPerf2hourGetCall(username, password, null, null);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get 2 hour nm_perf data (asynchronously)
     * Get 2 hour nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nmPerf2hourGetAsync(String username, String password, final ApiCallback<Per> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = nmPerf2hourGetCall(username, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for nmPerf30minGet */
    private com.squareup.okhttp.Call nmPerf30minGetCall(String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling nmPerf30minGet(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling nmPerf30minGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/nm_perf/30min".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get 30 minutes nm_perf data
     * Get 30 minutes nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return Per
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Per nmPerf30minGet(String username, String password) throws ApiException {
        ApiResponse<Per> resp = nmPerf30minGetWithHttpInfo(username, password);
        return resp.getData();
    }

    /**
     * Get 30 minutes nm_perf data
     * Get 30 minutes nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return ApiResponse&lt;Per&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Per> nmPerf30minGetWithHttpInfo(String username, String password) throws ApiException {
        com.squareup.okhttp.Call call = nmPerf30minGetCall(username, password, null, null);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get 30 minutes nm_perf data (asynchronously)
     * Get 30 minutes nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nmPerf30minGetAsync(String username, String password, final ApiCallback<Per> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = nmPerf30minGetCall(username, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for nmPerf5minGet */
    private com.squareup.okhttp.Call nmPerf5minGetCall(String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling nmPerf5minGet(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling nmPerf5minGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/nm_perf/5min".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get 5 minutes nm_perf data
     * Get 5 minutes nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return Per
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Per nmPerf5minGet(String username, String password) throws ApiException {
        ApiResponse<Per> resp = nmPerf5minGetWithHttpInfo(username, password);
        return resp.getData();
    }

    /**
     * Get 5 minutes nm_perf data
     * Get 5 minutes nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return ApiResponse&lt;Per&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Per> nmPerf5minGetWithHttpInfo(String username, String password) throws ApiException {
        com.squareup.okhttp.Call call = nmPerf5minGetCall(username, password, null, null);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get 5 minutes nm_perf data (asynchronously)
     * Get 5 minutes nm_perf data
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nmPerf5minGetAsync(String username, String password, final ApiCallback<Per> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = nmPerf5minGetCall(username, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for nmPerfsGet */
    private com.squareup.okhttp.Call nmPerfsGetCall(String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling nmPerfsGet(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling nmPerfsGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/nm_perfs".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get all performance info.
     * Get all performance info.
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return Per
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Per nmPerfsGet(String username, String password) throws ApiException {
        ApiResponse<Per> resp = nmPerfsGetWithHttpInfo(username, password);
        return resp.getData();
    }

    /**
     * Get all performance info.
     * Get all performance info.
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @return ApiResponse&lt;Per&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Per> nmPerfsGetWithHttpInfo(String username, String password) throws ApiException {
        com.squareup.okhttp.Call call = nmPerfsGetCall(username, password, null, null);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all performance info. (asynchronously)
     * Get all performance info.
     * @param username The nfvi username (required)
     * @param password The nfvi password (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nmPerfsGetAsync(String username, String password, final ApiCallback<Per> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = nmPerfsGetCall(username, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Per>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}