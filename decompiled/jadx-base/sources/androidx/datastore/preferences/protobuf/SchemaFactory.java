package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface SchemaFactory {
    <T> androidx.datastore.preferences.protobuf.Schema<T> createSchema(java.lang.Class<T> messageType);
}
