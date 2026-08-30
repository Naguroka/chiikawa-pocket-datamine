package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1242aZ extends com.facebook.ads.redexgen.core.KL {
    public static java.lang.String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1238aV A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0779Jg A01;

    public C1242aZ(com.facebook.ads.redexgen.core.C1238aV c1238aV, com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A00 = c1238aV;
        this.A01 = c0779Jg;
    }

    @Override // com.facebook.ads.redexgen.core.KL
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            com.facebook.ads.AdListener adListenerA06 = this.A00.A01.A06();
            com.facebook.ads.redexgen.core.C5P c5p = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            adListenerA06.onError(c5p.A07(), com.facebook.ads.redexgen.core.L8.A00(this.A01));
        }
    }
}
