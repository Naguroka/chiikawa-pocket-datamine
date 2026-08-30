package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f1088a;
    public final int b;
    public final java.lang.String c;

    public static com.applovin.impl.na a(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
        try {
            ahVar.g(21);
            int iW = ahVar.w() & 3;
            int iW2 = ahVar.w();
            int iD = ahVar.d();
            int i = 0;
            for (int i2 = 0; i2 < iW2; i2++) {
                ahVar.g(1);
                int iC = ahVar.C();
                for (int i3 = 0; i3 < iC; i3++) {
                    int iC2 = ahVar.C();
                    i += iC2 + 4;
                    ahVar.g(iC2);
                }
            }
            ahVar.f(iD);
            byte[] bArr = new byte[i];
            int i4 = 0;
            java.lang.String strA = null;
            for (int i5 = 0; i5 < iW2; i5++) {
                int iW3 = ahVar.w() & 127;
                int iC3 = ahVar.C();
                for (int i6 = 0; i6 < iC3; i6++) {
                    int iC4 = ahVar.C();
                    byte[] bArr2 = com.applovin.impl.yf.f1540a;
                    java.lang.System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    java.lang.System.arraycopy(ahVar.c(), ahVar.d(), bArr, length, iC4);
                    if (iW3 == 33 && i6 == 0) {
                        strA = com.applovin.impl.o3.a(new com.applovin.impl.bh(bArr, length, length + iC4));
                    }
                    i4 = length + iC4;
                    ahVar.g(iC4);
                }
            }
            return new com.applovin.impl.na(i == 0 ? null : java.util.Collections.singletonList(bArr), iW + 1, strA);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.applovin.impl.ch.a("Error parsing HEVC config", e);
        }
    }

    private na(java.util.List list, int i, java.lang.String str) {
        this.f1088a = list;
        this.b = i;
        this.c = str;
    }
}
