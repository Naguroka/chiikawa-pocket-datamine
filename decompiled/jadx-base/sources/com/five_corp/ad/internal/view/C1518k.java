package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1518k extends android.widget.FrameLayout implements com.five_corp.ad.internal.layouter.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.cache.b f2100a;

    public C1518k(android.content.Context context, com.five_corp.ad.internal.cache.f fVar, com.five_corp.ad.internal.ad.custom_layout.j jVar) {
        super(context);
        com.five_corp.ad.internal.cache.b bVarA = fVar.a(context, jVar.b);
        com.five_corp.ad.internal.cache.b bVarA2 = fVar.a(context, jVar.f1806a);
        this.f2100a = bVarA2;
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
        bVarA.setScaleType(scaleType);
        bVarA2.setScaleType(scaleType);
        addView(bVarA, new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(bVarA2, new android.widget.FrameLayout.LayoutParams(0, -1));
    }

    @Override // com.five_corp.ad.internal.layouter.l
    public final void a(com.five_corp.ad.internal.layouter.i iVar) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f2100a.getLayoutParams();
        layoutParams.width = (int) (getWidth() * iVar.d);
        this.f2100a.setLayoutParams(layoutParams);
    }
}
