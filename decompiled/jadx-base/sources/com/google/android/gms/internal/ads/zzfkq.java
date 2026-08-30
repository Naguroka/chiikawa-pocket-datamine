package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfkq {
    private final com.google.android.gms.internal.ads.zzflb zza;
    private final com.google.android.gms.internal.ads.zzflb zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzfku zzd;
    private final com.google.android.gms.internal.ads.zzfkx zze;

    private zzfkq(com.google.android.gms.internal.ads.zzfku zzfkuVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar, com.google.android.gms.internal.ads.zzflb zzflbVar, com.google.android.gms.internal.ads.zzflb zzflbVar2, boolean z) {
        this.zzd = zzfkuVar;
        this.zze = zzfkxVar;
        this.zza = zzflbVar;
        if (zzflbVar2 == null) {
            this.zzb = com.google.android.gms.internal.ads.zzflb.NONE;
        } else {
            this.zzb = zzflbVar2;
        }
        this.zzc = z;
    }

    public static com.google.android.gms.internal.ads.zzfkq zza(com.google.android.gms.internal.ads.zzfku zzfkuVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar, com.google.android.gms.internal.ads.zzflb zzflbVar, com.google.android.gms.internal.ads.zzflb zzflbVar2, boolean z) {
        com.google.android.gms.internal.ads.zzfmk.zzc(zzfkuVar, "CreativeType is null");
        com.google.android.gms.internal.ads.zzfmk.zzc(zzfkxVar, "ImpressionType is null");
        com.google.android.gms.internal.ads.zzfmk.zzc(zzflbVar, "Impression owner is null");
        if (zzflbVar == com.google.android.gms.internal.ads.zzflb.NONE) {
            throw new java.lang.IllegalArgumentException("Impression owner is none");
        }
        if (zzfkuVar == com.google.android.gms.internal.ads.zzfku.DEFINED_BY_JAVASCRIPT && zzflbVar == com.google.android.gms.internal.ads.zzflb.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfkxVar == com.google.android.gms.internal.ads.zzfkx.DEFINED_BY_JAVASCRIPT && zzflbVar == com.google.android.gms.internal.ads.zzflb.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new com.google.android.gms.internal.ads.zzfkq(zzfkuVar, zzfkxVar, zzflbVar, zzflbVar2, z);
    }

    public final org.json.JSONObject zzb() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject, "impressionOwner", this.zza);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject, "mediaEventsOwner", this.zzb);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject, "creativeType", this.zzd);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject, "impressionType", this.zze);
        com.google.android.gms.internal.ads.zzfmg.zze(jSONObject, "isolateVerificationScripts", java.lang.Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
