package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;
}
