package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzag extends com.google.android.gms.internal.nearby.zzdy {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> zza;
    private final java.util.Set<java.lang.String> zzb = new androidx.collection.ArraySet();
    private final java.util.Set<java.lang.String> zzc = new androidx.collection.ArraySet();

    zzag(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder) {
        this.zza = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final synchronized void zzb(com.google.android.gms.internal.nearby.zzew zzewVar) {
        this.zzb.add(zzewVar.zza());
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzaa(this, zzewVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final synchronized void zzc(com.google.android.gms.internal.nearby.zzfc zzfcVar) {
        this.zzb.remove(zzfcVar.zza());
        com.google.android.gms.common.api.Status statusZzG = com.google.android.gms.internal.nearby.zzbf.zzG(zzfcVar.zzb());
        if (statusZzG.isSuccess()) {
            this.zzc.add(zzfcVar.zza());
        }
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzab(this, zzfcVar, statusZzG));
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final synchronized void zzd(com.google.android.gms.internal.nearby.zzfe zzfeVar) {
        this.zzc.remove(zzfeVar.zza());
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzac(this, zzfeVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzdz
    public final void zze(com.google.android.gms.internal.nearby.zzeu zzeuVar) {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzad(this, zzeuVar));
    }

    final synchronized void zzf() {
        java.util.Iterator<java.lang.String> it = this.zzb.iterator();
        while (it.hasNext()) {
            this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzae(this, it.next()));
        }
        this.zzb.clear();
        java.util.Iterator<java.lang.String> it2 = this.zzc.iterator();
        while (it2.hasNext()) {
            this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzaf(this, it2.next()));
        }
        this.zzc.clear();
    }
}
