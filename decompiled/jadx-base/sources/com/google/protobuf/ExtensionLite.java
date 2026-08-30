package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ExtensionLite<ContainingType extends com.google.protobuf.MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract com.google.protobuf.WireFormat.FieldType getLiteType();

    public abstract com.google.protobuf.MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
