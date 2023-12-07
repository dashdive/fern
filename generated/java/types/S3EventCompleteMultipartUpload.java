/**
 * This file was auto-generated by Fern from our API Definition.
 */

package types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.ObjectMappers;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = S3EventCompleteMultipartUpload.Builder.class
)
public final class S3EventCompleteMultipartUpload {
  private final String uploadId;

  private final Optional<String> versionId;

  private final String bucket;

  private final OffsetDateTime timestamp;

  private final S3EventCompleteMultipartUploadProvider provider;

  private final Optional<String> customerId;

  private final Optional<String> featureId;

  private final Optional<String> clientType;

  private final Optional<String> clientId;

  private final Map<String, Object> additionalProperties;

  private S3EventCompleteMultipartUpload(String uploadId, Optional<String> versionId, String bucket,
      OffsetDateTime timestamp, S3EventCompleteMultipartUploadProvider provider,
      Optional<String> customerId, Optional<String> featureId, Optional<String> clientType,
      Optional<String> clientId, Map<String, Object> additionalProperties) {
    this.uploadId = uploadId;
    this.versionId = versionId;
    this.bucket = bucket;
    this.timestamp = timestamp;
    this.provider = provider;
    this.customerId = customerId;
    this.featureId = featureId;
    this.clientType = clientType;
    this.clientId = clientId;
    this.additionalProperties = additionalProperties;
  }

  @JsonProperty("uploadId")
  public String getUploadId() {
    return uploadId;
  }

  @JsonProperty("versionId")
  public Optional<String> getVersionId() {
    return versionId;
  }

  @JsonProperty("bucket")
  public String getBucket() {
    return bucket;
  }

  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  @JsonProperty("provider")
  public S3EventCompleteMultipartUploadProvider getProvider() {
    return provider;
  }

  @JsonProperty("customerId")
  public Optional<String> getCustomerId() {
    return customerId;
  }

  @JsonProperty("featureId")
  public Optional<String> getFeatureId() {
    return featureId;
  }

  @JsonProperty("clientType")
  public Optional<String> getClientType() {
    return clientType;
  }

  @JsonProperty("clientId")
  public Optional<String> getClientId() {
    return clientId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof S3EventCompleteMultipartUpload && equalTo((S3EventCompleteMultipartUpload) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(S3EventCompleteMultipartUpload other) {
    return uploadId.equals(other.uploadId) && versionId.equals(other.versionId) && bucket.equals(other.bucket) && timestamp.equals(other.timestamp) && provider.equals(other.provider) && customerId.equals(other.customerId) && featureId.equals(other.featureId) && clientType.equals(other.clientType) && clientId.equals(other.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.uploadId, this.versionId, this.bucket, this.timestamp, this.provider, this.customerId, this.featureId, this.clientType, this.clientId);
  }

  @Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static UploadIdStage builder() {
    return new Builder();
  }

  public interface UploadIdStage {
    BucketStage uploadId(String uploadId);

    Builder from(S3EventCompleteMultipartUpload other);
  }

  public interface BucketStage {
    TimestampStage bucket(String bucket);
  }

  public interface TimestampStage {
    ProviderStage timestamp(OffsetDateTime timestamp);
  }

  public interface ProviderStage {
    _FinalStage provider(S3EventCompleteMultipartUploadProvider provider);
  }

  public interface _FinalStage {
    S3EventCompleteMultipartUpload build();

    _FinalStage versionId(Optional<String> versionId);

    _FinalStage versionId(String versionId);

    _FinalStage customerId(Optional<String> customerId);

    _FinalStage customerId(String customerId);

    _FinalStage featureId(Optional<String> featureId);

    _FinalStage featureId(String featureId);

    _FinalStage clientType(Optional<String> clientType);

    _FinalStage clientType(String clientType);

    _FinalStage clientId(Optional<String> clientId);

    _FinalStage clientId(String clientId);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements UploadIdStage, BucketStage, TimestampStage, ProviderStage, _FinalStage {
    private String uploadId;

    private String bucket;

    private OffsetDateTime timestamp;

    private S3EventCompleteMultipartUploadProvider provider;

    private Optional<String> clientId = Optional.empty();

    private Optional<String> clientType = Optional.empty();

    private Optional<String> featureId = Optional.empty();

    private Optional<String> customerId = Optional.empty();

    private Optional<String> versionId = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @Override
    public Builder from(S3EventCompleteMultipartUpload other) {
      uploadId(other.getUploadId());
      versionId(other.getVersionId());
      bucket(other.getBucket());
      timestamp(other.getTimestamp());
      provider(other.getProvider());
      customerId(other.getCustomerId());
      featureId(other.getFeatureId());
      clientType(other.getClientType());
      clientId(other.getClientId());
      return this;
    }

    @Override
    @JsonSetter("uploadId")
    public BucketStage uploadId(String uploadId) {
      this.uploadId = uploadId;
      return this;
    }

    @Override
    @JsonSetter("bucket")
    public TimestampStage bucket(String bucket) {
      this.bucket = bucket;
      return this;
    }

    @Override
    @JsonSetter("timestamp")
    public ProviderStage timestamp(OffsetDateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    @Override
    @JsonSetter("provider")
    public _FinalStage provider(S3EventCompleteMultipartUploadProvider provider) {
      this.provider = provider;
      return this;
    }

    @Override
    public _FinalStage clientId(String clientId) {
      this.clientId = Optional.of(clientId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "clientId",
        nulls = Nulls.SKIP
    )
    public _FinalStage clientId(Optional<String> clientId) {
      this.clientId = clientId;
      return this;
    }

    @Override
    public _FinalStage clientType(String clientType) {
      this.clientType = Optional.of(clientType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "clientType",
        nulls = Nulls.SKIP
    )
    public _FinalStage clientType(Optional<String> clientType) {
      this.clientType = clientType;
      return this;
    }

    @Override
    public _FinalStage featureId(String featureId) {
      this.featureId = Optional.of(featureId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "featureId",
        nulls = Nulls.SKIP
    )
    public _FinalStage featureId(Optional<String> featureId) {
      this.featureId = featureId;
      return this;
    }

    @Override
    public _FinalStage customerId(String customerId) {
      this.customerId = Optional.of(customerId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "customerId",
        nulls = Nulls.SKIP
    )
    public _FinalStage customerId(Optional<String> customerId) {
      this.customerId = customerId;
      return this;
    }

    @Override
    public _FinalStage versionId(String versionId) {
      this.versionId = Optional.of(versionId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "versionId",
        nulls = Nulls.SKIP
    )
    public _FinalStage versionId(Optional<String> versionId) {
      this.versionId = versionId;
      return this;
    }

    @Override
    public S3EventCompleteMultipartUpload build() {
      return new S3EventCompleteMultipartUpload(uploadId, versionId, bucket, timestamp, provider, customerId, featureId, clientType, clientId, additionalProperties);
    }
  }
}