// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/age_range_view_service.proto

package com.google.ads.googleads.v3.services;

public final class AgeRangeViewServiceProto {
  private AgeRangeViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetAgeRangeViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetAgeRangeViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v3/services/age_r" +
      "ange_view_service.proto\022 google.ads.goog" +
      "leads.v3.services\0326google/ads/googleads/" +
      "v3/resources/age_range_view.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\"4\n\026GetAgeRangeViewRequest\022\032\n\rresource_" +
      "name\030\001 \001(\tB\003\340A\0022\372\001\n\023AgeRangeViewService\022" +
      "\305\001\n\017GetAgeRangeView\0228.google.ads.googlea" +
      "ds.v3.services.GetAgeRangeViewRequest\032/." +
      "google.ads.googleads.v3.resources.AgeRan" +
      "geView\"G\202\323\344\223\0021\022//v3/{resource_name=custo" +
      "mers/*/ageRangeViews/*}\332A\rresource_name\032" +
      "\033\312A\030googleads.googleapis.comB\377\001\n$com.goo" +
      "gle.ads.googleads.v3.servicesB\030AgeRangeV" +
      "iewServiceProtoP\001ZHgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v3/servic" +
      "es;services\242\002\003GAA\252\002 Google.Ads.GoogleAds" +
      ".V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\S" +
      "ervices\352\002$Google::Ads::GoogleAds::V3::Se" +
      "rvicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.resources.AgeRangeViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetAgeRangeViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetAgeRangeViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetAgeRangeViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.AgeRangeViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}