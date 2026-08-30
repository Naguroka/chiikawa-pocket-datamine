package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfut extends com.google.android.gms.internal.ads.zzfva {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfty zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfut(com.google.android.gms.internal.ads.zzfuu zzfuuVar, com.google.android.gms.internal.ads.zzfvc zzfvcVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.ads.zzfty zzftyVar) {
        super(zzfvcVar, charSequence);
        this.zza = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    final int zzd(int i) {
        java.lang.CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        com.google.android.gms.internal.ads.zzfun.zzb(i, length, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
