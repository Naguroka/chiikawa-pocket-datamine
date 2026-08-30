package com.bykv.vk.openvk.preload.geckox.a;

/* JADX INFO: compiled from: ChannelCleanHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.bykv.vk.openvk.preload.a.a.b(a = "gecko_accesskey")
    private java.util.List<java.lang.String> f1717a;

    @com.bykv.vk.openvk.preload.a.a.b(a = com.json.ce.y)
    private int b = 0;

    @com.bykv.vk.openvk.preload.a.a.b(a = "msg_type")
    private int c = 1;

    public static void a(final java.lang.String str) {
        com.bykv.vk.openvk.preload.geckox.utils.f.a().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.bykv.vk.openvk.preload.geckox.a.c.c(str);
                } catch (java.lang.Throwable th) {
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new java.lang.RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    public static boolean b(java.lang.String str) {
        try {
            com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(str + java.io.File.separator + "update.lock");
            if (aVarA == null) {
                return true;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(str + java.io.File.separator + "select.lock");
                try {
                    com.bykv.vk.openvk.preload.geckox.utils.b.c(new java.io.File(str));
                } catch (java.lang.Throwable unused) {
                }
                bVarA.a();
                return true;
            } finally {
                aVarA.a();
            }
        } catch (java.lang.Throwable unused2) {
            return false;
        }
    }

    private static java.util.List<java.io.File> a(java.io.File[] fileArr) {
        long j;
        java.util.ArrayList<java.io.File> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.io.File file = null;
        long j2 = -1;
        for (java.io.File file2 : fileArr) {
            java.lang.String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
            } else {
                try {
                    long j3 = java.lang.Long.parseLong(name);
                    if (j3 > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (java.lang.Exception unused) {
                                j2 = j3;
                                a(file2);
                            }
                        }
                        file = file2;
                        j2 = j3;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        for (java.io.File file3 : arrayList) {
            java.lang.String name2 = file3.getName();
            int iIndexOf = name2.indexOf("--updating");
            if (iIndexOf == -1) {
                a(file3);
            } else {
                try {
                    j = java.lang.Long.parseLong(name2.substring(0, iIndexOf));
                } catch (java.lang.NumberFormatException e) {
                    e.printStackTrace();
                    j = -1;
                }
                if (j <= j2) {
                    a(file3);
                }
            }
        }
        return arrayList2;
    }

    private static void a(final java.io.File file) {
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            }
        });
    }

    static /* synthetic */ void c(java.lang.String str) throws java.lang.Exception {
        com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(str + java.io.File.separator + "update.lock");
        if (aVarA != null) {
            try {
                com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(str + java.io.File.separator + "select.lock");
                try {
                    java.io.File[] fileArrListFiles = new java.io.File(str).listFiles(new java.io.FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.2
                        @Override // java.io.FileFilter
                        public final boolean accept(java.io.File file) {
                            return file.isDirectory();
                        }
                    });
                    java.util.List<java.io.File> listA = (fileArrListFiles == null || fileArrListFiles.length == 0 || fileArrListFiles.length == 1) ? null : a(fileArrListFiles);
                    if (listA != null && !listA.isEmpty()) {
                        java.util.Iterator<java.io.File> it = listA.iterator();
                        while (it.hasNext()) {
                            com.bykv.vk.openvk.preload.geckox.f.c.c(it.next().getAbsolutePath() + java.io.File.separator + "using.lock");
                        }
                        bVarA.a();
                        aVarA.a();
                        return;
                    }
                    bVarA.a();
                    aVarA.a();
                } catch (java.lang.Throwable th) {
                    bVarA.a();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                aVarA.a();
                throw th2;
            }
        }
    }

    public c(java.util.List<java.lang.String> list) {
        this.f1717a = list;
    }
}
