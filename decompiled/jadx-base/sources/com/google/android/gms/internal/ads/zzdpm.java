package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpm {
    private final com.google.android.gms.internal.ads.zzfdf zza;
    private final com.google.android.gms.internal.ads.zzdpj zzb;

    zzdpm(com.google.android.gms.internal.ads.zzfdf zzfdfVar, com.google.android.gms.internal.ads.zzdpj zzdpjVar) {
        this.zza = zzfdfVar;
        this.zzb = zzdpjVar;
    }

    final com.google.android.gms.internal.ads.zzbpe zza() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpe zzbpeVarZzb = this.zza.zzb();
        if (zzbpeVarZzb != null) {
            return zzbpeVarZzb;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unexpected call to adapter creator.");
        throw new android.os.RemoteException();
    }

    public final com.google.android.gms.internal.ads.zzbrd zzb(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbrd zzbrdVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbrdVarZzc);
        return zzbrdVarZzc;
    }

    public final com.google.android.gms.internal.ads.zzfdh zzc(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.internal.ads.zzbph zzbphVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbphVarZzb = new com.google.android.gms.internal.ads.zzbqf(new com.google.ads.mediation.admob.AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbphVarZzb = new com.google.android.gms.internal.ads.zzbqf(new com.google.android.gms.internal.ads.zzbrw());
            } else {
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        java.lang.String string = jSONObject.getString("class_name");
                        if (zzbpeVarZza.zze(string)) {
                            zzbphVarZzb = zzbpeVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbphVarZzb = zzbpeVarZza.zzd(string) ? zzbpeVarZza.zzb(string) : zzbpeVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid custom event.", e);
                        zzbphVarZzb = zzbpeVarZza.zzb(str);
                    }
                } else {
                    zzbphVarZzb = zzbpeVarZza.zzb(str);
                }
            }
            com.google.android.gms.internal.ads.zzfdh zzfdhVar = new com.google.android.gms.internal.ads.zzfdh(zzbphVarZzb);
            this.zzb.zzc(str, zzfdhVar);
            return zzfdhVar;
        } catch (java.lang.Throwable th) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjk)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new com.google.android.gms.internal.ads.zzfcq(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
