package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfdb {
    private final java.util.regex.Pattern zza;

    public zzfdb() {
        java.util.regex.Pattern patternCompile;
        try {
            patternCompile = java.util.regex.Pattern.compile((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgH));
        } catch (java.util.regex.PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.zza = patternCompile;
    }

    public final java.lang.String zza(java.lang.String str) {
        java.util.regex.Pattern pattern = this.zza;
        if (pattern == null || str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
