package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzccs implements com.google.android.gms.internal.ads.zzbjp {
    private boolean zza;

    private static int zzb(android.content.Context context, java.util.Map map, java.lang.String str, int i) {
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, java.lang.Integer.parseInt(str2));
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(com.google.android.gms.internal.ads.zzcbg zzcbgVar, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("minBufferMs");
        java.lang.String str2 = (java.lang.String) map.get("maxBufferMs");
        java.lang.String str3 = (java.lang.String) map.get("bufferForPlaybackMs");
        java.lang.String str4 = (java.lang.String) map.get("bufferForPlaybackAfterRebufferMs");
        java.lang.String str5 = (java.lang.String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbgVar.zzB(java.lang.Integer.parseInt(str));
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj(java.lang.String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcbgVar.zzA(java.lang.Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbgVar.zzy(java.lang.Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbgVar.zzz(java.lang.Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbgVar.zzD(java.lang.Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        int iMin;
        int iMin2;
        java.lang.Integer numValueOf;
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from video GMSG.");
            return;
        }
        java.lang.Integer numValueOf2 = map.containsKey("playerId") ? java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get("playerId"))) : null;
        java.lang.Integer numZzb = zzcbsVar.zzo() != null ? zzcbsVar.zzo().zzb() : null;
        int i = 0;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi(java.lang.String.format(java.util.Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZzb));
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            java.lang.String str2 = (java.lang.String) map.get("color");
            if (android.text.TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbsVar.setBackgroundColor(android.graphics.Color.parseColor(str2));
                return;
            } catch (java.lang.IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            java.lang.String str3 = (java.lang.String) map.get("color");
            if (android.text.TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbsVar.zzB(android.graphics.Color.parseColor(str3));
                return;
            } catch (java.lang.IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            java.lang.String str4 = (java.lang.String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No MIME types specified for decoder properties inspection.");
                java.util.HashMap map2 = new java.util.HashMap();
                map2.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcbsVar.zzd("onVideoEvent", map2);
                return;
            }
            java.util.HashMap map3 = new java.util.HashMap();
            java.lang.String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i < length) {
                java.lang.String str5 = strArrSplit[i];
                map3.put(str5, com.google.android.gms.ads.internal.util.zzcj.zza(str5.trim()));
                i++;
            }
            java.util.HashMap map4 = new java.util.HashMap();
            map4.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            zzcbsVar.zzd("onVideoEvent", map4);
            return;
        }
        com.google.android.gms.internal.ads.zzcbh zzcbhVarZzo = zzcbsVar.zzo();
        if (zzcbhVarZzo == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals(com.ironsource.y8.h.L);
        if (zEquals || zEquals2) {
            android.content.Context context = zzcbsVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdW)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcbsVar.zzh() : java.lang.Math.min(iZzb3, zzcbsVar.zzh());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + iZzb3 + ", videoHost.getVideoBoundingWidth() " + zzcbsVar.zzh() + ", x " + iZzb + ".");
                }
                iMin = java.lang.Math.min(iZzb3, zzcbsVar.zzh() - iZzb);
            }
            int iZzb4 = zzb(context, map, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, -1);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdW)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcbsVar.zzg() : java.lang.Math.min(iZzb4, zzcbsVar.zzg());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + iZzb4 + ", videoHost.getVideoBoundingHeight() " + zzcbsVar.zzg() + ", y " + iZzb2 + ".");
                }
                iMin2 = java.lang.Math.min(iZzb4, zzcbsVar.zzg() - iZzb2);
            }
            try {
                i = java.lang.Integer.parseInt((java.lang.String) map.get("player"));
            } catch (java.lang.NumberFormatException unused3) {
            }
            int i2 = i;
            boolean z = java.lang.Boolean.parseBoolean((java.lang.String) map.get("spherical"));
            if (!zEquals || zzcbhVarZzo.zza() != null) {
                zzcbhVarZzo.zzc(iZzb, iZzb2, iMin, iMin2);
                return;
            }
            zzcbhVarZzo.zzd(iZzb, iZzb2, iMin, iMin2, i2, z, new com.google.android.gms.internal.ads.zzcbr((java.lang.String) map.get("flags")));
            com.google.android.gms.internal.ads.zzcbg zzcbgVarZza = zzcbhVarZzo.zza();
            if (zzcbgVarZza != null) {
                zzc(zzcbgVarZza, map);
                return;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzcfz zzcfzVarZzq = zzcbsVar.zzq();
        if (zzcfzVarZzq != null) {
            if (str.equals("timeupdate")) {
                java.lang.String str6 = (java.lang.String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfzVarZzq.zzt(java.lang.Float.parseFloat(str6));
                    return;
                } catch (java.lang.NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcfzVarZzq.zzu();
                return;
            }
        }
        com.google.android.gms.internal.ads.zzcbg zzcbgVarZza2 = zzcbhVarZzo.zza();
        if (zzcbgVarZza2 == null) {
            java.util.HashMap map5 = new java.util.HashMap();
            map5.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzcbsVar.zzd("onVideoEvent", map5);
            return;
        }
        if (str.equals(com.json.z8.CLICK)) {
            android.content.Context context2 = zzcbsVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcbgVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            java.lang.String str7 = (java.lang.String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcbgVarZza2.zzw((int) (java.lang.Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (java.lang.NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcbgVarZza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcbgVarZza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcbgVarZza2.zzr(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcbgVarZza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (java.lang.Boolean.parseBoolean((java.lang.String) map.get("muted"))) {
                zzcbgVarZza2.zzs();
                return;
            } else {
                zzcbgVarZza2.zzI();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcbgVarZza2.zzu();
            return;
        }
        if (str.equals("play")) {
            zzcbgVarZza2.zzv();
            return;
        }
        if (str.equals(com.json.j5.v)) {
            zzcbgVarZza2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            java.lang.String str8 = (java.lang.String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get("periodicReportIntervalMs")));
                } catch (java.lang.NumberFormatException unused6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(java.lang.String.valueOf((java.lang.String) map.get("periodicReportIntervalMs"))));
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            java.lang.String[] strArr = {str8};
            java.lang.String str9 = (java.lang.String) map.get("demuxed");
            if (str9 != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str9);
                    java.lang.String[] strArr2 = new java.lang.String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (org.json.JSONException unused7) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new java.lang.String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzcbsVar.zzA(numValueOf.intValue());
            }
            zzcbgVarZza2.zzE(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            android.content.Context context3 = zzcbsVar.getContext();
            zzcbgVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzcbsVar.zzdg();
            this.zza = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                zzcbgVarZza2.zzn();
                return;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        java.lang.String str10 = (java.lang.String) map.get("volume");
        if (str10 == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcbgVarZza2.zzG(java.lang.Float.parseFloat(str10));
        } catch (java.lang.NumberFormatException unused8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
