package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface MethodOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    java.lang.String getName();

    com.google.protobuf.ByteString getNameBytes();

    com.google.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.protobuf.Option> getOptionsList();

    boolean getRequestStreaming();

    java.lang.String getRequestTypeUrl();

    com.google.protobuf.ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    java.lang.String getResponseTypeUrl();

    com.google.protobuf.ByteString getResponseTypeUrlBytes();

    com.google.protobuf.Syntax getSyntax();

    int getSyntaxValue();
}
