package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LT {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"CrCy7lrq6K7x8XfVc2fNdD07yQrJARzJ", "2MxjV7VZ3w9mO7JRBJp513kJ", "rmUL5G3ocM8QXPjdZtuh6zbaNsDgif4G", "2yiBwXDvjLEglhUZ76UGTCKc6ACbYUli", "XTHqKjDvfaB7R0kK8woS2JMLPY9kkXKh", "8qNbzU9VaySgM9v1BVYKE0up", "2SD8", "5eH9HzTGPv5UTtfJbfYv5z17pUBai2pZ"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 27, 15, 17, -3, 9, -2, -1, 40, 41, 55, 39, 54, 45, 52, 56, 45, 51, 50, -24, -27, -33};
    }

    static {
        A03();
    }

    public static java.lang.String A01(int i, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A00(15, 4, 57), i);
            jSONObject.put(A00(19, 11, 99), str);
            org.json.JSONObject errorMsgObj = jSONObject.put(A00(30, 3, 18), str2);
            errorMsgObj.toString();
        } catch (org.json.JSONException unused) {
        }
        java.lang.String string = jSONObject.toString();
        java.lang.String[] strArr = A01;
        if (strArr[2].charAt(8) == strArr[4].charAt(8)) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "VgY5LYgsJRJxHdOPZ6f9tdfdxgenUCo4";
        return string;
    }

    public static java.lang.String A02(java.lang.String str) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String strA00 = A00(0, 0, 114);
        if (zIsEmpty) {
            return strA00;
        }
        java.lang.String fileExtensionFromUrl = android.webkit.MimeTypeMap.getFileExtensionFromUrl(str);
        if (android.text.TextUtils.isEmpty(fileExtensionFromUrl)) {
            return strA00;
        }
        java.lang.String extension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return extension;
    }

    public static boolean A04(java.lang.String str) {
        return A00(0, 15, 74).equalsIgnoreCase(A02(str));
    }
}
