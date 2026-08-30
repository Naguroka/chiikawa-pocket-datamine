package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class zc extends android.widget.FrameLayout implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.zc.a f1568a;

    interface a {
        void a(com.applovin.impl.zc zcVar);
    }

    public void setListener(com.applovin.impl.zc.a aVar) {
        this.f1568a = aVar;
    }

    public zc(com.applovin.impl.bd bdVar, android.content.Context context) {
        super(context);
        setOnClickListener(this);
        com.applovin.impl.adview.i iVar = new com.applovin.impl.adview.i(context);
        int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, bdVar.e());
        iVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iDpToPx, iDpToPx, 17));
        iVar.a(iDpToPx);
        addView(iVar);
        int iDpToPx2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, bdVar.e() + (bdVar.c() * 2));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, 8388661);
        int iDpToPx3 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, bdVar.f());
        int iDpToPx4 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, bdVar.d());
        layoutParams.setMargins(iDpToPx4, iDpToPx3, iDpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        this.f1568a.a(this);
    }
}
