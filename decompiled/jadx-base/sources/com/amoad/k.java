package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f312a = a(com.amoad.AMoAdBuildConfig.DOMAIN_NAME + android.os.Build.MODEL);

    private static android.content.SharedPreferences a(android.content.Context context) {
        return context.getSharedPreferences(f312a, 0);
    }

    private static java.lang.String a(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            int length = bArrDigest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(java.lang.Integer.toHexString((bArrDigest[i] >> 4) & 15));
                stringBuffer.append(java.lang.Integer.toHexString(bArrDigest[i] & 15));
            }
            return stringBuffer.toString();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return str;
        }
    }

    public static final void a(android.content.Context context, java.lang.String str, int i) {
        a(context).edit().putInt("begin_index_".concat(java.lang.String.valueOf(str)), i).commit();
    }

    public static final int b(android.content.Context context, java.lang.String str, int i) {
        return a(context).getInt("begin_index_".concat(java.lang.String.valueOf(str)), i);
    }

    public static final void c(android.content.Context context, java.lang.String str, int i) {
        a(context).edit().putInt("interval_".concat(java.lang.String.valueOf(str)), i).commit();
    }

    public static final int d(android.content.Context context, java.lang.String str, int i) {
        return a(context).getInt("interval_".concat(java.lang.String.valueOf(str)), i);
    }
}
