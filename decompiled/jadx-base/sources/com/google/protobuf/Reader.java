package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
interface Reader {
    public static final int READ_DONE = Integer.MAX_VALUE;
    public static final int TAG_UNKNOWN = 0;

    int getFieldNumber() throws java.io.IOException;

    int getTag();

    <T> void mergeGroupField(T t, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    <T> void mergeMessageField(T t, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    boolean readBool() throws java.io.IOException;

    void readBoolList(java.util.List<java.lang.Boolean> list) throws java.io.IOException;

    com.google.protobuf.ByteString readBytes() throws java.io.IOException;

    void readBytesList(java.util.List<com.google.protobuf.ByteString> list) throws java.io.IOException;

    double readDouble() throws java.io.IOException;

    void readDoubleList(java.util.List<java.lang.Double> list) throws java.io.IOException;

    int readEnum() throws java.io.IOException;

    void readEnumList(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    int readFixed32() throws java.io.IOException;

    void readFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    long readFixed64() throws java.io.IOException;

    void readFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException;

    float readFloat() throws java.io.IOException;

    void readFloatList(java.util.List<java.lang.Float> list) throws java.io.IOException;

    @java.lang.Deprecated
    <T> T readGroup(java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    @java.lang.Deprecated
    <T> T readGroupBySchemaWithCheck(com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    @java.lang.Deprecated
    <T> void readGroupList(java.util.List<T> list, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    @java.lang.Deprecated
    <T> void readGroupList(java.util.List<T> list, java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    int readInt32() throws java.io.IOException;

    void readInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    long readInt64() throws java.io.IOException;

    void readInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException;

    <K, V> void readMap(java.util.Map<K, V> map, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    <T> T readMessage(java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    <T> T readMessageBySchemaWithCheck(com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    <T> void readMessageList(java.util.List<T> list, com.google.protobuf.Schema<T> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    <T> void readMessageList(java.util.List<T> list, java.lang.Class<T> cls, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    int readSFixed32() throws java.io.IOException;

    void readSFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    long readSFixed64() throws java.io.IOException;

    void readSFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException;

    int readSInt32() throws java.io.IOException;

    void readSInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    long readSInt64() throws java.io.IOException;

    void readSInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException;

    java.lang.String readString() throws java.io.IOException;

    void readStringList(java.util.List<java.lang.String> list) throws java.io.IOException;

    void readStringListRequireUtf8(java.util.List<java.lang.String> list) throws java.io.IOException;

    java.lang.String readStringRequireUtf8() throws java.io.IOException;

    int readUInt32() throws java.io.IOException;

    void readUInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException;

    long readUInt64() throws java.io.IOException;

    void readUInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException;

    boolean shouldDiscardUnknownFields();

    boolean skipField() throws java.io.IOException;
}
