package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class PatternPathMotion extends androidx.transition.PathMotion {
    private android.graphics.Path mOriginalPatternPath;
    private final android.graphics.Path mPatternPath;
    private final android.graphics.Matrix mTempMatrix;

    public PatternPathMotion() {
        android.graphics.Path path = new android.graphics.Path();
        this.mPatternPath = path;
        this.mTempMatrix = new android.graphics.Matrix();
        path.lineTo(1.0f, 0.0f);
        this.mOriginalPatternPath = path;
    }

    public PatternPathMotion(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.mPatternPath = new android.graphics.Path();
        this.mTempMatrix = new android.graphics.Matrix();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.PATTERN_PATH_MOTION);
        try {
            java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, (org.xmlpull.v1.XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString == null) {
                throw new java.lang.RuntimeException("pathData must be supplied for patternPathMotion");
            }
            setPatternPath(androidx.core.graphics.PathParser.createPathFromPathData(namedString));
            typedArrayObtainStyledAttributes.recycle();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public PatternPathMotion(android.graphics.Path path) {
        this.mPatternPath = new android.graphics.Path();
        this.mTempMatrix = new android.graphics.Matrix();
        setPatternPath(path);
    }

    public android.graphics.Path getPatternPath() {
        return this.mOriginalPatternPath;
    }

    public void setPatternPath(android.graphics.Path path) {
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new java.lang.IllegalArgumentException("pattern must not end at the starting point");
        }
        this.mTempMatrix.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fDistance = 1.0f / distance(f5, f6);
        this.mTempMatrix.postScale(fDistance, fDistance);
        this.mTempMatrix.postRotate((float) java.lang.Math.toDegrees(-java.lang.Math.atan2(f6, f5)));
        path.transform(this.mTempMatrix, this.mPatternPath);
        this.mOriginalPatternPath = path;
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fDistance = distance(f5, f6);
        double dAtan2 = java.lang.Math.atan2(f6, f5);
        this.mTempMatrix.setScale(fDistance, fDistance);
        this.mTempMatrix.postRotate((float) java.lang.Math.toDegrees(dAtan2));
        this.mTempMatrix.postTranslate(f, f2);
        android.graphics.Path path = new android.graphics.Path();
        this.mPatternPath.transform(this.mTempMatrix, path);
        return path;
    }

    private static float distance(float f, float f2) {
        return (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
    }
}
