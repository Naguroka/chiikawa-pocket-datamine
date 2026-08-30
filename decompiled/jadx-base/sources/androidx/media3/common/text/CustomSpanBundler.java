package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
final class CustomSpanBundler {
    private static final int HORIZONTAL_TEXT_IN_VERTICAL_CONTEXT = 3;
    private static final int RUBY = 1;
    private static final int TEXT_EMPHASIS = 2;
    private static final int UNKNOWN = -1;
    private static final java.lang.String FIELD_START_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_END_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_PARAMS = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    public static java.util.ArrayList<android.os.Bundle> bundleCustomSpans(android.text.Spanned spanned) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
        for (androidx.media3.common.text.RubySpan rubySpan : (androidx.media3.common.text.RubySpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.RubySpan.class)) {
            arrayList.add(spanToBundle(spanned, rubySpan, 1, rubySpan.toBundle()));
        }
        for (androidx.media3.common.text.TextEmphasisSpan textEmphasisSpan : (androidx.media3.common.text.TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.TextEmphasisSpan.class)) {
            arrayList.add(spanToBundle(spanned, textEmphasisSpan, 2, textEmphasisSpan.toBundle()));
        }
        for (androidx.media3.common.text.HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (androidx.media3.common.text.HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.HorizontalTextInVerticalContextSpan.class)) {
            arrayList.add(spanToBundle(spanned, horizontalTextInVerticalContextSpan, 3, null));
        }
        return arrayList;
    }

    public static void unbundleAndApplyCustomSpan(android.os.Bundle bundle, android.text.Spannable spannable) {
        int i = bundle.getInt(FIELD_START_INDEX);
        int i2 = bundle.getInt(FIELD_END_INDEX);
        int i3 = bundle.getInt(FIELD_FLAGS);
        int i4 = bundle.getInt(FIELD_TYPE, -1);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_PARAMS);
        if (i4 == 1) {
            spannable.setSpan(androidx.media3.common.text.RubySpan.fromBundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle2)), i, i2, i3);
        } else if (i4 == 2) {
            spannable.setSpan(androidx.media3.common.text.TextEmphasisSpan.fromBundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle2)), i, i2, i3);
        } else {
            if (i4 != 3) {
                return;
            }
            spannable.setSpan(new androidx.media3.common.text.HorizontalTextInVerticalContextSpan(), i, i2, i3);
        }
    }

    private static android.os.Bundle spanToBundle(android.text.Spanned spanned, java.lang.Object obj, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(FIELD_START_INDEX, spanned.getSpanStart(obj));
        bundle2.putInt(FIELD_END_INDEX, spanned.getSpanEnd(obj));
        bundle2.putInt(FIELD_FLAGS, spanned.getSpanFlags(obj));
        bundle2.putInt(FIELD_TYPE, i);
        if (bundle != null) {
            bundle2.putBundle(FIELD_PARAMS, bundle);
        }
        return bundle2;
    }

    private CustomSpanBundler() {
    }
}
