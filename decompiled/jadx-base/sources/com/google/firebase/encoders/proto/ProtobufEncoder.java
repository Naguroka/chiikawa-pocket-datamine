package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes5.dex */
public class ProtobufEncoder {
    private final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;

    ProtobufEncoder(java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> map, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> map2, com.google.firebase.encoders.ObjectEncoder<java.lang.Object> objectEncoder) {
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    public void encode(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        new com.google.firebase.encoders.proto.ProtobufDataEncoderContext(outputStream, this.objectEncoders, this.valueEncoders, this.fallbackEncoder).encode(obj);
    }

    public byte[] encode(java.lang.Object obj) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (java.io.IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static com.google.firebase.encoders.proto.ProtobufEncoder.Builder builder() {
        return new com.google.firebase.encoders.proto.ProtobufEncoder.Builder();
    }

    public static final class Builder implements com.google.firebase.encoders.config.EncoderConfig<com.google.firebase.encoders.proto.ProtobufEncoder.Builder> {
        private static final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> DEFAULT_FALLBACK_ENCODER = new com.google.firebase.encoders.ObjectEncoder() { // from class: com.google.firebase.encoders.proto.ProtobufEncoder$Builder$$ExternalSyntheticLambda0
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
                com.google.firebase.encoders.proto.ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
            }
        };
        private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders = new java.util.HashMap();
        private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders = new java.util.HashMap();
        private com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;

        static /* synthetic */ void lambda$static$0(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            throw new com.google.firebase.encoders.EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public <U> com.google.firebase.encoders.proto.ProtobufEncoder.Builder registerEncoder(java.lang.Class<U> cls, com.google.firebase.encoders.ObjectEncoder<? super U> objectEncoder) {
            this.objectEncoders.put(cls, objectEncoder);
            this.valueEncoders.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public <U> com.google.firebase.encoders.proto.ProtobufEncoder.Builder registerEncoder(java.lang.Class<U> cls, com.google.firebase.encoders.ValueEncoder<? super U> valueEncoder) {
            this.valueEncoders.put(cls, valueEncoder);
            this.objectEncoders.remove(cls);
            return this;
        }

        public com.google.firebase.encoders.proto.ProtobufEncoder.Builder registerFallbackEncoder(com.google.firebase.encoders.ObjectEncoder<java.lang.Object> objectEncoder) {
            this.fallbackEncoder = objectEncoder;
            return this;
        }

        public com.google.firebase.encoders.proto.ProtobufEncoder.Builder configureWith(com.google.firebase.encoders.config.Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        public com.google.firebase.encoders.proto.ProtobufEncoder build() {
            return new com.google.firebase.encoders.proto.ProtobufEncoder(new java.util.HashMap(this.objectEncoders), new java.util.HashMap(this.valueEncoders), this.fallbackEncoder);
        }
    }
}
