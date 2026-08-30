package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
interface MessageInfo {
    com.google.protobuf.MessageLite getDefaultInstance();

    com.google.protobuf.ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
