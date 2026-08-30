package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleItemAnimator extends androidx.recyclerview.widget.RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

    public abstract boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

    public void onAddFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }

    public void onAddStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }

    public void onChangeFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void onChangeStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void onMoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }

    public void onMoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return !this.mSupportsChangeAnimations || viewHolder.isInvalid();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i = itemHolderInfo.left;
        int i2 = itemHolderInfo.top;
        android.view.View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.left;
        int top = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.top;
        if (!viewHolder.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return animateMove(viewHolder, i, i2, left, top);
        }
        return animateRemove(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        if (itemHolderInfo != null && (itemHolderInfo.left != itemHolderInfo2.left || itemHolderInfo.top != itemHolderInfo2.top)) {
            return animateMove(viewHolder, itemHolderInfo.left, itemHolderInfo.top, itemHolderInfo2.left, itemHolderInfo2.top);
        }
        return animateAdd(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        if (itemHolderInfo.left != itemHolderInfo2.left || itemHolderInfo.top != itemHolderInfo2.top) {
            return animateMove(viewHolder, itemHolderInfo.left, itemHolderInfo.top, itemHolderInfo2.left, itemHolderInfo2.top);
        }
        dispatchMoveFinished(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        int i3 = itemHolderInfo.left;
        int i4 = itemHolderInfo.top;
        if (viewHolder2.shouldIgnore()) {
            int i5 = itemHolderInfo.left;
            i2 = itemHolderInfo.top;
            i = i5;
        } else {
            i = itemHolderInfo2.left;
            i2 = itemHolderInfo2.top;
        }
        return animateChange(viewHolder, viewHolder2, i3, i4, i, i2);
    }

    public final void dispatchRemoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchMoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchAddFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchChangeFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
        onChangeFinished(viewHolder, z);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchRemoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public final void dispatchMoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    public final void dispatchAddStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    public final void dispatchChangeStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
        onChangeStarting(viewHolder, z);
    }
}
