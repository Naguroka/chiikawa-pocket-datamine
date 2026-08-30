package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdgz implements com.google.android.gms.internal.ads.zzbjp {
    private final java.lang.ref.WeakReference zza;
    private final java.lang.ref.WeakReference zzb;

    /* synthetic */ zzdgz(com.google.android.gms.internal.ads.zzdhb zzdhbVar, android.view.View view, com.google.android.gms.internal.ads.zzdha zzdhaVar) {
        this.zza = new java.lang.ref.WeakReference(zzdhbVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmK)).booleanValue()) {
            this.zzb = new java.lang.ref.WeakReference(view);
        } else {
            this.zzb = new java.lang.ref.WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzdhb zzdhbVar = (com.google.android.gms.internal.ads.zzdhb) this.zza.get();
        if (zzdhbVar == null) {
            return;
        }
        zzdhbVar.zzg.zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmK)).booleanValue()) {
            zzdhbVar.zzD.zza((android.view.View) this.zzb.get(), zzdhbVar.zzj);
        }
    }
}
