package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class jb {
    public static final int d = 1;
    public static final int e = 2;
    public static final java.lang.String f = "C38FB23A402222A0C17D34A92F971D1F";
    public static final java.lang.String g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";
    public static final java.lang.String h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
    public static final int i = 32;
    private static final com.json.jb j = new com.json.jb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2817a = "";
    private java.lang.String b = "";
    private java.lang.String c = "";

    private java.lang.String a(java.lang.String str, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }

    public static com.json.jb b() {
        return j;
    }

    public java.lang.String a() throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(this.c)) {
            try {
                this.c = com.json.bk.a(d(), g);
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                java.lang.String str = "Session key encryption exception: " + e2.getLocalizedMessage();
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
                throw new org.json.JSONException(str);
            }
        }
        return this.c;
    }

    public java.lang.String c() {
        if (android.text.TextUtils.isEmpty(this.f2817a)) {
            this.f2817a = f;
        }
        return this.f2817a;
    }

    public synchronized java.lang.String d() {
        if (android.text.TextUtils.isEmpty(this.b)) {
            this.b = a(h, 32);
        }
        return this.b;
    }
}
