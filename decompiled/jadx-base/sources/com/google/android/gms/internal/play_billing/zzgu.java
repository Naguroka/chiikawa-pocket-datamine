package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgu implements com.google.android.gms.internal.play_billing.zzgi {
    private final com.google.android.gms.internal.play_billing.zzgl zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzgu(com.google.android.gms.internal.play_billing.zzgl zzglVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zza = zzglVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi
    public final com.google.android.gms.internal.play_billing.zzgl zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    final java.lang.String zzd() {
        return this.zzb;
    }

    final java.lang.Object[] zze() {
        return this.zzc;
    }
}
