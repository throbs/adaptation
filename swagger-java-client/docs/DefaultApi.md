# DefaultApi

All URIs are relative to *http://10.221.2.247/nfvi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nmPerf1dayGet**](DefaultApi.md#nmPerf1dayGet) | **GET** /nm_perf/1day | Get 1 day nm_perf data
[**nmPerf2hourGet**](DefaultApi.md#nmPerf2hourGet) | **GET** /nm_perf/2hour | Get 2 hour nm_perf data
[**nmPerf30minGet**](DefaultApi.md#nmPerf30minGet) | **GET** /nm_perf/30min | Get 30 minutes nm_perf data
[**nmPerf5minGet**](DefaultApi.md#nmPerf5minGet) | **GET** /nm_perf/5min | Get 5 minutes nm_perf data
[**nmPerfsGet**](DefaultApi.md#nmPerfsGet) | **GET** /nm_perfs | Get all performance info.


<a name="nmPerf1dayGet"></a>
# **nmPerf1dayGet**
> Per nmPerf1dayGet(username, password)

Get 1 day nm_perf data

Get 1 day nm_perf data

### Example
```java
// Import classes:
//import com.ap.client.ApiException;
//import com.ap.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | The nfvi username
String password = "password_example"; // String | The nfvi password
try {
    Per result = apiInstance.nmPerf1dayGet(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nmPerf1dayGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The nfvi username |
 **password** | **String**| The nfvi password |

### Return type

[**Per**](Per.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="nmPerf2hourGet"></a>
# **nmPerf2hourGet**
> Per nmPerf2hourGet(username, password)

Get 2 hour nm_perf data

Get 2 hour nm_perf data

### Example
```java
// Import classes:
//import com.ap.client.ApiException;
//import com.ap.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | The nfvi username
String password = "password_example"; // String | The nfvi password
try {
    Per result = apiInstance.nmPerf2hourGet(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nmPerf2hourGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The nfvi username |
 **password** | **String**| The nfvi password |

### Return type

[**Per**](Per.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="nmPerf30minGet"></a>
# **nmPerf30minGet**
> Per nmPerf30minGet(username, password)

Get 30 minutes nm_perf data

Get 30 minutes nm_perf data

### Example
```java
// Import classes:
//import com.ap.client.ApiException;
//import com.ap.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | The nfvi username
String password = "password_example"; // String | The nfvi password
try {
    Per result = apiInstance.nmPerf30minGet(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nmPerf30minGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The nfvi username |
 **password** | **String**| The nfvi password |

### Return type

[**Per**](Per.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="nmPerf5minGet"></a>
# **nmPerf5minGet**
> Per nmPerf5minGet(username, password)

Get 5 minutes nm_perf data

Get 5 minutes nm_perf data

### Example
```java
// Import classes:
//import com.ap.client.ApiException;
//import com.ap.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | The nfvi username
String password = "password_example"; // String | The nfvi password
try {
    Per result = apiInstance.nmPerf5minGet(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nmPerf5minGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The nfvi username |
 **password** | **String**| The nfvi password |

### Return type

[**Per**](Per.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="nmPerfsGet"></a>
# **nmPerfsGet**
> Per nmPerfsGet(username, password)

Get all performance info.

Get all performance info.

### Example
```java
// Import classes:
//import com.ap.client.ApiException;
//import com.ap.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | The nfvi username
String password = "password_example"; // String | The nfvi password
try {
    Per result = apiInstance.nmPerfsGet(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nmPerfsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The nfvi username |
 **password** | **String**| The nfvi password |

### Return type

[**Per**](Per.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

