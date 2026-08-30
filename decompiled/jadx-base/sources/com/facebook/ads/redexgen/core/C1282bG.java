package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1282bG implements com.facebook.ads.redexgen.core.InterfaceC03742f {
    public android.graphics.drawable.Drawable A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC03732e A01;

    public C1282bG(com.facebook.ads.redexgen.core.AbstractC03732e abstractC03732e) {
        this.A01 = abstractC03732e;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final android.graphics.drawable.Drawable A6h() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final com.facebook.ads.redexgen.core.AbstractC03732e A6i() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final boolean A89() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final boolean A8e() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final void AGK(android.graphics.drawable.Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final void AGX(int i, int i2) {
        if (i > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03742f
    public final void AGe(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
