package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcjo implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcjn zza;

    public zzcjo(com.google.android.gms.internal.ads.zzcjn zzcjnVar) {
        this.zza = zzcjnVar;
    }

    public static com.google.android.gms.ads.internal.zza zzc(com.google.android.gms.internal.ads.zzcjn zzcjnVar) {
        return new com.google.android.gms.ads.internal.zza(new com.google.android.gms.internal.ads.zzccp(), new com.google.android.gms.internal.ads.zzcbk());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza);
    }
}
