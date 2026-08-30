package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h6 implements com.applovin.impl.ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.h5.a f843a;
    private final android.util.SparseArray b;
    private final int[] c;
    private long d;
    private long e;
    private long f;
    private float g;
    private float h;

    private static android.util.SparseArray a(com.applovin.impl.h5.a aVar, com.applovin.impl.n8 n8Var) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        try {
            sparseArray.put(0, (com.applovin.impl.ce) java.lang.Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(com.applovin.impl.ce.class).getConstructor(com.applovin.impl.h5.a.class).newInstance(aVar));
        } catch (java.lang.Exception unused) {
        }
        try {
            sparseArray.put(1, (com.applovin.impl.ce) java.lang.Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(com.applovin.impl.ce.class).getConstructor(com.applovin.impl.h5.a.class).newInstance(aVar));
        } catch (java.lang.Exception unused2) {
        }
        try {
            sparseArray.put(2, (com.applovin.impl.ce) java.lang.Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(com.applovin.impl.ce.class).getConstructor(com.applovin.impl.h5.a.class).newInstance(aVar));
        } catch (java.lang.Exception unused3) {
        }
        try {
            sparseArray.put(3, (com.applovin.impl.ce) java.lang.Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(com.applovin.impl.ce.class).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
        } catch (java.lang.Exception unused4) {
        }
        sparseArray.put(4, new com.applovin.impl.bi.b(aVar, n8Var));
        return sparseArray;
    }

    public h6(android.content.Context context, com.applovin.impl.n8 n8Var) {
        this(new com.applovin.impl.u5.a(context), n8Var);
    }

    public h6(com.applovin.impl.h5.a aVar, com.applovin.impl.n8 n8Var) {
        this.f843a = aVar;
        android.util.SparseArray sparseArrayA = a(aVar, n8Var);
        this.b = sparseArrayA;
        this.c = new int[sparseArrayA.size()];
        for (int i = 0; i < this.b.size(); i++) {
            this.c[i] = this.b.keyAt(i);
        }
        this.d = androidx.media3.common.C.TIME_UNSET;
        this.e = androidx.media3.common.C.TIME_UNSET;
        this.f = androidx.media3.common.C.TIME_UNSET;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }
}
