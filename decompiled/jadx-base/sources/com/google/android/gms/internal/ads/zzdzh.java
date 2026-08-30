package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdzh implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvk zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvc zzb;

    zzdzh(com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        this.zza = zzbvkVar;
        this.zzb = zzbvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle;
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) obj;
        try {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
                this.zzb.zzf(parcelFileDescriptor);
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcl)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(com.google.android.gms.internal.ads.zzdre.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
