package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class X extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.onevcat.uniwebview.Y f3698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(android.content.Context context, com.onevcat.uniwebview.Y inspector) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspector, "inspector");
        this.f3698a = inspector;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (((com.onevcat.uniwebview.N) this.f3698a).l) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.onevcat.uniwebview.N n = (com.onevcat.uniwebview.N) this.f3698a;
        if (n.l && motionEvent != null && n.e.getHeight() > 0 && n.e.getWidth() > 0) {
            android.graphics.Bitmap bitmapA = n.a((android.graphics.Rect) null);
            if (motionEvent.getY() > 0.0f && motionEvent.getY() < bitmapA.getHeight() && motionEvent.getX() > 0.0f && motionEvent.getX() < bitmapA.getWidth()) {
                int pixel = bitmapA.getPixel((int) motionEvent.getX(), (int) motionEvent.getY());
                int iRed = android.graphics.Color.red(pixel);
                int iGreen = android.graphics.Color.green(pixel);
                int iBlue = android.graphics.Color.blue(pixel);
                int iAlpha = android.graphics.Color.alpha(pixel);
                com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message = "Clicking on color: (" + iRed + ", " + iGreen + ", " + iBlue + ") @ " + iAlpha;
                c1560l.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                c1560l.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message);
                if (iAlpha == 0) {
                    return super.onTouchEvent(motionEvent);
                }
            }
        }
        return ((com.onevcat.uniwebview.N) this.f3698a).p.onTouchEvent(motionEvent);
    }
}
