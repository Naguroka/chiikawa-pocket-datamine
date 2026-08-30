package com.bytedance.sdk.openadsdk.core.Ta.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static volatile com.bytedance.sdk.openadsdk.core.Ta.bX.bg bg;
    private java.lang.String IL;
    private final java.util.Map<com.bytedance.sdk.openadsdk.core.model.tuV, com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL> bX = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.Map<java.lang.String, org.json.JSONObject> eqN = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.Set<java.lang.String> ldr = java.util.Collections.synchronizedSet(new java.util.HashSet());
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.component.iR.IL.bg> iR = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.Map<java.lang.String, java.lang.String> Kg = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.Ta.bX.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0139bg {
    }

    public static com.bytedance.sdk.openadsdk.core.Ta.bX.bg bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.Ta.bX.bg.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.core.Ta.bX.bg();
                }
            }
        }
        return bg;
    }

    private bg() {
    }

    public boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (this.zx.get() && tuv != null && tuv.Dxa() != null && tuv.Dxa().Ta() != null) {
            try {
                if (!android.text.TextUtils.isEmpty(this.Kg.get(com.bytedance.sdk.component.utils.zx.bg(tuv.Dxa().Ta())))) {
                    return true;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    public void IL() {
        if (this.zx.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.Ta.bX.bg.1
            @Override // java.lang.Runnable
            public void run() {
                java.io.File[] fileArrListFiles;
                try {
                    java.lang.String strEqN = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.eqN();
                    if (!android.text.TextUtils.isEmpty(strEqN)) {
                        java.io.File file = new java.io.File(strEqN);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (java.io.File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        java.io.File fileBg = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg(file2);
                                        if (fileBg != null && fileBg.exists()) {
                                            com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.Kg.put(file2.getName(), fileBg.getAbsolutePath());
                                        }
                                        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bg(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.eqN(fileBg), true);
                                    } catch (java.lang.Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.tuV.bg.bX.bg().bg(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.Kg);
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.zx.set(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject bg(java.io.File file, boolean z) {
        byte[] bArrEqN;
        java.lang.String strIL;
        try {
            if (!zx(file) || (bArrEqN = com.bytedance.sdk.component.utils.ldr.eqN(file)) == null || bArrEqN.length <= 0) {
                return null;
            }
            if (android.text.TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strIL = com.bytedance.sdk.component.utils.bg.bX(new java.lang.String(bArrEqN));
            } else {
                strIL = com.bytedance.sdk.component.eqN.bg.IL(new java.lang.String(bArrEqN), com.bytedance.sdk.openadsdk.core.bg.IL());
            }
            if (android.text.TextUtils.isEmpty(strIL)) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(strIL);
            if (z && jSONObject.length() > 0) {
                this.eqN.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.File eqN(java.io.File file) {
        java.io.File file2 = new java.io.File(file, "tt_open_ad_sdk_check_res.dat");
        return zx(file2) ? file2 : new java.io.File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean zx(java.io.File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public android.webkit.WebResourceResponse bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.File fileBg;
        try {
            android.webkit.WebResourceResponse webResourceResponseBg = com.bytedance.sdk.openadsdk.tuV.bg.bX.bg().bg(str3);
            if (webResourceResponseBg != null) {
                return webResourceResponseBg;
            }
            if (this.zx.get() && !android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                try {
                    if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                        str3 = str3.split("\\?")[0];
                        if (str3.endsWith("/")) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
                java.lang.String strBg = com.bytedance.sdk.component.utils.yDt.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str3);
                com.bytedance.sdk.openadsdk.yDt.bX.bX(strBg, str3);
                if (android.text.TextUtils.isEmpty(strBg)) {
                    return null;
                }
                java.lang.String strBg2 = com.bytedance.sdk.component.utils.zx.bg(str);
                if (android.text.TextUtils.isEmpty(strBg2)) {
                    return null;
                }
                java.lang.String str4 = this.Kg.get(strBg2);
                if (!android.text.TextUtils.isEmpty(str4)) {
                    fileBg = new java.io.File(str4);
                } else {
                    fileBg = bg(new java.io.File(eqN(), strBg2));
                    if (fileBg != null && fileBg.exists()) {
                        this.Kg.put(strBg2, fileBg.getAbsolutePath());
                    }
                }
                if (fileBg != null && fileBg.exists()) {
                    java.lang.String strBg3 = bg(str2);
                    if (android.text.TextUtils.isEmpty(strBg3)) {
                        return null;
                    }
                    java.lang.String strReplace = str3.replace(strBg3, "");
                    if (!android.text.TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                        java.io.File file = new java.io.File(fileBg, strReplace);
                        if (file.exists() && bg(strBg2, strReplace, file) && file.getCanonicalPath().startsWith(fileBg.getCanonicalPath())) {
                            return new android.webkit.WebResourceResponse(strBg, com.json.zb.N, new java.io.FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("PlayableCache", "playable intercept error: ", th);
        }
        return null;
    }

    public static java.io.File bg(java.io.File file) {
        java.io.File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (java.io.File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return bg(file3);
                }
            }
        }
        return null;
    }

    private java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            java.lang.String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            java.lang.String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean bg(java.lang.String str, java.lang.String str2, java.io.File file) {
        if (file != null && file.exists()) {
            org.json.JSONObject jSONObject = this.eqN.get(str);
            if (jSONObject == null) {
                return true;
            }
            java.lang.String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(com.bytedance.sdk.component.utils.zx.bg(file))) {
                return true;
            }
        }
        return false;
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.core.Ta.bX.bg.InterfaceC0139bg interfaceC0139bg) {
        java.io.File file;
        if (com.bytedance.sdk.openadsdk.tuV.bg.eqN.bg().IL() && tuv != null && tuv.VW() != null && !android.text.TextUtils.isEmpty(tuv.VW().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, -705, "server bidding pre render");
            bg(interfaceC0139bg, false);
            return;
        }
        if (tuv == null || tuv.Dxa() == null || android.text.TextUtils.isEmpty(tuv.Dxa().Ta())) {
            com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, -701, (java.lang.String) null);
            bg(interfaceC0139bg, false);
            return;
        }
        final java.lang.String strTa = tuv.Dxa().Ta();
        if (this.ldr.contains(strTa)) {
            return;
        }
        this.bX.put(tuv, new com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL().bg(java.lang.System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv);
        java.lang.String strBg = com.bytedance.sdk.component.utils.zx.bg(strTa);
        final java.io.File file2 = new java.io.File(eqN(), strBg);
        java.lang.String str = this.Kg.get(strBg);
        if (android.text.TextUtils.isEmpty(str)) {
            file = bg(file2);
            if (file != null && file.exists()) {
                this.Kg.put(strBg, file.getAbsolutePath());
            }
        } else {
            file = new java.io.File(str);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, -702, (java.lang.String) null);
            bX(file2);
            this.bX.remove(tuv);
            bg(interfaceC0139bg, true);
            return;
        }
        try {
            com.bytedance.sdk.component.utils.ldr.bX(file2);
        } catch (java.lang.Throwable unused) {
        }
        this.ldr.add(strTa);
        java.io.File file3 = new java.io.File(zx(), strBg + ".zip");
        com.bytedance.sdk.component.iR.IL.bg bgVarEqN = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().eqN();
        this.iR.put(strTa, bgVarEqN);
        bgVarEqN.IL(strTa);
        bgVarEqN.bg(file3.getParent(), file3.getName());
        bgVarEqN.bg(7);
        bgVarEqN.bg("playable_download");
        bgVarEqN.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.bX.bg.2
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, final com.bytedance.sdk.component.iR.IL il) {
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.ldr.remove(strTa);
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.iR.remove(strTa);
                final com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL il2 = (com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL) com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bX.remove(tuv);
                if (il2 != null) {
                    il2.IL(java.lang.System.currentTimeMillis());
                }
                if (il.ldr() && il.zx() != null && il.zx().exists()) {
                    com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.Ta.bX.bg.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z;
                            long jBg;
                            long jIL;
                            try {
                                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL il3 = il2;
                                if (il3 != null) {
                                    il3.bX(java.lang.System.currentTimeMillis());
                                }
                                com.bytedance.sdk.component.utils.Uw.bg(il.zx().getAbsolutePath(), file2.getAbsolutePath());
                                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL il4 = il2;
                                if (il4 != null) {
                                    il4.eqN(java.lang.System.currentTimeMillis());
                                }
                                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL il5 = il2;
                                if (il5 != null) {
                                    jBg = il5.bg();
                                    jIL = il2.IL();
                                } else {
                                    jBg = 0;
                                    jIL = 0;
                                }
                                com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, jBg, jIL);
                                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL(file2);
                                z = true;
                                try {
                                    java.io.File fileBg = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg(file2);
                                    if (fileBg != null && fileBg.exists()) {
                                        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.Kg.put(file2.getName(), fileBg.getAbsolutePath());
                                    }
                                    com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bg(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.eqN(fileBg), true);
                                } catch (java.lang.Throwable unused2) {
                                }
                            } catch (java.lang.Throwable th) {
                                com.bytedance.sdk.component.utils.PX.bg("PlayableCache", "unzip error: ", th);
                                com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, -704, th.getMessage());
                                z = false;
                            }
                            try {
                                il.zx().delete();
                            } catch (java.lang.Throwable unused3) {
                            }
                            com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bg(interfaceC0139bg, z);
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, il.bg() != 0 ? il.bg() : -700, (java.lang.String) null);
                    com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bg(interfaceC0139bg, false);
                }
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.ldr.remove(strTa);
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.iR.remove(strTa);
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bX.remove(tuv);
                com.bytedance.sdk.openadsdk.core.Ta.bX.IL.bg(tuv, -700, iOException.getMessage());
                com.bytedance.sdk.openadsdk.core.Ta.bX.bg.this.bg(interfaceC0139bg, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.core.Ta.bX.bg.InterfaceC0139bg interfaceC0139bg, final boolean z) {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.bX.bg.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public static void IL(java.io.File file) {
        bX(file);
        try {
            com.bytedance.sdk.openadsdk.core.WR.IL().yDt().bg(file);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bX(java.io.File file) {
        try {
            if (!file.exists() || file.setLastModified(java.lang.System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String eqN() {
        java.io.File file = new java.io.File(zx(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private java.lang.String zx() {
        if (android.text.TextUtils.isEmpty(this.IL)) {
            try {
                java.io.File file = new java.io.File(com.bytedance.sdk.openadsdk.core.VzQ.bg().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.IL = file.getAbsolutePath();
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("PlayableCache", "init root path error: ".concat(java.lang.String.valueOf(th)));
            }
        }
        return this.IL;
    }

    private static class IL {
        long IL;
        long bX;
        long bg;
        long eqN;

        private IL() {
        }

        public long bg() {
            return this.IL - this.bg;
        }

        public long IL() {
            return this.eqN - this.bX;
        }

        public com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL bg(long j) {
            this.bg = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL IL(long j) {
            this.IL = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL bX(long j) {
            this.bX = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL eqN(long j) {
            this.eqN = j;
            return this;
        }
    }

    public void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || tuv.Dxa() == null || android.text.TextUtils.isEmpty(tuv.Dxa().Ta()) || !com.bytedance.sdk.openadsdk.Fy.bg.bg("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.iR.IL.bg bgVar = this.iR.get(tuv.Dxa().Ta());
        if (bgVar != null) {
            bgVar.IL();
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> bX() {
        return this.Kg;
    }
}
