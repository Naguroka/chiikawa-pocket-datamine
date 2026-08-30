package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfkr {
    private final com.google.android.gms.internal.ads.zzflc zza;
    private final android.webkit.WebView zzb;
    private final java.util.List zzc = new java.util.ArrayList();
    private final java.util.Map zzd = new java.util.HashMap();
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzfks zzg;

    private zzfkr(com.google.android.gms.internal.ads.zzflc zzflcVar, android.webkit.WebView webView, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzfks zzfksVar) {
        this.zza = zzflcVar;
        this.zzb = webView;
        this.zzg = zzfksVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static com.google.android.gms.internal.ads.zzfkr zzb(com.google.android.gms.internal.ads.zzflc zzflcVar, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.google.android.gms.internal.ads.zzfmk.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.google.android.gms.internal.ads.zzfkr(zzflcVar, webView, null, null, str, str2, com.google.android.gms.internal.ads.zzfks.HTML);
    }

    public static com.google.android.gms.internal.ads.zzfkr zzc(com.google.android.gms.internal.ads.zzflc zzflcVar, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfmk.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new com.google.android.gms.internal.ads.zzfkr(zzflcVar, webView, null, null, str, "", com.google.android.gms.internal.ads.zzfks.JAVASCRIPT);
    }

    public final android.webkit.WebView zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzfks zzd() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzflc zze() {
        return this.zza;
    }

    public final java.lang.String zzf() {
        return this.zzf;
    }

    public final java.lang.String zzg() {
        return this.zze;
    }

    public final java.util.List zzh() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    public final java.util.Map zzi() {
        return java.util.Collections.unmodifiableMap(this.zzd);
    }
}
