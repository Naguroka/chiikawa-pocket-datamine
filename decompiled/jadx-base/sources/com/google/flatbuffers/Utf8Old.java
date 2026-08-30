package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public class Utf8Old extends com.google.flatbuffers.Utf8 {
    private static final java.lang.ThreadLocal<com.google.flatbuffers.Utf8Old.Cache> CACHE;

    /* JADX INFO: Access modifiers changed from: private */
    static class Cache {
        java.lang.CharSequence lastInput = null;
        java.nio.ByteBuffer lastOutput = null;
        final java.nio.charset.CharsetEncoder encoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        final java.nio.charset.CharsetDecoder decoder = java.nio.charset.StandardCharsets.UTF_8.newDecoder();

        Cache() {
        }
    }

    static {
        final java.util.function.Supplier supplier = new java.util.function.Supplier() { // from class: com.google.flatbuffers.Utf8Old$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.flatbuffers.Utf8Old.lambda$static$0();
            }
        };
        CACHE = new java.lang.ThreadLocal() { // from class: com.google.flatbuffers.Utf8Old$$ExternalSyntheticThreadLocal1
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ java.lang.Object initialValue() {
                return supplier.get();
            }
        };
    }

    static /* synthetic */ com.google.flatbuffers.Utf8Old.Cache lambda$static$0() {
        return new com.google.flatbuffers.Utf8Old.Cache();
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(java.lang.CharSequence charSequence) {
        com.google.flatbuffers.Utf8Old.Cache cache = CACHE.get();
        int length = (int) (charSequence.length() * cache.encoder.maxBytesPerChar());
        if (cache.lastOutput == null || cache.lastOutput.capacity() < length) {
            cache.lastOutput = java.nio.ByteBuffer.allocate(java.lang.Math.max(128, length));
        }
        cache.lastOutput.clear();
        cache.lastInput = charSequence;
        java.nio.charset.CoderResult coderResultEncode = cache.encoder.encode(charSequence instanceof java.nio.CharBuffer ? (java.nio.CharBuffer) charSequence : java.nio.CharBuffer.wrap(charSequence), cache.lastOutput, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (java.nio.charset.CharacterCodingException e) {
                throw new java.lang.IllegalArgumentException("bad character encoding", e);
            }
        }
        cache.lastOutput.flip();
        return cache.lastOutput.remaining();
    }

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        com.google.flatbuffers.Utf8Old.Cache cache = CACHE.get();
        if (cache.lastInput != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(cache.lastOutput);
    }

    @Override // com.google.flatbuffers.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        java.nio.charset.CharsetDecoder charsetDecoder = CACHE.get().decoder;
        charsetDecoder.reset();
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (java.nio.charset.CharacterCodingException e) {
            throw new java.lang.IllegalArgumentException("Bad encoding", e);
        }
    }
}
