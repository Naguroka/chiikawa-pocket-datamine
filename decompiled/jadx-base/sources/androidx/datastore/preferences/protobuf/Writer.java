package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    androidx.datastore.preferences.protobuf.Writer.FieldOrder fieldOrder();

    void writeBool(int fieldNumber, boolean value) throws java.io.IOException;

    void writeBoolList(int fieldNumber, java.util.List<java.lang.Boolean> value, boolean packed) throws java.io.IOException;

    void writeBytes(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value) throws java.io.IOException;

    void writeBytesList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.ByteString> value) throws java.io.IOException;

    void writeDouble(int fieldNumber, double value) throws java.io.IOException;

    void writeDoubleList(int fieldNumber, java.util.List<java.lang.Double> value, boolean packed) throws java.io.IOException;

    @java.lang.Deprecated
    void writeEndGroup(int fieldNumber) throws java.io.IOException;

    void writeEnum(int fieldNumber, int value) throws java.io.IOException;

    void writeEnumList(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException;

    void writeFixed32(int fieldNumber, int value) throws java.io.IOException;

    void writeFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException;

    void writeFixed64(int fieldNumber, long value) throws java.io.IOException;

    void writeFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException;

    void writeFloat(int fieldNumber, float value) throws java.io.IOException;

    void writeFloatList(int fieldNumber, java.util.List<java.lang.Float> value, boolean packed) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroup(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroupList(int fieldNumber, java.util.List<?> value) throws java.io.IOException;

    @java.lang.Deprecated
    void writeGroupList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException;

    void writeInt32(int fieldNumber, int value) throws java.io.IOException;

    void writeInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException;

    void writeInt64(int fieldNumber, long value) throws java.io.IOException;

    void writeInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException;

    <K, V> void writeMap(int fieldNumber, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException;

    void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException;

    void writeMessage(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException;

    void writeMessageList(int fieldNumber, java.util.List<?> value) throws java.io.IOException;

    void writeMessageList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException;

    void writeMessageSetItem(int fieldNumber, java.lang.Object value) throws java.io.IOException;

    void writeSFixed32(int fieldNumber, int value) throws java.io.IOException;

    void writeSFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException;

    void writeSFixed64(int fieldNumber, long value) throws java.io.IOException;

    void writeSFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException;

    void writeSInt32(int fieldNumber, int value) throws java.io.IOException;

    void writeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException;

    void writeSInt64(int fieldNumber, long value) throws java.io.IOException;

    void writeSInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException;

    @java.lang.Deprecated
    void writeStartGroup(int fieldNumber) throws java.io.IOException;

    void writeString(int fieldNumber, java.lang.String value) throws java.io.IOException;

    void writeStringList(int fieldNumber, java.util.List<java.lang.String> value) throws java.io.IOException;

    void writeUInt32(int fieldNumber, int value) throws java.io.IOException;

    void writeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException;

    void writeUInt64(int fieldNumber, long value) throws java.io.IOException;

    void writeUInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException;
}
