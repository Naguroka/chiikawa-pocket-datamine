package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VC implements com.facebook.ads.redexgen.core.LG {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.VA A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public VC(com.facebook.ads.redexgen.core.VA va) {
        this.A00 = va;
    }

    public /* synthetic */ VC(com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.VH vh) {
        this(va);
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ABb() {
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        if (this.A00.A0X) {
            boolean zA0V = this.A00.A0V();
            java.lang.String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (zA0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ADF(float f) {
        float fA03;
        this.A00.A0O((int) f);
        if (this.A00.A0Y) {
            if (this.A00.A0E) {
                com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD = this.A00.A0I;
                if (A02[6].charAt(27) != 'a') {
                    throw new java.lang.RuntimeException();
                }
                A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
                fA03 = 1.0f - (f / abstractC1341cD.A1P().A0E().A02());
                if (this.A00.A0H || fA03 < 1.0f) {
                    this.A00.A0H = false;
                    this.A00.A0a.setToolbarActionMessage(this.A00.A0I.A1T().A02().replace(A00(0, 6, 117), java.lang.String.valueOf((int) f)));
                } else {
                    this.A00.A0H = true;
                    com.facebook.ads.redexgen.core.MQ mq = this.A00.A0a;
                    java.lang.String strA00 = A00(0, 0, 19);
                    if (A02[3].length() != 16) {
                        mq.setToolbarActionMessage(strA00);
                    } else {
                        java.lang.String[] strArr = A02;
                        strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                        strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                        mq.setToolbarActionMessage(strA00);
                    }
                }
            } else {
                fA03 = 1.0f - (f / this.A00.A0I.A1P().A0E().A03());
            }
            this.A00.A0a.setProgress(100.0f * fA03);
            float fA02 = this.A00.A0I.A1P().A0E().A02() - f;
            float percentageOfReward = this.A00.A0I.A1P().A0E().A03();
            boolean z = fA02 >= percentageOfReward;
            if (!this.A00.A0H && z) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
            return;
        }
        this.A00.A0a.setProgress(100.0f * (1.0f - (f / this.A00.A0J.A07())));
    }
}
