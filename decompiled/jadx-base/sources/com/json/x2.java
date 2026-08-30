package com.json;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public class x2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.json.x2> CREATOR = new com.ironsource.x2.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3546a;
    private java.lang.String b;
    private java.lang.String c;
    private boolean d;
    private int e;
    private java.util.ArrayList<java.lang.String> f;
    private java.util.ArrayList<java.lang.String> g;
    private java.util.ArrayList<java.lang.String> h;
    private java.util.ArrayList<java.lang.String> i;
    private java.lang.String j;
    private java.lang.String k;
    private java.util.Map<java.lang.String, java.lang.String> l;

    class a implements android.os.Parcelable.Creator<com.json.x2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.json.x2 createFromParcel(android.os.Parcel parcel) {
            return new com.json.x2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.json.x2[] newArray(int i) {
            return new com.json.x2[i];
        }
    }

    public x2() {
        i();
    }

    private x2(android.os.Parcel parcel) {
        i();
        try {
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.f3546a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = a(parcel.readString());
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            i();
        }
    }

    /* synthetic */ x2(android.os.Parcel parcel, com.ironsource.x2.a aVar) {
        this(parcel);
    }

    private java.util.Map<java.lang.String, java.lang.String> a(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog;
        java.lang.String string;
        java.util.HashMap map = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            string = e.toString();
            ironLog.error(string);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            string = th.toString();
            ironLog.error(string);
        }
        return map;
    }

    private void i() {
        this.d = false;
        this.e = -1;
        this.f = new java.util.ArrayList<>();
        this.g = new java.util.ArrayList<>();
        this.h = new java.util.ArrayList<>();
        this.i = new java.util.ArrayList<>();
        this.k = "";
        this.j = "";
        this.l = new java.util.HashMap();
    }

    public void a() {
        this.e = -1;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.g.remove(str);
        } else if (this.g.indexOf(str) == -1) {
            this.g.add(str);
        }
    }

    public void a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.l = map;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public java.lang.String b() {
        return this.c;
    }

    public void b(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.i.remove(str);
        } else if (this.i.indexOf(str) == -1) {
            this.i.add(str);
        }
    }

    public boolean b(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public int c() {
        return this.e;
    }

    public void c(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f.remove(str);
        } else if (this.f.indexOf(str) == -1) {
            this.f.add(str);
        }
    }

    public boolean c(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.i.indexOf(str) > -1;
    }

    public java.lang.String d() {
        return this.j;
    }

    public void d(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.h.remove(str);
        } else if (this.h.indexOf(str) == -1) {
            this.h.add(str);
        }
    }

    public boolean d(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.Map<java.lang.String, java.lang.String> e() {
        return this.l;
    }

    public boolean e(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.h.indexOf(str) > -1;
    }

    public java.lang.String f() {
        return this.k;
    }

    public void f(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String g() {
        return this.f3546a;
    }

    public void g(java.lang.String str) {
        this.j = str;
    }

    public java.lang.String h() {
        return this.b;
    }

    public void h(java.lang.String str) {
        this.k = str;
    }

    public void i(java.lang.String str) {
        this.f3546a = str;
    }

    public void j(java.lang.String str) {
        this.b = str;
    }

    public boolean j() {
        return this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            sb.append("shouldRestore:").append(this.d).append(", ");
            sb.append("displayedProduct:").append(this.e).append(", ");
            sb.append("ISReportInit:").append(this.f).append(", ");
            sb.append("ISInitSuccess:").append(this.g).append(", ");
            sb.append("ISAppKey").append(this.j).append(", ");
            sb.append("ISUserId").append(this.k).append(", ");
            sb.append("ISExtraParams").append(this.l).append(", ");
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.f3546a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new org.json.JSONObject(this.l).toString());
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
        }
    }
}
