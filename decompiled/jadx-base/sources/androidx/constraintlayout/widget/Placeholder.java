package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends android.view.View {
    private android.view.View mContent;
    private int mContentId;
    private int mEmptyVisibility;

    public Placeholder(android.content.Context context) {
        super(context);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(null);
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(attrs);
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(attrs);
    }

    public Placeholder(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(attrs);
    }

    private void init(android.util.AttributeSet attrs) {
        super.setVisibility(this.mEmptyVisibility);
        this.mContentId = -1;
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_placeholder_content) {
                    this.mContentId = typedArrayObtainStyledAttributes.getResourceId(index, this.mContentId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.mEmptyVisibility = typedArrayObtainStyledAttributes.getInt(index, this.mEmptyVisibility);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setEmptyVisibility(int visibility) {
        this.mEmptyVisibility = visibility;
    }

    public int getEmptyVisibility() {
        return this.mEmptyVisibility;
    }

    public android.view.View getContent() {
        return this.mContent;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
            android.graphics.Rect rect = new android.graphics.Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(android.graphics.Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout container) {
        if (this.mContentId == -1 && !isInEditMode()) {
            setVisibility(this.mEmptyVisibility);
        }
        android.view.View viewFindViewById = container.findViewById(this.mContentId);
        this.mContent = viewFindViewById;
        if (viewFindViewById != null) {
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).isInPlaceholder = true;
            this.mContent.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int id) {
        android.view.View viewFindViewById;
        if (this.mContentId == id) {
            return;
        }
        android.view.View view = this.mContent;
        if (view != null) {
            view.setVisibility(0);
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.mContent.getLayoutParams()).isInPlaceholder = false;
            this.mContent = null;
        }
        this.mContentId = id;
        if (id == -1 || (viewFindViewById = ((android.view.View) getParent()).findViewById(id)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout container) {
        if (this.mContent == null) {
            return;
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.mContent.getLayoutParams();
        layoutParams2.widget.setVisibility(0);
        if (layoutParams.widget.getHorizontalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            layoutParams.widget.setWidth(layoutParams2.widget.getWidth());
        }
        if (layoutParams.widget.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            layoutParams.widget.setHeight(layoutParams2.widget.getHeight());
        }
        layoutParams2.widget.setVisibility(8);
    }
}
