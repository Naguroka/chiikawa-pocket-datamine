package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static androidx.datastore.preferences.protobuf.ByteString unsafeWrap(byte[] buffer) {
        return androidx.datastore.preferences.protobuf.ByteString.wrap(buffer);
    }

    public static androidx.datastore.preferences.protobuf.ByteString unsafeWrap(byte[] buffer, int offset, int length) {
        return androidx.datastore.preferences.protobuf.ByteString.wrap(buffer, offset, length);
    }

    public static androidx.datastore.preferences.protobuf.ByteString unsafeWrap(java.nio.ByteBuffer buffer) {
        return androidx.datastore.preferences.protobuf.ByteString.wrap(buffer);
    }

    public static void unsafeWriteTo(androidx.datastore.preferences.protobuf.ByteString bytes, androidx.datastore.preferences.protobuf.ByteOutput output) throws java.io.IOException {
        bytes.writeTo(output);
    }
}
