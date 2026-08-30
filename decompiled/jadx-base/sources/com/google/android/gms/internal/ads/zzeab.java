package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeab implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzffr zza;

    zzeab(com.google.android.gms.internal.ads.zzeac zzeacVar, com.google.android.gms.internal.ads.zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get offline signal database: ".concat(java.lang.String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            this.zza.zza((android.database.sqlite.SQLiteDatabase) obj);
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error executing function on offline signal database: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
    }
}
