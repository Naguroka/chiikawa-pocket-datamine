package com.google.android.material.divider;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private android.graphics.drawable.Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final android.graphics.Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(android.content.Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, com.google.android.material.R.attr.materialDividerStyle, i);
    }

    public MaterialDividerItemDecoration(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new android.graphics.Rect();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.MaterialDivider, i, DEF_STYLE_RES, new int[0]);
        this.color = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new android.graphics.drawable.ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setDividerThickness(int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(android.content.Context context, int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerColor(int i) {
        this.color = i;
        android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(this.dividerDrawable);
        this.dividerDrawable = drawableWrap;
        androidx.core.graphics.drawable.DrawableCompat.setTint(drawableWrap, i);
    }

    public void setDividerColorResource(android.content.Context context, int i) {
        setDividerColor(androidx.core.content.ContextCompat.getColor(context, i));
    }

    public int getDividerColor() {
        return this.color;
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(android.content.Context context, int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(android.content.Context context, int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    private void drawForVerticalOrientation(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
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
        boolean z = androidx.core.view.ViewCompat.getLayoutDirection(recyclerView) == 1;
        int i = paddingLeft + (z ? this.insetEnd : this.insetStart);
        int i2 = width - (z ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        if (!this.lastItemDecorated) {
            childCount--;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.tempRect);
            int iRound = this.tempRect.bottom + java.lang.Math.round(childAt.getTranslationY());
            this.dividerDrawable.setBounds(i, (iRound - this.dividerDrawable.getIntrinsicHeight()) - this.thickness, i2, iRound);
            this.dividerDrawable.draw(canvas);
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
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
        int i = paddingTop + this.insetStart;
        int i2 = height - this.insetEnd;
        int childCount = recyclerView.getChildCount();
        if (!this.lastItemDecorated) {
            childCount--;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.tempRect);
            int iRound = this.tempRect.right + java.lang.Math.round(childAt.getTranslationX());
            this.dividerDrawable.setBounds((iRound - this.dividerDrawable.getIntrinsicWidth()) - this.thickness, i, iRound, i2);
            this.dividerDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (this.lastItemDecorated || recyclerView.getChildLayoutPosition(view) != state.getItemCount() - 1) {
            if (this.orientation == 1) {
                rect.bottom = this.dividerDrawable.getIntrinsicHeight() + this.thickness;
            } else {
                rect.right = this.dividerDrawable.getIntrinsicWidth() + this.thickness;
            }
        }
    }
}
