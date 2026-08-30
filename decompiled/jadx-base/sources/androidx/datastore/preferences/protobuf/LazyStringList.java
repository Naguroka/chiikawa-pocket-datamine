package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface LazyStringList extends androidx.datastore.preferences.protobuf.ProtocolStringList {
    void add(androidx.datastore.preferences.protobuf.ByteString element);

    void add(byte[] element);

    boolean addAllByteArray(java.util.Collection<byte[]> c);

    boolean addAllByteString(java.util.Collection<? extends androidx.datastore.preferences.protobuf.ByteString> c);

    java.util.List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    androidx.datastore.preferences.protobuf.ByteString getByteString(int index);

    java.lang.Object getRaw(int index);

    java.util.List<?> getUnderlyingElements();

    androidx.datastore.preferences.protobuf.LazyStringList getUnmodifiableView();

    void mergeFrom(androidx.datastore.preferences.protobuf.LazyStringList other);

    void set(int index, androidx.datastore.preferences.protobuf.ByteString element);

    void set(int index, byte[] element);
}
