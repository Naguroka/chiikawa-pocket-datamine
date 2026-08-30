package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NW extends android.widget.LinearLayout {
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 40.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
    public final com.facebook.ads.redexgen.core.C2W A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final com.facebook.ads.redexgen.core.NG A02;

    public NW(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.NG ng, com.facebook.ads.redexgen.core.MB mb) {
        this(c1199Zs, c2w, ng, null, mb);
    }

    public NW(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.NG ng, java.lang.String str, com.facebook.ads.redexgen.core.MB mb) {
        super(c1199Zs);
        this.A01 = c1199Zs;
        this.A00 = c2w;
        this.A02 = ng;
        setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        if (!android.text.TextUtils.isEmpty(str)) {
            android.view.View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            android.view.View view = new android.view.View(getContext());
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 1));
            com.facebook.ads.redexgen.core.M3.A0M(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!android.text.TextUtils.isEmpty(this.A00.A03())) {
            android.view.View viewA00 = A00(mb, this.A00.A03());
            viewA00.setPadding(0, A05, 0, A05);
            addView(viewA00, layoutParams);
        }
        com.facebook.ads.redexgen.core.C0875Nc c0875NcA03 = A03();
        c0875NcA03.setPadding(0, A05, 0, 0);
        addView(c0875NcA03, layoutParams);
    }

    private android.view.View A00(com.facebook.ads.redexgen.core.MB mb, java.lang.String str) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.M3.A0Y(textView, true, 14);
        textView.setTextColor(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private android.view.View A01(java.lang.String str) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        android.widget.LinearLayout.LayoutParams titleParams = new android.widget.LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new com.facebook.ads.redexgen.core.NU(this));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        com.facebook.ads.redexgen.core.M3.A0Y(textView, true, 16);
        textView.setTextColor(-14934495);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private com.facebook.ads.redexgen.core.C0875Nc A03() {
        com.facebook.ads.redexgen.core.C0875Nc c0875Nc = new com.facebook.ads.redexgen.core.C0875Nc(this.A01);
        for (com.facebook.ads.redexgen.core.C2W c2w : this.A00.A05()) {
            com.facebook.ads.redexgen.core.NI ni = new com.facebook.ads.redexgen.core.NI(this.A01);
            ni.setData(c2w.A04(), null);
            ni.setOnClickListener(new com.facebook.ads.redexgen.core.NV(this, ni, c2w));
            c0875Nc.addView(ni);
        }
        return c0875Nc;
    }
}
