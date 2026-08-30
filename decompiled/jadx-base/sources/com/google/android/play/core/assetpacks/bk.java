package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bk extends com.google.android.play.core.assetpacks.internal.an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.File f2154a;
    private final java.io.File b;
    private final java.util.NavigableMap c = new java.util.TreeMap();

    bk(java.io.File file, java.io.File file2) throws java.io.IOException {
        this.f2154a = file;
        this.b = file2;
        java.util.List<java.io.File> listA = com.google.android.play.core.assetpacks.eq.a(file, file2);
        if (listA.isEmpty()) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (java.io.File file3 : listA) {
            this.c.put(java.lang.Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    private final java.io.InputStream d(long j, java.lang.Long l) throws java.io.IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.io.File) this.c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.assetpacks.internal.an
    public final long a() {
        java.util.Map.Entry entryLastEntry = this.c.lastEntry();
        return ((java.lang.Long) entryLastEntry.getKey()).longValue() + ((java.io.File) entryLastEntry.getValue()).length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.play.core.assetpacks.internal.an
    protected final java.io.InputStream b(long j, long j2) throws java.io.IOException {
        if (j < 0 || j2 < 0) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Invalid input parameters %s, %s", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 > a()) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", java.lang.Long.valueOf(a()), java.lang.Long.valueOf(j3)));
        }
        java.lang.Long l = (java.lang.Long) this.c.floorKey(java.lang.Long.valueOf(j));
        java.lang.Long l2 = (java.lang.Long) this.c.floorKey(java.lang.Long.valueOf(j3));
        if (l.equals(l2)) {
            return new com.google.android.play.core.assetpacks.bj(d(j, l), j2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(d(j, l));
        java.util.Collection collectionValues = this.c.subMap(l, false, l2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new com.google.android.play.core.assetpacks.dr(java.util.Collections.enumeration(collectionValues)));
        }
        arrayList.add(new com.google.android.play.core.assetpacks.bj(new java.io.FileInputStream((java.io.File) this.c.get(l2)), j2 - (l2.longValue() - j)));
        return new java.io.SequenceInputStream(java.util.Collections.enumeration(arrayList));
    }
}
