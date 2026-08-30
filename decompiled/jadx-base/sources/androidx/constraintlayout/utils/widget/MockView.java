package androidx.constraintlayout.utils.widget;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends android.view.View {
    private int mDiagonalsColor;
    private boolean mDrawDiagonals;
    private boolean mDrawLabel;
    private int mMargin;
    private android.graphics.Paint mPaintDiagonals;
    private android.graphics.Paint mPaintText;
    private android.graphics.Paint mPaintTextBackground;
    protected java.lang.String mText;
    private int mTextBackgroundColor;
    private android.graphics.Rect mTextBounds;
    private int mTextColor;

    public MockView(android.content.Context context) {
        super(context);
        this.mPaintDiagonals = new android.graphics.Paint();
        this.mPaintText = new android.graphics.Paint();
        this.mPaintTextBackground = new android.graphics.Paint();
        this.mDrawDiagonals = true;
        this.mDrawLabel = true;
        this.mText = null;
        this.mTextBounds = new android.graphics.Rect();
        this.mDiagonalsColor = android.graphics.Color.argb(255, 0, 0, 0);
        this.mTextColor = android.graphics.Color.argb(255, 200, 200, 200);
        this.mTextBackgroundColor = android.graphics.Color.argb(255, 50, 50, 50);
        this.mMargin = 4;
        init(context, null);
    }

    public MockView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mPaintDiagonals = new android.graphics.Paint();
        this.mPaintText = new android.graphics.Paint();
        this.mPaintTextBackground = new android.graphics.Paint();
        this.mDrawDiagonals = true;
        this.mDrawLabel = true;
        this.mText = null;
        this.mTextBounds = new android.graphics.Rect();
        this.mDiagonalsColor = android.graphics.Color.argb(255, 0, 0, 0);
        this.mTextColor = android.graphics.Color.argb(255, 200, 200, 200);
        this.mTextBackgroundColor = android.graphics.Color.argb(255, 50, 50, 50);
        this.mMargin = 4;
        init(context, attrs);
    }

    public MockView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mPaintDiagonals = new android.graphics.Paint();
        this.mPaintText = new android.graphics.Paint();
        this.mPaintTextBackground = new android.graphics.Paint();
        this.mDrawDiagonals = true;
        this.mDrawLabel = true;
        this.mText = null;
        this.mTextBounds = new android.graphics.Rect();
        this.mDiagonalsColor = android.graphics.Color.argb(255, 0, 0, 0);
        this.mTextColor = android.graphics.Color.argb(255, 200, 200, 200);
        this.mTextBackgroundColor = android.graphics.Color.argb(255, 50, 50, 50);
        this.mMargin = 4;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_label) {
                    this.mText = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_showDiagonals) {
                    this.mDrawDiagonals = typedArrayObtainStyledAttributes.getBoolean(index, this.mDrawDiagonals);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_diagonalsColor) {
                    this.mDiagonalsColor = typedArrayObtainStyledAttributes.getColor(index, this.mDiagonalsColor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_labelBackgroundColor) {
                    this.mTextBackgroundColor = typedArrayObtainStyledAttributes.getColor(index, this.mTextBackgroundColor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_labelColor) {
                    this.mTextColor = typedArrayObtainStyledAttributes.getColor(index, this.mTextColor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_showLabel) {
                    this.mDrawLabel = typedArrayObtainStyledAttributes.getBoolean(index, this.mDrawLabel);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mText == null) {
            try {
                this.mText = context.getResources().getResourceEntryName(getId());
            } catch (java.lang.Exception unused) {
            }
        }
        this.mPaintDiagonals.setColor(this.mDiagonalsColor);
        this.mPaintDiagonals.setAntiAlias(true);
        this.mPaintText.setColor(this.mTextColor);
        this.mPaintText.setAntiAlias(true);
        this.mPaintTextBackground.setColor(this.mTextBackgroundColor);
        this.mMargin = java.lang.Math.round(this.mMargin * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.mDrawDiagonals) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.mPaintDiagonals);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.mPaintDiagonals);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.mPaintDiagonals);
            canvas.drawLine(f, 0.0f, f, f2, this.mPaintDiagonals);
            canvas.drawLine(f, f2, 0.0f, f2, this.mPaintDiagonals);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.mPaintDiagonals);
        }
        java.lang.String str = this.mText;
        if (str == null || !this.mDrawLabel) {
            return;
        }
        this.mPaintText.getTextBounds(str, 0, str.length(), this.mTextBounds);
        float fWidth = (width - this.mTextBounds.width()) / 2.0f;
        float fHeight = ((height - this.mTextBounds.height()) / 2.0f) + this.mTextBounds.height();
        this.mTextBounds.offset((int) fWidth, (int) fHeight);
        android.graphics.Rect rect = this.mTextBounds;
        rect.set(rect.left - this.mMargin, this.mTextBounds.top - this.mMargin, this.mTextBounds.right + this.mMargin, this.mTextBounds.bottom + this.mMargin);
        canvas.drawRect(this.mTextBounds, this.mPaintTextBackground);
        canvas.drawText(this.mText, fWidth, fHeight, this.mPaintText);
    }
}
