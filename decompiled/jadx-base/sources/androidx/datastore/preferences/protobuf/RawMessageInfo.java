package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class RawMessageInfo implements androidx.datastore.preferences.protobuf.MessageInfo {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] objects;

    RawMessageInfo(androidx.datastore.preferences.protobuf.MessageLite defaultInstance, java.lang.String info, java.lang.Object[] objects) {
        this.defaultInstance = defaultInstance;
        this.info = info;
        this.objects = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = info.charAt(i3);
            if (cCharAt2 < 55296) {
                this.flags = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    java.lang.String getStringInfo() {
        return this.info;
    }

    java.lang.Object[] getObjects() {
        return this.objects;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public androidx.datastore.preferences.protobuf.MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public androidx.datastore.preferences.protobuf.ProtoSyntax getSyntax() {
        int i = this.flags;
        if ((i & 1) != 0) {
            return androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2;
        }
        if ((i & 4) == 4) {
            return androidx.datastore.preferences.protobuf.ProtoSyntax.EDITIONS;
        }
        return androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
