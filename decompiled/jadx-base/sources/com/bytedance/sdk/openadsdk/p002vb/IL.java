package com.bytedance.sdk.openadsdk.p002vb;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static android.content.Context eqN;
    private static final long zx = java.lang.System.currentTimeMillis();
    private com.bytedance.sdk.openadsdk.p002vb.bX.bg IL;
    private java.lang.Boolean bX;
    private com.bytedance.sdk.openadsdk.p002vb.bX bg;
    private int ldr = 0;
    private final java.util.ArrayList<com.bytedance.sdk.openadsdk.p002vb.zx> iR = new java.util.ArrayList<>();
    private java.lang.Runnable Kg = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.2
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.p002vb.IL il = com.bytedance.sdk.openadsdk.p002vb.IL.this;
            il.bX = java.lang.Boolean.valueOf(il.bg.isMonitorOpen());
            if (com.bytedance.sdk.openadsdk.p002vb.IL.this.bX.booleanValue()) {
                com.bytedance.sdk.openadsdk.p002vb.IL il2 = com.bytedance.sdk.openadsdk.p002vb.IL.this;
                il2.bg(il2.iR);
                com.bytedance.sdk.openadsdk.p002vb.IL.this.iR.clear();
            }
        }
    };
    private java.lang.Runnable WR = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.4
        @Override // java.lang.Runnable
        public void run() {
            java.lang.String str;
            com.bytedance.sdk.openadsdk.p002vb.IL.AnonymousClass4 anonymousClass4 = this;
            java.lang.String str2 = "is_init";
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseIL = com.bytedance.sdk.openadsdk.p002vb.p003bg.VB.IL();
                if (sQLiteDatabaseIL != null) {
                    java.lang.String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", com.ironsource.aa.a.d, "mediation", "is_init", "extra"};
                    try {
                        java.lang.String str3 = "extra";
                        java.lang.String[] strArr2 = {java.lang.String.valueOf(com.bytedance.sdk.openadsdk.p002vb.IL.zx)};
                        int iMax = java.lang.Math.max(10, com.bytedance.sdk.openadsdk.p002vb.IL.this.bg.getOnceLogCount());
                        int i = iMax > 100 ? 10 : iMax;
                        android.database.Cursor cursorQuery = sQLiteDatabaseIL.query("monitor_table", strArr, "timestamp <= ?", strArr2, null, null, null, java.lang.String.valueOf(i));
                        if (cursorQuery != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (cursorQuery.moveToNext()) {
                                int i2 = i;
                                try {
                                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                    if (cursorQuery.getColumnIndex("_id") >= 0) {
                                        long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                        bgVar.bg(j);
                                        arrayList2.add(java.lang.String.valueOf(j));
                                    }
                                    if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                        bgVar.bg(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                                    }
                                    if (cursorQuery.getColumnIndex("scene") >= 0) {
                                        bgVar.IL(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                    }
                                    if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                        bgVar.bg(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                        bgVar.IL(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                        bgVar.bX(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("rit") >= 0) {
                                        bgVar.bX(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                    }
                                    if (cursorQuery.getColumnIndex("tag") >= 0) {
                                        bgVar.eqN(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                                    }
                                    if (cursorQuery.getColumnIndex("label") >= 0) {
                                        bgVar.zx(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                    }
                                    if (cursorQuery.getColumnIndex("mediation") >= 0) {
                                        bgVar.ldr(cursorQuery.getString(cursorQuery.getColumnIndex("mediation")));
                                    }
                                    java.lang.String str4 = str2;
                                    if (cursorQuery.getColumnIndex(str4) >= 0) {
                                        bgVar.eqN(cursorQuery.getInt(cursorQuery.getColumnIndex(str4)));
                                    }
                                    java.lang.String str5 = str3;
                                    if (cursorQuery.getColumnIndex(str5) >= 0) {
                                        bgVar.iR(cursorQuery.getString(cursorQuery.getColumnIndex(str5)));
                                    }
                                    arrayList.add(bgVar);
                                    anonymousClass4 = this;
                                    str3 = str5;
                                    i = i2;
                                    str2 = str4;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    str = "BusMonitorCenter";
                                    android.util.Log.e(str, th.getMessage());
                                }
                            }
                            int i3 = i;
                            cursorQuery.close();
                            str = "BusMonitorCenter";
                            try {
                                android.util.Log.i(str, "exec upload ...");
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                try {
                                    com.bytedance.sdk.openadsdk.p002vb.IL.this.bg.onMonitorUpload(arrayList);
                                    android.database.sqlite.SQLiteDatabase sQLiteDatabaseBg = com.bytedance.sdk.openadsdk.p002vb.p003bg.VB.bg();
                                    if (sQLiteDatabaseBg != null && sQLiteDatabaseBg.isOpen()) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append("_id IN (");
                                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                            sb.append("?");
                                            if (i4 < arrayList2.size() - 1) {
                                                sb.append(",");
                                            }
                                        }
                                        sb.append(")");
                                        sQLiteDatabaseBg.delete("monitor_table", sb.toString(), (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
                                        if (com.bytedance.sdk.openadsdk.p002vb.IL.this.IL != null) {
                                            com.bytedance.sdk.openadsdk.p002vb.IL.this.IL.bg(com.bytedance.sdk.openadsdk.p002vb.IL.zx);
                                        }
                                    }
                                    if (arrayList.size() < i3 || com.bytedance.sdk.openadsdk.p002vb.IL.this.ldr > 1000) {
                                        return;
                                    }
                                    com.bytedance.sdk.openadsdk.p002vb.IL.this.bg(false);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    android.util.Log.e(str, th.getMessage());
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                str = "BusMonitorCenter";
            }
        }
    };

    static /* synthetic */ int eqN(com.bytedance.sdk.openadsdk.p002vb.IL il) {
        int i = il.ldr;
        il.ldr = i + 1;
        return i;
    }

    private IL(com.bytedance.sdk.openadsdk.p002vb.bX bXVar) {
        try {
            this.bg = new com.bytedance.sdk.openadsdk.BusMonitorDependWrapper(bXVar);
            this.IL = new com.bytedance.sdk.openadsdk.p002vb.bX.bg(bXVar.getContext());
            eqN = bXVar.getContext();
        } catch (java.lang.Throwable th) {
            android.util.Log.e("BusMonitorCenter", th.getMessage());
        }
    }

    public static com.bytedance.sdk.openadsdk.p002vb.IL bg(com.bytedance.sdk.openadsdk.p002vb.bX bXVar) {
        return new com.bytedance.sdk.openadsdk.p002vb.IL(bXVar);
    }

    public static android.content.Context bg() {
        android.content.Context context = eqN;
        return context != null ? context : com.bytedance.sdk.openadsdk.BusMonitorDependWrapper.getReflectContext();
    }

    public void bg(final com.bytedance.sdk.openadsdk.p002vb.zx zxVar) {
        if (zxVar == null || !bX()) {
            return;
        }
        this.bg.getHandler().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.p002vb.IL il = com.bytedance.sdk.openadsdk.p002vb.IL.this;
                il.bX = java.lang.Boolean.valueOf(il.bg.isMonitorOpen());
                if (com.bytedance.sdk.openadsdk.p002vb.IL.this.bX.booleanValue()) {
                    com.bytedance.sdk.openadsdk.p002vb.IL.this.iR.add(zxVar);
                    if (com.bytedance.sdk.openadsdk.p002vb.IL.this.iR.size() >= 10) {
                        com.bytedance.sdk.openadsdk.p002vb.IL il2 = com.bytedance.sdk.openadsdk.p002vb.IL.this;
                        il2.bg(il2.iR);
                        com.bytedance.sdk.openadsdk.p002vb.IL.this.iR.clear();
                    }
                }
            }
        });
        this.bg.getHandler().removeCallbacks(this.Kg);
        this.bg.getHandler().postDelayed(this.Kg, 5000L);
    }

    private boolean bX() {
        if (this.bX == null) {
            com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
            if (bXVar != null && bXVar.getContext() != null && this.bg.getHandler() != null) {
                return true;
            }
        } else {
            com.bytedance.sdk.openadsdk.p002vb.bX bXVar2 = this.bg;
            if (bXVar2 != null && bXVar2.getContext() != null && this.bg.isMonitorOpen() && this.bg.getHandler() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x011f  */
    public void bg(java.util.List<com.bytedance.sdk.openadsdk.p002vb.zx> list) {
        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVarGeneratorModel;
        if (list == null || list.isEmpty()) {
            return;
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseBg = com.bytedance.sdk.openadsdk.p002vb.p003bg.VB.bg();
                if (sQLiteDatabaseBg != null) {
                    try {
                        sQLiteDatabaseBg.beginTransaction();
                        char c = 0;
                        int i = 0;
                        while (i < list.size()) {
                            com.bytedance.sdk.openadsdk.p002vb.zx zxVar = list.get(i);
                            if (zxVar == null || (bgVarGeneratorModel = zxVar.generatorModel()) == null) {
                                i = i;
                            } else {
                                java.lang.String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", com.ironsource.aa.a.d, "mediation", "is_init", "extra"};
                                java.lang.String string = new java.lang.StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND extra = ?").toString();
                                java.lang.String[] strArr2 = new java.lang.String[8];
                                strArr2[c] = bgVarGeneratorModel.IL();
                                strArr2[1] = bgVarGeneratorModel.bX();
                                strArr2[2] = bgVarGeneratorModel.iR();
                                strArr2[3] = bgVarGeneratorModel.Kg();
                                strArr2[4] = bgVarGeneratorModel.WR();
                                strArr2[5] = bgVarGeneratorModel.VB();
                                strArr2[6] = java.lang.String.valueOf(bgVarGeneratorModel.PX());
                                strArr2[7] = bgVarGeneratorModel.Ta();
                                android.database.Cursor cursorQuery = sQLiteDatabaseBg.query("monitor_table", strArr, string, strArr2, null, null, null);
                                if (cursorQuery != null) {
                                    if (cursorQuery.moveToNext()) {
                                        if (cursorQuery.getColumnIndex("_id") >= 0) {
                                            bgVarGeneratorModel.bg(cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                                        }
                                        if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                            bgVarGeneratorModel.bg(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")) + bgVarGeneratorModel.eqN());
                                        }
                                        if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                            bgVarGeneratorModel.IL(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")) + bgVarGeneratorModel.zx());
                                        }
                                        if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                            bgVarGeneratorModel.bX(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")) + bgVarGeneratorModel.ldr());
                                        }
                                        if (cursorQuery.getColumnIndex(com.ironsource.aa.a.d) >= 0) {
                                            bgVarGeneratorModel.IL(java.lang.Math.min(cursorQuery.getLong(cursorQuery.getColumnIndex(com.ironsource.aa.a.d)), bgVarGeneratorModel.eo()));
                                        }
                                    }
                                    cursorQuery.close();
                                } else {
                                    i = i;
                                }
                                android.content.ContentValues contentValues = new android.content.ContentValues();
                                if (bgVarGeneratorModel.bg() > 0) {
                                    contentValues.put("_id", java.lang.Long.valueOf(bgVarGeneratorModel.bg()));
                                }
                                contentValues.put("sdk_version", bgVarGeneratorModel.IL());
                                contentValues.put("scene", bgVarGeneratorModel.bX());
                                contentValues.put("start_count", java.lang.Integer.valueOf(bgVarGeneratorModel.eqN()));
                                contentValues.put("success_count", java.lang.Integer.valueOf(bgVarGeneratorModel.zx()));
                                contentValues.put("fail_count", java.lang.Integer.valueOf(bgVarGeneratorModel.ldr()));
                                contentValues.put("rit", bgVarGeneratorModel.iR());
                                contentValues.put("tag", bgVarGeneratorModel.Kg());
                                contentValues.put("label", bgVarGeneratorModel.WR());
                                contentValues.put(com.ironsource.aa.a.d, java.lang.Long.valueOf(bgVarGeneratorModel.eo()));
                                contentValues.put("mediation", bgVarGeneratorModel.VB());
                                contentValues.put("is_init", java.lang.Integer.valueOf(bgVarGeneratorModel.PX()));
                                contentValues.put("extra", bgVarGeneratorModel.Ta());
                                sQLiteDatabaseBg.insertWithOnConflict("monitor_table", null, contentValues, 5);
                            }
                            i++;
                            c = 0;
                        }
                        android.util.Log.i("BusMonitorCenter", "exec save size = " + list.size());
                        sQLiteDatabaseBg.setTransactionSuccessful();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseBg;
                        try {
                            android.util.Log.e("BusMonitorCenter", th.getMessage());
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                                return;
                            }
                            return;
                        } catch (java.lang.Throwable th2) {
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                    throw th2;
                                } catch (java.lang.Throwable th3) {
                                    android.util.Log.e("BusMonitorCenter", th3.getMessage());
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    }
                }
                if (sQLiteDatabaseBg != null) {
                    sQLiteDatabaseBg.endTransaction();
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        } catch (java.lang.Throwable th5) {
            android.util.Log.e("BusMonitorCenter", th5.getMessage());
        }
    }

    public void bg(final boolean z) {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar == null || bXVar.getHandler() == null || this.bg.getContext() == null || this.IL == null || !this.bg.isMonitorOpen()) {
            return;
        }
        this.bg.getHandler().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.p002vb.IL.eqN(com.bytedance.sdk.openadsdk.p002vb.IL.this);
                    if (z) {
                        long jBg = com.bytedance.sdk.openadsdk.p002vb.IL.this.IL.bg();
                        if (jBg == 0) {
                            com.bytedance.sdk.openadsdk.p002vb.IL.this.IL.bg(java.lang.System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.p002vb.IL.zx - jBg < com.bytedance.sdk.openadsdk.p002vb.IL.this.bg.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (com.bytedance.sdk.openadsdk.p002vb.IL.this.bg.getHandler() != null) {
                        com.bytedance.sdk.openadsdk.p002vb.IL.this.bg.getHandler().post(com.bytedance.sdk.openadsdk.p002vb.IL.this.WR);
                    }
                } catch (java.lang.Throwable th) {
                    android.util.Log.e("BusMonitorCenter", th.getMessage());
                }
            }
        }, java.lang.Math.max(this.bg.getOnceLogInterval(), 10000));
    }
}
