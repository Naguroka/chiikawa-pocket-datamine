package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfna extends com.google.android.gms.internal.ads.zzfmv {
    public zzfna(com.google.android.gms.internal.ads.zzfmo zzfmoVar, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j) {
        super(zzfmoVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        if (com.google.android.gms.internal.ads.zzfmg.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        onPostExecute((java.lang.String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfmw
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(java.lang.String str) {
        com.google.android.gms.internal.ads.zzflk zzflkVarZza;
        if (!android.text.TextUtils.isEmpty(str) && (zzflkVarZza = com.google.android.gms.internal.ads.zzflk.zza()) != null) {
            for (com.google.android.gms.internal.ads.zzfkt zzfktVar : zzflkVarZza.zzc()) {
                if (this.zza.contains(zzfktVar.zzh())) {
                    zzfktVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
