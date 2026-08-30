package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzez extends com.google.android.gms.ads.internal.client.zzdg {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzez(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final java.lang.String zze() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final java.lang.String zzf() throws android.os.RemoteException {
        return this.zzb;
    }
}
