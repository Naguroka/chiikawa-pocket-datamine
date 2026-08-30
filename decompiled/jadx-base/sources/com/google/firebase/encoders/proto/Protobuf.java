package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.encoders.annotations.ExtraProperty
public @interface Protobuf {

    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding() default com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT;

    int tag();
}
