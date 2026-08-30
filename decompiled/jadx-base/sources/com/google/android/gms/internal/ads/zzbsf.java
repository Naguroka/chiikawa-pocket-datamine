package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsf extends com.google.android.gms.internal.ads.zzbsi {
    private final java.util.Map zza;
    private final android.content.Context zzb;

    public zzbsf(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        super(zzcexVar, "storePicture");
        this.zza = map;
        this.zzb = zzcexVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new com.google.android.gms.internal.ads.zzbbt(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        java.lang.String str = (java.lang.String) this.zza.get("iurl");
        if (android.text.TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!android.webkit.URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(java.lang.String.valueOf(str)));
            return;
        }
        java.lang.String lastPathSegment = android.net.Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzv.zzq();
        if (android.text.TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(java.lang.String.valueOf(lastPathSegment)));
            return;
        }
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzb);
        builderZzL.setTitle(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s1) : "Save image");
        builderZzL.setMessage(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builderZzL.setPositiveButton(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s3) : com.google.common.net.HttpHeaders.ACCEPT, new com.google.android.gms.internal.ads.zzbsd(this, str, lastPathSegment));
        builderZzL.setNegativeButton(resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s4) : "Decline", new com.google.android.gms.internal.ads.zzbse(this));
        builderZzL.create().show();
    }
}
