package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjo {
    private final androidx.collection.SimpleArrayMap zza;

    zzjo(androidx.collection.SimpleArrayMap simpleArrayMap) {
        this.zza = simpleArrayMap;
    }

    public final java.lang.String zza(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        androidx.collection.SimpleArrayMap simpleArrayMap = uri != null ? (androidx.collection.SimpleArrayMap) this.zza.get(uri.toString()) : null;
        if (simpleArrayMap == null) {
            return null;
        }
        return (java.lang.String) simpleArrayMap.get("".concat(str3));
    }
}
