package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
final class ParseRequest {
    final int radix;
    final java.lang.String rawValue;

    private ParseRequest(java.lang.String rawValue, int radix) {
        this.rawValue = rawValue;
        this.radix = radix;
    }

    static com.google.common.primitives.ParseRequest fromString(java.lang.String stringValue) {
        if (stringValue.length() == 0) {
            throw new java.lang.NumberFormatException("empty string");
        }
        char cCharAt = stringValue.charAt(0);
        int i = 16;
        if (stringValue.startsWith("0x") || stringValue.startsWith("0X")) {
            stringValue = stringValue.substring(2);
        } else if (cCharAt == '#') {
            stringValue = stringValue.substring(1);
        } else if (cCharAt != '0' || stringValue.length() <= 1) {
            i = 10;
        } else {
            stringValue = stringValue.substring(1);
            i = 8;
        }
        return new com.google.common.primitives.ParseRequest(stringValue, i);
    }
}
