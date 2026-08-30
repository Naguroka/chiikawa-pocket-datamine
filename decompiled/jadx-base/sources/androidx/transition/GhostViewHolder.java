package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class GhostViewHolder extends android.widget.FrameLayout {
    private boolean mAttached;
    private android.view.ViewGroup mParent;

    GhostViewHolder(android.view.ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.mParent = viewGroup;
        viewGroup.setTag(androidx.transition.R.id.ghost_view_holder, this);
        androidx.transition.ViewGroupUtils.getOverlay(this.mParent).add(this);
        this.mAttached = true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        if (!this.mAttached) {
            throw new java.lang.IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.mParent.setTag(androidx.transition.R.id.ghost_view_holder, null);
            androidx.transition.ViewGroupUtils.getOverlay(this.mParent).remove(this);
            this.mAttached = false;
        }
    }

    static androidx.transition.GhostViewHolder getHolder(android.view.ViewGroup viewGroup) {
        return (androidx.transition.GhostViewHolder) viewGroup.getTag(androidx.transition.R.id.ghost_view_holder);
    }

    void popToOverlayTop() {
        if (!this.mAttached) {
            throw new java.lang.IllegalStateException("This GhostViewHolder is detached!");
        }
        androidx.transition.ViewGroupUtils.getOverlay(this.mParent).remove(this);
        androidx.transition.ViewGroupUtils.getOverlay(this.mParent).add(this);
    }

    void addGhostView(androidx.transition.GhostViewPort ghostViewPort) {
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        getParents(ghostViewPort.mView, arrayList);
        int insertIndex = getInsertIndex(arrayList);
        if (insertIndex < 0 || insertIndex >= getChildCount()) {
            addView(ghostViewPort);
        } else {
            addView(ghostViewPort, insertIndex);
        }
    }

    private int getInsertIndex(java.util.ArrayList<android.view.View> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            getParents(((androidx.transition.GhostViewPort) getChildAt(i2)).mView, arrayList2);
            if (isOnTop(arrayList, (java.util.ArrayList<android.view.View>) arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    private static boolean isOnTop(java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = java.lang.Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < iMin; i++) {
            android.view.View view = arrayList.get(i);
            android.view.View view2 = arrayList2.get(i);
            if (view != view2) {
                return isOnTop(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    private static void getParents(android.view.View view, java.util.ArrayList<android.view.View> arrayList) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            getParents((android.view.View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean isOnTop(android.view.View view, android.view.View view2) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(androidx.transition.ViewGroupUtils.getChildDrawingOrder(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }
}
