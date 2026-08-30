package com.bytedance.sdk.component.ldr.bg.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX {
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bX;
    protected java.util.List<java.lang.String> bg;

    public byte bX() {
        return (byte) 2;
    }

    public byte bg() {
        return (byte) 1;
    }

    public iR(android.content.Context context, com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        super(context);
        this.bg = new java.util.ArrayList();
        this.bX = bgVar;
        if (bgVar == null) {
            this.bX = com.bytedance.sdk.component.ldr.bg.eqN.IL.bg.bX();
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX
    public java.lang.String IL() {
        return com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().eqN();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int eqN() {
        android.database.Cursor cursorBg;
        int i = 0;
        try {
            cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), new java.lang.String[]{"count(1)"}, null, null, null, null, null);
            if (cursorBg != null) {
                try {
                    cursorBg.moveToFirst();
                    i = cursorBg.getInt(0);
                } catch (java.lang.Throwable unused) {
                    if (cursorBg != null) {
                        try {
                            cursorBg.close();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            }
            if (cursorBg != null) {
                cursorBg.close();
            }
        } catch (java.lang.Throwable unused3) {
            cursorBg = null;
        }
        return i;
    }

    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(int i, java.lang.String str) {
        long jBg = com.bytedance.sdk.component.ldr.bg.IL.bg.bg(i, zx());
        if (jBg <= 0) {
            jBg = 1;
        } else if (jBg > 100) {
            jBg = 100;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.bg.clear();
        android.database.Cursor cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), new java.lang.String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jBg);
        if (cursorBg != null) {
            while (cursorBg.moveToNext()) {
                try {
                    try {
                        java.lang.String string = cursorBg.getString(cursorBg.getColumnIndex("id"));
                        java.lang.String string2 = cursorBg.getString(cursorBg.getColumnIndex("value"));
                        if (cursorBg.getInt(cursorBg.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().bg(string2);
                        }
                        if (android.text.TextUtils.isEmpty(string2)) {
                            this.bg.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.ldr.bg.eqN.bg.bg bgVar = new com.bytedance.sdk.component.ldr.bg.eqN.bg.bg(string, new org.json.JSONObject(string2));
                            bgVar.IL(bX());
                            bgVar.bg(bg());
                            arrayList.add(bgVar);
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                } finally {
                    if (cursorBg != null) {
                        try {
                            cursorBg.close();
                            if (!this.bg.isEmpty()) {
                                bg(this.bg);
                                this.bg.clear();
                            }
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    protected void bg(java.util.List<java.lang.String> list) {
        IL();
        list.size();
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), "DELETE FROM " + IL() + " WHERE " + bg("id", list, 1000, true));
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.GZ(), list.size());
        bX(list);
    }

    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> IL(java.lang.String str) {
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar = this.bX;
        if (bgVar == null) {
            return new java.util.ArrayList();
        }
        return bg(bgVar.IL(), str);
    }

    public void IL(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar : list) {
            linkedList.add(bgVar.bX());
            com.bytedance.sdk.component.ldr.bg.bX.bg.eo(bgVar);
        }
        IL();
        linkedList.size();
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), "DELETE FROM " + IL() + " WHERE " + bg("id", linkedList, 1000, true));
        bX(linkedList);
    }

    public void bg(int i, long j) {
        IL(i, j);
    }

    private void IL(int i, long j) {
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), "gen_time <? AND retry >?", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j), java.lang.String.valueOf(i)});
    }

    public boolean bg(int i) {
        return this.bX != null && eqN() >= this.bX.bg();
    }

    public static java.lang.String bX(java.lang.String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private static java.lang.String bg(java.lang.String str, java.util.List<?> list, int i, boolean z) {
        int i2;
        java.lang.String str2 = z ? " IN " : " NOT IN ";
        java.lang.String str3 = z ? " OR " : " AND ";
        int iMin = java.lang.Math.min(i, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i2 = size / iMin;
        } else {
            i2 = (size / iMin) + 1;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iMin;
            java.lang.String strBg = bg(android.text.TextUtils.join("','", list.subList(i4, java.lang.Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str).append(str2).append("('").append(strBg).append("')");
        }
        return bg(sb.toString(), str + str2 + "('')");
    }

    private static java.lang.String bg(java.lang.String str, java.lang.String str2) {
        return !android.text.TextUtils.isEmpty(str) ? str : str2;
    }
}
