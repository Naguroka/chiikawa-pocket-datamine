package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 {
    public static final com.applovin.impl.x2 g = new com.applovin.impl.x2(-1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1484a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final android.graphics.Typeface f;

    public static com.applovin.impl.x2 a(android.view.accessibility.CaptioningManager.CaptionStyle captionStyle) {
        return com.applovin.impl.xp.f1515a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static com.applovin.impl.x2 b(android.view.accessibility.CaptioningManager.CaptionStyle captionStyle) {
        return new com.applovin.impl.x2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public x2(int i, int i2, int i3, int i4, int i5, android.graphics.Typeface typeface) {
        this.f1484a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    private static com.applovin.impl.x2 c(android.view.accessibility.CaptioningManager.CaptionStyle captionStyle) {
        return new com.applovin.impl.x2(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.f1484a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
