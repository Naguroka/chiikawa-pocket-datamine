package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
interface MessageInfo {
    androidx.datastore.preferences.protobuf.MessageLite getDefaultInstance();

    androidx.datastore.preferences.protobuf.ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
