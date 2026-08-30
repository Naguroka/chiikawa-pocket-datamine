package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzftv extends com.google.android.gms.internal.ads.zzftu {
    private final char zza;

    zzftv(char c) {
        this.zza = c;
    }

    public final java.lang.String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.zza;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + java.lang.String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}
