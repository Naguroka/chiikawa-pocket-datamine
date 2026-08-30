package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbm extends com.google.android.gms.internal.ads.zzapm {
    private final com.google.android.gms.internal.ads.zzcab zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbm(java.lang.String str, java.util.Map map, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        super(0, str, new com.google.android.gms.ads.internal.util.zzbl(zzcabVar));
        this.zza = zzcabVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    protected final com.google.android.gms.internal.ads.zzaps zzh(com.google.android.gms.internal.ads.zzapi zzapiVar) {
        return com.google.android.gms.internal.ads.zzaps.zzb(zzapiVar, com.google.android.gms.internal.ads.zzaqj.zzb(zzapiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    protected final /* bridge */ /* synthetic */ void zzo(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzapi zzapiVar = (com.google.android.gms.internal.ads.zzapi) obj;
        this.zzb.zzf(zzapiVar.zzc, zzapiVar.zza);
        byte[] bArr = zzapiVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzapiVar);
    }
}
