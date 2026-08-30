package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class NewInstanceSchemaLite implements androidx.datastore.preferences.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public java.lang.Object newInstance(java.lang.Object defaultInstance) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) defaultInstance).newMutableInstance();
    }
}
