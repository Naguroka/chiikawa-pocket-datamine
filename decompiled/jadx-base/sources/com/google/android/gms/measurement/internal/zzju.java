package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public enum zzju {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final java.lang.String zzf;

    zzju(java.lang.String str) {
        this.zzf = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zzf;
    }
}
