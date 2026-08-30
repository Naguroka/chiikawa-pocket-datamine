package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void loadTile(int i, int i2);

        void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> tile);

        void refresh(int i);

        void updateRange(int i, int i2, int i3, int i4, int i5);
    }

    public interface MainThreadCallback<T> {
        void addTile(int i, androidx.recyclerview.widget.TileList.Tile<T> tile);

        void removeTile(int i, int i2);

        void updateItemCount(int i, int i2);
    }

    androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getBackgroundProxy(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback);

    androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getMainThreadProxy(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mainThreadCallback);
}
