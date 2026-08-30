package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: JavaVersion.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1666a;

    private static int a(java.lang.String str) {
        try {
            java.lang.String[] strArrSplit = str.split("[._]");
            int i = java.lang.Integer.parseInt(strArrSplit[0]);
            return (i != 1 || strArrSplit.length <= 1) ? i : java.lang.Integer.parseInt(strArrSplit[1]);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(java.lang.String str) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!java.lang.Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return java.lang.Integer.parseInt(sb.toString());
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public static int a() {
        return f1666a;
    }

    public static boolean b() {
        return f1666a >= 9;
    }

    static {
        java.lang.String property = java.lang.System.getProperty("java.version");
        int iA = a(property);
        if (iA == -1) {
            iA = b(property);
        }
        if (iA == -1) {
            iA = 6;
        }
        f1666a = iA;
    }
}
