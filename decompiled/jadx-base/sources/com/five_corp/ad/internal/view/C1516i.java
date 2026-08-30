package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1516i extends android.widget.FrameLayout implements com.five_corp.ad.internal.layouter.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f2098a;
    public final com.five_corp.ad.internal.view.C1517j b;
    public final float c;
    public final com.five_corp.ad.internal.logger.a d;

    public C1516i(android.content.Context context, com.five_corp.ad.internal.ad.custom_layout.i iVar, int i, com.five_corp.ad.internal.logger.a aVar) {
        float f;
        super(context);
        this.d = aVar;
        com.five_corp.ad.internal.view.C1517j c1517j = new com.five_corp.ad.internal.view.C1517j(context, iVar, aVar);
        this.b = c1517j;
        addView(c1517j, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f2098a = textView;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
        textView.setTextSize(0, getHeight() * 0.8f);
        textView.setTextColor(com.five_corp.ad.internal.view.M.a(iVar.d));
        textView.setSingleLine();
        addView(textView, layoutParams);
        if (i >= 100000) {
            f = 0.5f;
        } else {
            if (i < 10000) {
                this.c = 0.8f;
                return;
            }
            f = 0.65f;
        }
        this.c = f;
    }

    @Override // com.five_corp.ad.internal.layouter.l
    public final void a(com.five_corp.ad.internal.layouter.i iVar) {
        android.widget.TextView textView = this.f2098a;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        int i = iVar.b / 1000;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        textView.setText(sb.toString());
        com.five_corp.ad.internal.view.C1517j c1517j = this.b;
        c1517j.getClass();
        c1517j.d = iVar.d;
        c1517j.invalidate();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.f2098a.setTextSize(0, getHeight() * this.c);
        } catch (java.lang.Throwable th) {
            this.d.a(th);
        }
    }
}
