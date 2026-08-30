package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextEmphasisSpan implements androidx.media3.common.text.LanguageFeatureSpan {
    public static final int MARK_FILL_FILLED = 1;
    public static final int MARK_FILL_OPEN = 2;
    public static final int MARK_FILL_UNKNOWN = 0;
    public static final int MARK_SHAPE_CIRCLE = 1;
    public static final int MARK_SHAPE_DOT = 2;
    public static final int MARK_SHAPE_NONE = 0;
    public static final int MARK_SHAPE_SESAME = 3;
    public int markFill;
    public int markShape;
    public final int position;
    private static final java.lang.String FIELD_MARK_SHAPE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_MARK_FILL = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_POSITION = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MarkFill {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MarkShape {
    }

    public TextEmphasisSpan(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_MARK_SHAPE, this.markShape);
        bundle.putInt(FIELD_MARK_FILL, this.markFill);
        bundle.putInt(FIELD_POSITION, this.position);
        return bundle;
    }

    public static androidx.media3.common.text.TextEmphasisSpan fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.text.TextEmphasisSpan(bundle.getInt(FIELD_MARK_SHAPE), bundle.getInt(FIELD_MARK_FILL), bundle.getInt(FIELD_POSITION));
    }
}
