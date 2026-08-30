package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends com.applovin.impl.dk {
    @Override // com.applovin.impl.dk
    protected com.applovin.impl.af a(com.applovin.impl.df dfVar, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new com.applovin.impl.zg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static com.applovin.impl.af a(com.applovin.impl.zg zgVar) {
        zgVar.d(12);
        int iD = (zgVar.d() + zgVar.a(12)) - 4;
        zgVar.d(44);
        zgVar.e(zgVar.a(12));
        zgVar.d(16);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String strA = null;
            if (zgVar.d() >= iD) {
                break;
            }
            zgVar.d(48);
            int iA = zgVar.a(8);
            zgVar.d(4);
            int iD2 = zgVar.d() + zgVar.a(12);
            java.lang.String strA2 = null;
            while (zgVar.d() < iD2) {
                int iA2 = zgVar.a(8);
                int iA3 = zgVar.a(8);
                int iD3 = zgVar.d() + iA3;
                if (iA2 == 2) {
                    int iA4 = zgVar.a(16);
                    zgVar.d(8);
                    if (iA4 == 3) {
                        while (zgVar.d() < iD3) {
                            strA = zgVar.a(zgVar.a(8), com.applovin.exoplayer2.common.base.Charsets.US_ASCII);
                            int iA5 = zgVar.a(8);
                            for (int i = 0; i < iA5; i++) {
                                zgVar.e(zgVar.a(8));
                            }
                        }
                    }
                } else if (iA2 == 21) {
                    strA2 = zgVar.a(iA3, com.applovin.exoplayer2.common.base.Charsets.US_ASCII);
                }
                zgVar.c(iD3 * 8);
            }
            zgVar.c(iD2 * 8);
            if (strA != null && strA2 != null) {
                arrayList.add(new com.applovin.impl.z0(iA, strA + strA2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.impl.af(arrayList);
    }
}
