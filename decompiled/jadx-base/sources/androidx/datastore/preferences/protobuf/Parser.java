package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data, int off, int len) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data, int off, int len, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream input) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data, int off, int len) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data, int off, int len, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
}
