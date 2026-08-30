package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaa {
    private final com.google.android.gms.ads.AdSize[] zza;
    private final java.lang.String zzb;

    public zzaa(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.ads.R.styleable.AdsAttrs);
        java.lang.String string = typedArrayObtainAttributes.getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adSize);
        java.lang.String string2 = typedArrayObtainAttributes.getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adSizes);
        boolean z = !android.text.TextUtils.isEmpty(string);
        boolean z2 = !android.text.TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.zza = zzc(string);
        } else {
            if (z || !z2) {
                if (z) {
                    typedArrayObtainAttributes.recycle();
                    throw new java.lang.IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                }
                typedArrayObtainAttributes.recycle();
                throw new java.lang.IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
            this.zza = zzc(string2);
        }
        java.lang.String string3 = typedArrayObtainAttributes.getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adUnitId);
        this.zzb = string3;
        typedArrayObtainAttributes.recycle();
        if (android.text.TextUtils.isEmpty(string3)) {
            throw new java.lang.IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static com.google.android.gms.ads.AdSize[] zzc(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        com.google.android.gms.ads.AdSize[] adSizeArr = new com.google.android.gms.ads.AdSize[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                java.lang.String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    adSizeArr[i] = new com.google.android.gms.ads.AdSize("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : java.lang.Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : java.lang.Integer.parseInt(strArrSplit2[1]));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(java.lang.String.valueOf(strTrim)));
                }
            } else if (com.json.mediationsdk.l.f2983a.equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.FULL_BANNER;
            } else if (com.json.mediationsdk.l.d.equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.LEADERBOARD;
            } else if (com.json.mediationsdk.l.g.equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(strTrim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.FLUID;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(java.lang.String.valueOf(strTrim)));
                }
                adSizeArr[i] = com.google.android.gms.ads.AdSize.zza;
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(java.lang.String.valueOf(str)));
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.AdSize[] zzb(boolean z) {
        if (z || this.zza.length == 1) {
            return this.zza;
        }
        throw new java.lang.IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
