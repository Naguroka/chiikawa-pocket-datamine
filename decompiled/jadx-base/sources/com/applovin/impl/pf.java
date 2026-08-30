package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class pf extends com.applovin.impl.ek {
    private final com.applovin.impl.ah o;

    public pf() {
        super("Mp4WebvttDecoder");
        this.o = new com.applovin.impl.ah();
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) throws com.applovin.impl.pl {
        this.o.a(bArr, i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.o.a() > 0) {
            if (this.o.a() >= 8) {
                int iJ = this.o.j();
                if (this.o.j() == 1987343459) {
                    arrayList.add(a(this.o, iJ - 8));
                } else {
                    this.o.g(iJ - 8);
                }
            } else {
                throw new com.applovin.impl.pl("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new com.applovin.impl.qf(arrayList);
    }

    private static com.applovin.impl.a5 a(com.applovin.impl.ah ahVar, int i) throws com.applovin.impl.pl {
        java.lang.CharSequence charSequenceA = null;
        com.applovin.impl.a5.b bVarC = null;
        while (i > 0) {
            if (i >= 8) {
                int iJ = ahVar.j();
                int iJ2 = ahVar.j();
                int i2 = iJ - 8;
                java.lang.String strA = com.applovin.impl.xp.a(ahVar.c(), ahVar.d(), i2);
                ahVar.g(i2);
                i = (i - 8) - i2;
                if (iJ2 == 1937011815) {
                    bVarC = com.applovin.impl.xr.c(strA);
                } else if (iJ2 == 1885436268) {
                    charSequenceA = com.applovin.impl.xr.a((java.lang.String) null, strA.trim(), java.util.Collections.emptyList());
                }
            } else {
                throw new com.applovin.impl.pl("Incomplete vtt cue box header found.");
            }
        }
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        if (bVarC != null) {
            return bVarC.a(charSequenceA).a();
        }
        return com.applovin.impl.xr.a(charSequenceA);
    }
}
