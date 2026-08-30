package com.bykv.vk.openvk.preload.geckox.g;

/* JADX INFO: compiled from: GeckoPipeline.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Field f1739a;

    public static com.bykv.vk.openvk.preload.b.b<java.lang.Object> a(java.io.File file, com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.falconx.a.a aVar, java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel>> map, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.e.class).a(file, bVar.d()).a(aVar.a(com.bykv.vk.openvk.preload.geckox.d.e.class)).b());
        com.bykv.vk.openvk.preload.geckox.e.a.a aVar2 = null;
        arrayList.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.c.class).a(bVar, null, map, null, str).a(new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a(aVar2, bVar) { // from class: com.bykv.vk.openvk.preload.geckox.g.a.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a.a f1744a = null;
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.b b;

            {
                this.b = bVar;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> list = (java.util.List) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.c.class);
                bVar2.a(com.bykv.vk.openvk.preload.geckox.d.c.class);
                java.util.HashMap map2 = new java.util.HashMap();
                for (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage : list) {
                    java.lang.String accessKey = updatePackage.getAccessKey();
                    java.util.List arrayList2 = (java.util.List) map2.get(accessKey);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(updatePackage);
                    map2.put(accessKey, arrayList2);
                }
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar2, dVar);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                bVar2.a(com.bykv.vk.openvk.preload.geckox.d.c.class);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }
        }, aVar.a(com.bykv.vk.openvk.preload.geckox.d.c.class))).b());
        arrayList.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.f.class).a(com.bykv.vk.openvk.preload.geckox.b.g()).a(new com.bykv.vk.openvk.preload.b.b.a(aVar2, bVar) { // from class: com.bykv.vk.openvk.preload.geckox.g.a.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a.a f1740a = null;
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.b b;

            {
                this.b = bVar;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                if (this.f1740a != null) {
                    ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) bVar2.b(com.bykv.vk.openvk.preload.geckox.d.f.class)).getChannel();
                }
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar2, dVar);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar2, dVar);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onPipelineEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }
        }).b());
        com.bykv.vk.openvk.preload.b.l.b bVar2 = new com.bykv.vk.openvk.preload.b.l.b();
        com.bykv.vk.openvk.preload.b.l.a aVarA = bVar2.a("branch_zip");
        com.bykv.vk.openvk.preload.b.l.b bVar3 = new com.bykv.vk.openvk.preload.b.l.b();
        com.bykv.vk.openvk.preload.b.l.a aVarA2 = bVar3.a("patch");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.h.class).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class).a(bVar, file).a(new com.bykv.vk.openvk.preload.b.b.b(b(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class))).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class))).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class).a(bVar).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class))).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class))).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class))).b());
        arrayList2.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.e.class).a(new com.bykv.vk.openvk.preload.b.b.b(null)).b());
        aVarA2.a(arrayList2);
        com.bykv.vk.openvk.preload.b.l.a aVarA3 = bVar3.a("full");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.g.class).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class).a(bVar, file).a(new com.bykv.vk.openvk.preload.b.b.b(b(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class))).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class))).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class))).b());
        arrayList3.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.c.class).a(new com.bykv.vk.openvk.preload.b.b.b(null)).b());
        aVarA3.a(arrayList3);
        aVarA.a(bVar3.a(com.bykv.vk.openvk.preload.geckox.d.b.class)).a(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.b.f.class).a(a(bVar)).b());
        com.bykv.vk.openvk.preload.b.l.a aVarA4 = bVar2.a("branch_single_file");
        com.bykv.vk.openvk.preload.b.l.b bVar4 = new com.bykv.vk.openvk.preload.b.l.b();
        com.bykv.vk.openvk.preload.b.l.a aVarA5 = bVar4.a("patch");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.h.class).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class).a(bVar, file).a(new com.bykv.vk.openvk.preload.b.b.b(b(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class))).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class))).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class).a(bVar).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class))).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class))).b());
        arrayList4.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class).a(new com.bykv.vk.openvk.preload.b.b.b(null, aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class))).b());
        aVarA5.a(arrayList4);
        com.bykv.vk.openvk.preload.b.l.a aVarA6 = bVar4.a("full");
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.g.class).b());
        arrayList5.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class).a(bVar, file).a(new com.bykv.vk.openvk.preload.b.b.b(b(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class))).b());
        arrayList5.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class).a(new com.bykv.vk.openvk.preload.b.b.b(a(null, bVar), aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class))).b());
        arrayList5.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class).a(new com.bykv.vk.openvk.preload.b.b.b(null, aVar.a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class))).b());
        aVarA6.a(arrayList5);
        aVarA4.a(bVar4.a(com.bykv.vk.openvk.preload.geckox.d.b.class)).a(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.b.f.class).a(a(bVar)).b());
        com.bykv.vk.openvk.preload.b.l.a aVarA7 = bVar2.a("branch_myarchive_file");
        com.bykv.vk.openvk.preload.b.l.b bVar5 = new com.bykv.vk.openvk.preload.b.l.b();
        bVar5.a("patch").a(java.util.Collections.emptyList());
        bVar5.a("full").a(java.util.Collections.emptyList());
        aVarA7.a(bVar5.a(com.bykv.vk.openvk.preload.geckox.d.b.class)).a(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.b.f.class).a(a(bVar)).b());
        arrayList.add(bVar2.a(com.bykv.vk.openvk.preload.geckox.d.a.class));
        arrayList.add(com.bykv.vk.openvk.preload.b.h.a.a().a(com.bykv.vk.openvk.preload.geckox.d.i.class).a(new com.bykv.vk.openvk.preload.b.b.a(aVar2, bVar) { // from class: com.bykv.vk.openvk.preload.geckox.g.a.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a.a f1741a = null;
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.b b;

            {
                this.b = bVar;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar6, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar6, dVar);
                android.util.Pair pair = (android.util.Pair) bVar6.a(com.bykv.vk.openvk.preload.geckox.d.i.class);
                if (this.f1741a != null) {
                    java.lang.Object obj = pair.first;
                    ((java.lang.Long) pair.second).longValue();
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar6, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar6, dVar, th);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar6, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar6, dVar, th);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar6, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar6, dVar);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar6, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar6, dVar);
                try {
                    this.b.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }
        }).b());
        return com.bykv.vk.openvk.preload.b.c.a((java.util.List<com.bykv.vk.openvk.preload.b.h>) arrayList);
    }

    private static com.bykv.vk.openvk.preload.b.b.a a(com.bykv.vk.openvk.preload.geckox.e.a.a aVar, final com.bykv.vk.openvk.preload.geckox.b bVar) {
        final com.bykv.vk.openvk.preload.geckox.e.a.a aVar2 = null;
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.3
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                if (aVar2 != null) {
                    bVar2.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }
        };
    }

    private static com.bykv.vk.openvk.preload.b.b.a b(com.bykv.vk.openvk.preload.geckox.e.a.a aVar, final com.bykv.vk.openvk.preload.geckox.b bVar) {
        final com.bykv.vk.openvk.preload.geckox.e.a.a aVar2 = null;
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.4
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar2, dVar);
                if (aVar2 != null) {
                    bVar2.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                if (aVar2 != null) {
                    bVar2.b(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                if (aVar2 != null) {
                    bVar2.a(com.bykv.vk.openvk.preload.geckox.d.b.class);
                }
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }
        };
    }

    private static com.bykv.vk.openvk.preload.b.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.a(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar, java.lang.Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.a(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                } catch (java.lang.Throwable unused) {
                }
            }
        };
    }

    public a(java.lang.reflect.Field field) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(field);
        this.f1739a = field;
    }
}
