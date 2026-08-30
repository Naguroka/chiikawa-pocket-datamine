package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zab {
    public final java.util.Set zaa;

    public zab(java.util.Set set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set);
        this.zaa = java.util.Collections.unmodifiableSet(set);
    }
}
