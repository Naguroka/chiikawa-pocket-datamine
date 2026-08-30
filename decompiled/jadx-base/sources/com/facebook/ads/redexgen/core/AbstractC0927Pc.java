package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0927Pc {
    public static java.lang.String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0926Pb>> A01 = new java.util.HashMap();

    public static int A00() {
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0926Pb>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static com.facebook.ads.redexgen.core.C0926Pb A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, int i, com.facebook.ads.redexgen.core.PZ pz) {
        com.facebook.ads.redexgen.core.C0926Pb c0926Pb = new com.facebook.ads.redexgen.core.C0926Pb(c1199Zs, abstractC1341cD, c1199Zs.A01().A09(), i);
        c0926Pb.A0b(pz);
        c0926Pb.A0X();
        A01.put(abstractC1341cD.A0l(), new java.lang.ref.WeakReference<>(c0926Pb));
        return c0926Pb;
    }

    public static com.facebook.ads.redexgen.core.C0926Pb A02(java.lang.String str) {
        java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0926Pb> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C0926Pb c0926Pb) {
        A01.put(abstractC1341cD.A0l(), new java.lang.ref.WeakReference<>(c0926Pb));
    }

    public static void A04(java.lang.String str) {
        A01.remove(str);
    }
}
