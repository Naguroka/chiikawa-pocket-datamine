package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC1514g implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2096a;
    public final com.five_corp.ad.internal.view.InterfaceC1513f b;
    public final com.five_corp.ad.internal.logger.a c;

    public ViewOnTouchListenerC1514g(android.content.Context context, com.five_corp.ad.internal.view.InterfaceC1513f interfaceC1513f, com.five_corp.ad.internal.logger.a aVar) {
        this.f2096a = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = interfaceC1513f;
        this.c = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        try {
            int iMax = java.lang.Math.max(view.getWidth(), 1);
            int iMax2 = java.lang.Math.max(view.getHeight(), 1);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getActionMasked() == 1) {
                int i = this.f2096a;
                float f = -i;
                if (f <= x && x <= iMax + i && f <= y && y <= iMax2 + i) {
                    this.b.a(x, y);
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            this.c.a(th);
            return false;
        }
    }
}
