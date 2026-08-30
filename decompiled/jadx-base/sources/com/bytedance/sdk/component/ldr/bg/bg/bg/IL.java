package com.bytedance.sdk.component.ldr.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
class IL {
    private android.content.Context IL;
    private com.bytedance.sdk.component.ldr.bg.bg.bg.IL.C0115IL bg;

    IL(android.content.Context context) {
        try {
            this.IL = context.getApplicationContext();
            if (this.bg == null) {
                this.bg = new com.bytedance.sdk.component.ldr.bg.bg.bg.IL.C0115IL();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.IL$IL, reason: collision with other inner class name */
    public class C0115IL {
        private volatile android.database.sqlite.SQLiteDatabase IL = null;

        public C0115IL() {
        }

        private void bg() {
            try {
                if (this.IL != null && this.IL.isOpen()) {
                    return;
                }
                synchronized (this) {
                    if (this.IL == null || !this.IL.isOpen()) {
                        this.IL = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr());
                        this.IL.setLockingEnabled(false);
                    }
                }
            } catch (java.lang.Throwable th) {
                if (IL()) {
                    throw th;
                }
            }
        }

        public void bg(java.lang.String str) throws android.database.SQLException {
            try {
                bg();
                this.IL.execSQL(str);
            } catch (java.lang.Throwable th) {
                if (IL()) {
                    throw th;
                }
            }
        }

        public android.database.Cursor bg(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            try {
                bg();
                return this.IL.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.ldr.bg.bg.bg.IL.bg bgVar = new com.bytedance.sdk.component.ldr.bg.bg.bg.IL.bg();
                if (IL()) {
                    throw th;
                }
                return bgVar;
            }
        }

        public int bg(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) throws java.lang.Exception {
            try {
                bg();
                return this.IL.update(str, contentValues, str2, strArr);
            } catch (java.lang.Exception e) {
                if (IL()) {
                    throw e;
                }
                return 0;
            }
        }

        public long bg(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) throws java.lang.Exception {
            try {
                bg();
                return this.IL.insert(str, str2, contentValues);
            } catch (java.lang.Exception e) {
                if (IL()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void bg(java.lang.String str, java.lang.String str2, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
            org.json.JSONObject jSONObjectIR;
            try {
                try {
                    bg();
                    this.IL.beginTransaction();
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar = list.get(i);
                        if (bgVar != null && (jSONObjectIR = bgVar.iR()) != null) {
                            contentValues.put("id", bgVar.bX());
                            java.lang.String strIL = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().IL(jSONObjectIR.toString());
                            if (!android.text.TextUtils.isEmpty(strIL)) {
                                contentValues.put("value", strIL);
                                contentValues.put("gen_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                contentValues.put("retry", (java.lang.Integer) 0);
                                contentValues.put("encrypt", (java.lang.Integer) 1);
                                if (com.bytedance.sdk.component.ldr.bg.bX.bg.eqN() && bgVar.eo() > 0 && (bgVar.eqN() == 0 || bgVar.eqN() == 3)) {
                                    contentValues.put("channel", java.lang.Integer.valueOf(bgVar.eo()));
                                }
                                this.IL.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.IL.setTransactionSuccessful();
                    new java.lang.StringBuilder().append(str).append(" insert list size=");
                    list.size();
                    if (this.IL != null) {
                        this.IL.endTransaction();
                    }
                } catch (java.lang.Exception e) {
                    new java.lang.StringBuilder().append(str).append(" insert list error=");
                    list.size();
                    if (IL()) {
                        throw e;
                    }
                    if (this.IL != null) {
                        this.IL.endTransaction();
                    }
                }
            } catch (java.lang.Throwable th) {
                if (this.IL != null) {
                    this.IL.endTransaction();
                }
                throw th;
            }
        }

        public int bg(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) throws java.lang.Exception {
            try {
                bg();
                return this.IL.delete(str, str2, strArr);
            } catch (java.lang.Exception e) {
                if (IL()) {
                    throw e;
                }
                return 0;
            }
        }

        private boolean IL() {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.IL;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    public com.bytedance.sdk.component.ldr.bg.bg.bg.IL.C0115IL bg() {
        return this.bg;
    }

    private class bg extends android.database.AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public java.lang.String[] getColumnNames() {
            return new java.lang.String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public java.lang.String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private bg() {
        }
    }
}
