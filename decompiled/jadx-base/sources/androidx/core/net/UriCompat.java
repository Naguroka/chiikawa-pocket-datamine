package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class UriCompat {
    private UriCompat() {
    }

    public static java.lang.String toSafeString(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        java.lang.String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char cCharAt = schemeSpecificPart.charAt(i);
                        if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                            sb.append(cCharAt);
                        } else {
                            sb.append('x');
                        }
                    }
                }
                return sb.toString();
            }
            if (scheme.equalsIgnoreCase(androidx.webkit.ProxyConfig.MATCH_HTTP) || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                schemeSpecificPart = "//" + (uri.getHost() != null ? uri.getHost() : "") + (uri.getPort() != -1 ? ":" + uri.getPort() : "") + "/...";
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(64);
        if (scheme != null) {
            sb2.append(scheme);
            sb2.append(':');
        }
        if (schemeSpecificPart != null) {
            sb2.append(schemeSpecificPart);
        }
        return sb2.toString();
    }
}
