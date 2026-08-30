package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxq extends com.google.android.gms.internal.ads.zzbvb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdxs zza;

    protected zzdxq(com.google.android.gms.internal.ads.zzdxs zzdxsVar) {
        this.zza = zzdxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        com.google.android.gms.internal.ads.zzdxs zzdxsVar = this.zza;
        zzdxsVar.zza.zzc(new com.google.android.gms.internal.ads.zzdyi(autoCloseInputStream, zzdxsVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        this.zza.zza.zzc(new com.google.android.gms.internal.ads.zzdyi(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvkVar));
    }
}
