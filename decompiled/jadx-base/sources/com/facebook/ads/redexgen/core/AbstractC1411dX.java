package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1411dX {
    public static final android.graphics.Point A00 = new android.graphics.Point();

    public static boolean A00(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3) {
        if (!view.isShown()) {
            rect.setEmpty();
            rect2.setEmpty();
            return false;
        }
        if (!view.getGlobalVisibleRect(rect, A00)) {
            rect2.setEmpty();
            rect.setEmpty();
            return false;
        }
        if (!rect.intersect(rect3)) {
            rect2.setEmpty();
            rect.setEmpty();
            return false;
        }
        rect2.set(A00.x, A00.y, A00.x + view.getWidth(), A00.y + view.getHeight());
        return true;
    }
}
