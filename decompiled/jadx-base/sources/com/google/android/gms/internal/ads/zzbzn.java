package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzn {
    final java.lang.String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final java.lang.Object zzj = new java.lang.Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzbzn(java.lang.String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzk = zzgVar;
    }

    private final void zzi() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbes.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final android.os.Bundle zzb(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle;
        synchronized (this.zzj) {
            bundle = new android.os.Bundle();
            if (!this.zzk.zzN()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            android.content.Context contextZza = com.google.android.gms.internal.ads.zzbvu.zza(context);
            int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE, "android");
            boolean z = false;
            if (identifier == 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == contextZza.getPackageManager().getActivityInfo(new android.content.ComponentName(contextZza.getPackageName(), com.google.android.gms.ads.AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to fetch AdActivity theme");
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
            bundle.putInt("consent_form_action_identifier", zza());
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        android.os.Bundle bundle;
        synchronized (this.zzj) {
            long jZzd = this.zzk.zzd();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (this.zzb == -1) {
                if (jCurrentTimeMillis - jZzd > ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbd)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzk.zzc();
                }
                this.zzb = j;
                this.zza = j;
            } else {
                this.zza = j;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdI)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                this.zzc++;
                int i = this.zzd + 1;
                this.zzd = i;
                if (i == 0) {
                    this.zze = 0L;
                    this.zzk.zzz(jCurrentTimeMillis);
                } else {
                    this.zze = jCurrentTimeMillis - this.zzk.zze();
                }
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
