package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzazp {
    public static int zza(java.lang.String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return com.google.android.gms.common.util.MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0100  */
    public static java.lang.String[] zzb(java.lang.String str, boolean z) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < str.length()) {
            int iCodePointAt = java.lang.Character.codePointAt(charArray, i);
            int iCharCount = java.lang.Character.charCount(iCodePointAt);
            if (java.lang.Character.isLetter(iCodePointAt)) {
                java.lang.Character.UnicodeBlock unicodeBlockOf = java.lang.Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z2) {
                        arrayList.add(new java.lang.String(charArray, i2, i - i2));
                    }
                    arrayList.add(new java.lang.String(charArray, i, iCharCount));
                } else {
                    if (!java.lang.Character.isLetterOrDigit(iCodePointAt) || java.lang.Character.getType(iCodePointAt) == 6 || java.lang.Character.getType(iCodePointAt) == 8) {
                        if (true != z2) {
                            i2 = i;
                        }
                    } else if (z && java.lang.Character.charCount(iCodePointAt) == 1 && java.lang.Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z2) {
                            i2 = i;
                        }
                    } else if (z2) {
                        arrayList.add(new java.lang.String(charArray, i2, i - i2));
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                if (java.lang.Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z2) {
                        i2 = i;
                    }
                } else if (true != z2) {
                    i2 = i;
                }
                z2 = true;
            }
            i += iCharCount;
        }
        if (z2) {
            arrayList.add(new java.lang.String(charArray, i2, i - i2));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}
