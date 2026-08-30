package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.view.C f2089a;
    public final android.view.ViewGroup b;
    public final android.view.ViewGroup c;
    public final android.view.TextureView d;
    public final android.os.Handler e;
    public final com.five_corp.ad.internal.view.t f;
    public final android.widget.ImageView g;

    public D(android.content.Context context, com.five_corp.ad.internal.view.C c, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, com.five_corp.ad.internal.cache.f fVar, com.five_corp.ad.internal.ad.w wVar, android.view.TextureView textureView) {
        java.lang.System.identityHashCode(this);
        this.f2089a = c;
        this.b = viewGroup;
        this.c = viewGroup2;
        this.d = textureView;
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.g = imageView;
        imageView.setVisibility(8);
        com.five_corp.ad.internal.view.t tVar = new com.five_corp.ad.internal.view.t(context);
        this.f = tVar;
        tVar.setVisibility(8);
        if (wVar != null) {
            a(fVar.a(context, wVar));
        }
        a(textureView);
        a(imageView);
        a(tVar);
    }

    public static void a(com.five_corp.ad.internal.view.D d) {
        com.five_corp.ad.internal.util.f fVar;
        com.five_corp.ad.internal.util.f fVar2;
        d.getClass();
        try {
            android.graphics.Bitmap bitmap = d.d.getBitmap(android.graphics.Bitmap.createBitmap(d.d.getWidth(), d.d.getHeight(), android.graphics.Bitmap.Config.RGB_565));
            fVar2 = bitmap == null ? new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.D3, null, null, null), null) : new com.five_corp.ad.internal.util.f(true, null, bitmap);
        } catch (java.lang.Exception e) {
            fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.F3, null, e, null), null);
            fVar2 = fVar;
        } catch (java.lang.OutOfMemoryError e2) {
            fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.E3, null, e2, null), null);
            fVar2 = fVar;
        }
        if (!fVar2.f2085a) {
            ((com.five_corp.ad.internal.view.G) d.f2089a).a(fVar2.b);
        } else {
            d.g.setImageBitmap((android.graphics.Bitmap) fVar2.c);
            d.g.setVisibility(0);
        }
    }

    public final void a(android.view.View view) {
        this.e.post(new com.five_corp.ad.internal.view.u(this, view));
    }

    public final void a() {
        this.e.post(new com.five_corp.ad.internal.view.v(this));
    }
}
