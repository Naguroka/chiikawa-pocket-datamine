package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class TexturePool {
    private final int capacity;
    private final java.util.Queue<androidx.media3.common.GlTextureInfo> freeTextures;
    private final java.util.Queue<androidx.media3.common.GlTextureInfo> inUseTextures;
    private final boolean useHighPrecisionColorComponents;

    public TexturePool(boolean z, int i) {
        this.capacity = i;
        this.useHighPrecisionColorComponents = z;
        this.freeTextures = new java.util.ArrayDeque(i);
        this.inUseTextures = new java.util.ArrayDeque(i);
    }

    public boolean isConfigured() {
        return getIteratorToAllTextures().hasNext();
    }

    public int capacity() {
        return this.capacity;
    }

    public int freeTextureCount() {
        if (!isConfigured()) {
            return this.capacity;
        }
        return this.freeTextures.size();
    }

    public void ensureConfigured(androidx.media3.common.GlObjectsProvider glObjectsProvider, int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        if (!isConfigured()) {
            createTextures(glObjectsProvider, i, i2);
            return;
        }
        androidx.media3.common.GlTextureInfo next = getIteratorToAllTextures().next();
        if (next.width == i && next.height == i2) {
            return;
        }
        deleteAllTextures();
        createTextures(glObjectsProvider, i, i2);
    }

    public androidx.media3.common.GlTextureInfo useTexture() {
        if (this.freeTextures.isEmpty()) {
            throw new java.lang.IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        androidx.media3.common.GlTextureInfo glTextureInfoRemove = this.freeTextures.remove();
        this.inUseTextures.add(glTextureInfoRemove);
        return glTextureInfoRemove;
    }

    public void freeTexture(androidx.media3.common.GlTextureInfo glTextureInfo) {
        androidx.media3.common.util.Assertions.checkState(this.inUseTextures.contains(glTextureInfo));
        this.inUseTextures.remove(glTextureInfo);
        this.freeTextures.add(glTextureInfo);
    }

    public boolean isUsingTexture(androidx.media3.common.GlTextureInfo glTextureInfo) {
        return this.inUseTextures.contains(glTextureInfo);
    }

    public void freeTexture() {
        androidx.media3.common.util.Assertions.checkState(!this.inUseTextures.isEmpty());
        this.freeTextures.add(this.inUseTextures.remove());
    }

    public void freeAllTextures() {
        this.freeTextures.addAll(this.inUseTextures);
        this.inUseTextures.clear();
    }

    public void deleteAllTextures() throws androidx.media3.common.util.GlUtil.GlException {
        java.util.Iterator<androidx.media3.common.GlTextureInfo> iteratorToAllTextures = getIteratorToAllTextures();
        while (iteratorToAllTextures.hasNext()) {
            iteratorToAllTextures.next().release();
        }
        this.freeTextures.clear();
        this.inUseTextures.clear();
    }

    private void createTextures(androidx.media3.common.GlObjectsProvider glObjectsProvider, int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.Assertions.checkState(this.freeTextures.isEmpty());
        androidx.media3.common.util.Assertions.checkState(this.inUseTextures.isEmpty());
        for (int i3 = 0; i3 < this.capacity; i3++) {
            this.freeTextures.add(glObjectsProvider.createBuffersForTexture(androidx.media3.common.util.GlUtil.createTexture(i, i2, this.useHighPrecisionColorComponents), i, i2));
        }
    }

    private java.util.Iterator<androidx.media3.common.GlTextureInfo> getIteratorToAllTextures() {
        return com.google.common.collect.Iterables.concat(this.freeTextures, this.inUseTextures).iterator();
    }
}
