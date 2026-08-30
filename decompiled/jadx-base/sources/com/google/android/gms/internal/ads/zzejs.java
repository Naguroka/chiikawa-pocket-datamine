package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzejs implements com.google.android.gms.internal.ads.zzelc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzejt zza;

    zzejs(com.google.android.gms.internal.ads.zzejt zzejtVar) {
        this.zza = zzejtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcom zzcomVar = (com.google.android.gms.internal.ads.zzcom) obj;
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzejt zzejtVar = this.zza;
            if (zzejtVar.zzi != null) {
                zzejtVar.zzi.zzb();
            }
            this.zza.zzi = zzcomVar;
            this.zza.zzi.zzk();
        }
    }
}
