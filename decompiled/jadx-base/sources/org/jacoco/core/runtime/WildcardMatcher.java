package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public class WildcardMatcher {
    private final java.util.regex.Pattern pattern;

    public WildcardMatcher(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\:");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() * 2);
        int length = strArrSplit.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            java.lang.String str2 = strArrSplit[i];
            if (z) {
                sb.append('|');
            }
            sb.append('(').append(toRegex(str2)).append(')');
            i++;
            z = true;
        }
        this.pattern = java.util.regex.Pattern.compile(sb.toString());
    }

    private static java.lang.CharSequence toRegex(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() * 2);
        for (char c : str.toCharArray()) {
            if (c == '*') {
                sb.append(".*");
            } else if (c == '?') {
                sb.append(".");
            } else {
                sb.append(java.util.regex.Pattern.quote(java.lang.String.valueOf(c)));
            }
        }
        return sb;
    }

    public boolean matches(java.lang.String str) {
        return this.pattern.matcher(str).matches();
    }
}
