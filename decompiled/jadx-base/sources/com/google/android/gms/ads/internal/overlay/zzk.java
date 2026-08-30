package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zza;

    /* synthetic */ zzk(com.google.android.gms.ads.internal.overlay.zzm zzmVar, com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.Bitmap bitmapZza = com.google.android.gms.ads.internal.zzv.zzv().zza(java.lang.Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (bitmapZza != null) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zza;
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.zzc.zzo;
            boolean z = zzlVar.zzd;
            float f = zzlVar.zze;
            android.app.Activity activity = zzmVar.zzb;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), bitmapZza);
            } else {
                try {
                    android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapZza, bitmapZza.getWidth(), bitmapZza.getHeight(), false);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    android.renderscript.RenderScript renderScriptCreate = android.renderscript.RenderScript.create(activity);
                    android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
                    android.renderscript.Allocation allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    android.renderscript.Allocation allocationCreateFromBitmap2 = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (java.lang.RuntimeException unused) {
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), bitmapZza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
