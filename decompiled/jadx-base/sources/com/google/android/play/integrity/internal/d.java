package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static final java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.play.integrity.internal.f fVar = (com.google.android.play.integrity.internal.f) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("event_type", fVar.a());
            bundle.putLong("event_timestamp", fVar.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i, java.util.List list) {
        list.add(com.google.android.play.integrity.internal.f.c(i, java.lang.System.currentTimeMillis()));
    }
}
