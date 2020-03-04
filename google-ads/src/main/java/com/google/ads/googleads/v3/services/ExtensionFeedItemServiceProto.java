// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/extension_feed_item_service.proto

package com.google.ads.googleads.v3.services;

public final class ExtensionFeedItemServiceProto {
  private ExtensionFeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetExtensionFeedItemRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetExtensionFeedItemRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ExtensionFeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ExtensionFeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v3/services/exten" +
      "sion_feed_item_service.proto\022 google.ads" +
      ".googleads.v3.services\032;google/ads/googl" +
      "eads/v3/resources/extension_feed_item.pr" +
      "oto\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032 google/protobuf/field_mask." +
      "proto\032\027google/rpc/status.proto\"9\n\033GetExt" +
      "ensionFeedItemRequest\022\032\n\rresource_name\030\001" +
      " \001(\tB\003\340A\002\"\302\001\n\037MutateExtensionFeedItemsRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022U\n\nopera" +
      "tions\030\002 \003(\0132<.google.ads.googleads.v3.se" +
      "rvices.ExtensionFeedItemOperationB\003\340A\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\"\374\001\n\032ExtensionFeedItemOperation\022/\n" +
      "\013update_mask\030\004 \001(\0132\032.google.protobuf.Fie" +
      "ldMask\022F\n\006create\030\001 \001(\01324.google.ads.goog" +
      "leads.v3.resources.ExtensionFeedItemH\000\022F" +
      "\n\006update\030\002 \001(\01324.google.ads.googleads.v3" +
      ".resources.ExtensionFeedItemH\000\022\020\n\006remove" +
      "\030\003 \001(\tH\000B\013\n\toperation\"\247\001\n MutateExtensio" +
      "nFeedItemsResponse\0221\n\025partial_failure_er" +
      "ror\030\003 \001(\0132\022.google.rpc.Status\022P\n\007results" +
      "\030\002 \003(\0132?.google.ads.googleads.v3.service" +
      "s.MutateExtensionFeedItemResult\"6\n\035Mutat" +
      "eExtensionFeedItemResult\022\025\n\rresource_nam" +
      "e\030\001 \001(\t2\224\004\n\030ExtensionFeedItemService\022\331\001\n" +
      "\024GetExtensionFeedItem\022=.google.ads.googl" +
      "eads.v3.services.GetExtensionFeedItemReq" +
      "uest\0324.google.ads.googleads.v3.resources" +
      ".ExtensionFeedItem\"L\202\323\344\223\0026\0224/v3/{resourc" +
      "e_name=customers/*/extensionFeedItems/*}" +
      "\332A\rresource_name\022\376\001\n\030MutateExtensionFeed" +
      "Items\022A.google.ads.googleads.v3.services" +
      ".MutateExtensionFeedItemsRequest\032B.googl" +
      "e.ads.googleads.v3.services.MutateExtens" +
      "ionFeedItemsResponse\"[\202\323\344\223\002<\"7/v3/custom" +
      "ers/{customer_id=*}/extensionFeedItems:m" +
      "utate:\001*\332A\026customer_id,operations\032\033\312A\030go" +
      "ogleads.googleapis.comB\204\002\n$com.google.ad" +
      "s.googleads.v3.servicesB\035ExtensionFeedIt" +
      "emServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v3/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V3::Ser" +
      "vicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.ExtensionFeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetExtensionFeedItemRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetExtensionFeedItemRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetExtensionFeedItemRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_ExtensionFeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_ExtensionFeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ExtensionFeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateExtensionFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.ExtensionFeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}