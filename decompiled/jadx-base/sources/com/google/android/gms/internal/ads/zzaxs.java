package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxs {
    private final java.util.Map zza = new java.util.HashMap();

    public final java.util.concurrent.atomic.AtomicReference zza(java.lang.String str) {
        synchronized (this) {
            if (!this.zza.containsKey(str)) {
                this.zza.put(str, new java.util.concurrent.atomic.AtomicReference());
            }
        }
        return (java.util.concurrent.atomic.AtomicReference) this.zza.get(str);
    }
}
