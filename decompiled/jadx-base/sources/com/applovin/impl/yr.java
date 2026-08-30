package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class yr extends com.applovin.impl.ek {
    private final com.applovin.impl.ah o;
    private final com.applovin.impl.ur p;

    public yr() {
        super("WebvttDecoder");
        this.o = new com.applovin.impl.ah();
        this.p = new com.applovin.impl.ur();
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) throws com.applovin.impl.pl {
        com.applovin.impl.wr wrVarA;
        this.o.a(bArr, i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.applovin.impl.zr.b(this.o);
            while (!android.text.TextUtils.isEmpty(this.o.l())) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                int iA = a(this.o);
                if (iA == 0) {
                    return new com.applovin.impl.as(arrayList2);
                }
                if (iA == 1) {
                    b(this.o);
                } else if (iA == 2) {
                    if (arrayList2.isEmpty()) {
                        this.o.l();
                        arrayList.addAll(this.p.c(this.o));
                    } else {
                        throw new com.applovin.impl.pl("A style block was found after the first cue.");
                    }
                } else if (iA == 3 && (wrVarA = com.applovin.impl.xr.a(this.o, arrayList)) != null) {
                    arrayList2.add(wrVarA);
                }
            }
        } catch (com.applovin.impl.ch e) {
            throw new com.applovin.impl.pl(e);
        }
    }

    private static void b(com.applovin.impl.ah ahVar) {
        while (!android.text.TextUtils.isEmpty(ahVar.l())) {
        }
    }

    private static int a(com.applovin.impl.ah ahVar) {
        int i = -1;
        int iD = 0;
        while (i == -1) {
            iD = ahVar.d();
            java.lang.String strL = ahVar.l();
            if (strL == null) {
                i = 0;
            } else if ("STYLE".equals(strL)) {
                i = 2;
            } else {
                i = strL.startsWith("NOTE") ? 1 : 3;
            }
        }
        ahVar.f(iD);
        return i;
    }
}
