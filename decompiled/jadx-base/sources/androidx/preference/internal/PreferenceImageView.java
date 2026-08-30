package androidx.preference.internal;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceImageView extends android.widget.ImageView {
    private int mMaxHeight;
    private int mMaxWidth;

    public PreferenceImageView(android.content.Context context) {
        this(context, null);
    }

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.PreferenceImageView, i, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.preference.R.styleable.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.preference.R.styleable.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        super.setMaxWidth(i);
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.mMaxHeight = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = android.view.View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = android.view.View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }
}
