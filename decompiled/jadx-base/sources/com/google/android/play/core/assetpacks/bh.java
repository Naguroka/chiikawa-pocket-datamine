package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2151a = new com.google.android.play.core.assetpacks.internal.o("AssetPackStorage");
    private static final long b = java.util.concurrent.TimeUnit.DAYS.toMillis(14);
    private static final long c = java.util.concurrent.TimeUnit.DAYS.toMillis(28);
    private final android.content.Context d;
    private final com.google.android.play.core.assetpacks.ed e;

    bh(android.content.Context context, com.google.android.play.core.assetpacks.ed edVar) {
        this.d = context;
        this.e = edVar;
    }

    private static long H(java.io.File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z && file.listFiles().length > 1) {
            f2151a.e("Multiple pack versions found, using highest version code.", new java.lang.Object[0]);
        }
        try {
            for (java.io.File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(java.lang.Long.valueOf(file2.getName()));
                }
            }
        } catch (java.lang.NumberFormatException e) {
            f2151a.c(e, "Corrupt asset pack directories.", new java.lang.Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        java.util.Collections.sort(arrayList);
        return ((java.lang.Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private final java.io.File I(java.lang.String str) {
        return new java.io.File(L(), str);
    }

    private final java.io.File J(java.lang.String str, int i, long j) {
        return new java.io.File(j(str, i, j), "merge.tmp");
    }

    private final java.io.File K(java.lang.String str, int i, long j) {
        return new java.io.File(new java.io.File(new java.io.File(M(), str), java.lang.String.valueOf(i)), java.lang.String.valueOf(j));
    }

    private final java.io.File L() {
        return new java.io.File(this.d.getFilesDir(), "assetpacks");
    }

    private final java.io.File M() {
        return new java.io.File(L(), "_tmp");
    }

    private static java.util.List N(android.content.pm.PackageInfo packageInfo, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (packageInfo.splitNames == null) {
            return arrayList;
        }
        for (int i = (-java.util.Arrays.binarySearch(packageInfo.splitNames, str)) - 1; i < packageInfo.splitNames.length && packageInfo.splitNames[i].startsWith(str); i++) {
            arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i]);
        }
        return arrayList;
    }

    private final java.util.List O() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (L().exists() && L().listFiles() != null) {
                for (java.io.File file : L().listFiles()) {
                    if (!file.getCanonicalPath().equals(M().getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
                return arrayList;
            }
            return arrayList;
        } catch (java.io.IOException e) {
            f2151a.b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    private static void P(java.io.File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jH = H(file, false);
        for (java.io.File file2 : file.listFiles()) {
            if (!file2.getName().equals(java.lang.String.valueOf(jH)) && !file2.getName().equals("stale.tmp")) {
                Q(file2);
            }
        }
    }

    private static boolean Q(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        boolean zQ = true;
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                zQ &= Q(file2);
            }
        }
        if (file.delete()) {
            return zQ;
        }
        return false;
    }

    final void A(java.lang.String str, int i, long j, int i2) throws java.io.IOException {
        java.io.File fileJ = J(str, i, j);
        java.util.Properties properties = new java.util.Properties();
        properties.put("numberOfMerges", java.lang.String.valueOf(i2));
        fileJ.getParentFile().mkdirs();
        fileJ.createNewFile();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileJ);
        properties.store(fileOutputStream, (java.lang.String) null);
        fileOutputStream.close();
    }

    final void B(java.lang.String str, int i, long j) {
        java.io.File fileI = I(str);
        if (fileI.exists()) {
            for (java.io.File file : fileI.listFiles()) {
                if (!file.getName().equals(java.lang.String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    Q(file);
                } else if (file.getName().equals(java.lang.String.valueOf(i))) {
                    for (java.io.File file2 : file.listFiles()) {
                        if (!file2.getName().equals(java.lang.String.valueOf(j))) {
                            Q(file2);
                        }
                    }
                }
            }
        }
    }

    final void C(java.util.List list) {
        int iA = this.e.a();
        for (java.io.File file : O()) {
            if (!list.contains(file.getName()) && H(file, true) != iA) {
                Q(file);
            }
        }
    }

    final boolean D(java.lang.String str) {
        if (I(str).exists()) {
            return Q(I(str));
        }
        return true;
    }

    final boolean E(java.lang.String str, int i, long j) {
        if (K(str, i, j).exists()) {
            return Q(K(str, i, j));
        }
        return true;
    }

    final boolean F(java.lang.String str, int i, long j) {
        if (h(str, i, j).exists()) {
            return Q(h(str, i, j));
        }
        return true;
    }

    final boolean G(java.lang.String str) {
        try {
            return r(str) != null;
        } catch (java.io.IOException unused) {
        }
    }

    final int a(java.lang.String str) {
        return (int) H(I(str), true);
    }

    final int b(java.lang.String str, int i, long j) throws java.io.IOException {
        java.io.File fileJ = J(str, i, j);
        if (!fileJ.exists()) {
            return 0;
        }
        java.util.Properties properties = new java.util.Properties();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileJ);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new com.google.android.play.core.assetpacks.ck("Merge checkpoint file corrupt.");
            }
            try {
                return java.lang.Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (java.lang.NumberFormatException e) {
                throw new com.google.android.play.core.assetpacks.ck("Merge checkpoint file corrupt.", e);
            }
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                try {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                } catch (java.lang.Exception unused) {
                }
            }
            throw th;
        }
    }

    final long c(java.lang.String str) {
        return H(g(str, (int) H(I(str), true)), true);
    }

    final com.google.android.play.core.assetpacks.AssetLocation d(java.lang.String str, java.lang.String str2, java.util.List list) {
        if (list == null) {
            return null;
        }
        java.lang.String path = new java.io.File("assets", str2).getPath();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            try {
                com.google.android.play.core.assetpacks.AssetLocation assetLocationA = com.google.android.play.core.assetpacks.bt.a(str3, path);
                if (assetLocationA != null) {
                    return assetLocationA;
                }
            } catch (java.io.IOException e) {
                f2151a.c(e, "Failed to parse APK file '%s' looking for asset '%s'.", str3, str2);
                return null;
            }
        }
        f2151a.a("The asset %s is not present in Asset Pack %s. Searched in APKs: %s", str2, str, list);
        return null;
    }

    final com.google.android.play.core.assetpacks.AssetLocation e(java.lang.String str, java.lang.String str2, com.google.android.play.core.assetpacks.AssetPackLocation assetPackLocation) {
        java.io.File file = new java.io.File(assetPackLocation.assetsPath(), str2);
        if (file.exists()) {
            return new com.google.android.play.core.assetpacks.bl(file.getPath(), 0L, file.length());
        }
        f2151a.a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str2, str, assetPackLocation.assetsPath());
        return null;
    }

    final com.google.android.play.core.assetpacks.AssetPackLocation f(java.lang.String str) throws java.io.IOException {
        java.lang.String strR = r(str);
        if (strR == null) {
            return null;
        }
        java.io.File file = new java.io.File(strR, "assets");
        if (file.isDirectory()) {
            return new com.google.android.play.core.assetpacks.bm(0, strR, file.getCanonicalPath());
        }
        f2151a.b("Failed to find assets directory: %s", file);
        return null;
    }

    final java.io.File g(java.lang.String str, int i) {
        return new java.io.File(I(str), java.lang.String.valueOf(i));
    }

    final java.io.File h(java.lang.String str, int i, long j) {
        return new java.io.File(g(str, i), java.lang.String.valueOf(j));
    }

    final java.io.File i(java.lang.String str, int i, long j) {
        return new java.io.File(h(str, i, j), "_metadata");
    }

    final java.io.File j(java.lang.String str, int i, long j) {
        return new java.io.File(K(str, i, j), "_packs");
    }

    final java.io.File k(java.lang.String str, int i, long j) {
        return new java.io.File(i(str, i, j), "properties.dat");
    }

    final java.io.File l(java.lang.String str, int i, long j) {
        return new java.io.File(new java.io.File(K(str, i, j), "_slices"), "_metadata");
    }

    final java.io.File m(java.lang.String str, int i, long j, java.lang.String str2) {
        return new java.io.File(o(str, i, j, str2), "checkpoint_ext.dat");
    }

    final java.io.File n(java.lang.String str, int i, long j, java.lang.String str2) {
        return new java.io.File(o(str, i, j, str2), "checkpoint.dat");
    }

    final java.io.File o(java.lang.String str, int i, long j, java.lang.String str2) {
        return new java.io.File(l(str, i, j), str2);
    }

    final java.io.File p(java.lang.String str, int i, long j, java.lang.String str2) {
        return new java.io.File(new java.io.File(new java.io.File(K(str, i, j), "_slices"), "_unverified"), str2);
    }

    final java.io.File q(java.lang.String str, int i, long j, java.lang.String str2) {
        return new java.io.File(new java.io.File(new java.io.File(K(str, i, j), "_slices"), "_verified"), str2);
    }

    final java.lang.String r(java.lang.String str) throws java.io.IOException {
        int length;
        java.io.File file = new java.io.File(L(), str);
        if (!file.exists()) {
            f2151a.a("Pack not found with pack name: %s", str);
            return null;
        }
        java.io.File file2 = new java.io.File(file, java.lang.String.valueOf(this.e.a()));
        if (!file2.exists()) {
            f2151a.a("Pack not found with pack name: %s app version: %s", str, java.lang.Integer.valueOf(this.e.a()));
            return null;
        }
        java.io.File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            f2151a.a("No pack version found for pack name: %s app version: %s", str, java.lang.Integer.valueOf(this.e.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        f2151a.b("Multiple pack versions found for pack name: %s app version: %s", str, java.lang.Integer.valueOf(this.e.a()));
        return null;
    }

    final java.util.List s(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        java.lang.String str2 = null;
        try {
            packageInfo = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            f2151a.b("Could not find PackageInfo.", new java.lang.Object[0]);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (packageInfo.splitNames == null || packageInfo.applicationInfo.splitSourceDirs == null) {
            f2151a.a("No splits present for package %s.", str);
        } else {
            int iBinarySearch = java.util.Arrays.binarySearch(packageInfo.splitNames, str);
            if (iBinarySearch < 0) {
                f2151a.a("Asset Pack '%s' is not installed.", str);
            } else {
                str2 = packageInfo.applicationInfo.splitSourceDirs[iBinarySearch];
            }
        }
        if (str2 == null) {
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            arrayList.addAll(N(packageInfo, "config."));
            return arrayList;
        }
        arrayList.add(str2);
        arrayList.addAll(N(packageInfo, java.lang.String.valueOf(str).concat(".config.")));
        return arrayList;
    }

    final java.util.Map t() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = O().iterator();
        while (it.hasNext()) {
            java.lang.String name = ((java.io.File) it.next()).getName();
            int iH = (int) H(I(name), true);
            long jH = H(g(name, iH), true);
            if (h(name, iH, jH).exists()) {
                map.put(name, java.lang.Long.valueOf(jH));
            }
        }
        return map;
    }

    final java.util.Map u() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : v().keySet()) {
            map.put(str, java.lang.Long.valueOf(c(str)));
        }
        return map;
    }

    final java.util.Map v() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            for (java.io.File file : O()) {
                com.google.android.play.core.assetpacks.AssetPackLocation assetPackLocationF = f(file.getName());
                if (assetPackLocationF != null) {
                    map.put(file.getName(), assetPackLocationF);
                }
            }
        } catch (java.io.IOException e) {
            f2151a.b("Could not process directory while scanning installed packs: %s", e);
        }
        return map;
    }

    final void w() {
        for (java.io.File file : O()) {
            if (file.listFiles() != null) {
                P(file);
                long jH = H(file, false);
                if (this.e.a() != jH) {
                    try {
                        new java.io.File(new java.io.File(file, java.lang.String.valueOf(jH)), "stale.tmp").createNewFile();
                    } catch (java.io.IOException unused) {
                        f2151a.b("Could not write staleness marker.", new java.lang.Object[0]);
                    }
                }
                for (java.io.File file2 : file.listFiles()) {
                    P(file2);
                }
            }
        }
    }

    final void x() {
        if (M().exists()) {
            for (java.io.File file : M().listFiles()) {
                if (java.lang.System.currentTimeMillis() - file.lastModified() > b) {
                    Q(file);
                } else {
                    P(file);
                }
            }
        }
    }

    final void y() {
        for (java.io.File file : O()) {
            if (file.listFiles() != null) {
                for (java.io.File file2 : file.listFiles()) {
                    java.io.File file3 = new java.io.File(file2, "stale.tmp");
                    if (file3.exists() && java.lang.System.currentTimeMillis() - file3.lastModified() > c) {
                        Q(file2);
                    }
                }
            }
        }
    }

    final void z() {
        Q(L());
    }
}
