package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdhf implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzdhd zza;

    public zzdhf(com.google.android.gms.internal.ads.zzdhd zzdhdVar) {
        this.zza = zzdhdVar;
    }

    public static org.json.JSONObject zza(com.google.android.gms.internal.ads.zzdhd zzdhdVar) {
        org.json.JSONObject jSONObjectZzb = zzdhdVar.zzb();
        com.google.android.gms.internal.ads.zzhez.zzb(jSONObjectZzb);
        return jSONObjectZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        return zza(this.zza);
    }

    public final org.json.JSONObject zzc() {
        return zza(this.zza);
    }
}
