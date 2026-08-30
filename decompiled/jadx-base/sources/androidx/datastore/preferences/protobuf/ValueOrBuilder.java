package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface ValueOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    boolean getBoolValue();

    androidx.datastore.preferences.protobuf.Value.KindCase getKindCase();

    androidx.datastore.preferences.protobuf.ListValue getListValue();

    androidx.datastore.preferences.protobuf.NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    java.lang.String getStringValue();

    androidx.datastore.preferences.protobuf.ByteString getStringValueBytes();

    androidx.datastore.preferences.protobuf.Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
