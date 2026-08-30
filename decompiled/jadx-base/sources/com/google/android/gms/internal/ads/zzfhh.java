package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfhh implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzfhk zzb;
    private java.lang.String zzc;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzfbz zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private java.util.concurrent.Future zzh;
    private final java.util.List zza = new java.util.ArrayList();
    private int zzi = 2;
    private com.google.android.gms.internal.ads.zzfhm zzd = com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;

    zzfhh(com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        this.zzb = zzfhkVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zza(com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            java.util.List list = this.zza;
            zzfgwVar.zzj();
            list.add(zzfgwVar);
            java.util.concurrent.Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = com.google.android.gms.internal.ads.zzbzw.zzd.schedule(this, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziG)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zzb(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() && com.google.android.gms.internal.ads.zzfhg.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zzd(java.util.ArrayList arrayList) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(com.google.android.gms.ads.AdFormat.BANNER.name())) {
                this.zzi = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(com.google.android.gms.ads.AdFormat.INTERSTITIAL.name())) {
                this.zzi = 4;
            } else if (arrayList.contains(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE) || arrayList.contains(com.google.android.gms.ads.AdFormat.NATIVE.name())) {
                this.zzi = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(com.google.android.gms.ads.AdFormat.REWARDED.name())) {
                this.zzi = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzi = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL.name())) {
                this.zzi = 6;
            }
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zze(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zzf(android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(bundle);
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zzg(com.google.android.gms.internal.ads.zzfbz zzfbzVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            this.zzf = zzfbzVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            java.util.concurrent.Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            for (com.google.android.gms.internal.ads.zzfgw zzfgwVar : this.zza) {
                int i = this.zzi;
                if (i != 2) {
                    zzfgwVar.zzn(i);
                }
                if (!android.text.TextUtils.isEmpty(this.zzc)) {
                    zzfgwVar.zze(this.zzc);
                }
                if (!android.text.TextUtils.isEmpty(this.zze) && !zzfgwVar.zzl()) {
                    zzfgwVar.zzd(this.zze);
                }
                com.google.android.gms.internal.ads.zzfbz zzfbzVar = this.zzf;
                if (zzfbzVar != null) {
                    zzfgwVar.zzb(zzfbzVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                    if (zzeVar != null) {
                        zzfgwVar.zza(zzeVar);
                    }
                }
                zzfgwVar.zzf(this.zzd);
                this.zzb.zzb(zzfgwVar.zzm());
            }
            this.zza.clear();
        }
    }

    public final synchronized com.google.android.gms.internal.ads.zzfhh zzi(int i) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
