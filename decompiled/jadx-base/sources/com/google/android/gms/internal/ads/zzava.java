package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzava {
    private static final java.lang.String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final java.lang.String zzb = "ad.doubleclick.net";
    private final java.lang.String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final com.google.android.gms.internal.ads.zzauv zzd;

    @java.lang.Deprecated
    public zzava(com.google.android.gms.internal.ads.zzauv zzauvVar) {
        this.zzd = zzauvVar;
    }

    private final android.net.Uri zzg(android.net.Uri uri, java.lang.String str) throws com.google.android.gms.internal.ads.zzavb {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.zzb) && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new com.google.android.gms.internal.ads.zzavb("Parameter already exists: dc_ms");
                    }
                    java.lang.String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i = iIndexOf + 1;
                        return android.net.Uri.parse(string.substring(0, i) + "dc_ms=" + str + ";" + string.substring(i));
                    }
                    java.lang.String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return android.net.Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (java.lang.NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new com.google.android.gms.internal.ads.zzavb("Query parameter already exists: ms");
            }
            java.lang.String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = iIndexOf3 + 1;
            return android.net.Uri.parse(string2.substring(0, i2) + "ms=" + str + com.ironsource.y8.i.c + string2.substring(i2));
        } catch (java.lang.UnsupportedOperationException unused2) {
            throw new com.google.android.gms.internal.ads.zzavb("Provided Uri is not in a valid state");
        }
    }

    @java.lang.Deprecated
    public final android.net.Uri zza(android.net.Uri uri, android.content.Context context, android.view.View view, android.app.Activity activity) throws com.google.android.gms.internal.ads.zzavb {
        try {
            return zzg(uri, this.zzd.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new com.google.android.gms.internal.ads.zzavb("Provided Uri is not in a valid state");
        }
    }

    @java.lang.Deprecated
    public final android.net.Uri zzb(android.net.Uri uri, android.content.Context context) throws com.google.android.gms.internal.ads.zzavb {
        return zzg(uri, this.zzd.zzf(context));
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzauv zzc() {
        return this.zzd;
    }

    @java.lang.Deprecated
    public final void zzd(android.view.MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(android.net.Uri uri) {
        if (zzf(uri)) {
            java.lang.String[] strArr = zza;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(android.net.Uri uri) {
        uri.getClass();
        try {
            java.lang.String host = uri.getHost();
            java.lang.String[] strArr = this.zzc;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return false;
    }
}
