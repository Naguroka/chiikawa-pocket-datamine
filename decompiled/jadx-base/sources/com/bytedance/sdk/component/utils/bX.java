package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> bg = new java.util.HashMap<>();

    public static java.util.ArrayList<java.lang.String> bg(android.content.Context context, java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = null;
        if (context != null && str != null) {
            java.lang.String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (bg.get(str) != null) {
                return bg.get(str);
            }
            arrayList = new java.util.ArrayList<>();
            try {
                for (android.content.pm.Signature signature : IL(context, packageName)) {
                    java.lang.String strBg = "error!";
                    if ("MD5".equals(str)) {
                        strBg = bg(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strBg = bg(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strBg = bg(signature, "SHA256");
                    }
                    arrayList.add(strBg);
                }
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.IL(e.toString());
            }
            bg.put(str, arrayList);
        }
        return arrayList;
    }

    public static java.lang.String bg(android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList<java.lang.String> arrayListBg = bg(context, "SHA1");
        if (arrayListBg != null && arrayListBg.size() != 0) {
            for (int i = 0; i < arrayListBg.size(); i++) {
                sb.append(arrayListBg.get(i));
                if (i < arrayListBg.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static android.content.pm.Signature[] IL(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.IL(e.toString());
            return null;
        }
    }

    private static java.lang.String bg(android.content.pm.Signature signature, java.lang.String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(java.lang.Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.IL(e.toString());
            return "error!";
        }
    }
}
