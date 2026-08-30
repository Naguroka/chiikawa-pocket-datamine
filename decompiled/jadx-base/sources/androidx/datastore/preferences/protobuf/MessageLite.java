package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
public interface MessageLite extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {

    public interface Builder extends androidx.datastore.preferences.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        androidx.datastore.preferences.protobuf.MessageLite build();

        androidx.datastore.preferences.protobuf.MessageLite buildPartial();

        androidx.datastore.preferences.protobuf.MessageLite.Builder clear();

        /* JADX INFO: renamed from: clone */
        androidx.datastore.preferences.protobuf.MessageLite.Builder mo45clone();

        boolean mergeDelimitedFrom(java.io.InputStream input) throws java.io.IOException;

        boolean mergeDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.datastore.preferences.protobuf.MessageLite other);

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream input) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] data, int off, int len) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] data, int off, int len, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
    }

    androidx.datastore.preferences.protobuf.Parser<? extends androidx.datastore.preferences.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType();

    androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    androidx.datastore.preferences.protobuf.ByteString toByteString();

    void writeDelimitedTo(java.io.OutputStream output) throws java.io.IOException;

    void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException;

    void writeTo(java.io.OutputStream output) throws java.io.IOException;
}
