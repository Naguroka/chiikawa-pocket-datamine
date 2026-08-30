package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfs implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (((com.google.android.gms.internal.play_billing.zzfv) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_billing.zzgl) {
            return ((com.google.android.gms.internal.play_billing.zzfv) this.zza.getValue()).zzc((com.google.android.gms.internal.play_billing.zzgl) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final com.google.android.gms.internal.play_billing.zzfv zza() {
        return (com.google.android.gms.internal.play_billing.zzfv) this.zza.getValue();
    }
}
