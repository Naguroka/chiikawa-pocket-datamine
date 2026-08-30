package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.encoders.annotations.Encodable
public abstract class ProtoEncoderDoNotUse {
    private static final com.google.firebase.encoders.proto.ProtobufEncoder ENCODER = com.google.firebase.encoders.proto.ProtobufEncoder.builder().configureWith(com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    public abstract com.google.firebase.messaging.reporting.MessagingClientEventExtension getMessagingClientEventExtension();

    private ProtoEncoderDoNotUse() {
    }

    public static byte[] encode(java.lang.Object obj) {
        return ENCODER.encode(obj);
    }

    public static void encode(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        ENCODER.encode(obj, outputStream);
    }
}
