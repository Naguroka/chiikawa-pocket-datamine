package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzche implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcha zza;

    public zzche(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        this.zza = zzchaVar;
    }

    public static android.content.Context zzc(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        android.content.Context contextZzb = zzchaVar.zzb();
        com.google.android.gms.internal.ads.zzhez.zzb(contextZzb);
        return contextZzb;
    }

    public final android.content.Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza);
    }
}
