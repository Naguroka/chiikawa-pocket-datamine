package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class Protobuf {
    private static final androidx.datastore.preferences.protobuf.Protobuf INSTANCE = new androidx.datastore.preferences.protobuf.Protobuf();
    static boolean assumeLiteRuntime = false;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, androidx.datastore.preferences.protobuf.Schema<?>> schemaCache = new java.util.concurrent.ConcurrentHashMap();
    private final androidx.datastore.preferences.protobuf.SchemaFactory schemaFactory = new androidx.datastore.preferences.protobuf.ManifestSchemaFactory();

    public static androidx.datastore.preferences.protobuf.Protobuf getInstance() {
        return INSTANCE;
    }

    public <T> void writeTo(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        schemaFor(message).writeTo(message, writer);
    }

    public <T> void mergeFrom(T message, androidx.datastore.preferences.protobuf.Reader reader) throws java.io.IOException {
        mergeFrom(message, reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public <T> void mergeFrom(T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        schemaFor(message).mergeFrom(message, reader, extensionRegistry);
    }

    public <T> void makeImmutable(T message) {
        schemaFor(message).makeImmutable(message);
    }

    <T> boolean isInitialized(T message) {
        return schemaFor(message).isInitialized(message);
    }

    public <T> androidx.datastore.preferences.protobuf.Schema<T> schemaFor(java.lang.Class<T> cls) {
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(cls, "messageType");
        androidx.datastore.preferences.protobuf.Schema<T> schema = (androidx.datastore.preferences.protobuf.Schema) this.schemaCache.get(cls);
        if (schema != null) {
            return schema;
        }
        androidx.datastore.preferences.protobuf.Schema<T> schemaCreateSchema = this.schemaFactory.createSchema(cls);
        androidx.datastore.preferences.protobuf.Schema<T> schema2 = (androidx.datastore.preferences.protobuf.Schema<T>) registerSchema(cls, schemaCreateSchema);
        return schema2 != null ? schema2 : schemaCreateSchema;
    }

    public <T> androidx.datastore.preferences.protobuf.Schema<T> schemaFor(T message) {
        return schemaFor((java.lang.Class) message.getClass());
    }

    public androidx.datastore.preferences.protobuf.Schema<?> registerSchema(java.lang.Class<?> messageType, androidx.datastore.preferences.protobuf.Schema<?> schema) {
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(messageType, "messageType");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(messageType, schema);
    }

    public androidx.datastore.preferences.protobuf.Schema<?> registerSchemaOverride(java.lang.Class<?> messageType, androidx.datastore.preferences.protobuf.Schema<?> schema) {
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(messageType, "messageType");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(messageType, schema);
    }

    private Protobuf() {
    }

    int getTotalSchemaSize() {
        int schemaSize = 0;
        for (androidx.datastore.preferences.protobuf.Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof androidx.datastore.preferences.protobuf.MessageSchema) {
                schemaSize += ((androidx.datastore.preferences.protobuf.MessageSchema) schema).getSchemaSize();
            }
        }
        return schemaSize;
    }
}
