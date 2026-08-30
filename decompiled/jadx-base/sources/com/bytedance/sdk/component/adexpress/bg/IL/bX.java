package com.bytedance.sdk.component.adexpress.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bX {
    public abstract java.io.File bg();

    protected boolean bg(java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar = map.get(it.next());
            if (bgVar != null && !bg(bgVar.ldr())) {
                return false;
            }
        }
        return true;
    }

    protected boolean bg(java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> list) {
        if (list == null || list.size() <= 0 || bg() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : list) {
            java.lang.String strBg = com.bytedance.sdk.component.utils.zx.bg(c0104bg.bg());
            if (android.text.TextUtils.isEmpty(strBg)) {
                return false;
            }
            java.io.File file = new java.io.File(bg(), strBg);
            java.lang.String strBg2 = com.bytedance.sdk.component.utils.zx.bg(file);
            if (!file.exists() || !file.isFile() || c0104bg.IL() == null || !c0104bg.IL().equals(strBg2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean bg(com.bytedance.sdk.component.adexpress.bg.bX.bg.IL il) {
        if (il == null || bg() == null) {
            return false;
        }
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> listIL = il.IL();
        if (listIL == null || listIL.size() <= 0) {
            return true;
        }
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = listIL.iterator();
        while (it.hasNext()) {
            java.io.File file = new java.io.File(bg(), (java.lang.String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> bg(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar, com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar2) {
        java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg = bgVar.bg();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (mapBg.size() == 0) {
            if (bgVar2 != null && bgVar2.bg().size() != 0) {
                java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg2 = bgVar2.bg();
                java.util.Iterator<java.lang.String> it = mapBg2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar3 = mapBg2.get(it.next());
                    if (bgVar3 != null) {
                        arrayList.addAll(bgVar3.ldr());
                    }
                }
            }
        } else if (bgVar2 == null || bgVar2.bg().size() == 0) {
            if (mapBg.size() != 0) {
                java.util.Iterator<java.lang.String> it2 = mapBg.keySet().iterator();
                while (it2.hasNext()) {
                    com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar4 = mapBg.get(it2.next());
                    if (bgVar4 != null) {
                        arrayList2.addAll(bgVar4.ldr());
                    }
                }
            }
        } else {
            java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg3 = bgVar2.bg();
            for (java.lang.String str : mapBg.keySet()) {
                com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar5 = mapBg.get(str);
                com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar6 = mapBg3.get(str);
                if (bgVar6 == null && bgVar5 != null) {
                    arrayList2.addAll(bgVar5.ldr());
                } else if (bgVar5 == null && bgVar6 != null) {
                    arrayList.addAll(bgVar6.ldr());
                } else if (bgVar5 != null) {
                    for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : bgVar5.ldr()) {
                        if (c0104bg != null && !bgVar6.ldr().contains(c0104bg) && c0104bg.IL() != null && c0104bg.bg() != null) {
                            arrayList2.add(c0104bg);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg2 : bgVar6.ldr()) {
                        if (c0104bg2 != null && !bgVar5.ldr().contains(c0104bg2)) {
                            arrayList.add(c0104bg2);
                        }
                    }
                }
            }
        }
        if (bg(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    private boolean bg(java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> list, java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> list2) {
        for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : list) {
            java.lang.String strBg = c0104bg.bg();
            java.lang.String strBg2 = com.bytedance.sdk.component.utils.zx.bg(strBg);
            java.io.File file = new java.io.File(bg(), strBg2);
            java.io.File file2 = new java.io.File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (java.lang.Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.iR.IL.bg bgVarLdr = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().ldr();
            bgVarLdr.IL(strBg);
            bgVarLdr.bg(bg().getAbsolutePath(), strBg2);
            com.bytedance.sdk.component.iR.IL ilBg = bgVarLdr.bg();
            list2.add(c0104bg);
            if (ilBg == null || !ilBg.ldr() || ilBg.zx() == null || !ilBg.zx().exists()) {
                bX(list2);
                return false;
            }
        }
        return true;
    }

    public java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> IL(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar, com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (bgVar2 == null || bgVar2.ldr().isEmpty()) {
            arrayList2.addAll(bgVar.ldr());
        } else if (bgVar.ldr().isEmpty()) {
            arrayList.addAll(bgVar2.ldr());
        } else {
            for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : bgVar.ldr()) {
                if (!bgVar2.ldr().contains(c0104bg) && c0104bg != null && c0104bg.bg() != null && c0104bg.IL() != null) {
                    arrayList2.add(c0104bg);
                }
            }
            for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg2 : bgVar2.ldr()) {
                if (!bgVar.ldr().contains(c0104bg2)) {
                    arrayList.add(c0104bg2);
                }
            }
        }
        if (bg(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void IL(java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> it = list.iterator();
        while (it.hasNext()) {
            java.io.File file = new java.io.File(bg(), com.bytedance.sdk.component.utils.zx.bg(it.next().bg()));
            java.io.File file2 = new java.io.File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
    }

    public boolean bg(java.lang.String str) {
        java.io.File file = new java.io.File(bg().getAbsoluteFile(), com.bytedance.sdk.component.utils.zx.bg(str) + ".zip");
        com.bytedance.sdk.component.iR.IL.bg bgVarLdr = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().ldr();
        bgVarLdr.IL(str);
        bgVarLdr.bg(file.getParent(), file.getName());
        com.bytedance.sdk.component.iR.IL ilBg = bgVarLdr.bg();
        if (ilBg.ldr() && ilBg.zx() != null && ilBg.zx().exists()) {
            java.io.File fileZx = ilBg.zx();
            try {
                com.bytedance.sdk.component.utils.Uw.bg(fileZx.getAbsolutePath(), file.getParent());
                if (!fileZx.exists()) {
                    return true;
                }
                fileZx.delete();
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public void bg(int i) {
        if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().eqN() != null) {
            com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().eqN().bg(i);
        }
    }

    public void bX(java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> it = list.iterator();
        while (it.hasNext()) {
            java.io.File file = new java.io.File(bg(), com.bytedance.sdk.component.utils.zx.bg(it.next().bg()));
            java.io.File file2 = new java.io.File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
    }

    public static void bg(java.io.File file, com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar, java.lang.String str) {
        if (bgVar == null) {
            return;
        }
        java.lang.String strWR = bgVar.WR();
        if (android.text.TextUtils.isEmpty(strWR)) {
            return;
        }
        java.io.File file2 = new java.io.File(file, str);
        java.io.File file3 = new java.io.File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file3);
            try {
                fileOutputStream2.write(strWR.getBytes(com.json.zb.N));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                try {
                    fileOutputStream2.close();
                } catch (java.io.IOException unused) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    com.bytedance.sdk.component.utils.PX.bg("PlayComponentEngineCacheManager", "version save error3", th);
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static boolean bX(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar, com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar2) {
        if (bgVar != null) {
            try {
                if (!android.text.TextUtils.isEmpty(bgVar.bX())) {
                    if (bgVar2 == null) {
                        return false;
                    }
                    if (bg(bgVar.bX(), bgVar2.bX())) {
                        return true;
                    }
                    java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg = bgVar.bg();
                    java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg2 = bgVar2.bg();
                    if (mapBg.isEmpty()) {
                        return !mapBg2.isEmpty();
                    }
                    if (mapBg2.isEmpty()) {
                        return false;
                    }
                    return bg(mapBg, mapBg2);
                }
            } catch (java.lang.Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    private static boolean bg(java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> map, java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (java.lang.String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar = map.get(str);
            if (bgVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar2 = map2.get(str);
            if (bgVar2 == null) {
                return false;
            }
            if (bg(bgVar.bX(), bgVar2.bX())) {
                return true;
            }
        }
        return false;
    }

    private static boolean bg(java.lang.String str, java.lang.String str2) {
        java.lang.String[] strArrSplit = str2.split("\\.");
        java.lang.String[] strArrSplit2 = str.split("\\.");
        int iMin = java.lang.Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int length = strArrSplit[i].length() - strArrSplit2[i].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i].compareTo(strArrSplit2[i]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean bg(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar, java.lang.String str) {
        if (bgVar == null) {
            return true;
        }
        try {
            if (android.text.TextUtils.isEmpty(bgVar.bX())) {
                return true;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            return bg(bgVar.bX(), str);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void IL(java.io.File file, com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar, java.lang.String str) {
        if (bgVar == null || file == null) {
            return;
        }
        try {
            new java.io.File(file, str).delete();
        } catch (java.lang.Throwable unused) {
        }
        if (bgVar.ldr() != null) {
            java.util.Iterator<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> it = bgVar.ldr().iterator();
            while (it.hasNext()) {
                try {
                    new java.io.File(file, com.bytedance.sdk.component.utils.zx.bg(it.next().bg())).delete();
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
    }
}
