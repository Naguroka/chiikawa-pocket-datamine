package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class w7 extends com.applovin.impl.dk {
    public com.applovin.impl.v7 a(com.applovin.impl.ah ahVar) {
        return new com.applovin.impl.v7((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) ahVar.t()), (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) ahVar.t()), ahVar.s(), ahVar.s(), java.util.Arrays.copyOfRange(ahVar.c(), ahVar.d(), ahVar.e()));
    }

    @Override // com.applovin.impl.dk
    protected com.applovin.impl.af a(com.applovin.impl.df dfVar, java.nio.ByteBuffer byteBuffer) {
        return new com.applovin.impl.af(a(new com.applovin.impl.ah(byteBuffer.array(), byteBuffer.limit())));
    }
}
