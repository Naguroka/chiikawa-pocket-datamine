package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class DividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {android.R.attr.listDivider};
    public static final int HORIZONTAL = 0;
    private static final java.lang.String TAG = "DividerItem";
    public static final int VERTICAL = 1;
    private final android.graphics.Rect mBounds = new android.graphics.Rect();
    private android.graphics.drawable.Drawable mDivider;
    private int mOrientation;

    public DividerItemDecoration(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.mDivider = drawable;
        if (drawable == null) {
            android.util.Log.w(TAG, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.mOrientation = i;
    }

    public void setDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            throw new java.lang.IllegalArgumentException("Drawable cannot be null.");
        }
        this.mDivider = drawable;
    }

    public android.graphics.drawable.Drawable getDrawable() {
        return this.mDivider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null || this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }

    private void drawVertical(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.mBounds);
            int iRound = this.mBounds.bottom + java.lang.Math.round(childAt.getTranslationY());
            this.mDivider.setBounds(paddingLeft, iRound - this.mDivider.getIntrinsicHeight(), width, iRound);
            this.mDivider.draw(canvas);
        }
        canvas.restore();
    }

    private void drawHorizontal(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.mBounds);
            int iRound = this.mBounds.right + java.lang.Math.round(childAt.getTranslationX());
            this.mDivider.setBounds(iRound - this.mDivider.getIntrinsicWidth(), paddingTop, iRound, height);
            this.mDivider.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        android.graphics.drawable.Drawable drawable = this.mDivider;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.mOrientation == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
