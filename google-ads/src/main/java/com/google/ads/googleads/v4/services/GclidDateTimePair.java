// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v4.services;

/**
 * <pre>
 * Uniquely identifies a conversion that was reported without an order ID
 * specified.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.services.GclidDateTimePair}
 */
public  final class GclidDateTimePair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.services.GclidDateTimePair)
    GclidDateTimePairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GclidDateTimePair.newBuilder() to construct.
  private GclidDateTimePair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GclidDateTimePair() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GclidDateTimePair();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GclidDateTimePair(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (gclid_ != null) {
              subBuilder = gclid_.toBuilder();
            }
            gclid_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gclid_);
              gclid_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (conversionDateTime_ != null) {
              subBuilder = conversionDateTime_.toBuilder();
            }
            conversionDateTime_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(conversionDateTime_);
              conversionDateTime_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v4.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v4_services_GclidDateTimePair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v4_services_GclidDateTimePair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.services.GclidDateTimePair.class, com.google.ads.googleads.v4.services.GclidDateTimePair.Builder.class);
  }

  public static final int GCLID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue gclid_;
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   * @return Whether the gclid field is set.
   */
  public boolean hasGclid() {
    return gclid_ != null;
  }
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   * @return The gclid.
   */
  public com.google.protobuf.StringValue getGclid() {
    return gclid_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : gclid_;
  }
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>.google.protobuf.StringValue gclid = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getGclidOrBuilder() {
    return getGclid();
  }

  public static final int CONVERSION_DATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue conversionDateTime_;
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
   * @return Whether the conversionDateTime field is set.
   */
  public boolean hasConversionDateTime() {
    return conversionDateTime_ != null;
  }
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
   * @return The conversionDateTime.
   */
  public com.google.protobuf.StringValue getConversionDateTime() {
    return conversionDateTime_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : conversionDateTime_;
  }
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder() {
    return getConversionDateTime();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (gclid_ != null) {
      output.writeMessage(1, getGclid());
    }
    if (conversionDateTime_ != null) {
      output.writeMessage(2, getConversionDateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gclid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGclid());
    }
    if (conversionDateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConversionDateTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v4.services.GclidDateTimePair)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.services.GclidDateTimePair other = (com.google.ads.googleads.v4.services.GclidDateTimePair) obj;

    if (hasGclid() != other.hasGclid()) return false;
    if (hasGclid()) {
      if (!getGclid()
          .equals(other.getGclid())) return false;
    }
    if (hasConversionDateTime() != other.hasConversionDateTime()) return false;
    if (hasConversionDateTime()) {
      if (!getConversionDateTime()
          .equals(other.getConversionDateTime())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGclid()) {
      hash = (37 * hash) + GCLID_FIELD_NUMBER;
      hash = (53 * hash) + getGclid().hashCode();
    }
    if (hasConversionDateTime()) {
      hash = (37 * hash) + CONVERSION_DATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getConversionDateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.GclidDateTimePair parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v4.services.GclidDateTimePair prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.services.GclidDateTimePair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.services.GclidDateTimePair)
      com.google.ads.googleads.v4.services.GclidDateTimePairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v4_services_GclidDateTimePair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v4_services_GclidDateTimePair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.services.GclidDateTimePair.class, com.google.ads.googleads.v4.services.GclidDateTimePair.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.services.GclidDateTimePair.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gclidBuilder_ == null) {
        gclid_ = null;
      } else {
        gclid_ = null;
        gclidBuilder_ = null;
      }
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTime_ = null;
      } else {
        conversionDateTime_ = null;
        conversionDateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v4_services_GclidDateTimePair_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.GclidDateTimePair getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.services.GclidDateTimePair.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.GclidDateTimePair build() {
      com.google.ads.googleads.v4.services.GclidDateTimePair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.GclidDateTimePair buildPartial() {
      com.google.ads.googleads.v4.services.GclidDateTimePair result = new com.google.ads.googleads.v4.services.GclidDateTimePair(this);
      if (gclidBuilder_ == null) {
        result.gclid_ = gclid_;
      } else {
        result.gclid_ = gclidBuilder_.build();
      }
      if (conversionDateTimeBuilder_ == null) {
        result.conversionDateTime_ = conversionDateTime_;
      } else {
        result.conversionDateTime_ = conversionDateTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v4.services.GclidDateTimePair) {
        return mergeFrom((com.google.ads.googleads.v4.services.GclidDateTimePair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.services.GclidDateTimePair other) {
      if (other == com.google.ads.googleads.v4.services.GclidDateTimePair.getDefaultInstance()) return this;
      if (other.hasGclid()) {
        mergeGclid(other.getGclid());
      }
      if (other.hasConversionDateTime()) {
        mergeConversionDateTime(other.getConversionDateTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v4.services.GclidDateTimePair parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.services.GclidDateTimePair) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue gclid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> gclidBuilder_;
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     * @return Whether the gclid field is set.
     */
    public boolean hasGclid() {
      return gclidBuilder_ != null || gclid_ != null;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     * @return The gclid.
     */
    public com.google.protobuf.StringValue getGclid() {
      if (gclidBuilder_ == null) {
        return gclid_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : gclid_;
      } else {
        return gclidBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder setGclid(com.google.protobuf.StringValue value) {
      if (gclidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gclid_ = value;
        onChanged();
      } else {
        gclidBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder setGclid(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (gclidBuilder_ == null) {
        gclid_ = builderForValue.build();
        onChanged();
      } else {
        gclidBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder mergeGclid(com.google.protobuf.StringValue value) {
      if (gclidBuilder_ == null) {
        if (gclid_ != null) {
          gclid_ =
            com.google.protobuf.StringValue.newBuilder(gclid_).mergeFrom(value).buildPartial();
        } else {
          gclid_ = value;
        }
        onChanged();
      } else {
        gclidBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public Builder clearGclid() {
      if (gclidBuilder_ == null) {
        gclid_ = null;
        onChanged();
      } else {
        gclid_ = null;
        gclidBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getGclidBuilder() {
      
      onChanged();
      return getGclidFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGclidOrBuilder() {
      if (gclidBuilder_ != null) {
        return gclidBuilder_.getMessageOrBuilder();
      } else {
        return gclid_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : gclid_;
      }
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>.google.protobuf.StringValue gclid = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getGclidFieldBuilder() {
      if (gclidBuilder_ == null) {
        gclidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGclid(),
                getParentForChildren(),
                isClean());
        gclid_ = null;
      }
      return gclidBuilder_;
    }

    private com.google.protobuf.StringValue conversionDateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> conversionDateTimeBuilder_;
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     * @return Whether the conversionDateTime field is set.
     */
    public boolean hasConversionDateTime() {
      return conversionDateTimeBuilder_ != null || conversionDateTime_ != null;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     * @return The conversionDateTime.
     */
    public com.google.protobuf.StringValue getConversionDateTime() {
      if (conversionDateTimeBuilder_ == null) {
        return conversionDateTime_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : conversionDateTime_;
      } else {
        return conversionDateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    public Builder setConversionDateTime(com.google.protobuf.StringValue value) {
      if (conversionDateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionDateTime_ = value;
        onChanged();
      } else {
        conversionDateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    public Builder setConversionDateTime(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTime_ = builderForValue.build();
        onChanged();
      } else {
        conversionDateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    public Builder mergeConversionDateTime(com.google.protobuf.StringValue value) {
      if (conversionDateTimeBuilder_ == null) {
        if (conversionDateTime_ != null) {
          conversionDateTime_ =
            com.google.protobuf.StringValue.newBuilder(conversionDateTime_).mergeFrom(value).buildPartial();
        } else {
          conversionDateTime_ = value;
        }
        onChanged();
      } else {
        conversionDateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    public Builder clearConversionDateTime() {
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTime_ = null;
        onChanged();
      } else {
        conversionDateTime_ = null;
        conversionDateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getConversionDateTimeBuilder() {
      
      onChanged();
      return getConversionDateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder() {
      if (conversionDateTimeBuilder_ != null) {
        return conversionDateTimeBuilder_.getMessageOrBuilder();
      } else {
        return conversionDateTime_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : conversionDateTime_;
      }
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>.google.protobuf.StringValue conversion_date_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getConversionDateTimeFieldBuilder() {
      if (conversionDateTimeBuilder_ == null) {
        conversionDateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getConversionDateTime(),
                getParentForChildren(),
                isClean());
        conversionDateTime_ = null;
      }
      return conversionDateTimeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.services.GclidDateTimePair)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.GclidDateTimePair)
  private static final com.google.ads.googleads.v4.services.GclidDateTimePair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.services.GclidDateTimePair();
  }

  public static com.google.ads.googleads.v4.services.GclidDateTimePair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GclidDateTimePair>
      PARSER = new com.google.protobuf.AbstractParser<GclidDateTimePair>() {
    @java.lang.Override
    public GclidDateTimePair parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GclidDateTimePair(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GclidDateTimePair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GclidDateTimePair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.services.GclidDateTimePair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
