package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbix implements com.google.android.gms.internal.ads.zzbjp {
    zzbix() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        com.google.android.gms.internal.ads.zzfsx zzfsxVarZzl = com.google.android.gms.internal.ads.zzfsy.zzl();
        zzfsxVarZzl.zzb((java.lang.String) map.get("appId"));
        zzfsxVarZzl.zzh(zzcexVar.getWidth());
        zzfsxVarZzl.zzg(zzcexVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfsxVarZzl.zzd(java.lang.Integer.parseInt((java.lang.String) map.get("gravityX")) | java.lang.Integer.parseInt((java.lang.String) map.get("gravityY")));
        } else {
            zzfsxVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfsxVarZzl.zze(java.lang.Float.parseFloat((java.lang.String) map.get("verticalMargin")));
        } else {
            zzfsxVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfsxVarZzl.zza((java.lang.String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzk().zzj(zzcexVar, zzfsxVarZzl.zzi());
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
