package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhq {
    private final com.google.android.gms.internal.ads.zzfvf zza;
    private final com.google.android.gms.internal.ads.zzho zzb;
    private com.google.android.gms.internal.ads.zzhp zzc;
    private float zze = 1.0f;
    private int zzd = 0;

    public zzhq(final android.content.Context context, android.os.Handler handler, com.google.android.gms.internal.ads.zzhp zzhpVar) {
        this.zza = com.google.android.gms.internal.ads.zzfvj.zza(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzhm
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                android.media.AudioManager audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            }
        });
        this.zzc = zzhpVar;
        this.zzb = new com.google.android.gms.internal.ads.zzho(this, handler);
    }

    private final void zze() {
        int i = this.zzd;
        if (i == 1 || i == 0 || com.google.android.gms.internal.ads.zzei.zza >= 26) {
            return;
        }
        ((android.media.AudioManager) this.zza.zza()).abandonAudioFocus(this.zzb);
    }

    private final void zzf(int i) {
        com.google.android.gms.internal.ads.zzhp zzhpVar = this.zzc;
        if (zzhpVar != null) {
            int iZzS = com.google.android.gms.internal.ads.zzjp.zzS(i);
            com.google.android.gms.internal.ads.zzjp zzjpVar = ((com.google.android.gms.internal.ads.zzjl) zzhpVar).zza;
            zzjpVar.zzae(zzjpVar.zzu(), i, iZzS);
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.zze != f) {
            this.zze = f;
            com.google.android.gms.internal.ads.zzhp zzhpVar = this.zzc;
            if (zzhpVar != null) {
                ((com.google.android.gms.internal.ads.zzjl) zzhpVar).zza.zzab();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        zzg(0);
        return 1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
        zzg(0);
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzhq zzhqVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzhqVar.zzg(4);
                return;
            } else {
                zzhqVar.zzf(0);
                zzhqVar.zzg(3);
                return;
            }
        }
        if (i == -1) {
            zzhqVar.zzf(-1);
            zzhqVar.zze();
            zzhqVar.zzg(1);
        } else if (i == 1) {
            zzhqVar.zzg(2);
            zzhqVar.zzf(1);
        } else {
            com.google.android.gms.internal.ads.zzdo.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
