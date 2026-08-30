package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface TypeOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    com.google.protobuf.Field getFields(int i);

    int getFieldsCount();

    java.util.List<com.google.protobuf.Field> getFieldsList();

    java.lang.String getName();

    com.google.protobuf.ByteString getNameBytes();

    java.lang.String getOneofs(int i);

    com.google.protobuf.ByteString getOneofsBytes(int i);

    int getOneofsCount();

    java.util.List<java.lang.String> getOneofsList();

    com.google.protobuf.Option getOptions(int i);

    int getOptionsCount();

    java.util.List<com.google.protobuf.Option> getOptionsList();

    com.google.protobuf.SourceContext getSourceContext();

    com.google.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
