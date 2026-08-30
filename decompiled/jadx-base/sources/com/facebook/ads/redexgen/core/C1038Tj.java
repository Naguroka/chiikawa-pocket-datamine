package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1038Tj extends com.facebook.ads.redexgen.core.KY {
    public static java.lang.String[] A01 = {"M2F6Kmdpn8vR7EEN0gGYLZs2yNDQD6jF", "WcwB5s3ZH8XUWWhYRsGPhRGAgRS7F", "1wzHcE8JrY1qQrLIUCacg6", "aO9bUKC9mwcMg2oxYIu04NXSdGwnlABS", "LSvrrVaEaUYZBIls3QQGViVr8YYMo4D4", "5u9inp355EzrKn8AcN", "FOTtox4pqjzhBM", "oEWmB2dr0o0vjQMmlNYMXQ5ONfeuqOC2"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.A4 A00;

    public C1038Tj(com.facebook.ads.redexgen.core.A4 a4) {
        this.A00 = a4;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A00.A00 != null) {
            com.facebook.ads.redexgen.core.AbstractC0907Oi abstractC0907Oi = this.A00.A00;
            java.lang.String[] strArr = A01;
            if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[6] = "bfueFeeK4pCyDd";
            strArr2[1] = "8ekS6HwfggRtR8RWj86xgWcHB7DcW";
            abstractC0907Oi.A0y();
        }
        this.A00.A07.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A07.A06();
        this.A00.A05.set(true);
    }
}
