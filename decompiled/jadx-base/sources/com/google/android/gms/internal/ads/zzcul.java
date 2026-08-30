package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcul implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzcul(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        final android.content.Context context = (android.content.Context) this.zza.zzb();
        final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZza = ((com.google.android.gms.internal.ads.zzchs) this.zzb).zza();
        final com.google.android.gms.internal.ads.zzfcj zzfcjVarZza = ((com.google.android.gms.internal.ads.zzcvk) this.zzc).zza();
        return new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzcuk
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfbo zzfboVar = (com.google.android.gms.internal.ads.zzfbo) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzfboVar.zzB);
                zzauVar.zzq(zzfboVar.zzC.toString());
                zzauVar.zzo(versionInfoParcelZza.afmaVersion);
                zzauVar.zzn(zzfcjVarZza.zzf);
                return zzauVar;
            }
        };
    }
}
