package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeib implements com.google.android.gms.internal.ads.zzecy {
    private final com.google.android.gms.internal.ads.zzejf zza;
    private final com.google.android.gms.internal.ads.zzdpm zzb;

    zzeib(com.google.android.gms.internal.ads.zzejf zzejfVar, com.google.android.gms.internal.ads.zzdpm zzdpmVar) {
        this.zza = zzejfVar;
        this.zzb = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    public final com.google.android.gms.internal.ads.zzecz zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.internal.ads.zzbrd zzbrdVarZzb;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbM)).booleanValue()) {
            try {
                zzbrdVarZzb = this.zzb.zzb(str);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Coundn't create RTB adapter: ", e);
                zzbrdVarZzb = null;
            }
        } else {
            zzbrdVarZzb = this.zza.zza(str);
        }
        if (zzbrdVarZzb == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzecz(zzbrdVarZzb, new com.google.android.gms.internal.ads.zzees(), str);
    }
}
