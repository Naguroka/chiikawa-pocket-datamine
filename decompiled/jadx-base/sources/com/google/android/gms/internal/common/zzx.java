package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzx extends com.google.android.gms.internal.common.zzz {
    final /* synthetic */ com.google.android.gms.internal.common.zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(com.google.android.gms.internal.common.zzaa zzaaVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.common.zzr zzrVar) {
        super(zzaaVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzd(int i) {
        java.lang.CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        com.google.android.gms.internal.common.zzv.zzb(i, length, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (this.zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
