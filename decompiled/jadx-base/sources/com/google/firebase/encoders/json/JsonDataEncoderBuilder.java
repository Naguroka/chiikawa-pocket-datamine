package com.google.firebase.encoders.json;

/* JADX INFO: loaded from: classes5.dex */
public final class JsonDataEncoderBuilder implements com.google.firebase.encoders.config.EncoderConfig<com.google.firebase.encoders.json.JsonDataEncoderBuilder> {
    private static final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> DEFAULT_FALLBACK_ENCODER = new com.google.firebase.encoders.ObjectEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda0
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.lambda$static$0(obj, objectEncoderContext);
        }
    };
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.String> STRING_ENCODER = new com.google.firebase.encoders.ValueEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda1
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(java.lang.Object obj, com.google.firebase.encoders.ValueEncoderContext valueEncoderContext) throws java.io.IOException {
            valueEncoderContext.add((java.lang.String) obj);
        }
    };
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.Boolean> BOOLEAN_ENCODER = new com.google.firebase.encoders.ValueEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda2
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(java.lang.Object obj, com.google.firebase.encoders.ValueEncoderContext valueEncoderContext) throws java.io.IOException {
            valueEncoderContext.add(((java.lang.Boolean) obj).booleanValue());
        }
    };
    private static final com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder TIMESTAMP_ENCODER = new com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder();
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders = new java.util.HashMap();
    private com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;
    private boolean ignoreNullValues = false;

    static /* synthetic */ void lambda$static$0(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        throw new com.google.firebase.encoders.EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    private static final class TimestampEncoder implements com.google.firebase.encoders.ValueEncoder<java.util.Date> {
        private static final java.text.DateFormat rfc339;

        private TimestampEncoder() {
        }

        static {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(java.util.Date date, com.google.firebase.encoders.ValueEncoderContext valueEncoderContext) throws java.io.IOException {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(java.lang.String.class, (com.google.firebase.encoders.ValueEncoder) STRING_ENCODER);
        registerEncoder(java.lang.Boolean.class, (com.google.firebase.encoders.ValueEncoder) BOOLEAN_ENCODER);
        registerEncoder(java.util.Date.class, (com.google.firebase.encoders.ValueEncoder) TIMESTAMP_ENCODER);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(java.lang.Class<T> cls, com.google.firebase.encoders.ObjectEncoder<? super T> objectEncoder) {
        this.objectEncoders.put(cls, objectEncoder);
        this.valueEncoders.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(java.lang.Class<T> cls, com.google.firebase.encoders.ValueEncoder<? super T> valueEncoder) {
        this.valueEncoders.put(cls, valueEncoder);
        this.objectEncoders.remove(cls);
        return this;
    }

    public com.google.firebase.encoders.json.JsonDataEncoderBuilder registerFallbackEncoder(com.google.firebase.encoders.ObjectEncoder<java.lang.Object> objectEncoder) {
        this.fallbackEncoder = objectEncoder;
        return this;
    }

    public com.google.firebase.encoders.json.JsonDataEncoderBuilder configureWith(com.google.firebase.encoders.config.Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    public com.google.firebase.encoders.json.JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.ignoreNullValues = z;
        return this;
    }

    public com.google.firebase.encoders.DataEncoder build() {
        return new com.google.firebase.encoders.DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(java.lang.Object obj, java.io.Writer writer) throws java.io.IOException {
                com.google.firebase.encoders.json.JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new com.google.firebase.encoders.json.JsonValueObjectEncoderContext(writer, com.google.firebase.encoders.json.JsonDataEncoderBuilder.this.objectEncoders, com.google.firebase.encoders.json.JsonDataEncoderBuilder.this.valueEncoders, com.google.firebase.encoders.json.JsonDataEncoderBuilder.this.fallbackEncoder, com.google.firebase.encoders.json.JsonDataEncoderBuilder.this.ignoreNullValues);
                jsonValueObjectEncoderContext.add(obj, false);
                jsonValueObjectEncoderContext.close();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public java.lang.String encode(java.lang.Object obj) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (java.io.IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }
}
