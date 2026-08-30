package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
interface MessageInfoFactory {
    boolean isSupported(java.lang.Class<?> cls);

    com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls);
}
