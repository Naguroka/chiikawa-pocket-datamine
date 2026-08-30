package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdac implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener, com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcye, com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.internal.ads.zzcxs, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzdds {
    private final com.google.android.gms.internal.ads.zzczz zza = new com.google.android.gms.internal.ads.zzczz(this, null);

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzekn zzb;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzekr zzc;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzexm zzd;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzfar zze;

    private static void zzn(java.lang.Object obj, com.google.android.gms.internal.ads.zzdaa zzdaaVar) {
        if (obj != null) {
            zzdaaVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcys
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyt
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekr) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final java.lang.String str, final java.lang.String str2) {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczx
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zza();
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczy
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzb();
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzc();
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzdd();
            }
        });
        zzn(this.zzc, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekr) obj).zzdd();
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzdd();
            }
        });
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzdd();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzdo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzdp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(final com.google.android.gms.internal.ads.zzbvw zzbvwVar, final java.lang.String str, final java.lang.String str2) {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa(zzbvwVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzdq(zzbvwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(final int i) {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzds(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzh(zzuVar);
            }
        });
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzh(zzuVar);
            }
        });
        zzn(this.zzd, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczj
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzexm) obj).zzh(zzuVar);
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzczz zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfar) obj).zzq(zzeVar);
            }
        });
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzn(this.zzb, new com.google.android.gms.internal.ads.zzdaa() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzekn) obj).zzu();
            }
        });
    }
}
