package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c3 {
    public static void a(long j, com.applovin.impl.ah ahVar, com.applovin.impl.qo[] qoVarArr) {
        while (true) {
            if (ahVar.a() <= 1) {
                return;
            }
            int iA = a(ahVar);
            int iA2 = a(ahVar);
            int iD = ahVar.d() + iA2;
            if (iA2 == -1 || iA2 > ahVar.a()) {
                com.applovin.impl.oc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iD = ahVar.e();
            } else if (iA == 4 && iA2 >= 8) {
                int iW = ahVar.w();
                int iC = ahVar.C();
                int iJ = iC == 49 ? ahVar.j() : 0;
                int iW2 = ahVar.w();
                if (iC == 47) {
                    ahVar.g(1);
                }
                boolean z = iW == 181 && (iC == 49 || iC == 47) && iW2 == 3;
                if (iC == 49) {
                    z &= iJ == 1195456820;
                }
                if (z) {
                    b(j, ahVar, qoVarArr);
                }
            }
            ahVar.f(iD);
        }
    }

    public static void b(long j, com.applovin.impl.ah ahVar, com.applovin.impl.qo[] qoVarArr) {
        int iW = ahVar.w();
        if ((iW & 64) != 0) {
            ahVar.g(1);
            int i = (iW & 31) * 3;
            int iD = ahVar.d();
            for (com.applovin.impl.qo qoVar : qoVarArr) {
                ahVar.f(iD);
                qoVar.a(ahVar, i);
                if (j != androidx.media3.common.C.TIME_UNSET) {
                    qoVar.a(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int a(com.applovin.impl.ah ahVar) {
        int i = 0;
        while (ahVar.a() != 0) {
            int iW = ahVar.w();
            i += iW;
            if (iW != 255) {
                return i;
            }
        }
        return -1;
    }
}
