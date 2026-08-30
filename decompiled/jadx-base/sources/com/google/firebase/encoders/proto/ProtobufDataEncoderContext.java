package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes5.dex */
final class ProtobufDataEncoderContext implements com.google.firebase.encoders.ObjectEncoderContext {
    private final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private java.io.OutputStream output;
    private final com.google.firebase.encoders.proto.ProtobufValueEncoderContext valueEncoderContext = new com.google.firebase.encoders.proto.ProtobufValueEncoderContext(this);
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    private static final com.google.firebase.encoders.FieldDescriptor MAP_KEY_DESC = com.google.firebase.encoders.FieldDescriptor.builder(com.ironsource.y8.h.W).withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
    private static final com.google.firebase.encoders.FieldDescriptor MAP_VALUE_DESC = com.google.firebase.encoders.FieldDescriptor.builder("value").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(2).build()).build();
    private static final com.google.firebase.encoders.ObjectEncoder<java.util.Map.Entry<java.lang.Object, java.lang.Object>> DEFAULT_MAP_ENCODER = new com.google.firebase.encoders.ObjectEncoder() { // from class: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$$ExternalSyntheticLambda0
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext.lambda$static$0((java.util.Map.Entry) obj, objectEncoderContext);
        }
    };

    static /* synthetic */ void lambda$static$0(java.util.Map.Entry entry, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
    }

    ProtobufDataEncoderContext(java.io.OutputStream outputStream, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> map, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> map2, com.google.firebase.encoders.ObjectEncoder<java.lang.Object> objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        return add(com.google.firebase.encoders.FieldDescriptor.of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, double d) throws java.io.IOException {
        return add(com.google.firebase.encoders.FieldDescriptor.of(str), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, int i) throws java.io.IOException {
        return add(com.google.firebase.encoders.FieldDescriptor.of(str), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, long j) throws java.io.IOException {
        return add(com.google.firebase.encoders.FieldDescriptor.of(str), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, boolean z) throws java.io.IOException {
        return add(com.google.firebase.encoders.FieldDescriptor.of(str), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj) throws java.io.IOException {
        return add(fieldDescriptor, obj, true);
    }

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj, boolean z) throws java.io.IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof java.lang.CharSequence) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(UTF_8);
            writeVarInt32(bytes.length);
            this.output.write(bytes);
            return this;
        }
        if (obj instanceof java.util.Collection) {
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                add(fieldDescriptor, it.next(), false);
            }
            return this;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                doEncode((com.google.firebase.encoders.ObjectEncoder<java.util.Map.Entry>) DEFAULT_MAP_ENCODER, fieldDescriptor, (java.util.Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof java.lang.Double) {
            return add(fieldDescriptor, ((java.lang.Double) obj).doubleValue(), z);
        }
        if (obj instanceof java.lang.Float) {
            return add(fieldDescriptor, ((java.lang.Float) obj).floatValue(), z);
        }
        if (obj instanceof java.lang.Number) {
            return add(fieldDescriptor, ((java.lang.Number) obj).longValue(), z);
        }
        if (obj instanceof java.lang.Boolean) {
            return add(fieldDescriptor, ((java.lang.Boolean) obj).booleanValue(), z);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
            writeVarInt32(bArr.length);
            this.output.write(bArr);
            return this;
        }
        com.google.firebase.encoders.ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            return doEncode(objectEncoder, fieldDescriptor, obj, z);
        }
        com.google.firebase.encoders.ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
        if (valueEncoder != null) {
            return doEncode(valueEncoder, fieldDescriptor, obj, z);
        }
        if (obj instanceof com.google.firebase.encoders.proto.ProtoEnum) {
            return add(fieldDescriptor, ((com.google.firebase.encoders.proto.ProtoEnum) obj).getNumber());
        }
        if (obj instanceof java.lang.Enum) {
            return add(fieldDescriptor, ((java.lang.Enum) obj).ordinal());
        }
        return doEncode(this.fallbackEncoder, fieldDescriptor, obj, z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, double d) throws java.io.IOException {
        return add(fieldDescriptor, d, true);
    }

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, double d, boolean z) throws java.io.IOException {
        if (z && d == 0.0d) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, float f) throws java.io.IOException {
        return add(fieldDescriptor, f, true);
    }

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, float f, boolean z) throws java.io.IOException {
        if (z && f == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, int i) throws java.io.IOException {
        return add(fieldDescriptor, i, true);
    }

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

        static {
            int[] iArr = new int[com.google.firebase.encoders.proto.Protobuf.IntEncoding.values().length];
            $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = iArr;
            try {
                iArr[com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, int i, boolean z) throws java.io.IOException {
        if (z && i == 0) {
            return this;
        }
        com.google.firebase.encoders.proto.Protobuf protobuf = getProtobuf(fieldDescriptor);
        int i2 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
        if (i2 == 1) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt32(i);
        } else if (i2 == 2) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt32((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            writeVarInt32((protobuf.tag() << 3) | 5);
            this.output.write(allocateBuffer(4).putInt(i).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, long j) throws java.io.IOException {
        return add(fieldDescriptor, j, true);
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, long j, boolean z) throws java.io.IOException {
        if (z && j == 0) {
            return this;
        }
        com.google.firebase.encoders.proto.Protobuf protobuf = getProtobuf(fieldDescriptor);
        int i = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
        if (i == 1) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt64(j);
        } else if (i == 2) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt64((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            writeVarInt32((protobuf.tag() << 3) | 1);
            this.output.write(allocateBuffer(8).putLong(j).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z) throws java.io.IOException {
        return add(fieldDescriptor, z, true);
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws java.io.IOException {
        return add(fieldDescriptor, z ? 1 : 0, z2);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext inline(java.lang.Object obj) throws java.io.IOException {
        return encode(obj);
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext encode(java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            return this;
        }
        com.google.firebase.encoders.ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new com.google.firebase.encoders.EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext nested(java.lang.String str) throws java.io.IOException {
        return nested(com.google.firebase.encoders.FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext nested(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) throws java.io.IOException {
        throw new com.google.firebase.encoders.EncodingException("nested() is not implemented for protobuf encoding.");
    }

    private <T> com.google.firebase.encoders.proto.ProtobufDataEncoderContext doEncode(com.google.firebase.encoders.ObjectEncoder<T> objectEncoder, com.google.firebase.encoders.FieldDescriptor fieldDescriptor, T t, boolean z) throws java.io.IOException {
        long jDetermineSize = determineSize(objectEncoder, t);
        if (z && jDetermineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt64(jDetermineSize);
        objectEncoder.encode(t, this);
        return this;
    }

    private <T> long determineSize(com.google.firebase.encoders.ObjectEncoder<T> objectEncoder, T t) throws java.io.IOException {
        com.google.firebase.encoders.proto.LengthCountingOutputStream lengthCountingOutputStream = new com.google.firebase.encoders.proto.LengthCountingOutputStream();
        try {
            java.io.OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(t, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (java.lang.Throwable th) {
                this.output = outputStream;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> com.google.firebase.encoders.proto.ProtobufDataEncoderContext doEncode(com.google.firebase.encoders.ValueEncoder<T> valueEncoder, com.google.firebase.encoders.FieldDescriptor fieldDescriptor, T t, boolean z) throws java.io.IOException {
        this.valueEncoderContext.resetContext(fieldDescriptor, z);
        valueEncoder.encode(t, this.valueEncoderContext);
        return this;
    }

    private static java.nio.ByteBuffer allocateBuffer(int i) {
        return java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private static int getTag(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) {
        com.google.firebase.encoders.proto.Protobuf protobuf = (com.google.firebase.encoders.proto.Protobuf) fieldDescriptor.getProperty(com.google.firebase.encoders.proto.Protobuf.class);
        if (protobuf == null) {
            throw new com.google.firebase.encoders.EncodingException("Field has no @Protobuf config");
        }
        return protobuf.tag();
    }

    private static com.google.firebase.encoders.proto.Protobuf getProtobuf(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) {
        com.google.firebase.encoders.proto.Protobuf protobuf = (com.google.firebase.encoders.proto.Protobuf) fieldDescriptor.getProperty(com.google.firebase.encoders.proto.Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new com.google.firebase.encoders.EncodingException("Field has no @Protobuf config");
    }

    private void writeVarInt32(int i) throws java.io.IOException {
        while ((i & (-128)) != 0) {
            this.output.write((i & 127) | 128);
            i >>>= 7;
        }
        this.output.write(i & 127);
    }

    private void writeVarInt64(long j) throws java.io.IOException {
        while (((-128) & j) != 0) {
            this.output.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.output.write(((int) j) & 127);
    }
}
