package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class Protobuf {
    private static final com.google.protobuf.Protobuf INSTANCE = new com.google.protobuf.Protobuf();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.protobuf.Schema<?>> schemaCache = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.protobuf.SchemaFactory schemaFactory = new com.google.protobuf.ManifestSchemaFactory();

    public static com.google.protobuf.Protobuf getInstance() {
        return INSTANCE;
    }

    public <T> void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        schemaFor(t).writeTo(t, writer);
    }

    public <T> void mergeFrom(T t, com.google.protobuf.Reader reader) throws java.io.IOException {
        mergeFrom(t, reader, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public <T> void mergeFrom(T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        schemaFor(t).mergeFrom(t, reader, extensionRegistryLite);
    }

    public <T> void makeImmutable(T t) {
        schemaFor(t).makeImmutable(t);
    }

    <T> boolean isInitialized(T t) {
        return schemaFor(t).isInitialized(t);
    }

    public <T> com.google.protobuf.Schema<T> schemaFor(java.lang.Class<T> cls) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Schema<T> schema = (com.google.protobuf.Schema) this.schemaCache.get(cls);
        if (schema != null) {
            return schema;
        }
        com.google.protobuf.Schema<T> schemaCreateSchema = this.schemaFactory.createSchema(cls);
        com.google.protobuf.Schema<T> schema2 = (com.google.protobuf.Schema<T>) registerSchema(cls, schemaCreateSchema);
        return schema2 != null ? schema2 : schemaCreateSchema;
    }

    public <T> com.google.protobuf.Schema<T> schemaFor(T t) {
        return schemaFor((java.lang.Class) t.getClass());
    }

    public com.google.protobuf.Schema<?> registerSchema(java.lang.Class<?> cls, com.google.protobuf.Schema<?> schema) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    public com.google.protobuf.Schema<?> registerSchemaOverride(java.lang.Class<?> cls, com.google.protobuf.Schema<?> schema) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    private Protobuf() {
    }

    int getTotalSchemaSize() {
        int schemaSize = 0;
        for (com.google.protobuf.Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof com.google.protobuf.MessageSchema) {
                schemaSize += ((com.google.protobuf.MessageSchema) schema).getSchemaSize();
            }
        }
        return schemaSize;
    }
}
