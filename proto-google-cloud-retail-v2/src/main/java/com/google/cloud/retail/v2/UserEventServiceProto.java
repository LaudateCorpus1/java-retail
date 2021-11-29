/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/user_event_service.proto

package com.google.cloud.retail.v2;

public final class UserEventServiceProto {
  private UserEventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CollectUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_RejoinUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_RejoinUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_RejoinUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_RejoinUserEventsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "/google/cloud/retail/v2/user_event_serv"
          + "ice.proto\022\026google.cloud.retail.v2\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/httpbody.proto\032*google/clo"
          + "ud/retail/v2/import_config.proto\032)google/cloud/retail/v2/purge_config.proto\032\'google/cloud/retail/v2/user_event.proto\032#google/longrunning/operations.proto\"h\n"
          + "\025WriteUserEventRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022:\n\n"
          + "user_event\030\002 \001(\0132!.google.cloud.retail.v2.UserEventB\003\340A\002\"a\n"
          + "\027CollectUserEventRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022\027\n\n"
          + "user_event\030\002 \001(\tB\003\340A\002\022\013\n"
          + "\003uri\030\003 \001(\t\022\013\n"
          + "\003ets\030\004 \001(\003\"\376\001\n"
          + "\027RejoinUserEventsRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022e\n"
          + "\027user_event_rejoin_scope\030\002"
          + " \001(\0162D.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope\"g\n"
          + "\024UserEventRejoinScope\022\'\n"
          + "#USER_EVENT_REJOIN_SCOPE_UNSPECIFIED\020\000\022\021\n\r"
          + "JOINED_EVENTS\020\001\022\023\n"
          + "\017UNJOINED_EVENTS\020\002\">\n"
          + "\030RejoinUserEventsResponse\022\"\n"
          + "\032rejoined_user_events_count\030\001 \001(\003\"\032\n"
          + "\030RejoinUserEventsMetadata2\277\t\n"
          + "\020UserEventService\022\267\001\n"
          + "\016WriteUserEvent\022-.google.cloud.retail.v2.WriteUserEventRequest\032!.google.cloud.retail.v2.UserEvent\"S\202\323\344\223\002M\"?/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:write:\n"
          + "user_event\022\244\001\n"
          + "\020CollectUserEvent\022/.google.cloud.retail.v2"
          + ".CollectUserEventRequest\032\024.google.api.HttpBody\"I\202\323\344\223\002C\022A/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:collect\022\206\002\n"
          + "\017PurgeUserEvents\022..google.cloud.ret"
          + "ail.v2.PurgeUserEventsRequest\032\035.google.longrunning.Operation\"\243\001\202\323\344\223\002D\"?/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:purge:\001*\312AV\n"
          + ".google.cloud.retail.v2.PurgeUserEventsResponse\022$google.cloud.retail.v2.PurgeMetadata\022\213\002\n"
          + "\020ImportUserEvents\022/.google.cloud.retail.v2.ImportU"
          + "serEventsRequest\032\035.google.longrunning.Operation\"\246\001\202\323\344\223\002E\"@/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:import:\001*\312AX\n"
          + "/google.cloud.retail.v2.ImportUserEventsResponse\022%google.cloud.retail.v2.ImportMetadata\022\347\001\n"
          + "\020RejoinUserEvents\022/.google.cloud.retail.v2.RejoinUserEventsRequest\032\035.google.longrunning.Operation\"\202\001\202\323\344\223\002E\"@/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:rejoin:\001*\312A4\n"
          + "\030RejoinUserEventsResponse\022\030RejoinUserEventsMetadata\032I\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\312\001\n"
          + "\032com.google.cloud.retail.v2B\025UserEventServiceProtoP\001Z<google.golang.org"
          + "/genproto/googleapis/cloud/retail/v2;ret"
          + "ail\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026"
          + "Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.cloud.retail.v2.ImportConfigProto.getDescriptor(),
              com.google.cloud.retail.v2.PurgeConfigProto.getDescriptor(),
              com.google.cloud.retail.v2.UserEventProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent",
            });
    internal_static_google_cloud_retail_v2_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "Uri", "Ets",
            });
    internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_RejoinUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEventRejoinScope",
            });
    internal_static_google_cloud_retail_v2_RejoinUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_RejoinUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_RejoinUserEventsResponse_descriptor,
            new java.lang.String[] {
              "RejoinedUserEventsCount",
            });
    internal_static_google_cloud_retail_v2_RejoinUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_RejoinUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_RejoinUserEventsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.cloud.retail.v2.ImportConfigProto.getDescriptor();
    com.google.cloud.retail.v2.PurgeConfigProto.getDescriptor();
    com.google.cloud.retail.v2.UserEventProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
