package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzab implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    zzab(java.util.Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zza);
        return com.google.android.gms.tasks.Tasks.forResult(arrayList);
    }
}
