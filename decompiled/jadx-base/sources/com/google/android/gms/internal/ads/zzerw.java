package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerw implements com.google.android.gms.internal.ads.zzetq {
    private final com.google.android.gms.internal.ads.zzfcj zza;
    private final android.content.pm.PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzerw(com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.content.pm.PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfcjVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzbfl zzbflVar = this.zza.zzi;
        if (zzbflVar == null || zzbflVar.zzi == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbflVar.zzj);
        bundle.putInt("sccg_dir", this.zza.zzi.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.util.ArrayList arrayList = this.zza.zzg;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcuvVar.zzb);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzbfl zzbflVar;
        org.json.JSONArray jSONArrayOptJSONArray;
        java.lang.String str;
        java.util.ArrayList<java.lang.String> arrayList = this.zza.zzg;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzcuvVar.zza.putInt("native_version", 0);
            return;
        }
        android.os.Bundle bundle = zzcuvVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zza.zzh);
        com.google.android.gms.internal.ads.zzbfl zzbflVar2 = this.zza.zzi;
        if (zzbflVar2 != null) {
            int i = zzbflVar2.zza;
            java.lang.String str2 = com.ironsource.y8.h.C;
            if (i > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i2 = this.zza.zzi.zzh;
                if (i2 == 1) {
                    str = "any";
                } else if (i2 == 2) {
                    str = com.ironsource.y8.h.C;
                } else if (i2 != 3) {
                    str = i2 != 4 ? "unknown" : "square";
                } else {
                    str = com.ironsource.y8.h.D;
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i3 = this.zza.zzi.zzc;
            if (i3 == 0) {
                str2 = "any";
            } else if (i3 == 1) {
                str2 = com.ironsource.y8.h.D;
            } else if (i3 != 2) {
                str2 = "unknown";
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", this.zza.zzi.zzd);
            bundle.putBoolean("use_custom_mute", this.zza.zzi.zzg);
            zzc(zzcuvVar.zza);
        }
        android.content.pm.PackageInfo packageInfo = this.zzb;
        int i4 = packageInfo != null ? packageInfo.versionCode : 0;
        if (i4 > this.zzc.zza()) {
            this.zzc.zzq();
            this.zzc.zzt(i4);
        }
        org.json.JSONObject jSONObjectZzn = this.zzc.zzn();
        java.lang.String string = null;
        if (jSONObjectZzn != null && (jSONArrayOptJSONArray = jSONObjectZzn.optJSONArray(this.zza.zzf)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!android.text.TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i5 = this.zza.zzk;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        com.google.android.gms.internal.ads.zzblz zzblzVar = this.zza.zzb;
        if (zzblzVar != null) {
            if (android.text.TextUtils.isEmpty(zzblzVar.zzc)) {
                int i6 = zzblzVar.zza;
                java.lang.String str3 = androidx.media3.extractor.text.ttml.TtmlNode.TAG_P;
                if (i6 >= 2) {
                    int i7 = zzblzVar.zzd;
                    if (i7 == 2 || i7 != 3) {
                        str3 = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE;
                    }
                } else {
                    int i8 = zzblzVar.zzb;
                    if (i8 == 1) {
                        str3 = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE;
                    } else if (i8 != 2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad video aspect ratio " + i8 + " is wrong.");
                        str3 = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE;
                    }
                }
                bundle.putString("ia_var", str3);
            } else {
                bundle.putString("ad_tag", zzblzVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zza.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlJ)).booleanValue() || (zzbflVar = this.zza.zzi) == null) {
            return;
        }
        if (zzbflVar.zzf != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("startMuted", this.zza.zzi.zzf.zza);
            bundle2.putBoolean("clickToExpandRequested", this.zza.zzi.zzf.zzc);
            bundle2.putBoolean("customControlsRequested", this.zza.zzi.zzf.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", this.zza.zzi.zzb);
        bundle.putInt("preferred_ad_choices_position", this.zza.zzi.zze);
    }
}
