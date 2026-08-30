package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class PreferenceRecyclerViewAccessibilityDelegate extends androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate {
    final androidx.core.view.AccessibilityDelegateCompat mDefaultItemDelegate;
    final androidx.core.view.AccessibilityDelegateCompat mItemDelegate;
    final androidx.recyclerview.widget.RecyclerView mRecyclerView;

    public PreferenceRecyclerViewAccessibilityDelegate(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(recyclerView);
        this.mDefaultItemDelegate = super.getItemDelegate();
        this.mItemDelegate = new androidx.core.view.AccessibilityDelegateCompat() { // from class: androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                androidx.preference.Preference item;
                androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.mDefaultItemDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int childAdapterPosition = androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.mRecyclerView.getChildAdapterPosition(view);
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.mRecyclerView.getAdapter();
                if ((adapter instanceof androidx.preference.PreferenceGroupAdapter) && (item = ((androidx.preference.PreferenceGroupAdapter) adapter).getItem(childAdapterPosition)) != null) {
                    item.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
                return androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.this.mDefaultItemDelegate.performAccessibilityAction(view, i, bundle);
            }
        };
        this.mRecyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public androidx.core.view.AccessibilityDelegateCompat getItemDelegate() {
        return this.mItemDelegate;
    }
}
