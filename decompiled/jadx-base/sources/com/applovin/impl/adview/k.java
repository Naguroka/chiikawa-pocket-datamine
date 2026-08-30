package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class k extends android.view.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.da f614a;
    private boolean b;

    interface a {
        void a();

        void onFailure();
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    public java.lang.String getIdentifier() {
        return this.f614a.b();
    }

    public void a(com.applovin.impl.adview.k.a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawableA = this.f614a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(drawableA);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public k(com.applovin.impl.da daVar, android.content.Context context) {
        super(context);
        this.f614a = daVar;
        setClickable(false);
        setFocusable(false);
    }
}
