package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes5.dex */
class ProtobufValueEncoderContext implements com.google.firebase.encoders.ValueEncoderContext {
    private com.google.firebase.encoders.FieldDescriptor field;
    private final com.google.firebase.encoders.proto.ProtobufDataEncoderContext objEncoderCtx;
    private boolean encoded = false;
    private boolean skipDefault = false;

    ProtobufValueEncoderContext(com.google.firebase.encoders.proto.ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.objEncoderCtx = protobufDataEncoderContext;
    }

    void resetContext(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z) {
        this.encoded = false;
        this.field = fieldDescriptor;
        this.skipDefault = z;
    }

    private void checkNotUsed() {
        if (this.encoded) {
            throw new com.google.firebase.encoders.EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.encoded = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(java.lang.String str) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, str, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(float f) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, f, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(double d) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, d, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(int i) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, i, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(long j) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, j, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(boolean z) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, z, this.skipDefault);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(byte[] bArr) throws java.io.IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, bArr, this.skipDefault);
        return this;
    }
}
