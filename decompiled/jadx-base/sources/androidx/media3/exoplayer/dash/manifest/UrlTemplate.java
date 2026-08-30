package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class UrlTemplate {
    private static final java.lang.String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final java.lang.String DEFAULT_FORMAT_TAG = "%01d";
    private static final java.lang.String ESCAPED_DOLLAR = "$$";
    private static final java.lang.String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final java.lang.String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final java.lang.String TIME = "Time";
    private static final int TIME_ID = 4;
    private final java.util.List<java.lang.String> identifierFormatTags;
    private final java.util.List<java.lang.Integer> identifiers;
    private final java.util.List<java.lang.String> urlPieces;

    public static androidx.media3.exoplayer.dash.manifest.UrlTemplate compile(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        parseTemplate(str, arrayList, arrayList2, arrayList3);
        return new androidx.media3.exoplayer.dash.manifest.UrlTemplate(arrayList, arrayList2, arrayList3);
    }

    private UrlTemplate(java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.String> list3) {
        this.urlPieces = list;
        this.identifiers = list2;
        this.identifierFormatTags = list3;
    }

    public java.lang.String buildUri(java.lang.String str, long j, int i, long j2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < this.identifiers.size(); i2++) {
            sb.append(this.urlPieces.get(i2));
            if (this.identifiers.get(i2).intValue() == 1) {
                sb.append(str);
            } else if (this.identifiers.get(i2).intValue() == 2) {
                sb.append(java.lang.String.format(java.util.Locale.US, this.identifierFormatTags.get(i2), java.lang.Long.valueOf(j)));
            } else if (this.identifiers.get(i2).intValue() == 3) {
                sb.append(java.lang.String.format(java.util.Locale.US, this.identifierFormatTags.get(i2), java.lang.Integer.valueOf(i)));
            } else if (this.identifiers.get(i2).intValue() == 4) {
                sb.append(java.lang.String.format(java.util.Locale.US, this.identifierFormatTags.get(i2), java.lang.Long.valueOf(j2)));
            }
        }
        sb.append(this.urlPieces.get(this.identifiers.size()));
        return sb.toString();
    }

    private static void parseTemplate(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.String> list3) {
        java.lang.String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith(ESCAPED_DOLLAR, length)) {
                list.set(list2.size(), list.get(list2.size()) + "$");
                length += 2;
            } else {
                list3.add("");
                int i = length + 1;
                int iIndexOf2 = str.indexOf("$", i);
                java.lang.String strSubstring2 = str.substring(i, iIndexOf2);
                if (strSubstring2.equals(REPRESENTATION)) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = DEFAULT_FORMAT_TAG;
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }
}
