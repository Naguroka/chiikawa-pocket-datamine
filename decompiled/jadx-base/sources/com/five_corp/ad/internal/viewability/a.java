package com.five_corp.ad.internal.viewability;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2114a;
    public final int b;
    public final double c;
    public final boolean d;
    public final android.view.View e;
    public android.view.View f;
    public final java.lang.Object g = new java.lang.Object();
    public boolean h = true;
    public final com.five_corp.ad.internal.util.h i;

    static {
        com.five_corp.ad.internal.viewability.a.class.toString();
    }

    public a(android.content.Context context, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.view.J j) {
        this.f2114a = context;
        this.b = lVar.e.d;
        com.five_corp.ad.internal.context.t tVar = lVar.d;
        this.c = tVar.c.f;
        this.d = tVar.b.g;
        this.i = new com.five_corp.ad.internal.util.h();
        this.e = j;
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    public final double a(java.util.HashSet hashSet, android.view.View view) {
        android.content.Context context = this.f2114a;
        double d = 0.0d;
        if (view.isShown() && ((android.os.PowerManager) context.getSystemService("power")).isScreenOn() && !((android.app.KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode() && view.getWindowVisibility() == 0) {
            java.lang.Object parent = view;
            while (parent != null && (parent instanceof android.view.View)) {
                android.view.View view2 = (android.view.View) parent;
                if (view2.getAlpha() > 0.0f) {
                    parent = view2.getParent();
                }
            }
            boolean z = this.d;
            int height = view.getHeight() * view.getWidth();
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.View view3 = view;
            if (view3.getGlobalVisibleRect(rect)) {
                if (z) {
                    d = ((double) ((rect.right - rect.left) * (rect.bottom - rect.top))) / ((double) height);
                } else {
                    double scaleY = 1.0d;
                    while (view3 != null) {
                        android.view.ViewParent parent2 = view3.getParent();
                        if (parent2 != null && (parent2 instanceof android.view.ViewGroup) && !hashSet.contains(parent2)) {
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent2;
                            int i = 1;
                            int i2 = 0;
                            int i3 = 0;
                            while (i3 < viewGroup.getChildCount()) {
                                android.view.View childAt = viewGroup.getChildAt(i3);
                                if (childAt == view3) {
                                    i = i2;
                                } else if (childAt.isShown() && childAt.getAlpha() > d && ((!(childAt instanceof android.view.ViewGroup) || ((android.view.ViewGroup) childAt).getChildCount() != 0) && view3.getZ() <= childAt.getZ() && ((view3.getZ() != childAt.getZ() || i == 0) && !hashSet.contains(childAt)))) {
                                    android.graphics.Rect rect2 = new android.graphics.Rect();
                                    if (childAt.getGlobalVisibleRect(rect2) && rect.right > rect2.left && rect.bottom > rect2.top && rect2.right > rect.left && rect2.bottom > rect.top) {
                                        android.graphics.Rect rect3 = new android.graphics.Rect(i2, i2, i2, i2);
                                        if (rect.left < rect2.left) {
                                            rect3 = new android.graphics.Rect(rect.left, rect.top, rect2.left, rect.bottom);
                                        }
                                        if (rect2.right < rect.right) {
                                            android.graphics.Rect rect4 = new android.graphics.Rect(rect2.right, rect.top, rect.right, rect.bottom);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect4.right - rect4.left) * (rect4.bottom - rect4.top)) {
                                                rect3 = rect4;
                                            }
                                        }
                                        if (rect2.bottom < rect.bottom) {
                                            android.graphics.Rect rect5 = new android.graphics.Rect(rect.left, rect2.bottom, rect.right, rect.bottom);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect5.right - rect5.left) * (rect5.bottom - rect5.top)) {
                                                rect3 = rect5;
                                            }
                                        }
                                        if (rect.top < rect2.top) {
                                            android.graphics.Rect rect6 = new android.graphics.Rect(rect.left, rect.top, rect.right, rect2.top);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect6.right - rect6.left) * (rect6.bottom - rect6.top)) {
                                                rect = rect6;
                                            } else {
                                                rect = rect3;
                                            }
                                        } else {
                                            rect = rect3;
                                        }
                                    }
                                }
                                i3++;
                                hashSet = hashSet;
                                d = 0.0d;
                                i2 = 0;
                            }
                        }
                        scaleY *= (double) (view3.getScaleY() * view3.getScaleX());
                        java.lang.Object parent3 = view3.getParent();
                        if (!(parent3 instanceof android.view.View)) {
                            break;
                        }
                        view3 = (android.view.View) parent3;
                        d = 0.0d;
                    }
                    double d2 = ((double) height) * scaleY;
                    d = 0.0d;
                    if (d2 > 0.0d) {
                        d = ((double) ((rect.right - rect.left) * (rect.bottom - rect.top))) / d2;
                    }
                }
            }
            if (this.c + d >= 1.0d) {
                return 1.0d;
            }
            return d;
        }
        return 0.0d;
    }

    public final void a(android.view.View view, int i) {
        synchronized (this.g) {
            com.five_corp.ad.internal.util.h hVar = this.i;
            hVar.getClass();
            java.util.HashSet hashSet = new java.util.HashSet();
            hVar.a((java.util.AbstractCollection) hashSet);
            if (hashSet.contains(view)) {
                return;
            }
            if (this.b == 2 && i == 0) {
                return;
            }
            this.i.f2086a.add(new java.lang.ref.WeakReference(view));
        }
    }

    public final void a(com.five_corp.ad.internal.view.C1519l c1519l) {
        this.f = c1519l;
    }
}
