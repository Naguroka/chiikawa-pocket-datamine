package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
@com.google.firebase.encoders.annotations.Encodable
public abstract class ProtoEncoderDoNotUse {
    private static final com.google.firebase.encoders.proto.ProtobufEncoder ENCODER = com.google.firebase.encoders.proto.ProtobufEncoder.builder().configureWith(com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    public abstract com.google.android.datatransport.runtime.firebase.transport.ClientMetrics getClientMetrics();

    private ProtoEncoderDoNotUse() {
    }

    public static byte[] encode(java.lang.Object obj) {
        return ENCODER.encode(obj);
    }

    public static void encode(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        ENCODER.encode(obj, outputStream);
    }
}
