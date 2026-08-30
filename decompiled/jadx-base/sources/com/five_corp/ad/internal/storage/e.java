package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.storage.l f2053a;
    public final com.five_corp.ad.internal.storage.r b;
    public final com.five_corp.ad.internal.system.c c;
    public final com.five_corp.ad.internal.logger.a d;
    public final java.lang.Object e = new java.lang.Object();
    public final java.util.HashMap f = new java.util.HashMap();
    public final java.util.HashMap g = new java.util.HashMap();

    public e(com.five_corp.ad.internal.storage.l lVar, com.five_corp.ad.internal.storage.r rVar, com.five_corp.ad.internal.system.c cVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f2053a = lVar;
        this.b = rVar;
        this.c = cVar;
        this.d = aVar;
    }

    public final com.five_corp.ad.internal.cache.o a(java.lang.String str, boolean z, boolean z2) {
        com.five_corp.ad.internal.storage.c cVar = (com.five_corp.ad.internal.storage.c) this.f2053a.f2059a;
        com.five_corp.ad.internal.storage.a aVar = new com.five_corp.ad.internal.storage.a(cVar, str, cVar.b);
        java.util.regex.Pattern pattern = com.five_corp.ad.internal.storage.r.b;
        com.five_corp.ad.internal.storage.a aVar2 = new com.five_corp.ad.internal.storage.a(cVar, str + ".success", cVar.b);
        android.os.Looper looperA = this.c.a();
        android.os.Handler handler = looperA != null ? new android.os.Handler(looperA) : null;
        if (z2) {
            handler.post(new com.five_corp.ad.internal.storage.d(aVar));
        }
        return new com.five_corp.ad.internal.cache.o(handler, aVar, aVar2, z);
    }

    public final com.five_corp.ad.internal.cache.o b(com.five_corp.ad.internal.ad.w wVar) {
        java.util.regex.Pattern pattern = com.five_corp.ad.internal.storage.r.b;
        java.lang.String strA = com.five_corp.ad.internal.J.a(wVar.f1835a);
        java.util.HashMap map = wVar.c ? this.f : this.g;
        com.five_corp.ad.internal.cache.o oVar = (com.five_corp.ad.internal.cache.o) map.get(strA);
        if (oVar != null) {
            return oVar;
        }
        int iNextInt = this.b.f2064a.nextInt(1073741824);
        java.lang.String str = wVar.c ? "res5" : "res6";
        java.lang.String strA2 = com.five_corp.ad.internal.J.a(wVar.f1835a);
        java.lang.String str2 = java.lang.String.format("%08X", java.lang.Integer.valueOf(iNextInt));
        java.util.regex.Matcher matcher = com.five_corp.ad.internal.storage.r.b.matcher(wVar.f1835a);
        com.five_corp.ad.internal.cache.o oVarA = a(str + com.ironsource.y8.i.b + strA2 + com.ironsource.y8.i.b + str2 + (!matcher.find() ? "" : matcher.group(1)), false, true);
        map.put(strA, oVarA);
        return oVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.five_corp.ad.internal.util.f] */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.five_corp.ad.internal.util.f] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.five_corp.ad.internal.util.f] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.five_corp.ad.internal.util.f] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [com.five_corp.ad.internal.util.f] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.BufferedInputStream] */
    public final com.five_corp.ad.internal.util.g b(java.lang.String str) throws java.lang.Throwable {
        int i;
        com.five_corp.ad.internal.util.g gVar;
        java.io.BufferedInputStream bufferedInputStream;
        ?? fVar;
        com.five_corp.ad.internal.util.f fVar2;
        com.five_corp.ad.internal.util.g gVarB = ((com.five_corp.ad.internal.storage.c) this.f2053a.f2059a).b();
        if (!gVarB.f2085a) {
            return gVarB;
        }
        com.five_corp.ad.internal.util.f fVarB = ((com.five_corp.ad.internal.storage.c) this.f2053a.f2059a).b("storage.id");
        ?? r4 = 0;
        if (fVarB.f2085a) {
            if (!((java.lang.Boolean) fVarB.c).booleanValue()) {
                fVar2 = new com.five_corp.ad.internal.util.f(true, null, java.lang.Boolean.TRUE);
            } else {
                com.five_corp.ad.internal.storage.c cVar = (com.five_corp.ad.internal.storage.c) this.f2053a.f2059a;
                com.five_corp.ad.internal.util.f fVarC = cVar.c("storage.id");
                if (!fVarC.f2085a) {
                    fVar = new com.five_corp.ad.internal.util.f(false, fVarC.b, null);
                } else {
                    int iIntValue = ((java.lang.Integer) fVarC.c).intValue();
                    ?? fVar3 = cVar.f2051a;
                    java.io.File file = new java.io.File((java.io.File) fVar3, "storage.id");
                    try {
                        try {
                            try {
                                byte[] bArr = new byte[iIntValue];
                                bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i2 >= iIntValue || i3 >= 16) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (java.io.IOException e) {
                                            android.util.Log.getStackTraceString(e);
                                        }
                                        if (i2 < iIntValue) {
                                            fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.W2, null, null, null), null);
                                            break;
                                        }
                                        fVar3 = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.storage.f(bArr, iIntValue));
                                        fVar = fVar3;
                                        break;
                                    }
                                    try {
                                        int i4 = bufferedInputStream.read(bArr, i2, iIntValue - i2);
                                        if (i4 < 0) {
                                            com.five_corp.ad.internal.util.f fVar4 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.X2, null, null, null), null);
                                            try {
                                                bufferedInputStream.close();
                                            } catch (java.io.IOException e2) {
                                                android.util.Log.getStackTraceString(e2);
                                            }
                                            fVar = fVar4;
                                            break;
                                        }
                                        i2 += i4;
                                        i3++;
                                    } catch (java.io.IOException e3) {
                                        e = e3;
                                        fVar3 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.V2, "File path: " + file.getAbsolutePath(), e, null), null);
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                            fVar3 = fVar3;
                                        }
                                        fVar = fVar3;
                                        break;
                                    } catch (java.lang.OutOfMemoryError e4) {
                                        e = e4;
                                        fVar3 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.i3, "File path: " + file.getAbsolutePath(), e, null), null);
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                            fVar3 = fVar3;
                                        }
                                        fVar = fVar3;
                                        break;
                                    } catch (java.lang.SecurityException e5) {
                                        e = e5;
                                        fVar3 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.U2, "File path: " + file.getAbsolutePath(), e, null), null);
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                            fVar3 = fVar3;
                                        }
                                        fVar = fVar3;
                                        break;
                                    }
                                }
                            } catch (java.io.IOException e6) {
                                android.util.Log.getStackTraceString(e6);
                            }
                        } catch (java.io.IOException e7) {
                            e = e7;
                            bufferedInputStream = null;
                        } catch (java.lang.OutOfMemoryError e8) {
                            e = e8;
                            bufferedInputStream = null;
                        } catch (java.lang.SecurityException e9) {
                            e = e9;
                            bufferedInputStream = null;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                } catch (java.io.IOException e10) {
                                    android.util.Log.getStackTraceString(e10);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r4 = "storage.id";
                    }
                }
                if (!fVar.f2085a) {
                    fVar2 = new com.five_corp.ad.internal.util.f(false, fVar.b, null);
                } else {
                    com.five_corp.ad.internal.storage.f fVar5 = (com.five_corp.ad.internal.storage.f) fVar.c;
                    fVar2 = new com.five_corp.ad.internal.util.f(true, null, java.lang.Boolean.valueOf(!new java.lang.String(fVar5.f2054a, 0, fVar5.b).equals(str)));
                }
            }
            fVarB = fVar2;
        }
        if (!fVarB.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, fVarB.b);
        }
        if (((java.lang.Boolean) fVarB.c).booleanValue()) {
            com.five_corp.ad.internal.util.f fVarA = ((com.five_corp.ad.internal.storage.c) this.f2053a.f2059a).a();
            if (!fVarA.f2085a) {
                gVar = new com.five_corp.ad.internal.util.g(false, fVarA.b);
            } else {
                java.util.Iterator it = ((java.util.List) fVarA.c).iterator();
                while (it.hasNext()) {
                    a((java.lang.String) it.next());
                }
                gVar = new com.five_corp.ad.internal.util.g(true, null);
            }
            if (!gVar.f2085a) {
                return gVar;
            }
            com.five_corp.ad.internal.util.g gVarA = ((com.five_corp.ad.internal.storage.c) this.f2053a.f2059a).a("storage.id", str.getBytes());
            if (!gVarA.f2085a) {
                return gVarA;
            }
        }
        com.five_corp.ad.internal.util.f fVarA2 = ((com.five_corp.ad.internal.storage.c) this.f2053a.f2059a).a();
        if (!fVarA2.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, fVarA2.b);
        }
        java.util.List<java.lang.String> list = (java.util.List) fVarA2.c;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.String str2 : list) {
            java.util.regex.Pattern pattern = com.five_corp.ad.internal.storage.r.b;
            if (str2.equals("storage.id")) {
                i = 2;
            } else if (str2.endsWith(".success")) {
                i = 5;
            } else if (!str2.startsWith("res5") || str2.endsWith(".success") || com.five_corp.ad.internal.storage.r.a(str2) == null) {
                i = (!str2.startsWith("res6") || str2.endsWith(".success") || com.five_corp.ad.internal.storage.r.a(str2) == null) ? 1 : 4;
            } else {
                i = 3;
            }
            int iA = com.five_corp.ad.e.a(i);
            if (iA == 0) {
                arrayList4.add(str2);
            } else if (iA == 2) {
                java.lang.String strA = com.five_corp.ad.internal.storage.r.a(str2);
                if (hashSet.contains(strA)) {
                    a(str2);
                } else {
                    arrayList.add(str2);
                    hashSet.add(strA);
                }
            } else if (iA == 3) {
                java.lang.String strA2 = com.five_corp.ad.internal.storage.r.a(str2);
                if (hashSet2.contains(strA2)) {
                    a(str2);
                } else {
                    arrayList2.add(str2);
                    hashSet2.add(strA2);
                }
            } else if (iA == 4) {
                arrayList3.add(str2);
            }
        }
        for (java.lang.String str3 : arrayList3) {
            java.util.regex.Pattern pattern2 = com.five_corp.ad.internal.storage.r.b;
            java.lang.String strSubstring = str3.substring(0, str3.length() - 8);
            if (!arrayList.contains(strSubstring) && !arrayList2.contains(strSubstring)) {
                a(str3);
            }
        }
        java.util.Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            a((java.lang.String) it2.next());
        }
        synchronized (this.e) {
            for (java.lang.String str4 : arrayList) {
                java.util.regex.Pattern pattern3 = com.five_corp.ad.internal.storage.r.b;
                this.f.put(com.five_corp.ad.internal.storage.r.a(str4), a(str4, arrayList3.contains(str4 + ".success"), false));
            }
            for (java.lang.String str5 : arrayList2) {
                java.util.regex.Pattern pattern4 = com.five_corp.ad.internal.storage.r.b;
                this.g.put(com.five_corp.ad.internal.storage.r.a(str5), a(str5, arrayList3.contains(str5 + ".success"), false));
            }
        }
        return new com.five_corp.ad.internal.util.g(true, null);
    }

    public final void a(java.util.HashSet hashSet) {
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.w wVar = (com.five_corp.ad.internal.ad.w) it.next();
            java.util.regex.Pattern pattern = com.five_corp.ad.internal.storage.r.b;
            hashSet2.add(com.five_corp.ad.internal.J.a(wVar.f1835a));
        }
        synchronized (this.e) {
            java.util.Iterator it2 = this.g.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                if (!hashSet2.contains(entry.getKey())) {
                    ((com.five_corp.ad.internal.cache.o) entry.getValue()).a();
                    it2.remove();
                }
            }
        }
    }

    public final void a(java.lang.String str) {
        com.five_corp.ad.internal.util.g gVarA = ((com.five_corp.ad.internal.storage.c) this.f2053a.f2059a).a(str);
        if (gVarA.f2085a) {
            return;
        }
        this.d.a(5, gVarA.b.b());
    }

    public final com.five_corp.ad.internal.cache.o a(com.five_corp.ad.internal.ad.w wVar) {
        com.five_corp.ad.internal.cache.o oVarB;
        synchronized (this.e) {
            oVarB = b(wVar);
        }
        return oVarB;
    }

    public final java.util.HashMap a(java.util.List list) {
        java.util.HashMap map;
        synchronized (this.e) {
            map = new java.util.HashMap();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.five_corp.ad.internal.ad.w wVar = (com.five_corp.ad.internal.ad.w) it.next();
                map.put(wVar, b(wVar));
            }
        }
        return map;
    }
}
