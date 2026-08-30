package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfcn {
    private final com.google.android.gms.internal.ads.zzava zza;

    public zzfcn(com.google.android.gms.internal.ads.zzava zzavaVar) {
        this.zza = zzavaVar;
    }

    private static final android.net.Uri zzb(android.net.Uri uri, java.lang.String str) throws com.google.android.gms.internal.ads.zzavb {
        if (uri != null) {
            try {
                try {
                    java.lang.String host = uri.getHost();
                    java.lang.String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new com.google.android.gms.internal.ads.zzavb("Parameter already exists: dc_ms");
                        }
                        java.lang.String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i = iIndexOf + 1;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(string.substring(0, i));
                            sb.append("dc_ms=");
                            sb.append(str);
                            sb.append(";");
                            sb.append((java.lang.CharSequence) string, i, string.length());
                            return android.net.Uri.parse(sb.toString());
                        }
                        java.lang.String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new java.lang.UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb2.append(";dc_ms=");
                        sb2.append(str);
                        sb2.append(";");
                        sb2.append((java.lang.CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return android.net.Uri.parse(sb2.toString());
                    }
                } catch (java.lang.UnsupportedOperationException unused) {
                    throw new com.google.android.gms.internal.ads.zzavb("Provided Uri is not in a valid state");
                }
            } catch (java.lang.NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new com.google.android.gms.internal.ads.zzavb("Query parameter already exists: ms");
        }
        if (uri == null) {
            throw new java.lang.UnsupportedOperationException();
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
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(string2.substring(0, i2));
        sb3.append("ms=");
        sb3.append(str);
        sb3.append(com.ironsource.y8.i.c);
        sb3.append((java.lang.CharSequence) string2, i2, string2.length());
        return android.net.Uri.parse(sb3.toString());
    }

    public final android.net.Uri zza(android.net.Uri uri, android.content.Context context, android.view.View view, android.app.Activity activity) throws com.google.android.gms.internal.ads.zzavb {
        try {
            return zzb(uri, this.zza.zzc().zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new com.google.android.gms.internal.ads.zzavb("Provided Uri is not in a valid state");
        }
    }
}
