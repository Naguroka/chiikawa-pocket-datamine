package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class GhostViewPort extends android.view.ViewGroup implements androidx.transition.GhostView {
    private android.graphics.Matrix mMatrix;
    private final android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    android.view.ViewGroup mStartParent;
    android.view.View mStartView;
    final android.view.View mView;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    GhostViewPort(android.view.View view) {
        super(view.getContext());
        this.mOnPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(androidx.transition.GhostViewPort.this);
                if (androidx.transition.GhostViewPort.this.mStartParent == null || androidx.transition.GhostViewPort.this.mStartView == null) {
                    return true;
                }
                androidx.transition.GhostViewPort.this.mStartParent.endViewTransition(androidx.transition.GhostViewPort.this.mStartView);
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(androidx.transition.GhostViewPort.this.mStartParent);
                androidx.transition.GhostViewPort.this.mStartParent = null;
                androidx.transition.GhostViewPort.this.mStartView = null;
                return true;
            }
        };
        this.mView = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getGhostView(this.mView) == this) {
            androidx.transition.ViewUtils.setTransitionVisibility(this.mView, i == 0 ? 4 : 0);
        }
    }

    void setMatrix(android.graphics.Matrix matrix) {
        this.mMatrix = matrix;
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(android.view.ViewGroup viewGroup, android.view.View view) {
        this.mStartParent = viewGroup;
        this.mStartView = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        androidx.transition.ViewUtils.setTransitionVisibility(this.mView, 4);
        if (this.mView.getParent() != null) {
            ((android.view.View) this.mView.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        androidx.transition.ViewUtils.setTransitionVisibility(this.mView, 0);
        setGhostView(this.mView, null);
        if (this.mView.getParent() != null) {
            ((android.view.View) this.mView.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        androidx.transition.CanvasUtils.enableZ(canvas, true);
        canvas.setMatrix(this.mMatrix);
        androidx.transition.ViewUtils.setTransitionVisibility(this.mView, 0);
        this.mView.invalidate();
        androidx.transition.ViewUtils.setTransitionVisibility(this.mView, 4);
        drawChild(canvas, this.mView, getDrawingTime());
        androidx.transition.CanvasUtils.enableZ(canvas, false);
    }

    static void copySize(android.view.View view, android.view.View view2) {
        androidx.transition.ViewUtils.setLeftTopRightBottom(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static androidx.transition.GhostViewPort getGhostView(android.view.View view) {
        return (androidx.transition.GhostViewPort) view.getTag(androidx.transition.R.id.ghost_view);
    }

    static void setGhostView(android.view.View view, androidx.transition.GhostViewPort ghostViewPort) {
        view.setTag(androidx.transition.R.id.ghost_view, ghostViewPort);
    }

    static void calculateMatrix(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.getParent();
        matrix.reset();
        androidx.transition.ViewUtils.transformMatrixToGlobal(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        androidx.transition.ViewUtils.transformMatrixToLocal(viewGroup, matrix);
    }

    static androidx.transition.GhostViewPort addGhost(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        int i;
        androidx.transition.GhostViewHolder ghostViewHolder;
        if (!(view.getParent() instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        androidx.transition.GhostViewHolder holder = androidx.transition.GhostViewHolder.getHolder(viewGroup);
        androidx.transition.GhostViewPort ghostView = getGhostView(view);
        if (ghostView == null || (ghostViewHolder = (androidx.transition.GhostViewHolder) ghostView.getParent()) == holder) {
            i = 0;
        } else {
            i = ghostView.mReferences;
            ghostViewHolder.removeView(ghostView);
            ghostView = null;
        }
        if (ghostView == null) {
            if (matrix == null) {
                matrix = new android.graphics.Matrix();
                calculateMatrix(view, viewGroup, matrix);
            }
            ghostView = new androidx.transition.GhostViewPort(view);
            ghostView.setMatrix(matrix);
            if (holder == null) {
                holder = new androidx.transition.GhostViewHolder(viewGroup);
            } else {
                holder.popToOverlayTop();
            }
            copySize(viewGroup, holder);
            copySize(viewGroup, ghostView);
            holder.addGhostView(ghostView);
            ghostView.mReferences = i;
        } else if (matrix != null) {
            ghostView.setMatrix(matrix);
        }
        ghostView.mReferences++;
        return ghostView;
    }

    static void removeGhost(android.view.View view) {
        androidx.transition.GhostViewPort ghostView = getGhostView(view);
        if (ghostView != null) {
            int i = ghostView.mReferences - 1;
            ghostView.mReferences = i;
            if (i <= 0) {
                ((androidx.transition.GhostViewHolder) ghostView.getParent()).removeView(ghostView);
            }
        }
    }
}
