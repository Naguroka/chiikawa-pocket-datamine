package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface MessageInfoFactory {
    boolean isSupported(java.lang.Class<?> clazz);

    androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz);
}
