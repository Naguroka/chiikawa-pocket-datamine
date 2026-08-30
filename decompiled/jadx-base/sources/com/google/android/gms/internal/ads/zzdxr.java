package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxr extends com.google.android.gms.internal.ads.zzbvb {
    private final com.google.android.gms.internal.ads.zzcab zza;
    private final com.google.android.gms.internal.ads.zzbvk zzb;

    zzdxr(com.google.android.gms.internal.ads.zzcab zzcabVar, com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        this.zza = zzcabVar;
        this.zzb = zzbvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new com.google.android.gms.internal.ads.zzdyi(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        this.zza.zzc(new com.google.android.gms.internal.ads.zzdyi(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvkVar));
    }
}
