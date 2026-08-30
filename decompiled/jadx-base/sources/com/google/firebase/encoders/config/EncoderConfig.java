package com.google.firebase.encoders.config;

/* JADX INFO: loaded from: classes5.dex */
public interface EncoderConfig<T extends com.google.firebase.encoders.config.EncoderConfig<T>> {
    <U> T registerEncoder(java.lang.Class<U> cls, com.google.firebase.encoders.ObjectEncoder<? super U> objectEncoder);

    <U> T registerEncoder(java.lang.Class<U> cls, com.google.firebase.encoders.ValueEncoder<? super U> valueEncoder);
}
