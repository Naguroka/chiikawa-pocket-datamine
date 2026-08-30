package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class MailTo {
    private static final java.lang.String BCC = "bcc";
    private static final java.lang.String BODY = "body";
    private static final java.lang.String CC = "cc";
    private static final java.lang.String MAILTO = "mailto";
    public static final java.lang.String MAILTO_SCHEME = "mailto:";
    private static final java.lang.String SUBJECT = "subject";
    private static final java.lang.String TO = "to";
    private java.util.HashMap<java.lang.String, java.lang.String> mHeaders = new java.util.HashMap<>();

    private MailTo() {
    }

    public static boolean isMailTo(java.lang.String str) {
        return str != null && str.startsWith(MAILTO_SCHEME);
    }

    public static boolean isMailTo(android.net.Uri uri) {
        return uri != null && MAILTO.equals(uri.getScheme());
    }

    public static androidx.core.net.MailTo parse(java.lang.String str) throws androidx.core.net.ParseException {
        java.lang.String strDecode;
        java.lang.String strSubstring;
        androidx.core.util.Preconditions.checkNotNull(str);
        if (!isMailTo(str)) {
            throw new androidx.core.net.ParseException("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = android.net.Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = android.net.Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        androidx.core.net.MailTo mailTo = new androidx.core.net.MailTo();
        if (strSubstring != null) {
            for (java.lang.String str2 : strSubstring.split(com.ironsource.y8.i.c)) {
                java.lang.String[] strArrSplit = str2.split(com.ironsource.y8.i.b, 2);
                if (strArrSplit.length != 0) {
                    mailTo.mHeaders.put(android.net.Uri.decode(strArrSplit[0]).toLowerCase(java.util.Locale.ROOT), strArrSplit.length > 1 ? android.net.Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        java.lang.String to = mailTo.getTo();
        if (to != null) {
            strDecode = strDecode + ", " + to;
        }
        mailTo.mHeaders.put("to", strDecode);
        return mailTo;
    }

    public static androidx.core.net.MailTo parse(android.net.Uri uri) throws androidx.core.net.ParseException {
        return parse(uri.toString());
    }

    public java.lang.String getTo() {
        return this.mHeaders.get("to");
    }

    public java.lang.String getCc() {
        return this.mHeaders.get(CC);
    }

    public java.lang.String getBcc() {
        return this.mHeaders.get(BCC);
    }

    public java.lang.String getSubject() {
        return this.mHeaders.get(SUBJECT);
    }

    public java.lang.String getBody() {
        return this.mHeaders.get("body");
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.mHeaders;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mailto:?");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.mHeaders.entrySet()) {
            sb.append(android.net.Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(android.net.Uri.encode(entry.getValue()));
            sb.append(kotlin.text.Typography.amp);
        }
        return sb.toString();
    }
}
