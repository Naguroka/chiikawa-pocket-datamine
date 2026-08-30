package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.do, reason: invalid class name */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class Cdo implements com.google.android.play.core.assetpacks.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2204a = new com.google.android.play.core.assetpacks.internal.o("FakeAssetPackService");
    private static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.String c;
    private final com.google.android.play.core.assetpacks.bb d;
    private final com.google.android.play.core.assetpacks.co e;
    private final android.content.Context f;
    private final com.google.android.play.core.assetpacks.ed g;
    private final com.google.android.play.core.assetpacks.eb h;
    private final android.os.Handler i = new android.os.Handler(android.os.Looper.getMainLooper());
    private final com.google.android.play.core.assetpacks.internal.aq j;

    Cdo(java.io.File file, com.google.android.play.core.assetpacks.bb bbVar, com.google.android.play.core.assetpacks.co coVar, android.content.Context context, com.google.android.play.core.assetpacks.ed edVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.eb ebVar) {
        this.c = file.getAbsolutePath();
        this.d = bbVar;
        this.e = coVar;
        this.f = context;
        this.g = edVar;
        this.j = aqVar;
        this.h = ebVar;
    }

    static long k(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0L;
    }

    private final android.os.Bundle p(int i, java.lang.String str, int i2) throws com.google.android.play.core.common.LocalTestingException {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("app_version_code", this.g.a());
        bundle.putInt("session_id", i);
        java.io.File[] fileArrS = s(str);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        long length = 0;
        for (java.io.File file : fileArrS) {
            length += file.length();
            java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add(i2 == 3 ? new android.content.Intent().setData(android.net.Uri.EMPTY) : null);
            java.lang.String strA = com.google.android.play.core.assetpacks.internal.ak.a(file);
            bundle.putParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", str, strA), arrayList2);
            bundle.putString(com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", str, strA), r(file));
            bundle.putLong(com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(com.google.android.play.core.assetpacks.model.b.a("slice_ids", str), arrayList);
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", str), this.g.a());
        bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("status", str), i2);
        bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str), 0);
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str), k(i2, length));
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new java.util.ArrayList<>(java.util.Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", k(i2, length));
        bundle.putLong("total_bytes_to_download", length);
        final android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.i.post(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.dm
            @Override // java.lang.Runnable
            public final void run() {
                this.f2202a.l(intentPutExtra);
            }
        });
        return bundle;
    }

    private final com.google.android.play.core.assetpacks.AssetPackState q(java.lang.String str, int i) throws com.google.android.play.core.common.LocalTestingException {
        long length = 0;
        for (java.io.File file : s(str)) {
            length += file.length();
        }
        return com.google.android.play.core.assetpacks.AssetPackState.a(str, i, 0, k(i, length), length, this.e.a(str), 1, java.lang.String.valueOf(this.g.a()), this.h.a(str));
    }

    private static java.lang.String r(java.io.File file) throws com.google.android.play.core.common.LocalTestingException {
        try {
            return com.google.android.play.core.assetpacks.dq.a(java.util.Arrays.asList(file));
        } catch (java.io.IOException e) {
            throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("Could not digest file: %s.", file), e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new com.google.android.play.core.common.LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    private final java.io.File[] s(final java.lang.String str) throws com.google.android.play.core.common.LocalTestingException {
        java.io.File file = new java.io.File(this.c);
        if (!file.isDirectory()) {
            throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("Local testing directory '%s' not found.", file));
        }
        java.io.File[] fileArrListFiles = file.listFiles(new java.io.FilenameFilter() { // from class: com.google.android.play.core.assetpacks.dl
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file2, java.lang.String str2) {
                return str2.startsWith(java.lang.String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("No APKs available for pack '%s'.", str));
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (com.google.android.play.core.assetpacks.internal.ak.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("No main slice available for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task a(int i, java.lang.String str, java.lang.String str2, int i2) {
        f2204a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", java.lang.Integer.valueOf(i), str, str2, java.lang.Integer.valueOf(i2));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        try {
            for (java.io.File file : s(str)) {
                if (com.google.android.play.core.assetpacks.internal.ak.a(file).equals(str2)) {
                    taskCompletionSource.setResult(android.os.ParcelFileDescriptor.open(file, 268435456));
                    return taskCompletionSource.getTask();
                }
            }
            throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("Local testing slice for '%s' not found.", str2));
        } catch (com.google.android.play.core.common.LocalTestingException e) {
            f2204a.e("getChunkFileDescriptor failed", e);
            taskCompletionSource.setException(e);
        } catch (java.io.FileNotFoundException e2) {
            f2204a.e("getChunkFileDescriptor failed", e2);
            taskCompletionSource.setException(new com.google.android.play.core.common.LocalTestingException("Asset Slice file not found.", e2));
        }
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task b(final java.util.List list, final com.google.android.play.core.assetpacks.be beVar, java.util.Map map) {
        f2204a.d("getPackStates(%s)", list);
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        ((java.util.concurrent.Executor) this.j.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.dk
            @Override // java.lang.Runnable
            public final void run() {
                this.f2200a.m(list, beVar, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task c(final java.util.List list, java.util.Map map) {
        f2204a.d("startDownload(%s)", list);
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        ((java.util.concurrent.Executor) this.j.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.dj
            @Override // java.lang.Runnable
            public final void run() {
                this.f2199a.o(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task d(java.util.Map map) {
        f2204a.d("syncPacks()", new java.lang.Object[0]);
        return com.google.android.gms.tasks.Tasks.forResult(new java.util.ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void e(java.util.List list) {
        f2204a.d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void f() {
        f2204a.d("keepAlive", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void g(int i, java.lang.String str, java.lang.String str2, int i2) {
        f2204a.d("notifyChunkTransferred", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void h(final int i, final java.lang.String str) {
        f2204a.d("notifyModuleCompleted", new java.lang.Object[0]);
        ((java.util.concurrent.Executor) this.j.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.dn
            @Override // java.lang.Runnable
            public final void run() {
                this.f2203a.n(i, str);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void i(int i) {
        f2204a.d("notifySessionFailed", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void j(java.lang.String str) {
        f2204a.d("removePack(%s)", str);
    }

    final /* synthetic */ void l(android.content.Intent intent) {
        this.d.c(this.f, intent);
    }

    final /* synthetic */ void m(java.util.List list, com.google.android.play.core.assetpacks.be beVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            try {
                com.google.android.play.core.assetpacks.AssetPackState assetPackStateQ = q(str, ((com.google.android.play.core.assetpacks.f) beVar).f2233a.a(8, str));
                j += assetPackStateQ.totalBytesToDownload();
                map.put(str, assetPackStateQ);
            } catch (com.google.android.play.core.common.LocalTestingException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        taskCompletionSource.setResult(new com.google.android.play.core.assetpacks.bo(j, map));
    }

    final /* synthetic */ void n(int i, java.lang.String str) {
        try {
            p(i, str, 4);
        } catch (com.google.android.play.core.common.LocalTestingException e) {
            f2204a.e("notifyModuleCompleted failed", e);
        }
    }

    final /* synthetic */ void o(java.util.List list, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            try {
                com.google.android.play.core.assetpacks.AssetPackState assetPackStateQ = q(str, 1);
                j += assetPackStateQ.totalBytesToDownload();
                map.put(str, assetPackStateQ);
            } catch (com.google.android.play.core.common.LocalTestingException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            java.lang.String str2 = (java.lang.String) it2.next();
            try {
                int andIncrement = b.getAndIncrement();
                p(andIncrement, str2, 1);
                p(andIncrement, str2, 2);
                p(andIncrement, str2, 3);
            } catch (com.google.android.play.core.common.LocalTestingException e2) {
                taskCompletionSource.setException(e2);
                return;
            }
        }
        taskCompletionSource.setResult(new com.google.android.play.core.assetpacks.bo(j, map));
    }
}
