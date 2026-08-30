package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcvm extends com.google.android.gms.ads.internal.client.zzdx {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final long zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzedb zzh;
    private final android.os.Bundle zzi;

    public zzcvm(com.google.android.gms.internal.ads.zzfbo zzfboVar, java.lang.String str, com.google.android.gms.internal.ads.zzedb zzedbVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, java.lang.String str2) {
        java.lang.String string = null;
        this.zzb = zzfboVar == null ? null : zzfboVar.zzab;
        this.zzc = str2;
        this.zzd = zzfbrVar == null ? null : zzfbrVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfboVar != null) {
            try {
                string = zzfboVar.zzv.getString("class_name");
            } catch (org.json.JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzedbVar.zzc();
        this.zzh = zzedbVar;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgE)).booleanValue() || zzfbrVar == null) {
            this.zzi = new android.os.Bundle();
        } else {
            this.zzi = zzfbrVar.zzk;
        }
        this.zzg = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzje)).booleanValue() || zzfbrVar == null || android.text.TextUtils.isEmpty(zzfbrVar.zzi)) ? "" : zzfbrVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final java.lang.String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final android.os.Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final com.google.android.gms.ads.internal.client.zzw zzf() {
        com.google.android.gms.internal.ads.zzedb zzedbVar = this.zzh;
        if (zzedbVar != null) {
            return zzedbVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.util.List zzj() {
        return this.zze;
    }

    public final java.lang.String zzk() {
        return this.zzd;
    }
}
