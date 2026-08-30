package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzet {
    private final java.lang.Object zza;
    private final int zzb;

    zzet(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzet)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzet zzetVar = (com.google.android.gms.internal.play_billing.zzet) obj;
        return this.zza == zzetVar.zza && this.zzb == zzetVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
