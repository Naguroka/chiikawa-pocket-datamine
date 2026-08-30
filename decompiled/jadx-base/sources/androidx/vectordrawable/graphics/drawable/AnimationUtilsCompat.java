package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes3.dex */
public class AnimationUtilsCompat {
    public static android.view.animation.Interpolator loadInterpolator(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        return android.view.animation.AnimationUtils.loadInterpolator(context, i);
    }

    private static android.view.animation.Interpolator createInterpolatorFromXml(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.view.animation.Interpolator accelerateInterpolator;
        int depth = xmlPullParser.getDepth();
        android.view.animation.Interpolator linearInterpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
                java.lang.String name = xmlPullParser.getName();
                if (name.equals("linearInterpolator")) {
                    linearInterpolator = new android.view.animation.LinearInterpolator();
                } else {
                    if (name.equals("accelerateInterpolator")) {
                        accelerateInterpolator = new android.view.animation.AccelerateInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("decelerateInterpolator")) {
                        accelerateInterpolator = new android.view.animation.DecelerateInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("accelerateDecelerateInterpolator")) {
                        linearInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
                    } else if (name.equals("cycleInterpolator")) {
                        accelerateInterpolator = new android.view.animation.CycleInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("anticipateInterpolator")) {
                        accelerateInterpolator = new android.view.animation.AnticipateInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("overshootInterpolator")) {
                        accelerateInterpolator = new android.view.animation.OvershootInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("anticipateOvershootInterpolator")) {
                        accelerateInterpolator = new android.view.animation.AnticipateOvershootInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("bounceInterpolator")) {
                        linearInterpolator = new android.view.animation.BounceInterpolator();
                    } else if (name.equals("pathInterpolator")) {
                        accelerateInterpolator = new androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat(context, attributeSetAsAttributeSet, xmlPullParser);
                    } else {
                        throw new java.lang.RuntimeException("Unknown interpolator name: " + xmlPullParser.getName());
                    }
                    linearInterpolator = accelerateInterpolator;
                }
            }
        }
        return linearInterpolator;
    }

    private AnimationUtilsCompat() {
    }
}
