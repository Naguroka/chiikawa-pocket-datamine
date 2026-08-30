package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface MapFieldSchema {
    java.util.Map<?, ?> forMapData(java.lang.Object mapField);

    androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object mapDefaultEntry);

    java.util.Map<?, ?> forMutableMapData(java.lang.Object mapField);

    int getSerializedSize(int fieldNumber, java.lang.Object mapField, java.lang.Object mapDefaultEntry);

    boolean isImmutable(java.lang.Object mapField);

    java.lang.Object mergeFrom(java.lang.Object destMapField, java.lang.Object srcMapField);

    java.lang.Object newMapField(java.lang.Object mapDefaultEntry);

    java.lang.Object toImmutable(java.lang.Object mapField);
}
