package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzflb {
    NATIVE(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final java.lang.String zze;

    zzflb(java.lang.String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zze;
    }
}
