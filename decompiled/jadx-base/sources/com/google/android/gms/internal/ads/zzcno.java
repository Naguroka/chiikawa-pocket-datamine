package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcno implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzcno(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set setEmptySet = ((org.json.JSONObject) this.zzb.zzb()) == null ? java.util.Collections.emptySet() : java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk((com.google.android.gms.internal.ads.zzcnh) this.zza.zzb(), com.google.android.gms.internal.ads.zzffh.zzc()));
        com.google.android.gms.internal.ads.zzhez.zzb(setEmptySet);
        return setEmptySet;
    }
}
