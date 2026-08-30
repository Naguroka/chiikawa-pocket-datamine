package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes.dex */
public final class EditorInfoCompat {
    private static final java.lang.String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final java.lang.String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final java.lang.String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;

    private static boolean isPasswordInputType(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void setContentMimeTypes(android.view.inputmethod.EditorInfo editorInfo, java.lang.String[] strArr) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_KEY, strArr);
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_INTEROP_KEY, strArr);
    }

    public static java.lang.String[] getContentMimeTypes(android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.lang.String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : EMPTY_STRING_ARRAY;
        }
        if (editorInfo.extras == null) {
            return EMPTY_STRING_ARRAY;
        }
        java.lang.String[] stringArray = editorInfo.extras.getStringArray(CONTENT_MIME_TYPES_KEY);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(CONTENT_MIME_TYPES_INTEROP_KEY);
        }
        return stringArray != null ? stringArray : EMPTY_STRING_ARRAY;
    }

    public static void setInitialSurroundingText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i) {
        int i2;
        int i3;
        androidx.core.util.Preconditions.checkNotNull(charSequence);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, i);
            return;
        }
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i2 = editorInfo.initialSelEnd;
        } else {
            i2 = editorInfo.initialSelStart;
        }
        int i4 = i2 - i;
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i3 = editorInfo.initialSelStart;
        } else {
            i3 = editorInfo.initialSelEnd;
        }
        int i5 = i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            setSurroundingText(editorInfo, null, 0, 0);
            return;
        }
        if (isPasswordInputType(editorInfo.inputType)) {
            setSurroundingText(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            setSurroundingText(editorInfo, charSequence, i4, i5);
        } else {
            trimLongSurroundingText(editorInfo, charSequence, i4, i5);
        }
    }

    private static void trimLongSurroundingText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i, int i2) {
        java.lang.CharSequence charSequenceSubSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int iMin = java.lang.Math.min(charSequence.length() - i2, i5 - java.lang.Math.min(i, (int) (((double) i5) * 0.8d)));
        int iMin2 = java.lang.Math.min(i, i5 - iMin);
        int i6 = i - iMin2;
        if (isCutOnSurrogate(charSequence, i6, 0)) {
            i6++;
            iMin2--;
        }
        if (isCutOnSurrogate(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        int i7 = iMin2 + i4 + iMin;
        if (i4 != i3) {
            charSequenceSubSequence = android.text.TextUtils.concat(charSequence.subSequence(i6, i6 + iMin2), charSequence.subSequence(i2, iMin + i2));
        } else {
            charSequenceSubSequence = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = iMin2 + 0;
        setSurroundingText(editorInfo, charSequenceSubSequence, i8, i4 + i8);
    }

    public static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
        java.lang.CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialTextBeforeCursor(editorInfo, i, i2);
        }
        if (editorInfo.extras == null || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int iMin = java.lang.Math.min(i, i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3 - iMin, i3);
        }
        return android.text.TextUtils.substring(charSequence, i3 - iMin, i3);
    }

    public static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo editorInfo, int i) {
        java.lang.CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialSelectedText(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = java.lang.Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = java.lang.Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int i4 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        if ((i & 1) != 0) {
            return charSequence.subSequence(i2, i3);
        }
        return android.text.TextUtils.substring(charSequence, i2, i3);
    }

    public static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
        java.lang.CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialTextAfterCursor(editorInfo, i, i2);
        }
        if (editorInfo.extras == null || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int iMin = java.lang.Math.min(i, charSequence.length() - i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3, iMin + i3);
        }
        return android.text.TextUtils.substring(charSequence, i3, iMin + i3);
    }

    private static boolean isCutOnSurrogate(java.lang.CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return java.lang.Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return java.lang.Character.isHighSurrogate(charSequence.charAt(i));
    }

    private static void setSurroundingText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, i);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, i2);
    }

    static int getProtocol(android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        if (editorInfo.extras == null) {
            return 0;
        }
        boolean zContainsKey = editorInfo.extras.containsKey(CONTENT_MIME_TYPES_KEY);
        boolean zContainsKey2 = editorInfo.extras.containsKey(CONTENT_MIME_TYPES_INTEROP_KEY);
        if (zContainsKey && zContainsKey2) {
            return 4;
        }
        if (zContainsKey) {
            return 3;
        }
        return zContainsKey2 ? 2 : 0;
    }

    @java.lang.Deprecated
    public EditorInfoCompat() {
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }

        static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }
    }
}
