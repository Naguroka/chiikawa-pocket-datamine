package androidx.core.text.util;

/* JADX INFO: loaded from: classes.dex */
public final class LinkifyCompat {
    private static final java.lang.String[] EMPTY_STRING = new java.lang.String[0];
    private static final java.util.Comparator<androidx.core.text.util.LinkifyCompat.LinkSpec> COMPARATOR = new java.util.Comparator() { // from class: androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.core.text.util.LinkifyCompat.lambda$static$0((androidx.core.text.util.LinkifyCompat.LinkSpec) obj, (androidx.core.text.util.LinkifyCompat.LinkSpec) obj2);
        }
    };

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    static /* synthetic */ int lambda$static$0(androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec, androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec2) {
        if (linkSpec.start < linkSpec2.start) {
            return -1;
        }
        if (linkSpec.start > linkSpec2.start) {
            return 1;
        }
        return java.lang.Integer.compare(linkSpec2.end, linkSpec.end);
    }

    public static boolean addLinks(android.text.Spannable spannable, int i) {
        if (shouldAddLinksFallbackToFramework()) {
            return android.text.util.Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            android.text.util.Linkify.addLinks(spannable, 4);
        }
        java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList = new java.util.ArrayList();
        if ((i & 1) != 0) {
            gatherLinks(arrayList, spannable, androidx.core.util.PatternsCompat.AUTOLINK_WEB_URL, new java.lang.String[]{"http://", "https://", "rtsp://"}, android.text.util.Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            gatherLinks(arrayList, spannable, androidx.core.util.PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new java.lang.String[]{androidx.core.net.MailTo.MAILTO_SCHEME}, null, null);
        }
        if ((i & 8) != 0) {
            gatherMapLinks(arrayList, spannable);
        }
        pruneOverlaps(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        for (androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec : arrayList) {
            if (linkSpec.frameworkAddedSpan == null) {
                applyLink(linkSpec.url, linkSpec.start, linkSpec.end, spannable);
            }
        }
        return true;
    }

    public static boolean addLinks(android.widget.TextView textView, int i) {
        if (shouldAddLinksFallbackToFramework()) {
            return android.text.util.Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        java.lang.CharSequence text = textView.getText();
        if (text instanceof android.text.Spannable) {
            if (addLinks((android.text.Spannable) text, i)) {
                addLinkMovementMethod(textView);
                return true;
            }
        } else {
            android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(text);
            if (addLinks(spannableStringValueOf, i)) {
                addLinkMovementMethod(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        }
        return false;
    }

    public static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str) {
        if (shouldAddLinksFallbackToFramework()) {
            android.text.util.Linkify.addLinks(textView, pattern, str);
        } else {
            addLinks(textView, pattern, str, (java.lang.String[]) null, (android.text.util.Linkify.MatchFilter) null, (android.text.util.Linkify.TransformFilter) null);
        }
    }

    public static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            android.text.util.Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            addLinks(textView, pattern, str, (java.lang.String[]) null, matchFilter, transformFilter);
        }
    }

    public static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            androidx.core.text.util.LinkifyCompat.Api24Impl.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(textView.getText());
        if (addLinks(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            addLinkMovementMethod(textView);
        }
    }

    public static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str) {
        if (shouldAddLinksFallbackToFramework()) {
            return android.text.util.Linkify.addLinks(spannable, pattern, str);
        }
        return addLinks(spannable, pattern, str, (java.lang.String[]) null, (android.text.util.Linkify.MatchFilter) null, (android.text.util.Linkify.TransformFilter) null);
    }

    public static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            return android.text.util.Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return addLinks(spannable, pattern, str, (java.lang.String[]) null, matchFilter, transformFilter);
    }

    public static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            return androidx.core.text.util.LinkifyCompat.Api24Impl.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = EMPTY_STRING;
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(java.util.Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            java.lang.String str2 = strArr[i];
            i++;
            strArr2[i] = str2 == null ? "" : str2.toLowerCase(java.util.Locale.ROOT);
        }
        java.util.regex.Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            java.lang.String strGroup = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, iStart, iEnd) : true) && strGroup != null) {
                applyLink(makeUrl(strGroup, strArr2, matcher, transformFilter), iStart, iEnd, spannable);
                z = true;
            }
        }
        return z;
    }

    private static boolean shouldAddLinksFallbackToFramework() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    private static void addLinkMovementMethod(android.widget.TextView textView) {
        if ((textView.getMovementMethod() instanceof android.text.method.LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    private static java.lang.String makeUrl(java.lang.String str, java.lang.String[] strArr, java.util.regex.Matcher matcher, android.text.util.Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            java.lang.String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                    break;
                }
                break;
            }
            i++;
        }
        return (z || strArr.length <= 0) ? str : strArr[0] + str;
    }

    private static void gatherLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList, android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        java.util.regex.Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            java.lang.String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = new androidx.core.text.util.LinkifyCompat.LinkSpec();
                    linkSpec.url = makeUrl(strGroup, strArr, matcher, transformFilter);
                    linkSpec.start = iStart;
                    linkSpec.end = iEnd;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    private static void applyLink(java.lang.String str, int i, int i2, android.text.Spannable spannable) {
        spannable.setSpan(new android.text.style.URLSpan(str), i, i2, 33);
    }

    private static void gatherMapLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList, android.text.Spannable spannable) {
        int iIndexOf;
        java.lang.String string = spannable.toString();
        int i = 0;
        while (true) {
            try {
                java.lang.String strFindAddress = findAddress(string);
                if (strFindAddress != null && (iIndexOf = string.indexOf(strFindAddress)) >= 0) {
                    androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = new androidx.core.text.util.LinkifyCompat.LinkSpec();
                    int length = strFindAddress.length() + iIndexOf;
                    linkSpec.start = iIndexOf + i;
                    i += length;
                    linkSpec.end = i;
                    string = string.substring(length);
                    try {
                        linkSpec.url = "geo:0,0?q=" + java.net.URLEncoder.encode(strFindAddress, com.adjust.sdk.Constants.ENCODING);
                        arrayList.add(linkSpec);
                    } catch (java.io.UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (java.lang.UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static java.lang.String findAddress(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.webkit.WebView.findAddress(str);
        }
        return androidx.core.text.util.FindAddress.findAddress(str);
    }

    private static void pruneOverlaps(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList, android.text.Spannable spannable) {
        int i;
        int i2 = 0;
        for (android.text.style.URLSpan uRLSpan : (android.text.style.URLSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.URLSpan.class)) {
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = new androidx.core.text.util.LinkifyCompat.LinkSpec();
            linkSpec.frameworkAddedSpan = uRLSpan;
            linkSpec.start = spannable.getSpanStart(uRLSpan);
            linkSpec.end = spannable.getSpanEnd(uRLSpan);
            arrayList.add(linkSpec);
        }
        java.util.Collections.sort(arrayList, COMPARATOR);
        int size = arrayList.size();
        while (i2 < size - 1) {
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec2 = arrayList.get(i2);
            int i3 = i2 + 1;
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec3 = arrayList.get(i3);
            if (linkSpec2.start <= linkSpec3.start && linkSpec2.end > linkSpec3.start) {
                if (linkSpec3.end > linkSpec2.end && linkSpec2.end - linkSpec2.start <= linkSpec3.end - linkSpec3.start) {
                    i = linkSpec2.end - linkSpec2.start < linkSpec3.end - linkSpec3.start ? i2 : -1;
                } else {
                    i = i3;
                }
                if (i != -1) {
                    java.lang.Object obj = arrayList.get(i).frameworkAddedSpan;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    private LinkifyCompat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LinkSpec {
        int end;
        android.text.style.URLSpan frameworkAddedSpan;
        int start;
        java.lang.String url;

        LinkSpec() {
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
            android.text.util.Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
            return android.text.util.Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }
}
