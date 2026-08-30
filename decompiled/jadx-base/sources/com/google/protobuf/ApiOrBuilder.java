package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface ApiOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    com.google.protobuf.Method getMethods(int i);

    int getMethodsCount();

    java.util.List<com.google.protobuf.Method> getMethodsList();

    com.google.protobuf.Mixin getMixins(int i);

    int getMixinsCount();

    java.util.List<com.google.protobuf.Mixin> getMixinsList();

    java.lang.String getName();

    com.google.protobuf.ByteString getNameBytes();

    com.google.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.protobuf.Option> getOptionsList();

    com.google.protobuf.SourceContext getSourceContext();

    com.google.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    java.lang.String getVersion();

    com.google.protobuf.ByteString getVersionBytes();

    boolean hasSourceContext();
}
