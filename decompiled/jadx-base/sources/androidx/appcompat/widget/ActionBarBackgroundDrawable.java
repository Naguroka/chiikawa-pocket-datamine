package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class ActionBarBackgroundDrawable extends android.graphics.drawable.Drawable {
    final androidx.appcompat.widget.ActionBarContainer mContainer;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public ActionBarBackgroundDrawable(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.mContainer = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.mContainer.mIsSplit) {
            if (this.mContainer.mSplitBackground != null) {
                this.mContainer.mSplitBackground.draw(canvas);
            }
        } else {
            if (this.mContainer.mBackground != null) {
                this.mContainer.mBackground.draw(canvas);
            }
            if (this.mContainer.mStackedBackground == null || !this.mContainer.mIsStacked) {
                return;
            }
            this.mContainer.mStackedBackground.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.mContainer.mIsSplit) {
            if (this.mContainer.mSplitBackground != null) {
                androidx.appcompat.widget.ActionBarBackgroundDrawable.Api21Impl.getOutline(this.mContainer.mBackground, outline);
            }
        } else if (this.mContainer.mBackground != null) {
            androidx.appcompat.widget.ActionBarBackgroundDrawable.Api21Impl.getOutline(this.mContainer.mBackground, outline);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        public static void getOutline(android.graphics.drawable.Drawable drawable, android.graphics.Outline outline) {
            drawable.getOutline(outline);
        }
    }
}
