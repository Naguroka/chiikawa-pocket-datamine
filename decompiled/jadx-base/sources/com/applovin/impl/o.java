package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class o extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.ProgressBar f1105a;

    public o(android.content.Context context, int i, int i2) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(context, null, i2);
        this.f1105a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i != -2 && i != -1) {
            int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new android.widget.RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(i, i);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void setColor(int i) {
        this.f1105a.getIndeterminateDrawable().setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }
}
