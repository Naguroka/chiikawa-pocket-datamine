package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ComplexColorCompat {
    private static final java.lang.String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final android.content.res.ColorStateList mColorStateList;
    private final android.graphics.Shader mShader;

    private ComplexColorCompat(android.graphics.Shader shader, android.content.res.ColorStateList colorStateList, int i) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = i;
    }

    static androidx.core.content.res.ComplexColorCompat from(android.graphics.Shader shader) {
        return new androidx.core.content.res.ComplexColorCompat(shader, null, 0);
    }

    static androidx.core.content.res.ComplexColorCompat from(android.content.res.ColorStateList colorStateList) {
        return new androidx.core.content.res.ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    static androidx.core.content.res.ComplexColorCompat from(int i) {
        return new androidx.core.content.res.ComplexColorCompat(null, null, i);
    }

    public android.graphics.Shader getShader() {
        return this.mShader;
    }

    public int getColor() {
        return this.mColor;
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public boolean isGradient() {
        return this.mShader != null;
    }

    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        return this.mShader == null && (colorStateList = this.mColorStateList) != null && colorStateList.isStateful();
    }

    public boolean onStateChanged(int[] iArr) {
        if (isStateful()) {
            android.content.res.ColorStateList colorStateList = this.mColorStateList;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.mColor) {
                this.mColor = colorForState;
                return true;
            }
        }
        return false;
    }

    public boolean willDraw() {
        return isGradient() || this.mColor != 0;
    }

    public static androidx.core.content.res.ComplexColorCompat inflate(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        try {
            return createFromXml(resources, i, theme);
        } catch (java.lang.Exception e) {
            android.util.Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    private static androidx.core.content.res.ComplexColorCompat createFromXml(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        java.lang.String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return from(androidx.core.content.res.GradientColorInflaterCompat.createFromXmlInner(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return from(androidx.core.content.res.ColorStateListInflaterCompat.createFromXmlInner(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }
}
