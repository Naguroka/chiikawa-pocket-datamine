package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
abstract class ExtensionSchema<T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> {
    abstract int extensionNumber(java.util.Map.Entry<?, ?> entry);

    abstract java.lang.Object findExtensionByNumber(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.MessageLite messageLite, int i);

    abstract com.google.protobuf.FieldSet<T> getExtensions(java.lang.Object obj);

    abstract com.google.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object obj);

    abstract boolean hasExtensions(com.google.protobuf.MessageLite messageLite);

    abstract void makeImmutable(java.lang.Object obj);

    abstract <UT, UB> UB parseExtension(java.lang.Object obj, com.google.protobuf.Reader reader, java.lang.Object obj2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.FieldSet<T> fieldSet, UB ub, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException;

    abstract void parseLengthPrefixedMessageSetItem(com.google.protobuf.Reader reader, java.lang.Object obj, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.FieldSet<T> fieldSet) throws java.io.IOException;

    abstract void parseMessageSetItem(com.google.protobuf.ByteString byteString, java.lang.Object obj, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.FieldSet<T> fieldSet) throws java.io.IOException;

    abstract void serializeExtension(com.google.protobuf.Writer writer, java.util.Map.Entry<?, ?> entry) throws java.io.IOException;

    abstract void setExtensions(java.lang.Object obj, com.google.protobuf.FieldSet<T> fieldSet);

    ExtensionSchema() {
    }
}
