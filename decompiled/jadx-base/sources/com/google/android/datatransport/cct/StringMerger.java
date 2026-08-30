package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes4.dex */
public final class StringMerger {
    static java.lang.String mergeStrings(java.lang.String str, java.lang.String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new java.lang.IllegalArgumentException("Invalid input received");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
