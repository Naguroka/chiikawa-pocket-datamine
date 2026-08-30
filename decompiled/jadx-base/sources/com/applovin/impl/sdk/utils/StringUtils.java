package com.applovin.impl.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class StringUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f1330a = "0123456789abcdef".toCharArray();

    class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    private static java.lang.String a(java.lang.String str, java.lang.Integer num) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str.getBytes(com.adjust.sdk.Constants.ENCODING));
            java.lang.String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, java.lang.Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static void addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, android.text.style.ClickableSpan clickableSpan, boolean z) {
        java.util.regex.Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannable.setSpan(clickableSpan, iStart, iEnd, 33);
            if (z) {
                spannable.setSpan(new android.text.style.StyleSpan(1), iStart, iEnd, 256);
            }
        }
    }

    public static java.lang.String appendQueryParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static java.lang.String appendQueryParameters(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        if (android.text.TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z) {
            java.util.TreeMap treeMap = new java.util.TreeMap(new com.applovin.impl.sdk.utils.StringUtils.a());
            treeMap.putAll(map);
            map = treeMap;
        }
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(str).buildUpon();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static boolean containsAtLeastOneSubstring(java.lang.String str, java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(java.lang.String str, java.lang.String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static android.text.SpannedString createListItemDetailSpannedString(java.lang.String str, int i) {
        return createSpannedString(str, i, 16);
    }

    public static android.text.SpannedString createListItemDetailSubSpannedString(java.lang.String str, int i) {
        return createSpannedString(str, i, 12, 1);
    }

    public static android.text.SpannedString createSpannedString(java.lang.String str, int i, int i2) {
        return createSpannedString(str, i, i2, 0);
    }

    public static java.lang.String emptyIfNull(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static java.lang.String encodeUriString(java.lang.String str) {
        return isValidString(str) ? android.net.Uri.encode(str) : "";
    }

    public static java.lang.Boolean endsWith(java.lang.String str, java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }

    public static java.lang.String getHost(java.lang.String str) {
        return android.net.Uri.parse(str).getHost();
    }

    public static java.lang.String getHostAndPath(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        return uri.getHost() + uri.getPath();
    }

    public static java.util.List<java.lang.String> getRegexMatches(java.util.regex.Matcher matcher, int i) {
        matcher.reset();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group(i);
            if (isValidString(strGroup)) {
                arrayList.add(strGroup);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(java.lang.String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        int i = (cCharAt == '-' || cCharAt == '+') ? 1 : 0;
        int length = str.length();
        if (i == 1 && length == 1) {
            return false;
        }
        while (i < length) {
            if (!java.lang.Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isValidString(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str);
    }

    public static java.lang.String join(java.lang.CharSequence charSequence, java.util.List<?> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(charSequence);
        }
        sb.delete(sb.length() - charSequence.length(), sb.length());
        return sb.toString();
    }

    public static java.util.regex.Matcher match(java.lang.String str, java.lang.String str2) {
        return java.util.regex.Pattern.compile(str2).matcher(str);
    }

    public static int parseInt(java.lang.String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(java.lang.String str, long j) {
        return isNumeric(str) ? java.lang.Long.parseLong(str) : j;
    }

    public static java.lang.String prefixToIndex(int i, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (i > str.length()) {
            i = str.length();
        }
        return str.substring(0, i);
    }

    public static java.lang.String replace(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str3 == null) {
            throw new java.lang.IllegalArgumentException("No replacement target specified");
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        int iIndexOf = sb.indexOf(str2);
        while (iIndexOf != -1) {
            sb.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = sb.indexOf(str2, iIndexOf + str3.length());
        }
        return sb.toString();
    }

    public static void replaceAll(java.lang.StringBuffer stringBuffer, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(stringBuffer) || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("No replacement target specified");
        }
        int iIndexOf = stringBuffer.indexOf(str);
        while (iIndexOf != -1) {
            stringBuffer.replace(iIndexOf, str.length() + iIndexOf, str2);
            iIndexOf = stringBuffer.indexOf(str, iIndexOf + str2.length());
        }
    }

    public static boolean startsWithAtLeastOnePrefix(java.lang.String str, java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String toDigitsOnlyVersionString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.String[] strArrSplit = str.split("\\.");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArrSplit.length);
        for (java.lang.String str2 : strArrSplit) {
            if (isValidString(str2)) {
                java.lang.String[] strArrSplit2 = str2.split("[^0-9]+");
                if (strArrSplit2.length > 0) {
                    arrayList.add(strArrSplit2[0]);
                }
            }
        }
        return android.text.TextUtils.join(".", arrayList);
    }

    public static java.lang.String toFullSHA1Hash(java.lang.String str) {
        return a(str, -1);
    }

    public static java.lang.String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            char[] cArr2 = f1330a;
            byte b = bArr[i];
            cArr[i2] = cArr2[(b & 240) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String toHumanReadableString(java.lang.String str) {
        if (!isValidString(str)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        for (java.lang.String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb.append(str2.toUpperCase(java.util.Locale.ENGLISH));
                } else {
                    java.lang.String strSubstring = str2.substring(0, 1);
                    java.util.Locale locale = java.util.Locale.ENGLISH;
                    sb.append(strSubstring.toUpperCase(locale)).append(str2.substring(1).toLowerCase(locale));
                }
                sb.append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static java.lang.String toShortSHA1Hash(java.lang.String str) {
        return a(str, 16);
    }

    public static android.text.SpannedString createSpannedString(java.lang.String str, int i, int i2, int i3) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i), 0, spannableString.length(), 33);
        spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(i2, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new android.text.style.StyleSpan(i3), 0, spannableString.length(), 33);
        return new android.text.SpannedString(spannableString);
    }

    public static int parseInt(java.lang.String str, int i) {
        return isNumeric(str) ? java.lang.Integer.parseInt(str) : i;
    }

    public static java.lang.String replace(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (str != null && map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }
}
