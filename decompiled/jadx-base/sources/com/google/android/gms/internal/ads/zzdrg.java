package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrg {
    public static android.os.Bundle zza(android.util.Pair... pairArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                android.util.Pair pair = pairArr[i];
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) pair.first) && ((java.lang.Long) pair.second).longValue() > 0) {
                    bundle.putLong((java.lang.String) pair.first, ((java.lang.Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
