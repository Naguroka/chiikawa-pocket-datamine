package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03953a extends android.view.ViewGroup.LayoutParams {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public boolean A05;

    public C03953a() {
        super(-1, -1);
        this.A00 = 0.0f;
    }

    public C03953a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.facebook.ads.redexgen.core.C04023h.A0u);
        this.A04 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
