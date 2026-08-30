package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzft implements java.util.Iterator {
    private final java.util.Iterator zza;

    public zzft(java.util.Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
        return entry.getValue() instanceof com.google.android.gms.internal.play_billing.zzfv ? new com.google.android.gms.internal.play_billing.zzfs(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
