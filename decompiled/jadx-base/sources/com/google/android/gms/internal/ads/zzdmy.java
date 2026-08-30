package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzdmy implements com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzbif, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzbih, com.google.android.gms.ads.internal.overlay.zzac {
    private com.google.android.gms.ads.internal.client.zza zza;
    private com.google.android.gms.internal.ads.zzbif zzb;
    private com.google.android.gms.ads.internal.overlay.zzr zzc;
    private com.google.android.gms.internal.ads.zzbih zzd;
    private com.google.android.gms.ads.internal.overlay.zzac zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final synchronized void zza(java.lang.String str, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzbif zzbifVar = this.zzb;
        if (zzbifVar != null) {
            zzbifVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbih zzbihVar = this.zzd;
        if (zzbihVar != null) {
            zzbihVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdo() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdp();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzds(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zze;
        if (zzacVar != null) {
            zzacVar.zzg();
        }
    }

    protected final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.internal.ads.zzbif zzbifVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar) {
        this.zza = zzaVar;
        this.zzb = zzbifVar;
        this.zzc = zzrVar;
        this.zzd = zzbihVar;
        this.zze = zzacVar;
    }
}
