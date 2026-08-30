package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleView extends android.widget.FrameLayout implements com.applovin.impl.qh.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.List f558a;
    private com.applovin.impl.x2 b;
    private int c;
    private float d;
    private float f;
    private boolean g;
    private boolean h;
    private int i;
    private com.applovin.exoplayer2.ui.SubtitleView.a j;
    private android.view.View k;

    interface a {
        void a(java.util.List list, com.applovin.impl.x2 x2Var, float f, int i, float f2);
    }

    public SubtitleView(android.content.Context context) {
        this(context, null);
    }

    private void e() {
        this.j.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.f);
    }

    private java.util.List<com.applovin.impl.a5> getCuesWithStylingPreferencesApplied() {
        if (this.g && this.h) {
            return this.f558a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f558a.size());
        for (int i = 0; i < this.f558a.size(); i++) {
            arrayList.add(a((com.applovin.impl.a5) this.f558a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        android.view.accessibility.CaptioningManager captioningManager;
        if (com.applovin.impl.xp.f1515a < 19 || isInEditMode() || (captioningManager = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private com.applovin.impl.x2 getUserCaptionStyle() {
        if (com.applovin.impl.xp.f1515a < 19 || isInEditMode()) {
            return com.applovin.impl.x2.g;
        }
        android.view.accessibility.CaptioningManager captioningManager = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? com.applovin.impl.x2.g : com.applovin.impl.x2.a(captioningManager.getUserStyle());
    }

    private <T extends android.view.View & com.applovin.exoplayer2.ui.SubtitleView.a> void setView(T t) {
        removeView(this.k);
        android.view.View view = this.k;
        if (view instanceof com.applovin.exoplayer2.ui.j) {
            ((com.applovin.exoplayer2.ui.j) view).a();
        }
        this.k = t;
        this.j = t;
        addView(t);
    }

    public void c() {
        setStyle(getUserCaptionStyle());
    }

    public void d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.h = z;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.g = z;
        e();
    }

    public void setBottomPaddingFraction(float f) {
        this.f = f;
        e();
    }

    public void setCues(java.util.List<com.applovin.impl.a5> list) {
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        this.f558a = list;
        e();
    }

    public void setFractionalTextSize(float f) {
        a(f, false);
    }

    public void setViewType(int i) {
        if (this.i == i) {
            return;
        }
        if (i == 1) {
            setView(new com.applovin.exoplayer2.ui.a(getContext()));
        } else {
            if (i != 2) {
                throw new java.lang.IllegalArgumentException();
            }
            setView(new com.applovin.exoplayer2.ui.j(getContext()));
        }
        this.i = i;
    }

    public SubtitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f558a = java.util.Collections.emptyList();
        this.b = com.applovin.impl.x2.g;
        this.c = 0;
        this.d = 0.0533f;
        this.f = 0.08f;
        this.g = true;
        this.h = true;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context);
        this.j = aVar;
        this.k = aVar;
        addView(aVar);
        this.i = 1;
    }

    public void setStyle(com.applovin.impl.x2 x2Var) {
        this.b = x2Var;
        e();
    }

    private com.applovin.impl.a5 a(com.applovin.impl.a5 a5Var) {
        com.applovin.impl.a5.b bVarA = a5Var.a();
        if (!this.g) {
            com.applovin.exoplayer2.ui.h.a(bVarA);
        } else if (!this.h) {
            com.applovin.exoplayer2.ui.h.b(bVarA);
        }
        return bVarA.a();
    }

    @Override // com.applovin.impl.qh.e
    public void a(java.util.List list) {
        setCues(list);
    }

    public void a(float f, boolean z) {
        a(z ? 1 : 0, f);
    }

    private void a(int i, float f) {
        this.c = i;
        this.d = f;
        e();
    }
}
