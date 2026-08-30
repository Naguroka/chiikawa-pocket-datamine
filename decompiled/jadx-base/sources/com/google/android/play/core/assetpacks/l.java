package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class l implements com.google.android.play.core.assetpacks.AssetPackManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2260a = new com.google.android.play.core.assetpacks.internal.o("AssetPackManager");
    private final com.google.android.play.core.assetpacks.bh b;
    private final com.google.android.play.core.assetpacks.bb c;
    private final com.google.android.play.core.assetpacks.internal.ad d;
    private final com.google.android.play.core.assetpacks.de e;
    private final com.google.android.play.core.assetpacks.co f;
    private final com.google.android.play.core.assetpacks.bx g;
    private final com.google.android.play.core.assetpacks.eb h;
    private final android.os.Handler i = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean j;
    private final com.google.android.play.core.assetpacks.internal.aq k;
    private final com.google.android.play.core.assetpacks.internal.aq l;

    l(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.bb bbVar, com.google.android.play.core.assetpacks.internal.ad adVar, com.google.android.play.core.assetpacks.de deVar, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.bx bxVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, com.google.android.play.core.assetpacks.eb ebVar) {
        this.b = bhVar;
        this.k = aqVar;
        this.c = bbVar;
        this.d = adVar;
        this.e = deVar;
        this.f = coVar;
        this.g = bxVar;
        this.l = aqVar2;
        this.h = ebVar;
    }

    private final void h() {
        ((java.util.concurrent.Executor) this.l.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f2236a.f();
            }
        });
    }

    final int a(int i, java.lang.String str) {
        if (!this.b.G(str) && i == 4) {
            return 8;
        }
        if (!this.b.G(str) || i == 4) {
            return i;
        }
        return 4;
    }

    final /* synthetic */ void c() {
        this.b.y();
        this.b.w();
        this.b.x();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.assetpacks.AssetPackStates cancel(java.util.List<java.lang.String> list) {
        java.util.Map mapF = this.e.f(list);
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : list) {
            java.lang.Integer num = (java.lang.Integer) mapF.get(str);
            map.put(str, com.google.android.play.core.assetpacks.AssetPackState.a(str, num == null ? 0 : num.intValue(), 0, 0L, 0L, 0.0d, 0, "", ""));
        }
        ((com.google.android.play.core.assetpacks.y) this.k.a()).e(list);
        return new com.google.android.play.core.assetpacks.bo(0L, map);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void clearListeners() {
        this.c.e();
    }

    final /* synthetic */ void d(java.lang.String str, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        if (!this.b.D(str)) {
            taskCompletionSource.setException(new java.io.IOException(java.lang.String.format("Failed to remove pack %s.", str)));
        } else {
            taskCompletionSource.setResult(null);
            ((com.google.android.play.core.assetpacks.y) this.k.a()).j(str);
        }
    }

    final /* synthetic */ void f() {
        com.google.android.gms.tasks.Task taskD = ((com.google.android.play.core.assetpacks.y) this.k.a()).d(this.b.u());
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.l.a();
        final com.google.android.play.core.assetpacks.bh bhVar = this.b;
        bhVar.getClass();
        taskD.addOnSuccessListener(executor, new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.g
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                bhVar.C((java.util.List) obj);
            }
        }).addOnFailureListener((java.util.concurrent.Executor) this.l.a(), new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.play.core.assetpacks.h
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                com.google.android.play.core.assetpacks.l.f2260a.e(java.lang.String.format("Could not sync active asset packs. %s", exc), new java.lang.Object[0]);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> fetch(java.util.List<java.lang.String> list) {
        java.util.Map mapU = this.b.u();
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (!arrayList.isEmpty()) {
            return ((com.google.android.play.core.assetpacks.y) this.k.a()).c(arrayList, mapU);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("error_code", 0);
        for (java.lang.String str : list) {
            bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("status", str), 4);
            bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str), 0);
            bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str), 0L);
            bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str), 0L);
        }
        bundle.putStringArrayList("pack_names", new java.util.ArrayList<>(list));
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return com.google.android.gms.tasks.Tasks.forResult(com.google.android.play.core.assetpacks.AssetPackStates.a(bundle, this.f, this.h, com.google.android.play.core.assetpacks.bf.f2150a));
    }

    final void g(boolean z) {
        boolean zJ = this.c.j();
        this.c.g(z);
        if (!z || zJ) {
            return;
        }
        h();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.assetpacks.AssetLocation getAssetLocation(java.lang.String str, java.lang.String str2) {
        com.google.android.play.core.assetpacks.AssetPackLocation assetPackLocationF;
        if (!this.j) {
            ((java.util.concurrent.Executor) this.l.a()).execute(new com.google.android.play.core.assetpacks.j(this));
            this.j = true;
        }
        if (this.b.G(str)) {
            try {
                assetPackLocationF = this.b.f(str);
            } catch (java.io.IOException unused) {
            }
        } else {
            assetPackLocationF = this.d.a().contains(str) ? com.google.android.play.core.assetpacks.AssetPackLocation.a() : null;
        }
        if (assetPackLocationF == null) {
            return null;
        }
        if (assetPackLocationF.packStorageMethod() == 1) {
            com.google.android.play.core.assetpacks.bh bhVar = this.b;
            return bhVar.d(str, str2, bhVar.s(str));
        }
        if (assetPackLocationF.packStorageMethod() == 0) {
            return this.b.e(str, str2, assetPackLocationF);
        }
        f2260a.a("The asset %s is not present in Asset Pack %s", str2, str);
        return null;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.assetpacks.AssetPackLocation getPackLocation(java.lang.String str) {
        if (!this.j) {
            ((java.util.concurrent.Executor) this.l.a()).execute(new com.google.android.play.core.assetpacks.j(this));
            this.j = true;
        }
        if (this.b.G(str)) {
            try {
                return this.b.f(str);
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        if (this.d.a().contains(str)) {
            return com.google.android.play.core.assetpacks.AssetPackLocation.a();
        }
        return null;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackLocation> getPackLocations() {
        java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackLocation> mapV = this.b.v();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = this.d.a().iterator();
        while (it.hasNext()) {
            map.put((java.lang.String) it.next(), com.google.android.play.core.assetpacks.AssetPackLocation.a());
        }
        mapV.putAll(map);
        return mapV;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> getPackStates(java.util.List<java.lang.String> list) {
        return ((com.google.android.play.core.assetpacks.y) this.k.a()).b(list, new com.google.android.play.core.assetpacks.f(this), this.b.u());
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final synchronized void registerListener(com.google.android.play.core.assetpacks.AssetPackStateUpdateListener assetPackStateUpdateListener) {
        boolean zJ = this.c.j();
        this.c.f(assetPackStateUpdateListener);
        if (zJ) {
            return;
        }
        h();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> removePack(final java.lang.String str) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        ((java.util.concurrent.Executor) this.l.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f2215a.d(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.gms.tasks.Task<java.lang.Integer> showCellularDataConfirmation(android.app.Activity activity) {
        if (activity == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.assetpacks.AssetPackException(-3));
        }
        if (this.g.a() == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.assetpacks.AssetPackException(-12));
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.g.a());
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        intent.putExtra("result_receiver", new com.google.android.play.core.assetpacks.k(this, this.i, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void unregisterListener(com.google.android.play.core.assetpacks.AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.c.h(assetPackStateUpdateListener);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final boolean showCellularDataConfirmation(androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> activityResultLauncher) {
        if (activityResultLauncher == null || this.g.a() == null) {
            return false;
        }
        activityResultLauncher.launch(new androidx.activity.result.IntentSenderRequest.Builder(this.g.a().getIntentSender()).build());
        return true;
    }
}
