package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
final class CommandLineSupport {
    private static final char BLANK = ' ';
    private static final int M_ESCAPED = 2;
    private static final int M_PARSE_ARGUMENT = 1;
    private static final int M_STRIP_WHITESPACE = 0;
    private static final char QUOTE = '\"';
    private static final char SLASH = '\\';

    static java.lang.String quote(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '\"' || c == '\\') {
                sb.append(SLASH);
            }
            sb.append(c);
        }
        if (str.indexOf(32) != -1 || str.indexOf(34) != -1) {
            sb.insert(0, '\"').append('\"');
        }
        return sb.toString();
    }

    static java.lang.String quote(java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        for (java.lang.String str : list) {
            if (z) {
                sb.append(BLANK);
            }
            sb.append(quote(str));
            z = true;
        }
        return sb.toString();
    }

    static java.util.List<java.lang.String> split(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char c = ' ';
        char c2 = 0;
        for (char c3 : str.toCharArray()) {
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 == 2) {
                        if (c3 == '\"' || c3 == '\\') {
                            sb.setCharAt(sb.length() - 1, c3);
                        } else if (c3 == c) {
                            addArgument(arrayList, sb);
                        } else {
                            sb.append(c3);
                        }
                        c2 = 1;
                    }
                } else if (c3 == c) {
                    addArgument(arrayList, sb);
                    c2 = 0;
                } else if (c3 == '\\') {
                    sb.append(SLASH);
                    c2 = 2;
                } else {
                    sb.append(c3);
                }
            } else if (!java.lang.Character.isWhitespace(c3)) {
                if (c3 == '\"') {
                    c = '\"';
                } else {
                    sb.append(c3);
                    c = ' ';
                }
                c2 = 1;
            }
        }
        addArgument(arrayList, sb);
        return arrayList;
    }

    private static void addArgument(java.util.List<java.lang.String> list, java.lang.StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private CommandLineSupport() {
    }
}
