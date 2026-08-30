package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class CaptionStyleCompat {
    public static final androidx.media3.ui.CaptionStyleCompat DEFAULT = new androidx.media3.ui.CaptionStyleCompat(-1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int USE_TRACK_COLOR_SETTINGS = 1;
    public final int backgroundColor;
    public final int edgeColor;
    public final int edgeType;
    public final int foregroundColor;
    public final android.graphics.Typeface typeface;
    public final int windowColor;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    public static androidx.media3.ui.CaptionStyleCompat createFromCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle captionStyle) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            return createFromCaptionStyleV21(captionStyle);
        }
        return new androidx.media3.ui.CaptionStyleCompat(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, android.graphics.Typeface typeface) {
        this.foregroundColor = i;
        this.backgroundColor = i2;
        this.windowColor = i3;
        this.edgeType = i4;
        this.edgeColor = i5;
        this.typeface = typeface;
    }

    private static androidx.media3.ui.CaptionStyleCompat createFromCaptionStyleV21(android.view.accessibility.CaptioningManager.CaptionStyle captionStyle) {
        return new androidx.media3.ui.CaptionStyleCompat(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : DEFAULT.foregroundColor, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : DEFAULT.backgroundColor, captionStyle.hasWindowColor() ? captionStyle.windowColor : DEFAULT.windowColor, captionStyle.hasEdgeType() ? captionStyle.edgeType : DEFAULT.edgeType, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : DEFAULT.edgeColor, captionStyle.getTypeface());
    }
}
