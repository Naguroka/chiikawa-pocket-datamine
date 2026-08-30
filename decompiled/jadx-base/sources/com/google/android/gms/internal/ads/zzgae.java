package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgae implements java.io.FilenameFilter {
    private final java.util.regex.Pattern zza;

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return this.zza.matcher(str).matches();
    }

    public zzgae(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
