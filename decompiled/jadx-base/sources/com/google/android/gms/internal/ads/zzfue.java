package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfue extends com.google.android.gms.internal.ads.zzfua implements java.io.Serializable {
    private final java.util.regex.Pattern zza;

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final com.google.android.gms.internal.ads.zzftz zza(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.ads.zzfud(this.zza.matcher(charSequence));
    }

    zzfue(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
