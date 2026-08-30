package com.bykv.vk.openvk.preload.geckox.statistic;

/* JADX INFO: compiled from: UpdateListeners.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static com.bykv.vk.openvk.preload.b.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(bVar, com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()));
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                    if ((dVar instanceof com.bykv.vk.openvk.preload.geckox.d.e) && (dVar.f() instanceof java.util.Map)) {
                        bVar.f().put(dVar.getClass().getSimpleName(), ((java.util.Map) dVar.f()).get("cca47107bfcbdb211d88f3385aeede40"));
                    }
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(bVar, com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()));
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(bVar, com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()));
                } catch (java.lang.Throwable unused) {
                }
            }
        };
    }

    private static com.bykv.vk.openvk.preload.b.b.a a(final android.content.Context context) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar, dVar);
                android.util.Pair pair = (android.util.Pair) bVar.b(com.bykv.vk.openvk.preload.geckox.d.g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
                aVarA.v = ((android.net.Uri) pair.first).toString();
                aVarA.p = com.bykv.vk.openvk.preload.geckox.utils.e.a(context);
                aVarA.x = android.os.SystemClock.uptimeMillis();
                aVarA.r = java.lang.Long.valueOf(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getFullPackage().getId());
                aVarA.c = ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel();
                if (!android.text.TextUtils.isEmpty(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getAccessKey())) {
                    aVarA.f1751a = ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getAccessKey();
                }
                if (android.text.TextUtils.isEmpty(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                aVarA.b = ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.B = true;
                aVarA.y = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar, dVar, th);
                android.util.Pair pair = (android.util.Pair) bVar.b(com.bykv.vk.openvk.preload.geckox.d.g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
                java.lang.String string = ((android.net.Uri) pair.first).toString();
                aVarA.B = false;
                aVarA.y = android.os.SystemClock.uptimeMillis();
                aVarA.w.add(new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th.getMessage()));
            }
        };
    }

    private static com.bykv.vk.openvk.preload.b.b.a b(final android.content.Context context) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar, dVar);
                android.util.Pair pair = (android.util.Pair) bVar.b(com.bykv.vk.openvk.preload.geckox.d.h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
                aVarA.d = ((android.net.Uri) pair.first).toString();
                aVarA.p = com.bykv.vk.openvk.preload.geckox.utils.e.a(context);
                aVarA.f = android.os.SystemClock.uptimeMillis();
                aVarA.q = java.lang.Long.valueOf(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getPatch().getId());
                aVarA.r = java.lang.Long.valueOf(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getFullPackage().getId());
                aVarA.c = ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.h = true;
                aVarA.g = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar, dVar, th);
                android.util.Pair pair = (android.util.Pair) bVar.b(com.bykv.vk.openvk.preload.geckox.d.h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
                java.lang.String string = ((android.net.Uri) pair.first).toString();
                aVarA.h = false;
                aVarA.g = android.os.SystemClock.uptimeMillis();
                aVarA.e.add(new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th.getMessage()));
            }
        };
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.a aVar, com.bykv.vk.openvk.preload.geckox.b bVar) {
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.e.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.d.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel()).i = true;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.i = false;
                aVarA.l = android.os.SystemClock.uptimeMillis();
                aVarA.s = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.m = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.m = android.os.SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.n = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.n = android.os.SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.k = true;
                aVarA.o = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.u = th.getMessage();
                aVarA.o = android.os.SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.C = true;
                aVarA.z = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.C = false;
                aVarA.z = android.os.SystemClock.uptimeMillis();
                aVarA.E = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.D = true;
                aVarA.A = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.D = false;
                aVarA.A = android.os.SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel()).i = true;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.i = false;
                aVarA.l = android.os.SystemClock.uptimeMillis();
                aVarA.s = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.m = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.m = android.os.SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.n = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.n = android.os.SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.o = android.os.SystemClock.uptimeMillis();
                aVarA.u = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.o = android.os.SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.h.class)).second).getChannel());
                aVarA.k = true;
                aVarA.o = android.os.SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.C = true;
                aVarA.z = android.os.SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.C = false;
                aVarA.z = android.os.SystemClock.uptimeMillis();
                aVarA.E = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.D = false;
                aVarA.A = android.os.SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.D = false;
                aVarA.A = android.os.SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = com.bykv.vk.openvk.preload.geckox.statistic.a.a(dVar.b()).a(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) ((android.util.Pair) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.g.class)).second).getChannel());
                aVarA.D = true;
                aVarA.A = android.os.SystemClock.uptimeMillis();
            }
        });
    }
}
