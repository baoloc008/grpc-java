// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/grpc/helloworld.proto

package grpc;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_HelloWorldResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_HelloWorldResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_GetHelloWorldRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_GetHelloWorldRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031src/grpc/helloworld.proto\022\004grpc\"%\n\022Hel" +
      "loWorldResponse\022\017\n\007message\030\002 \001(\t\"$\n\024GetH" +
      "elloWorldRequest\022\014\n\004name\030\001 \001(\t2Z\n\021HelloW" +
      "orldService\022E\n\rGetHelloWorld\022\032.grpc.GetH" +
      "elloWorldRequest\032\030.grpc.HelloWorldRespon" +
      "seB\031\n\004grpcB\017HelloWorldProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpc_HelloWorldResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_HelloWorldResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_HelloWorldResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_grpc_GetHelloWorldRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_GetHelloWorldRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_GetHelloWorldRequest_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}