package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final java.lang.String TAG = "ACTVAutoSizeHelper";
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private final android.content.Context mContext;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl mImpl;
    private android.text.TextPaint mTempTextPaint;
    private final android.widget.TextView mTextView;
    private static final android.graphics.RectF TEMP_RECTF = new android.graphics.RectF();
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> sTextViewMethodByNameCache = new java.util.concurrent.ConcurrentHashMap<>();
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> sTextViewFieldByNameCache = new java.util.concurrent.ConcurrentHashMap<>();
    private int mAutoSizeTextType = 0;
    private boolean mNeedsAutoSizeText = false;
    private float mAutoSizeStepGranularityInPx = -1.0f;
    private float mAutoSizeMinTextSizeInPx = -1.0f;
    private float mAutoSizeMaxTextSizeInPx = -1.0f;
    private int[] mAutoSizeTextSizesInPx = new int[0];
    private boolean mHasPresetAutoSizeValues = false;

    private static class Impl {
        void computeAndSetTextDirection(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
        }

        Impl() {
        }

        boolean isHorizontallyScrollable(android.widget.TextView textView) {
            return ((java.lang.Boolean) androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getHorizontallyScrolling", false)).booleanValue();
        }
    }

    private static class Impl23 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl {
        Impl23() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
            builder.setTextDirection((android.text.TextDirectionHeuristic) androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getTextDirectionHeuristic", android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class Impl29 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23 {
        Impl29() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean isHorizontallyScrollable(android.widget.TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    AppCompatTextViewAutoSizeHelper(android.widget.TextView textView) {
        this.mTextView = textView;
        this.mContext = textView.getContext();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl29();
        } else {
            this.mImpl = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23();
        }
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.AppCompatTextView, i, 0);
        android.widget.TextView textView = this.mTextView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), androidx.appcompat.R.styleable.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.mAutoSizeTextType = typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            android.content.res.TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            setupAutoSizeUniformPresetSizes(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (supportsAutoSizeText()) {
            if (this.mAutoSizeTextType == 1) {
                if (!this.mHasPresetAutoSizeValues) {
                    android.util.DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    validateAndSetAutoSizeTextTypeUniformConfiguration(dimension2, dimension3, dimension);
                }
                setupAutoSizeText();
                return;
            }
            return;
        }
        this.mAutoSizeTextType = 0;
    }

    void setAutoSizeTextTypeWithDefaults(int i) {
        if (supportsAutoSizeText()) {
            if (i == 0) {
                clearAutoSizeConfiguration();
                return;
            }
            if (i == 1) {
                android.util.DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                validateAndSetAutoSizeTextTypeUniformConfiguration(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (setupAutoSizeText()) {
                    autoSizeText();
                    return;
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        if (supportsAutoSizeText()) {
            android.util.DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            validateAndSetAutoSizeTextTypeUniformConfiguration(android.util.TypedValue.applyDimension(i4, i, displayMetrics), android.util.TypedValue.applyDimension(i4, i2, displayMetrics), android.util.TypedValue.applyDimension(i4, i3, displayMetrics));
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws java.lang.IllegalArgumentException {
        if (supportsAutoSizeText()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = java.lang.Math.round(android.util.TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArrCopyOf);
                if (!setupAutoSizeUniformPresetSizesConfiguration()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                this.mHasPresetAutoSizeValues = false;
            }
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextType;
    }

    int getAutoSizeStepGranularity() {
        return java.lang.Math.round(this.mAutoSizeStepGranularityInPx);
    }

    int getAutoSizeMinTextSize() {
        return java.lang.Math.round(this.mAutoSizeMinTextSizeInPx);
    }

    int getAutoSizeMaxTextSize() {
        return java.lang.Math.round(this.mAutoSizeMaxTextSizeInPx);
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextSizesInPx;
    }

    private void setupAutoSizeUniformPresetSizes(android.content.res.TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            setupAutoSizeUniformPresetSizesConfiguration();
        }
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
        int[] iArr = this.mAutoSizeTextSizesInPx;
        int length = iArr.length;
        boolean z = length > 0;
        this.mHasPresetAutoSizeValues = z;
        if (z) {
            this.mAutoSizeTextType = 1;
            this.mAutoSizeMinTextSizeInPx = iArr[0];
            this.mAutoSizeMaxTextSizeInPx = iArr[length - 1];
            this.mAutoSizeStepGranularityInPx = -1.0f;
        }
        return z;
    }

    private int[] cleanupAutoSizePresetSizes(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        java.util.Arrays.sort(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArr) {
            if (i > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i)) < 0) {
                arrayList.add(java.lang.Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float f, float f2, float f3) throws java.lang.IllegalArgumentException {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.mAutoSizeTextType = 1;
        this.mAutoSizeMinTextSizeInPx = f;
        this.mAutoSizeMaxTextSizeInPx = f2;
        this.mAutoSizeStepGranularityInPx = f3;
        this.mHasPresetAutoSizeValues = false;
    }

    private boolean setupAutoSizeText() {
        if (supportsAutoSizeText() && this.mAutoSizeTextType == 1) {
            if (!this.mHasPresetAutoSizeValues || this.mAutoSizeTextSizesInPx.length == 0) {
                int iFloor = ((int) java.lang.Math.floor((this.mAutoSizeMaxTextSizeInPx - this.mAutoSizeMinTextSizeInPx) / this.mAutoSizeStepGranularityInPx)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = java.lang.Math.round(this.mAutoSizeMinTextSizeInPx + (i * this.mAutoSizeStepGranularityInPx));
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            }
            this.mNeedsAutoSizeText = true;
        } else {
            this.mNeedsAutoSizeText = false;
        }
        return this.mNeedsAutoSizeText;
    }

    void autoSizeText() {
        if (isAutoSizeEnabled()) {
            if (this.mNeedsAutoSizeText) {
                if (this.mTextView.getMeasuredHeight() <= 0 || this.mTextView.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.mImpl.isHorizontallyScrollable(this.mTextView) ? 1048576 : (this.mTextView.getMeasuredWidth() - this.mTextView.getTotalPaddingLeft()) - this.mTextView.getTotalPaddingRight();
                int height = (this.mTextView.getHeight() - this.mTextView.getCompoundPaddingBottom()) - this.mTextView.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = TEMP_RECTF;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fFindLargestTextSizeWhichFits = findLargestTextSizeWhichFits(rectF);
                    if (fFindLargestTextSizeWhichFits != this.mTextView.getTextSize()) {
                        setTextSizeInternal(0, fFindLargestTextSizeWhichFits);
                    }
                }
            }
            this.mNeedsAutoSizeText = true;
        }
    }

    private void clearAutoSizeConfiguration() {
        this.mAutoSizeTextType = 0;
        this.mAutoSizeMinTextSizeInPx = -1.0f;
        this.mAutoSizeMaxTextSizeInPx = -1.0f;
        this.mAutoSizeStepGranularityInPx = -1.0f;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.mNeedsAutoSizeText = false;
    }

    void setTextSizeInternal(int i, float f) {
        android.content.res.Resources resources;
        android.content.Context context = this.mContext;
        if (context == null) {
            resources = android.content.res.Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        setRawTextSize(android.util.TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void setRawTextSize(float f) {
        if (f != this.mTextView.getPaint().getTextSize()) {
            this.mTextView.getPaint().setTextSize(f);
            boolean zIsInLayout = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api18Impl.isInLayout(this.mTextView);
            if (this.mTextView.getLayout() != null) {
                this.mNeedsAutoSizeText = false;
                try {
                    java.lang.reflect.Method textViewMethod = getTextViewMethod("nullLayouts");
                    if (textViewMethod != null) {
                        textViewMethod.invoke(this.mTextView, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.w(TAG, "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!zIsInLayout) {
                    this.mTextView.requestLayout();
                } else {
                    this.mTextView.forceLayout();
                }
                this.mTextView.invalidate();
            }
        }
    }

    private int findLargestTextSizeWhichFits(android.graphics.RectF rectF) {
        int length = this.mAutoSizeTextSizesInPx.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (suggestedSizeFitsInSpace(this.mAutoSizeTextSizesInPx[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.mAutoSizeTextSizesInPx[i3];
    }

    void initTempTextPaint(int i) {
        android.text.TextPaint textPaint = this.mTempTextPaint;
        if (textPaint == null) {
            this.mTempTextPaint = new android.text.TextPaint();
        } else {
            textPaint.reset();
        }
        this.mTempTextPaint.set(this.mTextView.getPaint());
        this.mTempTextPaint.setTextSize(i);
    }

    android.text.StaticLayout createLayout(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, int i2) {
        return androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api23Impl.createStaticLayoutForMeasuring(charSequence, alignment, i, i2, this.mTextView, this.mTempTextPaint, this.mImpl);
    }

    private boolean suggestedSizeFitsInSpace(int i, android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        java.lang.CharSequence text = this.mTextView.getText();
        android.text.method.TransformationMethod transformationMethod = this.mTextView.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.mTextView)) != null) {
            text = transformation;
        }
        int maxLines = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api16Impl.getMaxLines(this.mTextView);
        initTempTextPaint(i);
        android.text.StaticLayout staticLayoutCreateLayout = createLayout(text, (android.text.Layout.Alignment) invokeAndReturnWithDefault(this.mTextView, "getLayoutAlignment", android.text.Layout.Alignment.ALIGN_NORMAL), java.lang.Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutCreateLayout.getLineCount() <= maxLines && staticLayoutCreateLayout.getLineEnd(staticLayoutCreateLayout.getLineCount() - 1) == text.length())) && ((float) staticLayoutCreateLayout.getHeight()) <= rectF.bottom;
    }

    private android.text.StaticLayout createStaticLayoutForMeasuringPre16(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i) {
        return new android.text.StaticLayout(charSequence, this.mTempTextPaint, i, alignment, ((java.lang.Float) accessAndReturnWithDefault(this.mTextView, "mSpacingMult", java.lang.Float.valueOf(1.0f))).floatValue(), ((java.lang.Float) accessAndReturnWithDefault(this.mTextView, "mSpacingAdd", java.lang.Float.valueOf(0.0f))).floatValue(), ((java.lang.Boolean) accessAndReturnWithDefault(this.mTextView, "mIncludePad", true)).booleanValue());
    }

    static <T> T invokeAndReturnWithDefault(java.lang.Object obj, java.lang.String str, T t) {
        try {
            return (T) getTextViewMethod(str).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    private static <T> T accessAndReturnWithDefault(java.lang.Object obj, java.lang.String str, T t) {
        try {
            java.lang.reflect.Field textViewField = getTextViewField(str);
            return textViewField == null ? t : (T) textViewField.get(obj);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    private static java.lang.reflect.Method getTextViewMethod(java.lang.String str) {
        try {
            java.lang.reflect.Method declaredMethod = sTextViewMethodByNameCache.get(str);
            if (declaredMethod == null && (declaredMethod = android.widget.TextView.class.getDeclaredMethod(str, new java.lang.Class[0])) != null) {
                declaredMethod.setAccessible(true);
                sTextViewMethodByNameCache.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    private static java.lang.reflect.Field getTextViewField(java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = sTextViewFieldByNameCache.get(str);
            if (declaredField == null && (declaredField = android.widget.TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                sTextViewFieldByNameCache.put(str, declaredField);
            }
            return declaredField;
        } catch (java.lang.NoSuchFieldException e) {
            android.util.Log.w(TAG, "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    boolean isAutoSizeEnabled() {
        return supportsAutoSizeText() && this.mAutoSizeTextType != 0;
    }

    private boolean supportsAutoSizeText() {
        return !(this.mTextView instanceof androidx.appcompat.widget.AppCompatEditText);
    }

    private static final class Api23Impl {
        private Api23Impl() {
        }

        static android.text.StaticLayout createStaticLayoutForMeasuring(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, int i2, android.widget.TextView textView, android.text.TextPaint textPaint, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl impl) {
            android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            android.text.StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                impl.computeAndSetTextDirection(builderObtain, textView);
            } catch (java.lang.ClassCastException unused) {
                android.util.Log.w(androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TAG, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static final class Api18Impl {
        private Api18Impl() {
        }

        static boolean isInLayout(android.view.View view) {
            return view.isInLayout();
        }
    }

    private static final class Api16Impl {
        private Api16Impl() {
        }

        static int getMaxLines(android.widget.TextView textView) {
            return textView.getMaxLines();
        }

        static android.text.StaticLayout createStaticLayoutForMeasuring(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, android.widget.TextView textView, android.text.TextPaint textPaint) {
            return new android.text.StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }
    }
}
