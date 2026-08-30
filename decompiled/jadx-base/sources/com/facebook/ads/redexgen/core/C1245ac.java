package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1245ac extends com.facebook.ads.redexgen.core.C5Y implements com.facebook.ads.internal.api.AdOptionsViewApi {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"HVqi6jlpWuJt2YtXNdvGk3FhV0BHl3EV", "MmKJ6DDV7RS65o7dKLAsYGebg3Me5CTe", "1YJN2Qnc4ttaIZRVWQztvMy6euLicnbf", "AdY32lBMWhACAu5OzQBb3WT", "7pW2kqTunwh3p", "By284lxDKeQhXfwWoADF7ASQT9nDXNCZ", "", "3GcamP2dghLgpW6nys2YEXVC3i8y"};
    public static final int A05;
    public static final int A06;
    public final android.widget.ImageView A00;
    public final android.widget.ImageView A01;
    public final com.facebook.ads.AdOptionsView A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {81, 102, 115, 108, 113, 119, 35, 66, 103};
        java.lang.String[] strArr = A04;
        if (strArr[3].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[3] = "u5VvbSB0F1Ye86S0UUtiEMk";
        strArr2[7] = "xkynJM0f4daSI4M9ryujsiLCexBq";
        A03 = bArr;
    }

    static {
        A02();
        A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 23.0f);
        A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    }

    public C1245ac(final android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation orientation, int i, com.facebook.ads.AdOptionsView adOptionsView) {
        int i2;
        this.A02 = adOptionsView;
        final android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.A02.addView(linearLayout);
        if (orientation == com.facebook.ads.AdOptionsView.Orientation.HORIZONTAL) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        this.A01 = A00(com.facebook.ads.redexgen.core.MB.DEFAULT_INFO_ICON);
        this.A00 = A00(com.facebook.ads.redexgen.core.MB.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 53));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final com.facebook.ads.redexgen.core.W7 w7A0L = com.facebook.ads.redexgen.core.W7.A0L(nativeAdBase.getInternalNativeAd());
        w7A0L.A1U(nativeAdLayout);
        w7A0L.A1W(this);
        com.facebook.ads.redexgen.core.C1358cU c1358cUA0y = w7A0L.A0y();
        if (c1358cUA0y != null && c1358cUA0y.A0R() && !c1358cUA0y.A0P()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.5N
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) throws java.lang.Throwable {
                    if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                        return;
                    }
                    try {
                        w7A0L.A1I();
                        if (android.os.Build.VERSION.SDK_INT >= 16 && com.facebook.ads.redexgen.core.C0762Im.A2N(context)) {
                            linearLayout.performAccessibilityAction(128, null);
                        }
                    } catch (java.lang.Throwable th) {
                        com.facebook.ads.redexgen.core.KQ.A00(th, this);
                    }
                }
            });
            com.facebook.ads.redexgen.core.LU.A04(this.A02, com.facebook.ads.redexgen.core.LU.A0C);
        }
    }

    public C1245ac(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private android.widget.ImageView A00(com.facebook.ads.redexgen.core.MB mb) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.A02.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(A06, A06, A06, A06);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
        return imageView;
    }

    public final void A03(com.facebook.ads.redexgen.core.MB mb) {
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        this.A01.setColorFilter(i);
        this.A00.setColorFilter(i);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int iconSize = java.lang.Math.max(A05, (int) (com.facebook.ads.redexgen.core.LP.A02 * i));
        android.widget.LinearLayout.LayoutParams iconParams = new android.widget.LinearLayout.LayoutParams(iconSize, iconSize);
        this.A01.setLayoutParams(iconParams);
        this.A00.setLayoutParams(iconParams);
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        com.facebook.ads.redexgen.core.M3.A0N(this.A01, z ? 8 : 0);
    }
}
