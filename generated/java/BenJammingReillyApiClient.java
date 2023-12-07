/**
 * This file was auto-generated by Fern from our API Definition.
 */

import core.ApiError;
import core.ClientOptions;
import core.ObjectMappers;
import core.RequestOptions;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Object;
import java.lang.RuntimeException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import types.ReceiveS3EventResponse;
import types.S3Event;

public class BenJammingReillyApiClient {
  protected final ClientOptions clientOptions;

  public BenJammingReillyApiClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  /**
   * This endpoint receives notifications for events happening in an S3 bucket, like file uploads.
   */
  public ReceiveS3EventResponse receiveS3Event(S3Event request, RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("s3")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response response = clientOptions.httpClient().newCall(okhttpRequest).execute();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ReceiveS3EventResponse.class);
      }
      throw new ApiError(response.code(), ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * This endpoint receives notifications for events happening in an S3 bucket, like file uploads.
   */
  public ReceiveS3EventResponse receiveS3Event(S3Event request) {
    return receiveS3Event(request,null);
  }

  public static BenJammingReillyApiClientBuilder builder() {
    return new BenJammingReillyApiClientBuilder();
  }
}
