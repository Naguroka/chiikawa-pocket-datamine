package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface EnumOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    com.google.protobuf.EnumValue getEnumvalue(int i);

    int getEnumvalueCount();

    java.util.List<com.google.protobuf.EnumValue> getEnumvalueList();

    java.lang.String getName();

    com.google.protobuf.ByteString getNameBytes();

    com.google.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.protobuf.Option> getOptionsList();

    com.google.protobuf.SourceContext getSourceContext();

    com.google.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
