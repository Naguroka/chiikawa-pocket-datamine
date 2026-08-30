package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzayg {
    private final java.lang.String zza;
    private final org.json.JSONObject zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final boolean zze;

    public zzayg(java.lang.String str, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str2, org.json.JSONObject jSONObject, boolean z, boolean z2) {
        this.zzd = versionInfoParcel.afmaVersion;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z2;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzd;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final org.json.JSONObject zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }
}
