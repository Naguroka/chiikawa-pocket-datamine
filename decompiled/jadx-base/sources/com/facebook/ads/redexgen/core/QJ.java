package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QJ extends android.widget.LinearLayout {
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 32.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public android.widget.TextView A00;
    public android.widget.TextView A01;
    public com.facebook.ads.redexgen.core.OU A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;

    public QJ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A03 = c1199Zs;
        A00(c1199Zs);
    }

    private final void A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        setGravity(16);
        this.A02 = new com.facebook.ads.redexgen.core.OU(c1199Zs);
        this.A02.setFullCircleCorners(true);
        android.widget.LinearLayout.LayoutParams pageImageViewParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        android.widget.LinearLayout pageInfoView = new android.widget.LinearLayout(c1199Zs);
        pageInfoView.setOrientation(1);
        this.A00 = new android.widget.TextView(c1199Zs);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A00, true, 16);
        this.A00.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new android.widget.TextView(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(com.facebook.ads.redexgen.core.C1Z c1z) {
        com.facebook.ads.redexgen.core.AsyncTaskC1068Un asyncTaskC1068Un = new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A02, this.A03);
        asyncTaskC1068Un.A05(A04, A04);
        asyncTaskC1068Un.A07(c1z.A01());
        this.A00.setText(c1z.A02());
        this.A01.setText(c1z.A03());
    }
}
