package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0693Fs {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final android.graphics.Bitmap A0A;
    public final android.text.Layout.Alignment A0B;
    public final java.lang.CharSequence A0C;
    public final boolean A0D;

    public C0693Fs(android.graphics.Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public C0693Fs(java.lang.CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C0693Fs(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public C0693Fs(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public C0693Fs(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    public C0693Fs(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = f2;
        this.A07 = i3;
        this.A03 = f4;
        this.A00 = f5;
        this.A0D = z;
        this.A09 = i5;
        this.A08 = i4;
        this.A04 = f3;
    }
}
