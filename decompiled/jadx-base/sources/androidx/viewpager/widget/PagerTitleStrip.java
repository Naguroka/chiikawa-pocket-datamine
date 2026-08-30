package androidx.viewpager.widget;

/* JADX INFO: loaded from: classes3.dex */
@androidx.viewpager.widget.ViewPager.DecorView
public class PagerTitleStrip extends android.view.ViewGroup {
    private static final float SIDE_ALPHA = 0.6f;
    private static final int TEXT_SPACING = 16;
    android.widget.TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    android.widget.TextView mNextText;
    private int mNonPrimaryAlpha;
    private final androidx.viewpager.widget.PagerTitleStrip.PageListener mPageListener;
    androidx.viewpager.widget.ViewPager mPager;
    android.widget.TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> mWatchingAdapter;
    private static final int[] ATTRS = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.gravity};
    private static final int[] TEXT_ATTRS = {android.R.attr.textAllCaps};

    private static class SingleLineAllCapsTransform extends android.text.method.SingleLineTransformationMethod {
        private java.util.Locale mLocale;

        SingleLineAllCapsTransform(android.content.Context context) {
            this.mLocale = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
            java.lang.CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(android.widget.TextView textView) {
        textView.setTransformationMethod(new androidx.viewpager.widget.PagerTitleStrip.SingleLineAllCapsTransform(textView.getContext()));
    }

    public PagerTitleStrip(android.content.Context context) {
        this(context, null);
    }

    public PagerTitleStrip(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastKnownCurrentPage = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.mPageListener = new androidx.viewpager.widget.PagerTitleStrip.PageListener();
        android.widget.TextView textView = new android.widget.TextView(context);
        this.mPrevText = textView;
        addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            androidx.core.widget.TextViewCompat.setTextAppearance(this.mPrevText, resourceId);
            androidx.core.widget.TextViewCompat.setTextAppearance(this.mCurrText, resourceId);
            androidx.core.widget.TextViewCompat.setTextAppearance(this.mNextText, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.mPrevText.setTextColor(color);
            this.mCurrText.setTextColor(color);
            this.mNextText.setTextColor(color);
        }
        this.mGravity = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(SIDE_ALPHA);
        this.mPrevText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.mCurrText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.mNextText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, TEXT_ATTRS);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.mPrevText);
            setSingleLineAllCaps(this.mCurrText);
            setSingleLineAllCaps(this.mNextText);
        } else {
            this.mPrevText.setSingleLine();
            this.mCurrText.setSingleLine();
            this.mNextText.setSingleLine();
        }
        this.mScaledTextSpacing = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.mScaledTextSpacing = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.mNonPrimaryAlpha = i;
        int i2 = (i << 24) | (this.mTextColor & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i2);
        this.mNextText.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.mTextColor = i;
        this.mCurrText.setTextColor(i);
        int i2 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i2);
        this.mNextText.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.mPrevText.setTextSize(i, f);
        this.mCurrText.setTextSize(i, f);
        this.mNextText.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.mGravity = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof androidx.viewpager.widget.ViewPager)) {
            throw new java.lang.IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) parent;
        androidx.viewpager.widget.PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.mPageListener);
        viewPager.addOnAdapterChangeListener(this.mPageListener);
        this.mPager = viewPager;
        java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> weakReference = this.mWatchingAdapter;
        updateAdapter(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.viewpager.widget.ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    void updateText(int i, androidx.viewpager.widget.PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.mUpdatingText = true;
        java.lang.CharSequence pageTitle = null;
        this.mPrevText.setText((i < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i - 1));
        this.mCurrText.setText((pagerAdapter == null || i >= count) ? null : pagerAdapter.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && pagerAdapter != null) {
            pageTitle = pagerAdapter.getPageTitle(i2);
        }
        this.mNextText.setText(pageTitle);
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mCurrText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mNextText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mLastKnownCurrentPage = i;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mUpdatingText) {
            return;
        }
        super.requestLayout();
    }

    void updateAdapter(androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new java.lang.ref.WeakReference<>(pagerAdapter2);
        }
        androidx.viewpager.widget.ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    void updateTextPositions(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.mLastKnownCurrentPage) {
            updateText(i, this.mPager.getAdapter());
        } else if (!z && f == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int iMax = java.lang.Math.max(java.lang.Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = java.lang.Math.max(java.lang.Math.max(this.mPrevText.getMeasuredHeight() + i11, this.mCurrText.getMeasuredHeight() + i12), this.mNextText.getMeasuredHeight() + i13);
        int i14 = this.mGravity & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            android.widget.TextView textView = this.mCurrText;
            textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
            int iMin = java.lang.Math.min(paddingLeft, (i9 - this.mScaledTextSpacing) - measuredWidth);
            android.widget.TextView textView2 = this.mPrevText;
            textView2.layout(iMin, i3, measuredWidth + iMin, textView2.getMeasuredHeight() + i3);
            int iMax3 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i10 + this.mScaledTextSpacing);
            android.widget.TextView textView3 = this.mNextText;
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.mLastKnownPositionOffset = f;
            this.mUpdatingPositions = false;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        android.widget.TextView textView4 = this.mCurrText;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = java.lang.Math.min(paddingLeft, (i9 - this.mScaledTextSpacing) - measuredWidth);
        android.widget.TextView textView5 = this.mPrevText;
        textView5.layout(iMin2, i3, measuredWidth + iMin2, textView5.getMeasuredHeight() + i3);
        int iMax4 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i10 + this.mScaledTextSpacing);
        android.widget.TextView textView6 = this.mNextText;
        textView6.layout(iMax4, i5, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i5);
        this.mLastKnownPositionOffset = f;
        this.mUpdatingPositions = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMax;
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            throw new java.lang.IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
        this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
        this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
        if (android.view.View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = android.view.View.MeasureSpec.getSize(i2);
        } else {
            iMax = java.lang.Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, android.view.View.resolveSizeAndState(iMax, i2, this.mCurrText.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mPager != null) {
            float f = this.mLastKnownPositionOffset;
            if (f < 0.0f) {
                f = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f, true);
        }
    }

    int getMinHeight() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    private class PageListener extends android.database.DataSetObserver implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private int mScrollState;

        PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            androidx.viewpager.widget.PagerTitleStrip.this.updateTextPositions(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.mScrollState == 0) {
                androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip = androidx.viewpager.widget.PagerTitleStrip.this;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), androidx.viewpager.widget.PagerTitleStrip.this.mPager.getAdapter());
                float f = androidx.viewpager.widget.PagerTitleStrip.this.mLastKnownPositionOffset >= 0.0f ? androidx.viewpager.widget.PagerTitleStrip.this.mLastKnownPositionOffset : 0.0f;
                androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip2 = androidx.viewpager.widget.PagerTitleStrip.this;
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.mScrollState = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
            androidx.viewpager.widget.PagerTitleStrip.this.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip = androidx.viewpager.widget.PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), androidx.viewpager.widget.PagerTitleStrip.this.mPager.getAdapter());
            float f = androidx.viewpager.widget.PagerTitleStrip.this.mLastKnownPositionOffset >= 0.0f ? androidx.viewpager.widget.PagerTitleStrip.this.mLastKnownPositionOffset : 0.0f;
            androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip2 = androidx.viewpager.widget.PagerTitleStrip.this;
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f, true);
        }
    }
}
