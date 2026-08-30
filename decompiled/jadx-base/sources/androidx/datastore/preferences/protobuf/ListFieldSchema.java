package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface ListFieldSchema {
    void makeImmutableListAt(java.lang.Object msg, long offset);

    <L> void mergeListsAt(java.lang.Object msg, java.lang.Object otherMsg, long offset);

    <L> java.util.List<L> mutableListAt(java.lang.Object msg, long offset);
}
