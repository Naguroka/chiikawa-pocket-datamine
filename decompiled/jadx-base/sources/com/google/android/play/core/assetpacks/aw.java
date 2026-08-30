package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class aw implements com.google.android.play.core.assetpacks.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2142a = new com.google.android.play.core.assetpacks.internal.o("AssetPackServiceImpl");
    private static final android.content.Intent b = new android.content.Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    private final java.lang.String c;
    private final com.google.android.play.core.assetpacks.co d;
    private final com.google.android.play.core.assetpacks.eb e;
    private com.google.android.play.core.assetpacks.internal.z f;
    private com.google.android.play.core.assetpacks.internal.z g;
    private final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();

    aw(android.content.Context context, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar) {
        this.c = context.getPackageName();
        this.d = coVar;
        this.e = ebVar;
        if (com.google.android.play.core.assetpacks.internal.ai.b(context)) {
            android.content.Context contextA = com.google.android.play.core.assetpacks.internal.ag.a(context);
            com.google.android.play.core.assetpacks.internal.o oVar = f2142a;
            android.content.Intent intent = b;
            this.f = new com.google.android.play.core.assetpacks.internal.z(contextA, oVar, "AssetPackService", intent, com.google.android.play.core.assetpacks.z.f2272a, null);
            this.g = new com.google.android.play.core.assetpacks.internal.z(com.google.android.play.core.assetpacks.internal.ag.a(context), oVar, "AssetPackService-keepAlive", intent, com.google.android.play.core.assetpacks.z.f2272a, null);
        }
        f2142a.a("AssetPackService initiated.", new java.lang.Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Bundle A() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("playcore_version_code", 11004);
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Bundle B(int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    private static com.google.android.gms.tasks.Task C() {
        f2142a.b("onError(%d)", -11);
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.assetpacks.AssetPackException(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i, java.lang.String str, int i2) {
        if (this.f == null) {
            throw new com.google.android.play.core.assetpacks.ck("The Play Store app is not installed or is an unofficial version.", i);
        }
        f2142a.d("notifyModuleCompleted", new java.lang.Object[0]);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ah(this, taskCompletionSource, i, str, taskCompletionSource, i2), taskCompletionSource);
    }

    static /* bridge */ /* synthetic */ android.os.Bundle k(int i, java.lang.String str, java.lang.String str2, int i2) {
        android.os.Bundle bundleZ = z(i, str);
        bundleZ.putString("slice_id", str2);
        bundleZ.putInt("chunk_number", i2);
        return bundleZ;
    }

    static /* bridge */ /* synthetic */ android.os.Bundle n(java.util.Map map) {
        android.os.Bundle bundleA = A();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        for (java.util.Map.Entry entry : map.entrySet()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("installed_asset_module_name", (java.lang.String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((java.lang.Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleA.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleA;
    }

    static /* bridge */ /* synthetic */ java.util.ArrayList v(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ java.util.List w(com.google.android.play.core.assetpacks.aw awVar, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.play.core.assetpacks.AssetPackState next = com.google.android.play.core.assetpacks.AssetPackStates.a((android.os.Bundle) it.next(), awVar.d, awVar.e, com.google.android.play.core.assetpacks.bf.f2150a).packStates().values().iterator().next();
            if (next == null) {
                f2142a.b("onGetSessionStates: Bundle contained no pack.", new java.lang.Object[0]);
            }
            if (com.google.android.play.core.assetpacks.bg.a(next.status())) {
                arrayList.add(next.name());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Bundle z(int i, java.lang.String str) {
        android.os.Bundle bundleB = B(i);
        bundleB.putString("module_name", str);
        return bundleB;
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task a(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (this.f == null) {
            return C();
        }
        f2142a.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.aj(this, taskCompletionSource, i, str, str2, i2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task b(java.util.List list, com.google.android.play.core.assetpacks.be beVar, java.util.Map map) {
        if (this.f == null) {
            return C();
        }
        f2142a.d("getPackStates(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.af(this, taskCompletionSource, list, map, taskCompletionSource, beVar), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task c(java.util.List list, java.util.Map map) {
        if (this.f == null) {
            return C();
        }
        f2142a.d("startDownload(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ac(this, taskCompletionSource, list, map, taskCompletionSource), taskCompletionSource);
        taskCompletionSource.getTask().addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.aa
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                this.f2130a.f();
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final com.google.android.gms.tasks.Task d(java.util.Map map) {
        if (this.f == null) {
            return C();
        }
        f2142a.d("syncPacks", new java.lang.Object[0]);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ae(this, taskCompletionSource, map, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void e(java.util.List list) {
        if (this.f == null) {
            return;
        }
        f2142a.d("cancelDownloads(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ad(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final synchronized void f() {
        if (this.g == null) {
            f2142a.e("Keep alive connection manager is not initialized.", new java.lang.Object[0]);
            return;
        }
        com.google.android.play.core.assetpacks.internal.o oVar = f2142a;
        oVar.d("keepAlive", new java.lang.Object[0]);
        if (!this.h.compareAndSet(false, true)) {
            oVar.d("Service is already kept alive.", new java.lang.Object[0]);
        } else {
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
            this.g.s(new com.google.android.play.core.assetpacks.ak(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        }
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void g(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (this.f == null) {
            throw new com.google.android.play.core.assetpacks.ck("The Play Store app is not installed or is an unofficial version.", i);
        }
        f2142a.d("notifyChunkTransferred", new java.lang.Object[0]);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ag(this, taskCompletionSource, i, str, str2, i2, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void h(int i, java.lang.String str) {
        D(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void i(int i) {
        if (this.f == null) {
            throw new com.google.android.play.core.assetpacks.ck("The Play Store app is not installed or is an unofficial version.", i);
        }
        f2142a.d("notifySessionFailed", new java.lang.Object[0]);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ai(this, taskCompletionSource, i, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void j(java.lang.String str) {
        if (this.f == null) {
            return;
        }
        f2142a.d("removePack(%s)", str);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ab(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
    }
}
