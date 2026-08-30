package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f292a;
    final long b;
    boolean c;

    bk(com.amoad.bd bdVar) {
        this.f292a = bdVar.f271a;
        this.b = bdVar.b;
    }

    static java.util.List<com.amoad.bk> a(java.util.List<com.amoad.bd> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.amoad.bd> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.amoad.bk(it.next()));
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.amoad.bk>() { // from class: com.amoad.bk.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(com.amoad.bk bkVar, com.amoad.bk bkVar2) {
                return (int) (bkVar.b - bkVar2.b);
            }
        });
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
