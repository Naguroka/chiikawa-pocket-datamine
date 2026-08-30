package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ListAdapter<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    final androidx.recyclerview.widget.AsyncListDiffer<T> mDiffer;
    private final androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> mListener;

    public void onCurrentListChanged(java.util.List<T> list, java.util.List<T> list2) {
    }

    protected ListAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> listListener = new androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>() { // from class: androidx.recyclerview.widget.ListAdapter.1
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public void onCurrentListChanged(java.util.List<T> list, java.util.List<T> list2) {
                androidx.recyclerview.widget.ListAdapter.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = listListener;
        androidx.recyclerview.widget.AsyncListDiffer<T> asyncListDiffer = new androidx.recyclerview.widget.AsyncListDiffer<>(new androidx.recyclerview.widget.AdapterListUpdateCallback(this), new androidx.recyclerview.widget.AsyncDifferConfig.Builder(itemCallback).build());
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.addListListener(listListener);
    }

    protected ListAdapter(androidx.recyclerview.widget.AsyncDifferConfig<T> asyncDifferConfig) {
        androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> listListener = new androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>() { // from class: androidx.recyclerview.widget.ListAdapter.1
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public void onCurrentListChanged(java.util.List<T> list, java.util.List<T> list2) {
                androidx.recyclerview.widget.ListAdapter.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = listListener;
        androidx.recyclerview.widget.AsyncListDiffer<T> asyncListDiffer = new androidx.recyclerview.widget.AsyncListDiffer<>(new androidx.recyclerview.widget.AdapterListUpdateCallback(this), asyncDifferConfig);
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.addListListener(listListener);
    }

    public void submitList(java.util.List<T> list) {
        this.mDiffer.submitList(list);
    }

    public void submitList(java.util.List<T> list, java.lang.Runnable runnable) {
        this.mDiffer.submitList(list, runnable);
    }

    protected T getItem(int i) {
        return this.mDiffer.getCurrentList().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.getCurrentList().size();
    }

    public java.util.List<T> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }
}
