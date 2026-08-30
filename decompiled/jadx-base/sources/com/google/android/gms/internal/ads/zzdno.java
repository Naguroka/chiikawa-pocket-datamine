package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdno extends com.google.android.gms.internal.ads.zzdmy implements com.google.android.gms.internal.ads.zzdds {
    private com.google.android.gms.internal.ads.zzdds zza;

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzdd() {
        com.google.android.gms.internal.ads.zzdds zzddsVar = this.zza;
        if (zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.internal.ads.zzbif zzbifVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, com.google.android.gms.internal.ads.zzdds zzddsVar) {
        super.zzh(zzaVar, zzbifVar, zzrVar, zzbihVar, zzacVar);
        this.zza = zzddsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzu() {
        com.google.android.gms.internal.ads.zzdds zzddsVar = this.zza;
        if (zzddsVar != null) {
            zzddsVar.zzu();
        }
    }
}
