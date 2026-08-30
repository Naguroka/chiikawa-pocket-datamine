package com.bykv.vk.openvk.preload.a.b.a.a;

/* JADX INFO: compiled from: ISO8601Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.TimeZone f1620a = java.util.TimeZone.getTimeZone("UTC");

    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x017d, B:55:0x00e0, B:56:0x00fa, B:57:0x00fb, B:61:0x0119, B:63:0x0126, B:66:0x012f, B:68:0x0147, B:71:0x0156, B:72:0x0178, B:74:0x017b, B:60:0x0106, B:77:0x01ae, B:78:0x01b5, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x017d, B:55:0x00e0, B:56:0x00fa, B:57:0x00fb, B:61:0x0119, B:63:0x0126, B:66:0x012f, B:68:0x0147, B:71:0x0156, B:72:0x0178, B:74:0x017b, B:60:0x0106, B:77:0x01ae, B:78:0x01b5, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x017d, B:55:0x00e0, B:56:0x00fa, B:57:0x00fb, B:61:0x0119, B:63:0x0126, B:66:0x012f, B:68:0x0147, B:71:0x0156, B:72:0x0178, B:74:0x017b, B:60:0x0106, B:77:0x01ae, B:78:0x01b5, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x017b A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x017d, B:55:0x00e0, B:56:0x00fa, B:57:0x00fb, B:61:0x0119, B:63:0x0126, B:66:0x012f, B:68:0x0147, B:71:0x0156, B:72:0x0178, B:74:0x017b, B:60:0x0106, B:77:0x01ae, B:78:0x01b5, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x017d, B:55:0x00e0, B:56:0x00fa, B:57:0x00fb, B:61:0x0119, B:63:0x0126, B:66:0x012f, B:68:0x0147, B:71:0x0156, B:72:0x0178, B:74:0x017b, B:60:0x0106, B:77:0x01ae, B:78:0x01b5, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    public static java.util.Date a(java.lang.String str, java.text.ParsePosition parsePosition) throws java.text.ParseException {
        int i;
        int i2;
        int i3;
        int iA;
        char cCharAt;
        java.lang.String strSubstring;
        int length;
        java.util.TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i4 = index + 4;
            int iA2 = a(str, index, i4);
            if (a(str, i4, org.objectweb.asm.signature.SignatureVisitor.SUPER)) {
                i4++;
            }
            int i5 = i4 + 2;
            int iA3 = a(str, i4, i5);
            if (a(str, i5, org.objectweb.asm.signature.SignatureVisitor.SUPER)) {
                i5++;
            }
            int i6 = i5 + 2;
            int iA4 = a(str, i5, i6);
            boolean zA = a(str, i6, 'T');
            if (!zA && str.length() <= i6) {
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(iA2, iA3 - 1, iA4);
                parsePosition.setIndex(i6);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i7 = i6 + 1;
                int i8 = i7 + 2;
                int iA5 = a(str, i7, i8);
                if (a(str, i8, ':')) {
                    i8++;
                }
                int i9 = i8 + 2;
                int iA6 = a(str, i8, i9);
                if (a(str, i9, ':')) {
                    i9++;
                }
                if (str.length() <= i9 || (cCharAt2 = str.charAt(i9)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i2 = iA6;
                    i3 = 0;
                    i = iA5;
                    i6 = i9;
                } else {
                    int i10 = i9 + 2;
                    iA = a(str, i9, i10);
                    if (iA > 59 && iA < 63) {
                        iA = 59;
                    }
                    if (a(str, i10, '.')) {
                        int i11 = i10 + 1;
                        int iA7 = a(str, i11 + 1);
                        int iMin = java.lang.Math.min(iA7, i11 + 3);
                        int iA8 = a(str, i11, iMin);
                        int i12 = iMin - i11;
                        if (i12 == 1) {
                            iA8 *= 100;
                        } else if (i12 == 2) {
                            iA8 *= 10;
                        }
                        i2 = iA6;
                        i3 = iA8;
                        i = iA5;
                        i6 = iA7;
                    } else {
                        i2 = iA6;
                        i = iA5;
                        i6 = i10;
                        i3 = 0;
                    }
                }
                if (str.length() > i6) {
                    throw new java.lang.IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i6);
                if (cCharAt == 'Z') {
                    timeZone = f1620a;
                    length = i6 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i6);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i6 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = f1620a;
                    } else {
                        java.lang.String strConcat = "GMT".concat(java.lang.String.valueOf(strSubstring));
                        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone(strConcat);
                        java.lang.String id = timeZone2.getID();
                        if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                            throw new java.lang.IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iA2);
                gregorianCalendar2.set(2, iA3 - 1);
                gregorianCalendar2.set(5, iA4);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, iA);
                gregorianCalendar2.set(14, i3);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            i2 = 0;
            i3 = 0;
            iA = 0;
            if (str.length() > i6) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i6);
            if (cCharAt == 'Z') {
                timeZone = f1620a;
                length = i6 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i6);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i6 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    timeZone = f1620a;
                } else {
                    timeZone = f1620a;
                }
            }
            java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iA2);
            gregorianCalendar3.set(2, iA3 - 1);
            gregorianCalendar3.set(5, iA4);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i2);
            gregorianCalendar3.set(13, iA);
            gregorianCalendar3.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException e) {
            java.lang.String str2 = str == null ? null : "\"" + str + kotlin.text.Typography.quote;
            java.lang.String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            java.text.ParseException parseException = new java.text.ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean a(java.lang.String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int a(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new java.lang.NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = java.lang.Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = java.lang.Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }

    private static int a(java.lang.String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
