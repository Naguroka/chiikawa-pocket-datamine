package com.bytedance.sdk.component.ldr.bg.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX {
    private final android.content.Context bX;
    protected java.util.List<java.lang.String> bg;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eqN;

    public byte bX() {
        return (byte) 2;
    }

    public byte eqN() {
        return (byte) 0;
    }

    public bg(android.content.Context context, com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        super(context);
        this.bg = new java.util.ArrayList();
        this.bX = context;
        this.eqN = bgVar;
        if (bgVar == null) {
            this.eqN = com.bytedance.sdk.component.ldr.bg.eqN.IL.bg.bX();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0024 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x0024: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:13:0x002f, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r1v3 int) = (r1v0 int), (r1v5 int) binds: [B:13:0x002f, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int bg() {
        android.database.Cursor cursorBg = null;
        int i = 0;
        try {
            cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), new java.lang.String[]{"count(1)"}, null, null, null, null, null);
            if (cursorBg != null) {
                cursorBg.moveToFirst();
                i = cursorBg.getInt(0);
            }
        } catch (java.lang.Exception unused) {
        } finally {
            if (cursorBg != null) {
                try {
                    cursorBg.close();
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        return i;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX
    public java.lang.String IL() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        if (zxVarEqN != null) {
            return zxVarEqN.IL();
        }
        return null;
    }

    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(int i, java.lang.String str) {
        java.lang.String str2;
        java.lang.String[] strArr;
        java.lang.String str3;
        java.lang.String str4;
        android.database.Cursor cursorBg;
        long jBg = com.bytedance.sdk.component.ldr.bg.IL.bg.bg(i, zx());
        IL();
        if (jBg <= 0) {
            jBg = 1;
        } else if (jBg > 100) {
            jBg = 100;
        }
        java.lang.String str5 = str + " DESC limit " + jBg;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.bg.clear();
        long jXxp = com.bytedance.sdk.component.ldr.bg.Kg.iR().xxp();
        if (jXxp > 0) {
            strArr = new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - jXxp)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.ldr.bg.bX.bg.eqN() && eqN() == 3) {
            str3 = "id";
            str4 = "value";
            cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), new java.lang.String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str5);
        } else {
            str3 = "id";
            str4 = "value";
            cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), new java.lang.String[]{str3, str4, "encrypt"}, str2, strArr, null, null, str5);
        }
        android.database.Cursor cursor = cursorBg;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
                while (cursor.moveToNext()) {
                    try {
                        java.lang.String string = cursor.getString(cursor.getColumnIndex(str3));
                        java.lang.String string2 = cursor.getString(cursor.getColumnIndex(str4));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.ldr.bg.bX.bg.eqN() && eqN() == 3) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = zxVarVb.bg(string2);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (android.text.TextUtils.isEmpty(string2)) {
                            this.bg.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject(string2);
                            com.bytedance.sdk.component.ldr.bg.eqN.bg.bg bgVar = new com.bytedance.sdk.component.ldr.bg.eqN.bg.bg(string, jSONObject);
                            bgVar.bg(eqN());
                            bgVar.IL(bX());
                            if (com.bytedance.sdk.component.ldr.bg.bX.bg.eqN() && eqN() == 3) {
                                bgVar.bg(i3);
                            }
                            com.bytedance.sdk.component.ldr.bg.bX.bg.bg(jSONObject, bgVar);
                            arrayList.add(bgVar);
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.bg.isEmpty()) {
                            bg(this.bg);
                            this.bg.clear();
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            } catch (java.lang.Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.bg.isEmpty()) {
                            bg(this.bg);
                            this.bg.clear();
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
                throw th3;
            }
        }
        IL();
        arrayList.size();
        return arrayList;
    }

    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(java.lang.String str) {
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar = this.eqN;
        if (bgVar == null) {
            return new java.util.ArrayList();
        }
        return bg(bgVar.IL(), str);
    }

    protected void bg(java.util.List<java.lang.String> list) {
        IL();
        list.size();
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), "DELETE FROM " + IL() + " WHERE " + bg("id", list, 1000, true));
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.GZ(), list.size());
        bX(list);
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
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), "gen_time <? OR retry >?", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j), java.lang.String.valueOf(i)});
            IL();
        }
    }

    public boolean bg(int i) {
        if (this.eqN == null) {
            return false;
        }
        int iBg = bg();
        int iBg2 = this.eqN.bg();
        IL();
        if (com.bytedance.sdk.component.ldr.bg.bX.bg.bX() && (i == 1 || i == 2)) {
            return iBg > 0;
        }
        return iBg >= iBg2;
    }

    public static java.lang.String IL(java.lang.String str) {
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
