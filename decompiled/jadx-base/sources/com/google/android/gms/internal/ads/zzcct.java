package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcct implements com.google.android.gms.internal.ads.zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) obj;
        com.google.android.gms.internal.ads.zzcfz zzcfzVarZzq = zzcbsVar.zzq();
        if (zzcfzVarZzq == null) {
            try {
                com.google.android.gms.internal.ads.zzcfz zzcfzVar = new com.google.android.gms.internal.ads.zzcfz(zzcbsVar, java.lang.Float.parseFloat((java.lang.String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbsVar.zzC(zzcfzVar);
                zzcfzVarZzq = zzcfzVar;
            } catch (java.lang.NullPointerException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (java.lang.NumberFormatException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = java.lang.Float.parseFloat((java.lang.String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = java.lang.Float.parseFloat((java.lang.String) map.get("currentTime"));
        int i = java.lang.Integer.parseInt((java.lang.String) map.get("playbackState"));
        if (i < 0 || i > 3) {
            i = 0;
        }
        java.lang.String str = (java.lang.String) map.get("aspectRatio");
        float f3 = android.text.TextUtils.isEmpty(str) ? 0.0f : java.lang.Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzcfzVarZzq.zzc(f2, f, i, zEquals, f3);
    }
}
