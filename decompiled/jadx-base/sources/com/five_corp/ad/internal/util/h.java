package com.five_corp.ad.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f2086a = new java.util.ArrayList();

    public final void a(java.lang.Object obj) {
        this.f2086a.add(new java.lang.ref.WeakReference(obj));
    }

    public final void a(java.util.AbstractCollection abstractCollection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.ref.WeakReference weakReference : this.f2086a) {
            java.lang.Object obj = weakReference.get();
            if (obj != null) {
                arrayList.add(weakReference);
                abstractCollection.add(obj);
            }
        }
        this.f2086a = arrayList;
    }
}
