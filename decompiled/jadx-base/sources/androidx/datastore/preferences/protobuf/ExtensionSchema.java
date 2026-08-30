package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
abstract class ExtensionSchema<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
    abstract int extensionNumber(java.util.Map.Entry<?, ?> extension);

    abstract java.lang.Object findExtensionByNumber(androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.MessageLite defaultInstance, int number);

    abstract androidx.datastore.preferences.protobuf.FieldSet<T> getExtensions(java.lang.Object message);

    abstract androidx.datastore.preferences.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object message);

    abstract boolean hasExtensions(androidx.datastore.preferences.protobuf.MessageLite prototype);

    abstract void makeImmutable(java.lang.Object message);

    abstract <UT, UB> UB parseExtension(java.lang.Object containerMessage, androidx.datastore.preferences.protobuf.Reader reader, java.lang.Object extension, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.FieldSet<T> extensions, UB unknownFields, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException;

    abstract void parseLengthPrefixedMessageSetItem(androidx.datastore.preferences.protobuf.Reader reader, java.lang.Object extension, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.FieldSet<T> extensions) throws java.io.IOException;

    abstract void parseMessageSetItem(androidx.datastore.preferences.protobuf.ByteString data, java.lang.Object extension, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.FieldSet<T> extensions) throws java.io.IOException;

    abstract void serializeExtension(androidx.datastore.preferences.protobuf.Writer writer, java.util.Map.Entry<?, ?> extension) throws java.io.IOException;

    abstract void setExtensions(java.lang.Object message, androidx.datastore.preferences.protobuf.FieldSet<T> extensions);

    ExtensionSchema() {
    }
}
