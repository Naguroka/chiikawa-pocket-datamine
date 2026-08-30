package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f991a;
    public final java.util.List b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f992a;
        public final java.lang.String b;
        public final long c;
        public final long d;

        public a(java.lang.String str, java.lang.String str2, long j, long j2) {
            this.f992a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public lf(long j, java.util.List list) {
        this.f991a = j;
        this.b = list;
    }

    public com.applovin.impl.mf a(long j) {
        long j2;
        if (this.b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            com.applovin.impl.lf.a aVar = (com.applovin.impl.lf.a) this.b.get(size);
            boolean zEquals = androidx.media3.common.MimeTypes.VIDEO_MP4.equals(aVar.f992a) | z;
            if (size == 0) {
                j3 -= aVar.d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.c;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new com.applovin.impl.mf(j4, j5, this.f991a, j6, j7);
    }
}
