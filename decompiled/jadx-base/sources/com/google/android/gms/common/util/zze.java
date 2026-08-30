package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zze {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static java.lang.String zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zza.matcher(str);
        java.lang.StringBuilder sb = null;
        int iEnd = 0;
        while (matcher.find()) {
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            int iStart = matcher.start();
            int i = iStart;
            while (i >= 0 && str.charAt(i) == '\\') {
                i--;
            }
            if ((iStart - i) % 2 != 0) {
                int i2 = java.lang.Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((java.lang.CharSequence) str, iEnd, matcher.start());
                if (i2 == 92) {
                    sb.append("\\\\");
                } else {
                    sb.append(java.lang.Character.toChars(i2));
                }
                iEnd = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb.append((java.lang.CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb.toString();
    }
}
