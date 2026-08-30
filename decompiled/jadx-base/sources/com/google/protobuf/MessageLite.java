package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface MessageLite extends com.google.protobuf.MessageLiteOrBuilder {

    public interface Builder extends com.google.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        com.google.protobuf.MessageLite build();

        com.google.protobuf.MessageLite buildPartial();

        com.google.protobuf.MessageLite.Builder clear();

        /* JADX INFO: renamed from: clone */
        com.google.protobuf.MessageLite.Builder mo888clone();

        boolean mergeDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException;

        boolean mergeDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.MessageLite messageLite);

        com.google.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException;
    }

    com.google.protobuf.Parser<? extends com.google.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    com.google.protobuf.MessageLite.Builder newBuilderForType();

    com.google.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    com.google.protobuf.ByteString toByteString();

    void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException;

    void writeTo(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    void writeTo(java.io.OutputStream outputStream) throws java.io.IOException;
}
