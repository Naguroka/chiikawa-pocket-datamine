package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class FlagSet {
    private final android.util.SparseBooleanArray flags;

    public static final class Builder {
        private boolean buildCalled;
        private final android.util.SparseBooleanArray flags = new android.util.SparseBooleanArray();

        public androidx.media3.common.FlagSet.Builder add(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.flags.append(i, true);
            return this;
        }

        public androidx.media3.common.FlagSet.Builder addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        public androidx.media3.common.FlagSet.Builder addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        public androidx.media3.common.FlagSet.Builder addAll(androidx.media3.common.FlagSet flagSet) {
            for (int i = 0; i < flagSet.size(); i++) {
                add(flagSet.get(i));
            }
            return this;
        }

        public androidx.media3.common.FlagSet.Builder remove(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.flags.delete(i);
            return this;
        }

        public androidx.media3.common.FlagSet.Builder removeIf(int i, boolean z) {
            return z ? remove(i) : this;
        }

        public androidx.media3.common.FlagSet.Builder removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        public androidx.media3.common.FlagSet build() {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.common.FlagSet(this.flags);
        }
    }

    private FlagSet(android.util.SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean contains(int i) {
        return this.flags.get(i);
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.flags.size();
    }

    public int get(int i) {
        androidx.media3.common.util.Assertions.checkIndex(i, 0, size());
        return this.flags.keyAt(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.FlagSet)) {
            return false;
        }
        androidx.media3.common.FlagSet flagSet = (androidx.media3.common.FlagSet) obj;
        if (androidx.media3.common.util.Util.SDK_INT < 24) {
            if (size() != flagSet.size()) {
                return false;
            }
            for (int i = 0; i < size(); i++) {
                if (get(i) != flagSet.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.flags.equals(flagSet.flags);
    }

    public int hashCode() {
        if (androidx.media3.common.util.Util.SDK_INT < 24) {
            int size = size();
            for (int i = 0; i < size(); i++) {
                size = (size * 31) + get(i);
            }
            return size;
        }
        return this.flags.hashCode();
    }
}
