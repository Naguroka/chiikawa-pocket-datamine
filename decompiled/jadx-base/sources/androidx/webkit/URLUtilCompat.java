package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public final class URLUtilCompat {
    private static final java.util.regex.Pattern DISPOSITION_PATTERN = java.util.regex.Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    private URLUtilCompat() {
    }

    public static java.lang.String guessFileName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String filenameSuggestion = getFilenameSuggestion(str, str2);
        java.lang.String strSuggestExtensionFromMimeType = suggestExtensionFromMimeType(str3);
        if (filenameSuggestion.indexOf(46) < 0) {
            return filenameSuggestion + strSuggestExtensionFromMimeType;
        }
        return (str3 == null || !extensionDifferentFromMimeType(filenameSuggestion, str3)) ? filenameSuggestion : filenameSuggestion + strSuggestExtensionFromMimeType;
    }

    private static java.lang.String getFilenameSuggestion(java.lang.String str, java.lang.String str2) {
        java.lang.String lastPathSegment;
        java.lang.String filenameFromContentDisposition;
        if (str2 != null && (filenameFromContentDisposition = getFilenameFromContentDisposition(str2)) != null) {
            return replacePathSeparators(filenameFromContentDisposition);
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        return (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) ? "downloadfile" : replacePathSeparators(lastPathSegment);
    }

    private static java.lang.String replacePathSeparators(java.lang.String str) {
        return str.replaceAll("/", "_");
    }

    private static boolean extensionDifferentFromMimeType(java.lang.String str, java.lang.String str2) {
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1));
        return (mimeTypeFromExtension == null || mimeTypeFromExtension.equalsIgnoreCase(str2)) ? false : true;
    }

    private static java.lang.String suggestExtensionFromMimeType(java.lang.String str) {
        if (str == null) {
            return ".bin";
        }
        java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            return "." + extensionFromMimeType;
        }
        if (str.equalsIgnoreCase("text/html")) {
            return ".html";
        }
        return str.toLowerCase(java.util.Locale.ROOT).startsWith("text/") ? ".txt" : ".bin";
    }

    public static java.lang.String getFilenameFromContentDisposition(java.lang.String str) {
        java.lang.String strGroup;
        java.lang.String[] strArrSplit = str.trim().split(";", 2);
        java.lang.String extValueString = null;
        if (strArrSplit.length < 2 || "inline".equalsIgnoreCase(strArrSplit[0].trim())) {
            return null;
        }
        java.util.regex.Matcher matcher = DISPOSITION_PATTERN.matcher(strArrSplit[1]);
        java.lang.String str2 = null;
        while (matcher.find()) {
            java.lang.String strGroup2 = matcher.group(1);
            if (matcher.group(2) != null) {
                strGroup = removeSlashEscapes(matcher.group(2));
            } else if (matcher.group(3) != null) {
                strGroup = removeSlashEscapes(matcher.group(3));
            } else {
                strGroup = matcher.group(4);
            }
            if (strGroup2 != null && strGroup != null) {
                if ("filename*".equalsIgnoreCase(strGroup2)) {
                    extValueString = parseExtValueString(strGroup);
                } else if ("filename".equalsIgnoreCase(strGroup2)) {
                    str2 = strGroup;
                }
            }
        }
        return extValueString != null ? extValueString : str2;
    }

    private static java.lang.String removeSlashEscapes(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\(.)", "$1");
    }

    private static java.lang.String parseExtValueString(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("'", 3);
        if (strArrSplit.length < 3) {
            return null;
        }
        java.lang.String str2 = strArrSplit[0];
        try {
            return java.net.URLDecoder.decode(encodePlusCharacters(strArrSplit[2], str2), str2);
        } catch (java.io.UnsupportedEncodingException | java.lang.RuntimeException unused) {
            return null;
        }
    }

    private static java.lang.String encodePlusCharacters(java.lang.String str, java.lang.String str2) {
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : charsetForName.encode("+").array()) {
            sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
        }
        return str.replaceAll("\\+", sb.toString());
    }
}
