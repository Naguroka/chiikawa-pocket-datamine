package com.bytedance.adsdk.bg.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static boolean IL(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean bX(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean bg(char c) {
        return c == ' ';
    }

    public static boolean eqN(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }
}
