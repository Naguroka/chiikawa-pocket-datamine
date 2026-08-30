package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    com.google.protobuf.Writer.FieldOrder fieldOrder();

    void writeBool(int i, boolean z) throws java.io.IOException;

    void writeBoolList(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException;

    void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException;

    void writeBytesList(int i, java.util.List<com.google.protobuf.ByteString> list) throws java.io.IOException;

    void writeDouble(int i, double d) throws java.io.IOException;

    void writeDoubleList(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException;

    @java.lang.Deprecated
    void writeEndGroup(int i) throws java.io.IOException;

    void writeEnum(int i, int i2) throws java.io.IOException;

    void writeEnumList(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void writeFixed32(int i, int i2) throws java.io.IOException;

    void writeFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void writeFixed64(int i, long j) throws java.io.IOException;

    void writeFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void writeFloat(int i, float f) throws java.io.IOException;

    void writeFloatList(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroup(int i, java.lang.Object obj) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroup(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroupList(int i, java.util.List<?> list) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroupList(int i, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException;

    void writeInt32(int i, int i2) throws java.io.IOException;

    void writeInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void writeInt64(int i, long j) throws java.io.IOException;

    void writeInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    <K, V> void writeMap(int i, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException;

    void writeMessage(int i, java.lang.Object obj) throws java.io.IOException;

    void writeMessage(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException;

    void writeMessageList(int i, java.util.List<?> list) throws java.io.IOException;

    void writeMessageList(int i, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException;

    void writeMessageSetItem(int i, java.lang.Object obj) throws java.io.IOException;

    void writeSFixed32(int i, int i2) throws java.io.IOException;

    void writeSFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void writeSFixed64(int i, long j) throws java.io.IOException;

    void writeSFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    void writeSInt32(int i, int i2) throws java.io.IOException;

    void writeSInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void writeSInt64(int i, long j) throws java.io.IOException;

    void writeSInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;

    @java.lang.Deprecated
    void writeStartGroup(int i) throws java.io.IOException;

    void writeString(int i, java.lang.String str) throws java.io.IOException;

    void writeStringList(int i, java.util.List<java.lang.String> list) throws java.io.IOException;

    void writeUInt32(int i, int i2) throws java.io.IOException;

    void writeUInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException;

    void writeUInt64(int i, long j) throws java.io.IOException;

    void writeUInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException;
}
