package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dk implements com.applovin.impl.bf {
    protected abstract com.applovin.impl.af a(com.applovin.impl.df dfVar, java.nio.ByteBuffer byteBuffer);

    @Override // com.applovin.impl.bf
    public final com.applovin.impl.af a(com.applovin.impl.df dfVar) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.applovin.impl.b1.a(dfVar.c);
        com.applovin.impl.b1.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dfVar.d()) {
            return null;
        }
        return a(dfVar, byteBuffer);
    }
}
