package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tn {
    public static boolean b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        for (java.lang.String str2 : str.split("\\.")) {
            if (!c(str2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[a-zA-Z\\d_-]*$");
    }

    public static java.lang.Boolean a(int i, java.lang.String str) {
        if (!a(str)) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("~", -1);
        java.util.List listAsList = java.util.Arrays.asList(strArrSplit[1].split("\\."));
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        boolean zContains = listAsList.contains(strValueOf);
        if (strArrSplit[0].equals("1")) {
            return java.lang.Boolean.valueOf(zContains);
        }
        if (zContains) {
            return java.lang.Boolean.TRUE;
        }
        if (java.util.Arrays.asList(strArrSplit[2].split("\\.")).contains(strValueOf)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public static boolean a(java.lang.String str, int i) {
        return str != null && i >= 0 && str.length() > i && str.charAt(i) == '1';
    }

    public static boolean a(java.lang.String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        java.lang.String[] strArrSplit = str.split("~", -1);
        if (strArrSplit.length == 2 && "1".equals(strArrSplit[0])) {
            return java.util.regex.Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[1]);
        }
        return strArrSplit.length == 3 && "2".equals(strArrSplit[0]) && java.util.regex.Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[1]) && strArrSplit[2].length() >= 3 && strArrSplit[2].startsWith("dv.") && java.util.regex.Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[2].substring(3));
    }
}
