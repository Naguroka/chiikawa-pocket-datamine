package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaa implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    zzaa(java.util.Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.tasks.Task) it.next()).getResult());
        }
        return arrayList;
    }
}
