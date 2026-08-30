package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.layouter.e f1939a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.five_corp.ad.internal.layouter.e eVar, android.content.Context context) {
        super(context);
        this.f1939a = eVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return this.f1939a.a(motionEvent.getX(), motionEvent.getY()) != null;
        } catch (java.lang.Exception e) {
            this.f1939a.d.a(e);
            return false;
        }
    }
}
