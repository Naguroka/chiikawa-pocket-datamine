package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
enum zzan {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    zzan(char c) {
        this.zzl = c;
    }

    public static com.google.android.gms.measurement.internal.zzan zzb(char c) {
        for (com.google.android.gms.measurement.internal.zzan zzanVar : values()) {
            if (zzanVar.zzl == c) {
                return zzanVar;
            }
        }
        return UNSET;
    }
}
