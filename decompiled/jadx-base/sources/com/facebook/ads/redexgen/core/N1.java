package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N1 extends android.widget.LinearLayout {
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 15.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final android.widget.ImageView A03;
    public final android.widget.LinearLayout A04;
    public final android.widget.TextView A05;
    public final com.facebook.ads.redexgen.core.C1199Zs A06;
    public final com.facebook.ads.redexgen.core.OJ A07;

    public N1(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, boolean z) {
        super(c1199Zs);
        this.A01 = false;
        this.A06 = c1199Zs;
        this.A02 = z;
        this.A03 = new android.widget.ImageView(c1199Zs);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new com.facebook.ads.redexgen.core.OJ(c1199Zs, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new android.widget.TextView(c1199Zs);
        setOrientation(0);
        this.A04 = new android.widget.LinearLayout(c1199Zs);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A0A, A0A);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        android.widget.LinearLayout.LayoutParams actionTextLayoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i;
        com.facebook.ads.redexgen.core.OJ oj = this.A07;
        int i2 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        oj.setVisibility(i);
        android.widget.ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i2 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f, int i) {
        this.A07.A02(f, i);
    }

    public final void A04(com.facebook.ads.redexgen.core.C1O c1o, boolean z, boolean z2) {
        int iA04 = c1o.A04(z);
        com.facebook.ads.redexgen.core.OJ oj = this.A07;
        int accentColor = com.facebook.ads.redexgen.core.AbstractC03842p.A01(iA04, 77);
        oj.A03(accentColor, iA04, 110);
        this.A03.setColorFilter(iA04);
        if (z2) {
            android.widget.TextView textView = this.A05;
            int accentColor2 = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A05.setTextColor(iA04);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(android.view.View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A07.setProgressWithAnimation(f);
    }

    public void setProgressClickListener(android.view.View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(com.facebook.ads.redexgen.core.MB mb) {
        this.A07.setImage(mb);
    }

    public void setProgressImmediate(float f) {
        this.A07.clearAnimation();
        this.A07.setProgress(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        com.facebook.ads.redexgen.core.MB mb;
        this.A06.A0E().ADn(i);
        this.A00 = i;
        A01();
        setVisibility(0);
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            this.A03.setImageAlpha(255);
        }
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i) {
            case 0:
                mb = com.facebook.ads.redexgen.core.MB.CROSS;
                break;
            case 1:
                mb = !this.A02 ? com.facebook.ads.redexgen.core.MB.SKIP_ARROW : com.facebook.ads.redexgen.core.MB.REDESIGN_SKIP_ICON;
                break;
            case 2:
            default:
                mb = com.facebook.ads.redexgen.core.MB.CROSS;
                break;
            case 3:
                mb = com.facebook.ads.redexgen.core.MB.MINIMIZE_ARROW;
                break;
            case 4:
                mb = com.facebook.ads.redexgen.core.MB.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                mb = com.facebook.ads.redexgen.core.MB.CROSS;
                break;
            case 6:
                mb = com.facebook.ads.redexgen.core.MB.CROSS;
                break;
            case 7:
                mb = com.facebook.ads.redexgen.core.MB.CROSS;
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    this.A03.setImageAlpha(110);
                }
                this.A03.setPadding(A08, A08, A08, A08);
                break;
        }
        this.A03.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
        if (i == 1) {
            com.facebook.ads.redexgen.core.M3.A0G(1005, this.A03);
            setVisibility(0);
        } else {
            com.facebook.ads.redexgen.core.M3.A0G(1002, this.A03);
        }
    }

    public void setToolbarMessage(java.lang.String str) {
        this.A05.setText(str);
        this.A05.setVisibility(android.text.TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A05.setVisibility(z ? 0 : 4);
    }
}
