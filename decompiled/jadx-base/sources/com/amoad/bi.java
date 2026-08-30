package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.ref.WeakReference<android.view.View> f281a;
    final java.lang.String b;
    final com.amoad.i.b c;

    bi(android.view.View view, java.lang.String str, com.amoad.i.b bVar) {
        if (view != null) {
            view.setTag(Integer.MAX_VALUE, str);
        }
        this.f281a = new java.lang.ref.WeakReference<>(view);
        this.b = str;
        this.c = bVar;
    }

    final int a() {
        boolean zContains = false;
        try {
            android.view.View view = this.f281a.get();
            if (view != null && b()) {
                if (!view.isShown()) {
                    return 1;
                }
                android.view.View view2 = this.f281a.get();
                if (view2 != null) {
                    int[] iArr = new int[2];
                    view2.getLocationInWindow(iArr);
                    android.graphics.Rect rect = new android.graphics.Rect();
                    view2.getWindowVisibleDisplayFrame(rect);
                    zContains = rect.contains(iArr[0], iArr[1]);
                }
                return zContains ? 3 : 2;
            }
            return 0;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    final boolean b() {
        android.view.View view = this.f281a.get();
        if (view != null) {
            return android.text.TextUtils.equals(view.getTag(Integer.MAX_VALUE).toString(), this.b);
        }
        return this.c != null;
    }
}
