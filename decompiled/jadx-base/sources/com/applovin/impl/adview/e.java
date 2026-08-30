package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends android.view.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f609a;
    protected final android.content.Context b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f610a;

        a(int i) {
            this.f610a = i;
        }

        public int b() {
            return this.f610a;
        }
    }

    protected e(android.content.Context context) {
        super(context);
        this.f609a = 1.0f;
        this.b = context;
    }

    public void a(int i) {
        setViewScale(i / 30.0f);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f609a * 30.0f;
    }

    public abstract com.applovin.impl.adview.e.a getStyle();

    public void setViewScale(float f) {
        this.f609a = f;
    }

    public static com.applovin.impl.adview.e a(com.applovin.impl.adview.e.a aVar, android.content.Context context) {
        if (aVar.equals(com.applovin.impl.adview.e.a.INVISIBLE)) {
            return new com.applovin.impl.adview.h(context);
        }
        if (aVar.equals(com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT)) {
            return new com.applovin.impl.adview.i(context);
        }
        if (aVar.equals(com.applovin.impl.adview.e.a.TRANSPARENT_SKIP)) {
            return new com.applovin.impl.adview.j(context);
        }
        return new com.applovin.impl.adview.n(context);
    }
}
