package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmz extends com.google.android.gms.internal.ads.zzfmv {
    public zzfmz(com.google.android.gms.internal.ads.zzfmo zzfmoVar, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j) {
        super(zzfmoVar, hashSet, jSONObject, j);
    }

    private final void zzc(java.lang.String str) {
        com.google.android.gms.internal.ads.zzflk zzflkVarZza = com.google.android.gms.internal.ads.zzflk.zza();
        if (zzflkVarZza != null) {
            for (com.google.android.gms.internal.ads.zzfkt zzfktVar : zzflkVarZza.zzc()) {
                if (this.zza.contains(zzfktVar.zzh())) {
                    zzfktVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfmw
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(java.lang.String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
