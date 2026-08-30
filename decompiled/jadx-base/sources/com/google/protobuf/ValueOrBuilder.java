package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface ValueOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    boolean getBoolValue();

    com.google.protobuf.Value.KindCase getKindCase();

    com.google.protobuf.ListValue getListValue();

    com.google.protobuf.NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    java.lang.String getStringValue();

    com.google.protobuf.ByteString getStringValueBytes();

    com.google.protobuf.Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
