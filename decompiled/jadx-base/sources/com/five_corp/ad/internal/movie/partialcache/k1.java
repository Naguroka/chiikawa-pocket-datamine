package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 {
    public static final /* synthetic */ boolean k = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.movie.partialcache.K0 f2006a;
    public final com.five_corp.ad.internal.movie.partialcache.G0 b;
    public final com.five_corp.ad.internal.movie.partialcache.G c;
    public final com.five_corp.ad.internal.movie.partialcache.F d;
    public final com.five_corp.ad.internal.movie.partialcache.E e;
    public final long[] f;
    public final long[] g;
    public final long h;
    public final int i;
    public final int[] j;

    public k1(long j, com.five_corp.ad.internal.movie.partialcache.H0 h0) {
        com.five_corp.ad.internal.movie.partialcache.K0 k0;
        this.h = j;
        this.f2006a = (com.five_corp.ad.internal.movie.partialcache.K0) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.K0.class);
        com.five_corp.ad.internal.movie.partialcache.G0 g0 = (com.five_corp.ad.internal.movie.partialcache.G0) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.G0.class);
        this.b = g0;
        com.five_corp.ad.internal.movie.partialcache.G g = (com.five_corp.ad.internal.movie.partialcache.G) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.G.class);
        this.c = g;
        com.five_corp.ad.internal.movie.partialcache.V0 v0 = (com.five_corp.ad.internal.movie.partialcache.V0) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.V0.class);
        this.d = (com.five_corp.ad.internal.movie.partialcache.F) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.F.class);
        this.e = (com.five_corp.ad.internal.movie.partialcache.E) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.E.class);
        int length = g0 != null ? g0.i : g != null ? g.h.length : 0;
        this.i = length;
        this.j = new int[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.i; i5++) {
            if (i <= 0 && (k0 = this.f2006a) != null) {
                if (k0.h.size() <= i2 || ((com.five_corp.ad.internal.movie.partialcache.J0) this.f2006a.h.get(i2)).f1986a > i3 + 2) {
                    i3++;
                    i = i4;
                } else {
                    com.five_corp.ad.internal.movie.partialcache.J0 j0 = (com.five_corp.ad.internal.movie.partialcache.J0) this.f2006a.h.get(i2);
                    i3 = j0.f1986a - 1;
                    i = j0.b;
                    i2++;
                    i4 = i;
                }
            }
            this.j[i5] = i3;
            i--;
        }
        com.five_corp.ad.internal.movie.partialcache.Y0 y0 = (com.five_corp.ad.internal.movie.partialcache.Y0) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.Y0.class);
        this.f = new long[this.i];
        if (y0 != null) {
            long j2 = 0;
            int i6 = 0;
            for (com.five_corp.ad.internal.movie.partialcache.X0 x0 : y0.h) {
                for (int i7 = 0; i7 < x0.f1989a; i7++) {
                    this.f[i6] = (1000000 * j2) / this.h;
                    j2 += (long) x0.b;
                    i6++;
                }
            }
        }
        if (v0 == null) {
            this.g = null;
            return;
        }
        int size = v0.h.size();
        this.g = new long[size];
        for (int i8 = 0; i8 < size; i8++) {
            this.g[i8] = ((java.lang.Integer) v0.h.get(i8)).intValue();
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        int i4 = i3 >= this.i ? 4 : 0;
        long[] jArr = this.g;
        if (jArr != null) {
            long j = i3;
            int length = jArr.length;
            if (length != 0 && j >= jArr[0]) {
                int i5 = length - 1;
                if (j < jArr[i5]) {
                    int i6 = length;
                    i2 = length / 2;
                    int i7 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if (j2 <= j && j < jArr[i2 + 1]) {
                            break;
                        }
                        if (j < j2) {
                            i6 = i2;
                        } else {
                            i7 = i2;
                        }
                        i2 = ((i6 - i7) / 2) + i7;
                    }
                } else {
                    i2 = i5;
                }
            } else {
                i2 = -1;
            }
            if (this.g[i2] != j) {
                return i4;
            }
        }
        return i4 | 1;
    }

    public final int b(int i) {
        int iIntValue;
        int i2 = this.j[i];
        int iC = 0;
        for (int i3 = i - 1; i3 >= 0 && this.j[i3] == i2; i3--) {
            iC += c(i3);
        }
        if (i2 == -1) {
            return -1;
        }
        com.five_corp.ad.internal.movie.partialcache.F f = this.d;
        if (f != null) {
            if (f.h.size() <= i2) {
                return -1;
            }
            iIntValue = ((java.lang.Integer) this.d.h.get(i2)).intValue();
        } else {
            if (!k && this.e == null) {
                throw new java.lang.AssertionError();
            }
            if (this.e.h.size() <= i2) {
                return -1;
            }
            iIntValue = ((java.lang.Long) this.e.h.get(i2)).intValue();
        }
        return iIntValue + iC;
    }

    public final int c(int i) {
        com.five_corp.ad.internal.movie.partialcache.G0 g0 = this.b;
        if (g0 != null) {
            if (i >= g0.i) {
                return -1;
            }
            int i2 = g0.h;
            return i2 == 0 ? g0.j[i] : i2;
        }
        if (!k && this.c == null) {
            throw new java.lang.AssertionError();
        }
        int[] iArr = this.c.h;
        if (i >= iArr.length) {
            return -1;
        }
        return iArr[i];
    }
}
