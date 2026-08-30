package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface Schema<T> {
    boolean equals(T message, T other);

    int getSerializedSize(T message);

    int hashCode(T message);

    boolean isInitialized(T message);

    void makeImmutable(T message);

    void mergeFrom(T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    void mergeFrom(T message, T other);

    void mergeFrom(T message, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException;

    T newInstance();

    void writeTo(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException;
}
