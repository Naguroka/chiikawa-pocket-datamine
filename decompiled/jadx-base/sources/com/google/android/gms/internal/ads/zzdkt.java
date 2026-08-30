package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdkt {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final com.google.android.gms.common.util.Clock zzb;
    private final java.util.concurrent.Executor zzc;

    public zzdkt(com.google.android.gms.ads.internal.util.zzbo zzboVar, com.google.android.gms.common.util.Clock clock, java.util.concurrent.Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final android.graphics.Bitmap zzc(byte[] bArr, android.graphics.BitmapFactory.Options options) {
        long jElapsedRealtime = this.zzb.elapsedRealtime();
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.zzb.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            com.google.android.gms.ads.internal.util.zze.zza("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j + " on ui thread: " + (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ android.graphics.Bitmap zza(double d, boolean z, com.google.android.gms.internal.ads.zzapi zzapiVar) {
        byte[] bArr = zzapiVar.zzb;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfY)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - java.lang.Integer.numberOfLeadingZeros((i - 1) / ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfZ)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String str, final double d, final boolean z) {
        return com.google.android.gms.internal.ads.zzgch.zzm(this.zza.zza(str), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zza(d, z, (com.google.android.gms.internal.ads.zzapi) obj);
            }
        }, this.zzc);
    }
}
