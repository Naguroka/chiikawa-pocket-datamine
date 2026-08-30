package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class ExtensionSchemas {
    private static final androidx.datastore.preferences.protobuf.ExtensionSchema<?> LITE_SCHEMA = new androidx.datastore.preferences.protobuf.ExtensionSchemaLite();
    private static final androidx.datastore.preferences.protobuf.ExtensionSchema<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    private static androidx.datastore.preferences.protobuf.ExtensionSchema<?> loadSchemaForFullRuntime() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (androidx.datastore.preferences.protobuf.ExtensionSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static androidx.datastore.preferences.protobuf.ExtensionSchema<?> lite() {
        return LITE_SCHEMA;
    }

    static androidx.datastore.preferences.protobuf.ExtensionSchema<?> full() {
        androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private ExtensionSchemas() {
    }
}
