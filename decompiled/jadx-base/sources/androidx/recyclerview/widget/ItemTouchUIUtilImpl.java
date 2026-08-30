package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class ItemTouchUIUtilImpl implements androidx.recyclerview.widget.ItemTouchUIUtil {
    static final androidx.recyclerview.widget.ItemTouchUIUtil INSTANCE = new androidx.recyclerview.widget.ItemTouchUIUtilImpl();

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(android.view.View view) {
    }

    ItemTouchUIUtilImpl() {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation) == null) {
            java.lang.Float fValueOf = java.lang.Float.valueOf(androidx.core.view.ViewCompat.getElevation(view));
            androidx.core.view.ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
            view.setTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    private static float findMaxElevation(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float elevation = androidx.core.view.ViewCompat.getElevation(childAt);
                if (elevation > f) {
                    f = elevation;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(android.view.View view) {
        java.lang.Object tag = view.getTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation);
        if (tag instanceof java.lang.Float) {
            androidx.core.view.ViewCompat.setElevation(view, ((java.lang.Float) tag).floatValue());
        }
        view.setTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
