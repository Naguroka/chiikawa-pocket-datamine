package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private FragmentViewHolder(android.widget.FrameLayout frameLayout) {
        super(frameLayout);
    }

    static androidx.viewpager2.adapter.FragmentViewHolder create(android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(androidx.core.view.ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new androidx.viewpager2.adapter.FragmentViewHolder(frameLayout);
    }

    android.widget.FrameLayout getContainer() {
        return (android.widget.FrameLayout) this.itemView;
    }
}
