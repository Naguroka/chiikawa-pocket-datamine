package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends android.widget.RatingBar {
    private final androidx.appcompat.widget.AppCompatProgressBarHelper mAppCompatProgressBarHelper;

    public AppCompatRatingBar(android.content.Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatProgressBarHelper appCompatProgressBarHelper = new androidx.appcompat.widget.AppCompatProgressBarHelper(this);
        this.mAppCompatProgressBarHelper = appCompatProgressBarHelper;
        appCompatProgressBarHelper.loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.Bitmap sampleTile = this.mAppCompatProgressBarHelper.getSampleTile();
        if (sampleTile != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(sampleTile.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
