package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private static int getAlphaIndex(char c) {
        return (char) ((c | CASE_MASK) - 97);
    }

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private Ascii() {
    }

    public static java.lang.String toLowerCase(java.lang.String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (isUpperCase(string.charAt(i))) {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (isUpperCase(c)) {
                        charArray[i] = (char) (c ^ CASE_MASK);
                    }
                    i++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static java.lang.String toLowerCase(java.lang.CharSequence chars) {
        if (chars instanceof java.lang.String) {
            return toLowerCase((java.lang.String) chars);
        }
        int length = chars.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toLowerCase(chars.charAt(i));
        }
        return java.lang.String.valueOf(cArr);
    }

    public static char toLowerCase(char c) {
        return isUpperCase(c) ? (char) (c ^ CASE_MASK) : c;
    }

    public static java.lang.String toUpperCase(java.lang.String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (isLowerCase(string.charAt(i))) {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (isLowerCase(c)) {
                        charArray[i] = (char) (c ^ CASE_MASK);
                    }
                    i++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static java.lang.String toUpperCase(java.lang.CharSequence chars) {
        if (chars instanceof java.lang.String) {
            return toUpperCase((java.lang.String) chars);
        }
        int length = chars.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toUpperCase(chars.charAt(i));
        }
        return java.lang.String.valueOf(cArr);
    }

    public static char toUpperCase(char c) {
        return isLowerCase(c) ? (char) (c ^ CASE_MASK) : c;
    }

    public static java.lang.String truncate(java.lang.CharSequence charSequence, int i, java.lang.String str) {
        java.lang.String string;
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        int length = i - str.length();
        com.google.common.base.Preconditions.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i, str.length());
        int length2 = charSequence.length();
        java.lang.CharSequence charSequence2 = charSequence;
        if (length2 <= i) {
            string = charSequence.toString();
            if (string.length() <= i) {
                charSequence2 = string;
                return string;
            }
        }
        charSequence2 = string;
        return new java.lang.StringBuilder(i).append(charSequence2, 0, length).append(str).toString();
    }

    public static boolean equalsIgnoreCase(java.lang.CharSequence s1, java.lang.CharSequence s2) {
        int alphaIndex;
        int length = s1.length();
        if (s1 == s2) {
            return true;
        }
        if (length != s2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = s1.charAt(i);
            char cCharAt2 = s2.charAt(i);
            if (cCharAt != cCharAt2 && ((alphaIndex = getAlphaIndex(cCharAt)) >= 26 || alphaIndex != getAlphaIndex(cCharAt2))) {
                return false;
            }
        }
        return true;
    }
}
