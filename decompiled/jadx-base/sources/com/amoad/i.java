package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class i {
    final boolean A;
    final float B;
    final boolean C;
    final float D;
    final float E;
    final com.amoad.bk F;
    final com.amoad.bk G;
    final java.util.List<com.amoad.bk> H;
    final com.amoad.b I;
    com.amoad.Analytics J;
    boolean K;
    boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f310a;
    final java.lang.String b;
    final java.lang.String c;
    final java.lang.String d;
    final java.util.List<java.lang.String> e;
    final java.lang.String f;
    final java.lang.String g;
    final java.lang.String h;
    final java.lang.String i;
    final java.lang.String j;
    final int k = -1;
    final int l = -1;
    final long m;
    final java.lang.String n;
    final boolean o;
    final long p;
    final int q;
    final java.lang.String r;
    final com.amoad.c s;
    final java.lang.String t;
    final java.lang.String u;
    final java.lang.String v;
    final java.lang.String w;
    final int x;
    final int y;
    final long z;

    interface a {
        void a(com.amoad.d dVar, com.amoad.AMoAdError aMoAdError);
    }

    interface b {
        void a(android.media.MediaPlayer mediaPlayer, com.amoad.AMoAdError aMoAdError);
    }

    i(android.content.Context context, com.amoad.al.a aVar, com.amoad.c cVar, long j, long j2, com.amoad.b bVar) {
        java.util.List<com.amoad.bk> listA;
        this.f310a = context.getApplicationContext();
        this.g = aVar.d;
        this.h = aVar.e;
        this.d = aVar.j;
        this.e = aVar.q;
        this.f = aVar.h;
        this.c = aVar.f;
        this.b = aVar.g;
        this.i = aVar.o;
        this.j = aVar.p;
        this.n = aVar.b;
        this.o = aVar.n;
        this.q = aVar.f211a;
        this.r = aVar.c;
        this.t = aVar.l;
        this.u = aVar.m;
        this.I = bVar;
        if (aVar.i != null) {
            this.v = aVar.i.f212a;
            this.w = aVar.i.b;
            this.x = aVar.i.c;
            this.y = aVar.i.d;
            this.z = aVar.i.e;
            this.A = aVar.i.f;
            this.B = aVar.i.g;
            this.C = aVar.i.h;
            this.D = aVar.i.i;
            this.E = aVar.i.j;
            this.F = new com.amoad.bk(aVar.i.k);
            this.G = new com.amoad.bk(aVar.i.l);
            listA = com.amoad.bk.a(aVar.i.m);
        } else {
            listA = null;
            this.v = null;
            this.w = null;
            this.x = 0;
            this.y = 0;
            this.z = 0L;
            this.A = false;
            this.B = 0.0f;
            this.C = false;
            this.D = 0.0f;
            this.E = 0.0f;
            this.F = null;
            this.G = null;
        }
        this.H = listA;
        this.s = cVar;
        this.p = j;
        this.m = j2;
    }

    final void a(android.view.View view, java.lang.String str, com.amoad.i.a aVar) {
        com.amoad.t.a(this.f310a).a(new com.amoad.af(view, str, aVar));
    }

    public final java.lang.String toString() {
        return "AMoAdNativeInfo [mTitleLong=" + this.b + "\n, mTitleShort=" + this.c + "\n, mLink=" + this.d + "\n, mServiceName=" + this.f + "\n, mIconUrl=" + this.g + "\n, mImageUrl=" + this.h + "\n, mVideoUrl=" + this.v + "\n, mImpressionUrl=" + this.i + com.ironsource.y8.i.e;
    }
}
