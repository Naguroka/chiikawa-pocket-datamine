package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OI {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3n] */
    public static com.facebook.ads.redexgen.core.C04083n A00(final com.facebook.ads.redexgen.core.C0911Om c0911Om, final com.facebook.ads.redexgen.core.W7 w7, final java.lang.String str, final com.facebook.ads.redexgen.core.C0597Bl c0597Bl) {
        final boolean z = true;
        return new com.facebook.ads.redexgen.core.BZ(c0911Om, w7, z, str, c0597Bl) { // from class: com.facebook.ads.redexgen.X.3n
            public com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A00;
            public com.facebook.ads.redexgen.core.QK A01;
            public final com.facebook.ads.redexgen.core.J7 A02 = this.A0I.A05().A01().A09();
            public final com.facebook.ads.redexgen.core.W7 A03;
            public final com.facebook.ads.redexgen.core.C0597Bl A04;
            public final java.lang.String A05;
            public static java.lang.String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * (-4.0f));
            public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);

            {
                this.A03 = w7;
                this.A05 = str;
                this.A04 = c0597Bl;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public void setupNativeCtaExtension(com.facebook.ads.redexgen.core.QK qk) {
                com.facebook.ads.redexgen.core.C1T c1tA1Q;
                this.A01 = qk;
                int iA0O = com.facebook.ads.redexgen.core.C0762Im.A0O(this.A0I.A05());
                com.facebook.ads.redexgen.core.C1O c1oA01 = this.A03.A0z().A1O().A01();
                com.facebook.ads.redexgen.core.C1199Zs c1199ZsA05 = this.A0I.A05();
                java.lang.String strA0Y = this.A03.A0z().A0Y();
                com.facebook.ads.redexgen.core.J7 j7 = this.A02;
                com.facebook.ads.redexgen.core.MR dummyListener = com.facebook.ads.redexgen.core.C0895Nw.getDummyListener();
                com.facebook.ads.redexgen.core.C0987Rk c0987RkA0b = this.A04.A0b();
                com.facebook.ads.redexgen.core.C0842Lv c0842LvA19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    c1tA1Q = null;
                } else {
                    c1tA1Q = this.A03.A0z().A1Q();
                }
                this.A00 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(c1199ZsA05, strA0Y, c1oA01, j7, dummyListener, c0987RkA0b, c0842LvA19, c1tA1Q);
                this.A00.setCta(qk.A03().A0G(), this.A05, new java.util.HashMap());
                this.A03.A1K(this.A00);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                if (iA0O == 1) {
                    layoutParams.addRule(12);
                    java.lang.String[] strArr = A06;
                    java.lang.String str2 = strArr[5];
                    java.lang.String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new java.lang.RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    com.facebook.ads.redexgen.core.M3.A0P(this.A00, A07, 5, c1oA01.A09(false));
                    ((com.facebook.ads.redexgen.core.BZ) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0O == 2) {
                    layoutParams.addRule(3, ((com.facebook.ads.redexgen.core.BZ) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((com.facebook.ads.redexgen.core.BZ) this).A06.bringToFront();
                }
            }
        };
    }
}
