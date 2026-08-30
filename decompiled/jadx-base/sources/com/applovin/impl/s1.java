package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class s1 extends com.applovin.impl.xl {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public s1(com.applovin.impl.qo qoVar) {
        super(qoVar);
    }

    @Override // com.applovin.impl.xl
    protected boolean a(com.applovin.impl.ah ahVar) throws com.applovin.impl.xl.a {
        if (!this.b) {
            int iW = ahVar.w();
            int i = (iW >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.f1513a.a(new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.AUDIO_MPEG).c(1).n(e[(iW >> 2) & 3]).a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.f1513a.a(new com.applovin.impl.e9.b().f(i == 7 ? androidx.media3.common.MimeTypes.AUDIO_ALAW : androidx.media3.common.MimeTypes.AUDIO_MLAW).c(1).n(8000).a());
                this.c = true;
            } else if (i != 10) {
                throw new com.applovin.impl.xl.a("Audio format not supported: " + this.d);
            }
            this.b = true;
        } else {
            ahVar.g(1);
        }
        return true;
    }

    @Override // com.applovin.impl.xl
    protected boolean b(com.applovin.impl.ah ahVar, long j) {
        if (this.d == 2) {
            int iA = ahVar.a();
            this.f1513a.a(ahVar, iA);
            this.f1513a.a(j, 1, iA, 0, null);
            return true;
        }
        int iW = ahVar.w();
        if (iW == 0 && !this.c) {
            int iA2 = ahVar.a();
            byte[] bArr = new byte[iA2];
            ahVar.a(bArr, 0, iA2);
            com.applovin.impl.a.b bVarA = com.applovin.impl.a.a(bArr);
            this.f1513a.a(new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.AUDIO_AAC).a(bVarA.c).c(bVarA.b).n(bVarA.f574a).a(java.util.Collections.singletonList(bArr)).a());
            this.c = true;
            return false;
        }
        if (this.d == 10 && iW != 1) {
            return false;
        }
        int iA3 = ahVar.a();
        this.f1513a.a(ahVar, iA3);
        this.f1513a.a(j, 1, iA3, 0, null);
        return true;
    }
}
