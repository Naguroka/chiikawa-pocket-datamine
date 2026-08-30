package com.bykv.vk.openvk.bg.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg {
    private final java.util.LinkedHashMap<java.lang.String, java.io.File> IL = new java.util.LinkedHashMap<>(0, 0.75f, true);
    private volatile float Kg;
    private final android.os.Handler VB;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.IL WR;
    private final java.util.concurrent.locks.ReentrantReadWriteLock bX;
    public final java.io.File bg;
    private final java.lang.Runnable eo;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock eqN;
    private volatile long iR;
    private final java.util.Set<com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg> ldr;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock zx;

    public interface bg {
        void bg(java.lang.String str);

        void bg(java.util.Set<java.lang.String> set);
    }

    public void bg(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg bgVar) {
        if (bgVar != null) {
            this.ldr.add(bgVar);
        }
    }

    public bX(java.io.File file) throws java.io.IOException {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.bX = reentrantReadWriteLock;
        this.eqN = reentrantReadWriteLock.readLock();
        this.zx = reentrantReadWriteLock.writeLock();
        this.ldr = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        this.iR = 104857600L;
        this.Kg = 0.5f;
        this.WR = new com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.IL();
        this.eo = new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.Kg.ldr.IL(new com.bytedance.sdk.component.Kg.Kg("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.this.IL(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.this.iR);
                    }
                });
            }
        };
        this.VB = new android.os.Handler(android.os.Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            throw new java.io.IOException("dir error!  ".concat(java.lang.String.valueOf(file == null ? " dir null" : "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite())));
        }
        this.bg = file;
        com.bytedance.sdk.component.Kg.ldr.IL(new com.bytedance.sdk.component.Kg.Kg("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.this.IL();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        this.zx.lock();
        try {
            java.io.File[] fileArrListFiles = this.bg.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                final java.util.HashMap map = new java.util.HashMap(fileArrListFiles.length);
                java.util.ArrayList<java.io.File> arrayList = new java.util.ArrayList(fileArrListFiles.length);
                for (java.io.File file : fileArrListFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        map.put(file, java.lang.Long.valueOf(file.lastModified()));
                    }
                }
                java.util.Collections.sort(arrayList, new java.util.Comparator<java.io.File>() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.3
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                    public int compare(java.io.File file2, java.io.File file3) {
                        long jLongValue = ((java.lang.Long) map.get(file2)).longValue() - ((java.lang.Long) map.get(file3)).longValue();
                        if (jLongValue < 0) {
                            return -1;
                        }
                        return jLongValue > 0 ? 1 : 0;
                    }
                });
                for (java.io.File file2 : arrayList) {
                    this.IL.put(bg(file2), file2);
                }
            }
            this.zx.unlock();
            bX();
        } catch (java.lang.Throwable th) {
            this.zx.unlock();
            throw th;
        }
    }

    public void bg(long j) {
        this.iR = j;
        bX();
    }

    private void bX() {
        this.VB.removeCallbacks(this.eo);
        this.VB.postDelayed(this.eo, 10000L);
    }

    public void bg() {
        com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().eqN();
        android.content.Context contextBg = com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg();
        if (contextBg != null) {
            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.bg(contextBg).bg(0);
        }
        this.VB.removeCallbacks(this.eo);
        com.bytedance.sdk.component.Kg.ldr.IL(new com.bytedance.sdk.component.Kg.Kg("clear", 1) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.4
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.this.IL(0L);
            }
        });
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg
    public void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.WR.bg(str);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg
    public void IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.WR.IL(str);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg
    public java.io.File bX(java.lang.String str) {
        this.eqN.lock();
        java.io.File file = this.IL.get(str);
        this.eqN.unlock();
        if (file != null) {
            return file;
        }
        java.io.File file2 = new java.io.File(this.bg, str);
        this.zx.lock();
        this.IL.put(str, file2);
        this.zx.unlock();
        java.util.Iterator<com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg> it = this.ldr.iterator();
        while (it.hasNext()) {
            it.next().bg(str);
        }
        bX();
        return file2;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg
    public java.io.File eqN(java.lang.String str) {
        if (!this.eqN.tryLock()) {
            return null;
        }
        java.io.File file = this.IL.get(str);
        this.eqN.unlock();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(long j) {
        java.util.HashSet hashSet;
        final java.util.HashSet hashSet2 = new java.util.HashSet();
        this.zx.lock();
        try {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.io.File>> it = this.IL.entrySet().iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().getValue().length();
            }
            if (length > j) {
                long j2 = (long) (j * this.Kg);
                hashSet = new java.util.HashSet();
                try {
                    for (java.util.Map.Entry<java.lang.String, java.io.File> entry : this.IL.entrySet()) {
                        java.io.File value = entry.getValue();
                        if (value != null && value.exists()) {
                            if (!this.WR.bX(bg(value))) {
                                long length2 = value.length();
                                java.io.File file = new java.io.File(value.getAbsolutePath() + "-tmp");
                                if (value.renameTo(file)) {
                                    hashSet2.add(file);
                                    length -= length2;
                                    hashSet.add(entry.getKey());
                                }
                            }
                        } else {
                            hashSet.add(entry.getKey());
                        }
                        if (length <= j2) {
                            break;
                        }
                    }
                    java.util.Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        this.IL.remove((java.lang.String) it2.next());
                    }
                } catch (java.lang.Throwable unused) {
                }
            } else {
                this.zx.unlock();
                return;
            }
        } catch (java.lang.Throwable unused2) {
            hashSet = null;
        }
        this.zx.unlock();
        java.util.Iterator<com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg> it3 = this.ldr.iterator();
        while (it3.hasNext()) {
            it3.next().bg(hashSet);
        }
        com.bytedance.sdk.component.Kg.ldr.IL(new com.bytedance.sdk.component.Kg.Kg("trimSize", 1) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.5
            @Override // java.lang.Runnable
            public void run() {
                java.util.Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    try {
                        ((java.io.File) it4.next()).delete();
                    } catch (java.lang.Throwable unused3) {
                    }
                }
            }
        });
    }

    private java.lang.String bg(java.io.File file) {
        return file.getName();
    }

    private static final class IL {
        private final java.util.Map<java.lang.String, java.lang.Integer> bg;

        private IL() {
            this.bg = new java.util.HashMap();
        }

        synchronized void bg(java.lang.String str) {
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.Integer num = this.bg.get(str);
                if (num == null) {
                    this.bg.put(str, 1);
                    return;
                }
                this.bg.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
            }
        }

        synchronized void IL(java.lang.String str) {
            java.lang.Integer num;
            if (!android.text.TextUtils.isEmpty(str) && (num = this.bg.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.bg.remove(str);
                    return;
                }
                this.bg.put(str, java.lang.Integer.valueOf(num.intValue() - 1));
            }
        }

        synchronized boolean bX(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            return this.bg.containsKey(str);
        }
    }
}
