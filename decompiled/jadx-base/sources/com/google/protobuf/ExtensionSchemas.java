package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class ExtensionSchemas {
    private static final com.google.protobuf.ExtensionSchema<?> LITE_SCHEMA = new com.google.protobuf.ExtensionSchemaLite();
    private static final com.google.protobuf.ExtensionSchema<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    ExtensionSchemas() {
    }

    private static com.google.protobuf.ExtensionSchema<?> loadSchemaForFullRuntime() {
        try {
            return (com.google.protobuf.ExtensionSchema) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.protobuf.ExtensionSchema<?> lite() {
        return LITE_SCHEMA;
    }

    static com.google.protobuf.ExtensionSchema<?> full() {
        com.google.protobuf.ExtensionSchema<?> extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
