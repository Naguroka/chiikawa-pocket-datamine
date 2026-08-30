package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface StructOrBuilder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    boolean containsFields(java.lang.String key);

    @java.lang.Deprecated
    java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getFields();

    int getFieldsCount();

    java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getFieldsMap();

    androidx.datastore.preferences.protobuf.Value getFieldsOrDefault(java.lang.String key, androidx.datastore.preferences.protobuf.Value defaultValue);

    androidx.datastore.preferences.protobuf.Value getFieldsOrThrow(java.lang.String key);
}
