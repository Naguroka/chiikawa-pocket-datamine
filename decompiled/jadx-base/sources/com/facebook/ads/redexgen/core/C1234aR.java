package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1234aR implements com.facebook.ads.redexgen.core.PQ {
    public static java.lang.String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ com.facebook.ads.NativeAd A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1229aM A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.W7 A02;

    public C1234aR(com.facebook.ads.redexgen.core.C1229aM c1229aM, com.facebook.ads.redexgen.core.W7 w7, com.facebook.ads.NativeAd nativeAd) {
        this.A01 = c1229aM;
        this.A02 = w7;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void A9k() {
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void ABp(com.facebook.ads.redexgen.core.BN bn) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.C1235aS(this, bn), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void AC4() {
        if (this.A01.A0A != null) {
            com.facebook.ads.redexgen.core.BN bn = this.A01.A0A;
            java.lang.String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            bn.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void ADo(android.view.View view, android.view.MotionEvent motionEvent) throws java.lang.Throwable {
        this.A02.A19().A06(this.A01.A07, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0J(this.A00) && this.A02.A12() != null) {
            this.A02.A12().onClick(view);
        }
    }
}
