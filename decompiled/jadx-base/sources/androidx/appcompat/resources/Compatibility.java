package androidx.appcompat.resources;

/* JADX INFO: loaded from: classes.dex */
public final class Compatibility {
    private Compatibility() {
    }

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void inflate(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static int getChangingConfigurations(android.content.res.TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            return android.graphics.drawable.Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
    }

    public static class Api18Impl {
        private Api18Impl() {
        }

        public static void setAutoCancel(android.animation.ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class Api15Impl {
        private Api15Impl() {
        }

        public static void getValueForDensity(android.content.res.Resources resources, int i, int i2, android.util.TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }
}
