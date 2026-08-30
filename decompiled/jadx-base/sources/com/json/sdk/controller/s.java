package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
final class s {
    private static final java.lang.String b = "MD5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3350a;

    s(java.lang.String str) {
        this.f3350a = str;
    }

    static java.lang.String a() {
        return java.util.UUID.randomUUID().toString();
    }

    private java.lang.String a(java.lang.String str) {
        try {
            return com.json.fm.a(str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return b(str);
        }
    }

    private java.lang.String a(byte[] bArr) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b2 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private java.lang.String b(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(b);
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f3350a));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    java.lang.String b() {
        return this.f3350a;
    }
}
