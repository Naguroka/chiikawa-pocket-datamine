package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduf {
    private final android.content.Context zza;
    private final android.content.pm.ApplicationInfo zzb;
    private java.lang.String zze = "";
    private final int zzc = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzja)).intValue();
    private final int zzd = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjb)).intValue();

    public zzduf(android.content.Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
        java.lang.String strZzq;
        java.lang.String strEncodeToString;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.content.Context context = this.zza;
            java.lang.String str = this.zzb.packageName;
            com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            jSONObject.put("name", com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.zzb.packageName);
        com.google.android.gms.ads.internal.zzv.zzq();
        android.graphics.drawable.Drawable drawable = null;
        try {
            strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
        } catch (android.os.RemoteException unused2) {
            strZzq = null;
        }
        jSONObject.put("adMobAppId", strZzq);
        if (this.zze.isEmpty()) {
            try {
                drawable = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).second;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.zzc, this.zzd);
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(this.zzc, this.zzd, android.graphics.Bitmap.Config.ARGB_8888);
                drawable.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put(com.ironsource.y8.h.H0, this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
