package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ListFieldSchemaLite implements androidx.datastore.preferences.protobuf.ListFieldSchema {
    ListFieldSchemaLite() {
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <L> java.util.List<L> mutableListAt(java.lang.Object message, long offset) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = getProtobufList(message, offset);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public void makeImmutableListAt(java.lang.Object message, long offset) {
        getProtobufList(message, offset).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <E> void mergeListsAt(java.lang.Object msg, java.lang.Object otherMsg, long offset) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = getProtobufList(msg, offset);
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList2 = getProtobufList(otherMsg, offset);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(msg, offset, protobufList2);
    }

    static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object message, long offset) {
        return (androidx.datastore.preferences.protobuf.Internal.ProtobufList) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset);
    }
}
