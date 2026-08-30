package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class id extends com.applovin.impl.n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.jd f885a;
    public final java.lang.String b;

    public id(java.lang.Throwable th, com.applovin.impl.jd jdVar) {
        super("Decoder failed: " + (jdVar == null ? null : jdVar.f920a), th);
        this.f885a = jdVar;
        this.b = com.applovin.impl.xp.f1515a >= 21 ? a(th) : null;
    }

    private static java.lang.String a(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
