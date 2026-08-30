package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7d;
    protected static final double MIN_WIDTH_RATIO = 0.5d;

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static com.google.android.gms.ads.AdSize findClosestSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize, java.util.List<com.google.android.gms.ads.AdSize> list) {
        com.google.android.gms.ads.AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzh() && !adSize.zzi()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new com.google.android.gms.ads.AdSize(java.lang.Math.round(adSize.getWidthInPixels(context) / f), java.lang.Math.round(adSize.getHeightInPixels(context) / f));
            }
            for (com.google.android.gms.ads.AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    double d = ((double) width) * 0.5d;
                    double d2 = width2;
                    int height2 = adSize3.getHeight();
                    if (d <= d2 && width >= width2) {
                        if (adSize.zzi()) {
                            int iZza = adSize.zza();
                            if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhL)).intValue() <= width2) {
                                if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhM)).intValue() <= height2 && iZza >= height2) {
                                    if (adSize2 != null || adSize2.getWidth() * adSize2.getHeight() <= adSize3.getWidth() * adSize3.getHeight()) {
                                        adSize2 = adSize3;
                                    }
                                }
                            }
                        } else if (adSize.zzh()) {
                            if (adSize.zzb() >= height2) {
                                if (adSize2 != null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if (((double) height) * MIN_HEIGHT_RATIO <= height2 && height >= height2) {
                            if (adSize2 != null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
