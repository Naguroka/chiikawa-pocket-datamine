package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class er extends com.applovin.impl.gl {
    private com.applovin.impl.er.a n;
    private int o;
    private boolean p;
    private com.applovin.impl.fr.d q;
    private com.applovin.impl.fr.b r;

    static int a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    er() {
    }

    @Override // com.applovin.impl.gl
    protected void c(long j) {
        super.c(j);
        this.p = j != 0;
        com.applovin.impl.fr.d dVar = this.q;
        this.o = dVar != null ? dVar.g : 0;
    }

    public static boolean c(com.applovin.impl.ah ahVar) {
        try {
            return com.applovin.impl.fr.a(1, ahVar, true);
        } catch (com.applovin.impl.ch unused) {
            return false;
        }
    }

    com.applovin.impl.er.a b(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
        com.applovin.impl.fr.d dVar = this.q;
        if (dVar == null) {
            this.q = com.applovin.impl.fr.b(ahVar);
            return null;
        }
        com.applovin.impl.fr.b bVar = this.r;
        if (bVar == null) {
            this.r = com.applovin.impl.fr.a(ahVar);
            return null;
        }
        byte[] bArr = new byte[ahVar.e()];
        java.lang.System.arraycopy(ahVar.c(), 0, bArr, 0, ahVar.e());
        com.applovin.impl.fr.c[] cVarArrA = com.applovin.impl.fr.a(ahVar, dVar.b);
        return new com.applovin.impl.er.a(dVar, bVar, bArr, cVarArrA, com.applovin.impl.fr.a(cVarArrA.length - 1));
    }

    static void a(com.applovin.impl.ah ahVar, long j) {
        if (ahVar.b() < ahVar.e() + 4) {
            ahVar.a(java.util.Arrays.copyOf(ahVar.c(), ahVar.e() + 4));
        } else {
            ahVar.e(ahVar.e() + 4);
        }
        byte[] bArrC = ahVar.c();
        bArrC[ahVar.e() - 4] = (byte) (j & 255);
        bArrC[ahVar.e() - 3] = (byte) ((j >>> 8) & 255);
        bArrC[ahVar.e() - 2] = (byte) ((j >>> 16) & 255);
        bArrC[ahVar.e() - 1] = (byte) ((j >>> 24) & 255);
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.fr.d f769a;
        public final com.applovin.impl.fr.b b;
        public final byte[] c;
        public final com.applovin.impl.fr.c[] d;
        public final int e;

        public a(com.applovin.impl.fr.d dVar, com.applovin.impl.fr.b bVar, byte[] bArr, com.applovin.impl.fr.c[] cVarArr, int i) {
            this.f769a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    private static int a(byte b, com.applovin.impl.er.a aVar) {
        if (!aVar.d[a(b, aVar.e, 1)].f801a) {
            return aVar.f769a.g;
        }
        return aVar.f769a.h;
    }

    @Override // com.applovin.impl.gl
    protected long a(com.applovin.impl.ah ahVar) {
        if ((ahVar.c()[0] & 1) == 1) {
            return -1L;
        }
        int iA = a(ahVar.c()[0], (com.applovin.impl.er.a) com.applovin.impl.b1.b(this.n));
        long j = this.p ? (this.o + iA) / 4 : 0;
        a(ahVar, j);
        this.p = true;
        this.o = iA;
        return j;
    }

    @Override // com.applovin.impl.gl
    protected boolean a(com.applovin.impl.ah ahVar, long j, com.applovin.impl.gl.b bVar) throws com.applovin.impl.ch {
        if (this.n != null) {
            com.applovin.impl.b1.a(bVar.f826a);
            return false;
        }
        com.applovin.impl.er.a aVarB = b(ahVar);
        this.n = aVarB;
        if (aVarB == null) {
            return true;
        }
        com.applovin.impl.fr.d dVar = aVarB.f769a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(dVar.j);
        arrayList.add(aVarB.c);
        bVar.f826a = new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.AUDIO_VORBIS).b(dVar.e).k(dVar.d).c(dVar.b).n(dVar.c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.impl.gl
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
