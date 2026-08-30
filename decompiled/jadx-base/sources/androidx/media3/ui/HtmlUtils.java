package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static java.lang.String toCssRgba(int i) {
        return androidx.media3.common.util.Util.formatInvariant("rgba(%d,%d,%d,%.3f)", java.lang.Integer.valueOf(android.graphics.Color.red(i)), java.lang.Integer.valueOf(android.graphics.Color.green(i)), java.lang.Integer.valueOf(android.graphics.Color.blue(i)), java.lang.Double.valueOf(((double) android.graphics.Color.alpha(i)) / 255.0d));
    }

    public static java.lang.String cssAllClassDescendantsSelector(java.lang.String str) {
        return "." + str + ",." + str + " *";
    }
}
