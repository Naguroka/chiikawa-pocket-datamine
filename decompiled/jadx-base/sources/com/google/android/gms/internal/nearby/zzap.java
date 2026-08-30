package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzap extends com.google.android.gms.internal.nearby.zzef {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> zza;
    private final java.util.Set<java.lang.String> zzb = new androidx.collection.ArraySet();

    zzap(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> listenerHolder) {
        this.zza = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzg(com.google.android.gms.internal.nearby.zzfi zzfiVar) {
        if (zzfiVar.zzd() != null) {
            return zzfiVar.zza() == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(zzfiVar.zza());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzb(com.google.android.gms.internal.nearby.zzfg zzfgVar) {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzal(this, zzfgVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzc(com.google.android.gms.internal.nearby.zzfi zzfiVar) {
        if (!zzg(zzfiVar)) {
            this.zzb.add(zzfiVar.zza());
        }
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzam(this, zzfiVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzd(com.google.android.gms.internal.nearby.zzfk zzfkVar) {
        this.zzb.remove(zzfkVar.zza());
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzan(this, zzfkVar));
    }

    final synchronized void zze() {
        java.util.Iterator<java.lang.String> it = this.zzb.iterator();
        while (it.hasNext()) {
            this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzao(this, it.next()));
        }
        this.zzb.clear();
    }
}
