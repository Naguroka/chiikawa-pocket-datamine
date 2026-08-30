package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class TileList<T> {
    androidx.recyclerview.widget.TileList.Tile<T> mLastAccessedTile;
    final int mTileSize;
    private final android.util.SparseArray<androidx.recyclerview.widget.TileList.Tile<T>> mTiles = new android.util.SparseArray<>(10);

    public TileList(int i) {
        this.mTileSize = i;
    }

    public T getItemAt(int i) {
        androidx.recyclerview.widget.TileList.Tile<T> tile = this.mLastAccessedTile;
        if (tile == null || !tile.containsPosition(i)) {
            int iIndexOfKey = this.mTiles.indexOfKey(i - (i % this.mTileSize));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(iIndexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i);
    }

    public int size() {
        return this.mTiles.size();
    }

    public void clear() {
        this.mTiles.clear();
    }

    public androidx.recyclerview.widget.TileList.Tile<T> getAtIndex(int i) {
        if (i < 0 || i >= this.mTiles.size()) {
            return null;
        }
        return this.mTiles.valueAt(i);
    }

    public androidx.recyclerview.widget.TileList.Tile<T> addOrReplace(androidx.recyclerview.widget.TileList.Tile<T> tile) {
        int iIndexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (iIndexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        androidx.recyclerview.widget.TileList.Tile<T> tileValueAt = this.mTiles.valueAt(iIndexOfKey);
        this.mTiles.setValueAt(iIndexOfKey, tile);
        if (this.mLastAccessedTile == tileValueAt) {
            this.mLastAccessedTile = tile;
        }
        return tileValueAt;
    }

    public androidx.recyclerview.widget.TileList.Tile<T> removeAtPos(int i) {
        androidx.recyclerview.widget.TileList.Tile<T> tile = this.mTiles.get(i);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i);
        return tile;
    }

    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        androidx.recyclerview.widget.TileList.Tile<T> mNext;
        public int mStartPosition;

        Tile(java.lang.Class<T> cls, int i) {
            this.mItems = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i));
        }

        boolean containsPosition(int i) {
            int i2 = this.mStartPosition;
            return i2 <= i && i < i2 + this.mItemCount;
        }

        T getByPosition(int i) {
            return this.mItems[i - this.mStartPosition];
        }
    }
}
