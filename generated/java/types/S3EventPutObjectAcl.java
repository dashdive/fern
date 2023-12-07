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
    builder = S3EventPutObjectAcl.Builder.class
)
public final class S3EventPutObjectAcl {
  private final String objectKey;

  private final String bucket;

  private final OffsetDateTime timestamp;

  private final S3EventPutObjectAclProvider provider;

  private final Optional<String> customerId;

  private final Optional<String> featureId;

  private final Optional<String> clientType;

  private final Optional<String> clientId;

  private final Map<String, Object> additionalProperties;

  private S3EventPutObjectAcl(String objectKey, String bucket, OffsetDateTime timestamp,
      S3EventPutObjectAclProvider provider, Optional<String> customerId, Optional<String> featureId,
      Optional<String> clientType, Optional<String> clientId,
      Map<String, Object> additionalProperties) {
    this.objectKey = objectKey;
    this.bucket = bucket;
    this.timestamp = timestamp;
    this.provider = provider;
    this.customerId = customerId;
    this.featureId = featureId;
    this.clientType = clientType;
    this.clientId = clientId;
    this.additionalProperties = additionalProperties;
  }

  @JsonProperty("objectKey")
  public String getObjectKey() {
    return objectKey;
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
  public S3EventPutObjectAclProvider getProvider() {
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
    return other instanceof S3EventPutObjectAcl && equalTo((S3EventPutObjectAcl) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(S3EventPutObjectAcl other) {
    return objectKey.equals(other.objectKey) && bucket.equals(other.bucket) && timestamp.equals(other.timestamp) && provider.equals(other.provider) && customerId.equals(other.customerId) && featureId.equals(other.featureId) && clientType.equals(other.clientType) && clientId.equals(other.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.objectKey, this.bucket, this.timestamp, this.provider, this.customerId, this.featureId, this.clientType, this.clientId);
  }

  @Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static ObjectKeyStage builder() {
    return new Builder();
  }

  public interface ObjectKeyStage {
    BucketStage objectKey(String objectKey);

    Builder from(S3EventPutObjectAcl other);
  }

  public interface BucketStage {
    TimestampStage bucket(String bucket);
  }

  public interface TimestampStage {
    ProviderStage timestamp(OffsetDateTime timestamp);
  }

  public interface ProviderStage {
    _FinalStage provider(S3EventPutObjectAclProvider provider);
  }

  public interface _FinalStage {
    S3EventPutObjectAcl build();

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
  public static final class Builder implements ObjectKeyStage, BucketStage, TimestampStage, ProviderStage, _FinalStage {
    private String objectKey;

    private String bucket;

    private OffsetDateTime timestamp;

    private S3EventPutObjectAclProvider provider;

    private Optional<String> clientId = Optional.empty();

    private Optional<String> clientType = Optional.empty();

    private Optional<String> featureId = Optional.empty();

    private Optional<String> customerId = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @Override
    public Builder from(S3EventPutObjectAcl other) {
      objectKey(other.getObjectKey());
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
    @JsonSetter("objectKey")
    public BucketStage objectKey(String objectKey) {
      this.objectKey = objectKey;
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
    public _FinalStage provider(S3EventPutObjectAclProvider provider) {
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
    public S3EventPutObjectAcl build() {
      return new S3EventPutObjectAcl(objectKey, bucket, timestamp, provider, customerId, featureId, clientType, clientId, additionalProperties);
    }
  }
}
