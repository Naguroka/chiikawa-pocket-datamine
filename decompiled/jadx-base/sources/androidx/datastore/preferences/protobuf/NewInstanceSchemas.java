package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class NewInstanceSchemas {
    private static final androidx.datastore.preferences.protobuf.NewInstanceSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final androidx.datastore.preferences.protobuf.NewInstanceSchema LITE_SCHEMA = new androidx.datastore.preferences.protobuf.NewInstanceSchemaLite();

    static androidx.datastore.preferences.protobuf.NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    static androidx.datastore.preferences.protobuf.NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    private static androidx.datastore.preferences.protobuf.NewInstanceSchema loadSchemaForFullRuntime() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (androidx.datastore.preferences.protobuf.NewInstanceSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private NewInstanceSchemas() {
    }
}
