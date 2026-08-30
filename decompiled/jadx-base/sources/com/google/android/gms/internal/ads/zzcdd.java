package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcdd implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcde zze;

    zzcdd(com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcdeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        map.put("src", this.zza);
        if (!android.text.TextUtils.isEmpty(this.zzb)) {
            map.put("cachedSrc", this.zzb);
        }
        switch (this.zzc) {
            case "interrupted":
                b = 3;
                break;
            case "badUrl":
                b = 8;
                break;
            case "inProgress":
                b = 2;
                break;
            case "downloadTimeout":
                b = 9;
                break;
            case "contentLengthMissing":
                b = 0;
                break;
            case "playerFailed":
                b = 5;
                break;
            case "sizeExceeded":
                b = 11;
                break;
            case "externalAbort":
                b = 10;
                break;
            case "noop":
                b = 4;
                break;
            case "error":
                b = 1;
                break;
            case "expireFailed":
                b = 6;
                break;
            case "noCacheDir":
                b = 7;
                break;
            default:
                b = -1;
                break;
        }
        java.lang.String str = "internal";
        switch (b) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = "policy";
                break;
        }
        map.put("type", str);
        map.put("reason", this.zzc);
        if (!android.text.TextUtils.isEmpty(this.zzd)) {
            map.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, this.zzd);
        }
        com.google.android.gms.internal.ads.zzcde.zze(this.zze, "onPrecacheEvent", map);
    }
}
