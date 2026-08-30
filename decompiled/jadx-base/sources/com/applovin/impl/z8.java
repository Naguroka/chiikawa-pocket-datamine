package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1565a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final com.applovin.impl.z8.a k;
    private final com.applovin.impl.af l;

    private static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case androidx.media3.extractor.OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f1566a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.f1566a = jArr;
            this.b = jArr2;
        }
    }

    private z8(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, com.applovin.impl.z8.a aVar, com.applovin.impl.af afVar) {
        this.f1565a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = afVar;
    }

    public com.applovin.impl.z8 b(java.util.List list) {
        return new com.applovin.impl.z8(this.f1565a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(list, java.util.Collections.emptyList())));
    }

    public z8(byte[] bArr, int i) {
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(bArr);
        zgVar.c(i * 8);
        this.f1565a = zgVar.a(16);
        this.b = zgVar.a(16);
        this.c = zgVar.a(24);
        this.d = zgVar.a(24);
        int iA = zgVar.a(20);
        this.e = iA;
        this.f = b(iA);
        this.g = zgVar.a(3) + 1;
        int iA2 = zgVar.a(5) + 1;
        this.h = iA2;
        this.i = a(iA2);
        this.j = zgVar.b(36);
        this.k = null;
        this.l = null;
    }

    private static com.applovin.impl.af a(java.util.List list, java.util.List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = (java.lang.String) list.get(i);
            java.lang.String[] strArrB = com.applovin.impl.xp.b(str, com.ironsource.y8.i.b);
            if (strArrB.length != 2) {
                com.applovin.impl.oc.d("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new com.applovin.impl.dr(strArrB[0], strArrB[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.impl.af(arrayList);
    }

    public long b() {
        long j = this.j;
        return j == 0 ? androidx.media3.common.C.TIME_UNSET : (j * 1000000) / ((long) this.e);
    }

    public com.applovin.impl.z8 a(java.util.List list) {
        return new com.applovin.impl.z8(this.f1565a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(java.util.Collections.emptyList(), list)));
    }

    public long a() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (((long) i) + ((long) this.c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f1565a;
            j = ((((i2 != this.b || i2 <= 0) ? 4096L : i2) * ((long) this.g)) * ((long) this.h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public com.applovin.impl.e9 a(byte[] bArr, com.applovin.impl.af afVar) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.AUDIO_FLAC).i(i).c(this.g).n(this.e).a(java.util.Collections.singletonList(bArr)).a(a(afVar)).a();
    }

    public com.applovin.impl.af a(com.applovin.impl.af afVar) {
        com.applovin.impl.af afVar2 = this.l;
        return afVar2 == null ? afVar : afVar2.a(afVar);
    }

    public long a(long j) {
        return com.applovin.impl.xp.b((j * ((long) this.e)) / 1000000, 0L, this.j - 1);
    }

    public com.applovin.impl.z8 a(com.applovin.impl.z8.a aVar) {
        return new com.applovin.impl.z8(this.f1565a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }
}
