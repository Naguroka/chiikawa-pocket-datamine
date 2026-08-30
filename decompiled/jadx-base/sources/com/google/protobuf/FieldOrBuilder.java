package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface FieldOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    com.google.protobuf.Field.Cardinality getCardinality();

    int getCardinalityValue();

    java.lang.String getDefaultValue();

    com.google.protobuf.ByteString getDefaultValueBytes();

    java.lang.String getJsonName();

    com.google.protobuf.ByteString getJsonNameBytes();

    com.google.protobuf.Field.Kind getKind();

    int getKindValue();

    java.lang.String getName();

    com.google.protobuf.ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    com.google.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.protobuf.Option> getOptionsList();

    boolean getPacked();

    java.lang.String getTypeUrl();

    com.google.protobuf.ByteString getTypeUrlBytes();
}
