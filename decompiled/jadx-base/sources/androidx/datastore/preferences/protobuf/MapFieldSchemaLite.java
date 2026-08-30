package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class MapFieldSchemaLite implements androidx.datastore.preferences.protobuf.MapFieldSchema {
    MapFieldSchemaLite() {
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMutableMapData(java.lang.Object mapField) {
        return (androidx.datastore.preferences.protobuf.MapFieldLite) mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object mapDefaultEntry) {
        return ((androidx.datastore.preferences.protobuf.MapEntryLite) mapDefaultEntry).getMetadata();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMapData(java.lang.Object mapField) {
        return (androidx.datastore.preferences.protobuf.MapFieldLite) mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public boolean isImmutable(java.lang.Object mapField) {
        return !((androidx.datastore.preferences.protobuf.MapFieldLite) mapField).isMutable();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.lang.Object toImmutable(java.lang.Object mapField) {
        ((androidx.datastore.preferences.protobuf.MapFieldLite) mapField).makeImmutable();
        return mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.lang.Object newMapField(java.lang.Object unused) {
        return androidx.datastore.preferences.protobuf.MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public java.lang.Object mergeFrom(java.lang.Object destMapField, java.lang.Object srcMapField) {
        return mergeFromLite(destMapField, srcMapField);
    }

    private static <K, V> androidx.datastore.preferences.protobuf.MapFieldLite<K, V> mergeFromLite(java.lang.Object destMapField, java.lang.Object srcMapField) {
        androidx.datastore.preferences.protobuf.MapFieldLite<K, V> mapFieldLiteMutableCopy = (androidx.datastore.preferences.protobuf.MapFieldLite) destMapField;
        androidx.datastore.preferences.protobuf.MapFieldLite<K, V> mapFieldLite = (androidx.datastore.preferences.protobuf.MapFieldLite) srcMapField;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public int getSerializedSize(int fieldNumber, java.lang.Object mapField, java.lang.Object mapDefaultEntry) {
        return getSerializedSizeLite(fieldNumber, mapField, mapDefaultEntry);
    }

    private static <K, V> int getSerializedSizeLite(int fieldNumber, java.lang.Object mapField, java.lang.Object defaultEntry) {
        androidx.datastore.preferences.protobuf.MapFieldLite mapFieldLite = (androidx.datastore.preferences.protobuf.MapFieldLite) mapField;
        androidx.datastore.preferences.protobuf.MapEntryLite mapEntryLite = (androidx.datastore.preferences.protobuf.MapEntryLite) defaultEntry;
        int iComputeMessageSize = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (java.util.Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iComputeMessageSize += mapEntryLite.computeMessageSize(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }
}
